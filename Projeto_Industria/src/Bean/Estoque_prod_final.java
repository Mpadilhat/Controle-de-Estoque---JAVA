package Bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Estoque_prod_final extends Produto {

    private String produto, medidas, material, venc, cliente;
    private double preco, total;
    private int quant;

    // Colocar com set e mostrar com get  // Encapsulamento
    
    public String getProduto() {
        return produto;
    }

    public void setProduto(String prod) {
        this.produto = prod;
    }


    public String getMedidas() {
        return medidas;
    }

    public void setMedidas(String medidas) {
        this.medidas= medidas;
    }
    
    public double getPrecoVenda() {
        return preco;
    }

    public void setPrecoVenda(double preco) {
        this.preco = preco;
    }
    
     public String getMaterial() {
        return material;
    }

    public void setMaterial(String mat) {
        this.material = mat;
    }
    
       public String getVencimento() {
        return venc;
    }

    public void setVencimento(String venc) {
        this.venc = venc;
    }
    
     public String getCliente() {
        return cliente;
    }

    public void setCliente(String cli) {
        this.cliente = cli;
    }
    
    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    

    ////////////////////////////////////////////////////////////////
 
    //Metodo Incluir registro – Classe Estoque_prod_final
    public void incluir(Connection conn) throws SQLException {
        String sqlInsert = "INSERT INTO estoque_prod_final(Produto, Medidas, Qtd) VALUES (?, ?, ?)";
        PreparedStatement stm = null;

        stm = conn.prepareStatement(sqlInsert); // envia os valores
        //Aqui, substitui a primeira interrogação pelo nome da materia
        stm.setString(1, getProduto());
        stm.setString(2, getMedidas());
        stm.setInt(3, getQtd()); //Recebe só um por vez na tela que gera novo produto

        // o comando execute()
        stm.execute();
        JOptionPane.showMessageDialog(null, "Incluído no Estoque de Produto Final", "SUCESSO!", JOptionPane.WARNING_MESSAGE);
    }

    ////////////////////////////////////////////////////////////////
    
//    Metodo Alterar registro
    public void alterar(Connection conn, int cod) throws SQLException {
        String sqlAltera;
        sqlAltera = "UPDATE estoque_prod_final SET Produto=?, Medidas=?, Preco_unit=?  WHERE Idproduto=" + cod;
        PreparedStatement stm = null;

        stm = conn.prepareStatement(sqlAltera); // envia os valores

        stm.setString(1, getProduto());
        stm.setString(2, getMedidas());
        stm.setDouble(3, getPrecoVenda());

        stm.execute();
        conn.commit();
        JOptionPane.showMessageDialog(null, "Alteração Executada com Sucesso!", "Mensagem do Sistema ", JOptionPane.INFORMATION_MESSAGE);
    }

    //Metodo Excluir registro
    public void excluir(Connection conn, int cod) throws SQLException {
        String sqlExcluir = "delete FROM estoque_prod_final WHERE Idproduto=" + cod;
        PreparedStatement stm = null;
        stm = conn.prepareStatement(sqlExcluir);
        stm.execute();
        conn.commit();
        
        String sqlExcluirComposicao = "delete FROM composicao_produto WHERE Idproduto=" + cod;
        stm = conn.prepareStatement(sqlExcluirComposicao);
        stm.execute();
        conn.commit();
        
        
        JOptionPane.showMessageDialog(null, "Exclusão Executada com Sucesso!", "Mensagem do Sistema ", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
      //Metodo Excluir registro
    public void excluirLinha(Connection conn, int cod, String prod) throws SQLException {
        String sqlExcluir = "delete FROM projeto_industria.composicao_produto WHERE Idproduto = '"+cod+"' AND Material='" + prod+"'";
     
        PreparedStatement stm = null;
        stm = conn.prepareStatement(sqlExcluir);
        stm.execute();
        conn.commit();
        
        JOptionPane.showMessageDialog(null, "Exclusão Executada com Sucesso!", "Mensagem do Sistema ", JOptionPane.INFORMATION_MESSAGE);
    }
    
      //Metodo Incluir Composição – Classe Estoque_prod_final
    public void incluirComposicao(Connection conn, int qtdDesejada, String material, String nomeProd) throws SQLException {
        
        Statement stmt = null; //Parâmetros, valores a serem informados
        ResultSet rs = null; //Pega os resultados do select
        String sqlConsulta;

        sqlConsulta = "Select Idproduto from estoque_prod_final Where Produto='" + nomeProd + "'";

        stmt = conn.createStatement();
        rs = stmt.executeQuery(sqlConsulta); //Executa o select

        int recebe_id=0;

        while (rs.next()) { //lê todos os registros
            recebe_id = rs.getInt("IdProduto");
        }

        rs.close();
        stmt.close();
        //////////////////////////////////////////////////////////////////////////////////////
        
        String sqlInsert = "INSERT INTO composicao_produto(IdProduto, Material, Qtd) VALUES (?, ?, ?)";
        PreparedStatement stm = null;

        stm = conn.prepareStatement(sqlInsert); // envia os valores
        //Aqui, substitui a primeira interrogação pelo nome da materia
        stm.setInt(1, recebe_id);
        stm.setString(2, material);
        stm.setInt(3, qtdDesejada);

        // o comando execute()
        stm.execute();
        JOptionPane.showMessageDialog(null, "Incluído na Composição de Produtos", "SUCESSO!", JOptionPane.WARNING_MESSAGE);
    }
    
    //    Metodo Alterar registro
    public void alterarComposicao(Connection conn, String material) throws SQLException {
        String sqlAltera;
        sqlAltera = "UPDATE composicao_produto SET Material=?, Qtd=?  WHERE Material='"+material+"'";
        PreparedStatement stm = null;

        stm = conn.prepareStatement(sqlAltera); // envia os valores

        stm.setString(1, getMaterial());
        stm.setInt(2, getQtd());


        stm.execute();
        conn.commit();
        JOptionPane.showMessageDialog(null, "Alteração Executada com Sucesso!", "Mensagem do Sistema ", JOptionPane.INFORMATION_MESSAGE);
    }
    
        //COMO ADICIONAR OU REMOVER QUANTIDADES!
    public void adicionaProduto(Connection conn, String prod, int qtdProduzida) throws SQLException {

        Statement stmt = null; //Parâmetros, valores a serem informados
        ResultSet rs = null; //Pega os resultados do select

        String sqlConsulta;

        sqlConsulta = "Select Qtd from estoque_prod_final Where Produto='" + prod + "'";

        stmt = conn.createStatement();
        rs = stmt.executeQuery(sqlConsulta); //Executa o select

        int recebe_qtd = 0;

        while (rs.next()) { //lê todos os registros
            recebe_qtd = rs.getInt("Qtd");
        }

        rs.close();
        stmt.close();

        recebe_qtd = recebe_qtd + qtdProduzida;

        String sqlTeste = "UPDATE estoque_prod_final SET Qtd=?  WHERE Produto='" + prod + "'";
        PreparedStatement stm = null;
        stm = conn.prepareStatement(sqlTeste);

        stm.setInt(1, recebe_qtd); //Recebe quantos produtos forem possíveis

        stm.execute();
        JOptionPane.showMessageDialog(null, "Estoque de Produtos atualizado!", "Mensagem do Sistema ", JOptionPane.INFORMATION_MESSAGE);
    }
  
    public void AdicionaOrdemProducao(Connection conn) throws SQLException {
        String sqlInsert = "INSERT INTO ordem_producao(Produto, Medidas, QtdProd, Entrega) VALUES (?, ?, ?, ?)";
        PreparedStatement stm = null;
        
        stm = conn.prepareStatement(sqlInsert); // envia os valores
        //Aqui, substitui a primeira interrogação pelo item desejado
        stm.setString(1, getProduto());
        stm.setString(2, getMedidas());
        stm.setDouble(3, getQtd());       
        stm.setString(4, getVencimento());   


        // o comando execute()
        stm.execute();
        JOptionPane.showMessageDialog(null, "Incluído na Ordem de Produção.", "SUCESSO!", JOptionPane.WARNING_MESSAGE);
}
    
////////////////////////////////////////////////////////////////////////////////////

//COMO ADICIONAR OU REMOVER QUANTIDADES!
    public void removeProduto(Connection conn, String prod, int qtdProduzida) throws SQLException {

        Statement stmt = null; //Parâmetros, valores a serem informados
        ResultSet rs = null; //Pega os resultados do select

        String sqlConsulta;

        sqlConsulta = "Select Qtd from estoque_prod_final Where Produto='" + prod + "'";

        stmt = conn.createStatement();
        rs = stmt.executeQuery(sqlConsulta); //Executa o select

        int recebe_qtd = 0;

        while (rs.next()) { //lê todos os registros
            recebe_qtd = rs.getInt("Qtd");
        }

        rs.close();
        stmt.close();

        recebe_qtd = recebe_qtd - qtdProduzida;

        String sqlTeste = "UPDATE estoque_prod_final SET Qtd=?  WHERE Produto='" + prod + "'";
        PreparedStatement stm = null;
        stm = conn.prepareStatement(sqlTeste);

        stm.setInt(1, recebe_qtd); //Recebe quantos produtos forem possíveis

        stm.execute();
        JOptionPane.showMessageDialog(null, "Estoque de Produtos atualizado!", "Mensagem do Sistema ", JOptionPane.INFORMATION_MESSAGE);
    }    
    
    
    public void AdicionaContaReceber(Connection conn) throws SQLException {
        String sqlInsert = "INSERT INTO contas_receber(Cliente, Produto, Preco_venda, QtdProd, Total, Vencimento) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement stm = null;

        stm = conn.prepareStatement(sqlInsert); // envia os valores
        //Aqui, substitui a primeira interrogação pelo item desejado
        stm.setString(1, getCliente());
        stm.setString(2, getDescricao());
        stm.setDouble(3, getPrecoVenda());        
        stm.setInt(4, getQtd());
        stm.setDouble(5, getTotal());
        stm.setString(6, getVencimento());

        // o comando execute()
        stm.execute();
        JOptionPane.showMessageDialog(null, "Incluído nas Contas a Receber.", "SUCESSO!", JOptionPane.WARNING_MESSAGE);
  
}
    
    
}
