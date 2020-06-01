package Bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Encomendas_Geral extends Produto {

    private String vencimento;

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String venc) {
        this.vencimento = venc;
    }

    ////////////////////////////////////////////////////////////////
    public void alterar(Connection conn, int cod) throws SQLException {
        String sqlAltera;
        sqlAltera = "UPDATE encomendas SET Chegada=? WHERE IdEncomenda=" + cod;
        PreparedStatement stm = null;

        stm = conn.prepareStatement(sqlAltera); // envia os valores

        stm.setString(1, getVencimento());

        stm.execute();
        conn.commit();
        JOptionPane.showMessageDialog(null, "Alteração Executada com Sucesso!", "Mensagem do Sistema ", JOptionPane.INFORMATION_MESSAGE);
    }

    ////////////////////////////////////////////////////////////////
    //Mover registro para o histórico e deletar da tabela atual
    public void Recebido(Connection conn, int cod) throws SQLException {

        PreparedStatement stm = null;

        //Excluir registro da tabela atual
        String sqlExcluir = "delete FROM encomendas WHERE IdEncomenda=" + cod;

        stm = conn.prepareStatement(sqlExcluir);
        stm.execute();
        conn.commit();

        JOptionPane.showMessageDialog(null, "Material Recebido!", "Mensagem do Sistema ", JOptionPane.INFORMATION_MESSAGE);
    }

    public void alterarEntrega(Connection conn, int cod) throws SQLException {
        String sqlAltera;
        sqlAltera = "UPDATE ordem_producao SET Entrega=? WHERE IdProducao=" + cod;
        PreparedStatement stm = null;

        stm = conn.prepareStatement(sqlAltera); // envia os valores

        stm.setString(1, getVencimento());

        stm.execute();
        conn.commit();
        JOptionPane.showMessageDialog(null, "Alteração Executada com Sucesso!", "Mensagem do Sistema ", JOptionPane.INFORMATION_MESSAGE);
    }

    ////////////////////////////////////////////////////////////////
    //Mover registro para o histórico e deletar da tabela atual
    public void Finalizado(Connection conn, int cod) throws SQLException {

        PreparedStatement stm = null;

        //Excluir registro da tabela atual
        String sqlExcluir = "delete FROM ordem_producao WHERE IdProducao=" + cod;

        stm = conn.prepareStatement(sqlExcluir);
        stm.execute();
        conn.commit();

        JOptionPane.showMessageDialog(null, "Produto Finalizado!", "Mensagem do Sistema ", JOptionPane.INFORMATION_MESSAGE);
    }

    //Metodo Incluir registro – Classe Compras Cliente
    public void incluirCompra(Connection conn, String med, int id) throws SQLException {
        String sqlInsert = "INSERT INTO compras_cliente(Idcliente, Produto, Medidas, Qtd, Total, Data) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement stm = null;

        stm = conn.prepareStatement(sqlInsert); // envia os valores
        //Aqui, substitui a primeira interrogação pelo nome da materia
        stm.setInt(1, id);
        stm.setString(2, getDescricao());
        stm.setString(3, med);
        stm.setInt(4, getQtd()); //Recebe só um por vez na tela que gera novo produto
        stm.setDouble(5, getPrecoCompra());
        stm.setString(6, getVencimento());

        // o comando execute()
        stm.execute();
        JOptionPane.showMessageDialog(null, "Incluído nas Compras do Cliente!", "SUCESSO!", JOptionPane.WARNING_MESSAGE);
    }

}
