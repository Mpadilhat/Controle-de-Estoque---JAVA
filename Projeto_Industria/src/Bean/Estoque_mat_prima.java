package Bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Estoque_mat_prima extends Produto {

    private String unid_medida, dataVencimento;
    private double total;

    // Colocar com set e mostrar com get  // Encapsulamento
    public String getUnidade() {
        return unid_medida;
    }

    public void setUnidade(String unid) {
        this.unid_medida = unid;
    }

    public String getVencimento() {
        return dataVencimento;
    }

    public void setVencimento(String venc) {
        this.dataVencimento = venc;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double tot) {
        this.total = tot;
    }

    ////////////////////////////////////////////////////////////////
    //Metodo Incluir registro – Classe Estoque_mat_prima
    public void incluir(Connection conn) throws SQLException {
        String sqlInsert = "INSERT INTO estoque_materia(Descricao, Qtd, Unid_medida, Fornecedor, Preco_compra) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement stm = null;

        stm = conn.prepareStatement(sqlInsert); // envia os valores
        //Aqui, substitui a primeira interrogação pelo nome da materia
        stm.setString(1, getDescricao());
        stm.setInt(2, getQtd());
        stm.setString(3, getUnidade());
        stm.setString(4, getFornecedor());
        stm.setDouble(5, getPrecoCompra());

        // o comando execute()
        stm.execute();
        JOptionPane.showMessageDialog(null, "Incluído no Banco de Dados", "SUCESSO!", JOptionPane.WARNING_MESSAGE);
    }

    ////////////////////////////////////////////////////////////////
    //Metodo Alterar registro
    public void alterar(Connection conn, int cod) throws SQLException {
        String sqlAltera;
        sqlAltera = "UPDATE estoque_materia SET Descricao=?, Unid_medida=?, Fornecedor=?, Preco_compra=?  WHERE Idmateria=" + cod;
        PreparedStatement stm = null;

        stm = conn.prepareStatement(sqlAltera); // envia os valores

        stm.setString(1, getDescricao());
        stm.setString(2, getUnidade());
        stm.setString(3, getFornecedor());
        stm.setDouble(4, getPrecoCompra());

        stm.execute();
        conn.commit();
        JOptionPane.showMessageDialog(null, "Alteração Executada com Sucesso!", "Mensagem do Sistema ", JOptionPane.INFORMATION_MESSAGE);
    }

    //Metodo Excluir registro
    public void excluir(Connection conn, int cod) throws SQLException {
        String sqlExcluir = "delete FROM estoque_materia WHERE Idmateria=" + cod;
        PreparedStatement stm = null;
        stm = conn.prepareStatement(sqlExcluir);
        stm.execute();
        conn.commit();
        JOptionPane.showMessageDialog(null, "Exclusão Executada com Sucesso!", "Mensagem do Sistema ", JOptionPane.INFORMATION_MESSAGE);
    }

    //COMO ADICIONAR OU REMOVER QUANTIDADES!
    public void adicionaMateria(Connection conn, String prod, int qtdCompra) throws SQLException {

        Statement stmt = null; //Parâmetros, valores a serem informados
        ResultSet rs = null; //Pega os resultados do select

        String sqlConsulta;

        sqlConsulta = "Select Qtd from estoque_materia Where Descricao='" + prod + "'";

        stmt = conn.createStatement();
        rs = stmt.executeQuery(sqlConsulta); //Executa o select

        int recebe_qtd = 0;

        while (rs.next()) { //lê todos os registros
            recebe_qtd = rs.getInt("Qtd");
        }

        rs.close();
        stmt.close();

            recebe_qtd = recebe_qtd + qtdCompra;
       

        String sqlTeste = "UPDATE estoque_materia SET Qtd=?  WHERE Descricao='" + prod + "'";
        PreparedStatement stm = null;
        stm = conn.prepareStatement(sqlTeste);

        stm.setInt(1, recebe_qtd);

        stm.execute();
        JOptionPane.showMessageDialog(null, "Estoque atualizado.", "Mensagem do Sistema ", JOptionPane.INFORMATION_MESSAGE);
    }

    public void AdicionaContaPagar(Connection conn) throws SQLException {
        String sqlInsert = "INSERT INTO contas_pagar(Fornecedor, Produto, Preco_compra, QtdProd, Total_pagar, Vencimento) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement stm = null;

        stm = conn.prepareStatement(sqlInsert); // envia os valores
        //Aqui, substitui a primeira interrogação pelo item desejado
        stm.setString(1, getFornecedor());
        stm.setString(2, getDescricao());
        stm.setDouble(3, getPrecoCompra());
        stm.setInt(4, getQtd());
        stm.setDouble(5, getTotal());
        stm.setString(6, getVencimento());

        // o comando execute()
        stm.execute();
        JOptionPane.showMessageDialog(null, "Incluído nas Contas a Pagar.", "SUCESSO!", JOptionPane.WARNING_MESSAGE);

    }

    public void AdicionaEncomendas(Connection conn, double total) throws SQLException {
        String sqlInsert = "INSERT INTO encomendas(Fornecedor, Produto, Preco_compra, QtdProd, Total_pagar, Chegada) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement stm = null;
        String chegada = "00/00/0000";

        stm = conn.prepareStatement(sqlInsert); // envia os valores
        //Aqui, substitui a primeira interrogação pelo item desejado
        stm.setString(1, getFornecedor());
        stm.setString(2, getDescricao());
        stm.setDouble(3, getPrecoCompra());
        stm.setInt(4, getQtd());
        stm.setDouble(5, total);
        stm.setString(6, chegada);

        // o comando execute()
        stm.execute();
        JOptionPane.showMessageDialog(null, "Incluído nas Encomendas.", "SUCESSO!", JOptionPane.WARNING_MESSAGE);
    }

}
