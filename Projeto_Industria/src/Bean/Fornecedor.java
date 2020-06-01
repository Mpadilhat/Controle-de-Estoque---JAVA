package Bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Fornecedor extends Cadastro { //herança

    private String cnpj;

    // Colocar com set e mostrar com get  // Encapsulamento
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    ////////////////////////////////////////////////////////////////
    //Metodo Incluir registro – Classe Fornecedor
    public void incluir(Connection conn) throws SQLException {
        String sqlInsert = "INSERT INTO fornecedor(Nome, Endereco, Email, Telefone, Cnpj) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement stm = null;

        stm = conn.prepareStatement(sqlInsert); // envia os valores
        //Aqui, substitui a primeira interrogação pelo nome do cliente
        stm.setString(1, getNome());
        stm.setString(2, getEndereco());
        stm.setString(3, getEmail());
        stm.setString(4, getTelefone());
        stm.setString(5, getCnpj());

        // o comando execute()
        stm.execute();
        JOptionPane.showMessageDialog(null, "Incluído no Banco de Fornecedores", "SUCESSO!", JOptionPane.WARNING_MESSAGE);
    }

    ////////////////////////////////////////////////////////////////
    //Metodo Alterar registro
    public void alterar(Connection conn, int cod) throws SQLException {
        String sqlAltera;
        sqlAltera = "UPDATE fornecedor SET Nome=?, Endereco=?, Email=?, Telefone=?, Cnpj=?  WHERE Idfornecedor=" + cod;
        PreparedStatement stm = null;

        stm = conn.prepareStatement(sqlAltera); // envia os valores

        stm.setString(1, getNome());
        stm.setString(2, getEndereco());
        stm.setString(3, getEmail());
        stm.setString(4, getTelefone());
        stm.setString(5, getCnpj());

        stm.execute();
        conn.commit();
        JOptionPane.showMessageDialog(null, "Alteração Executada com Sucesso!", "Mensagem do Sistema ", JOptionPane.INFORMATION_MESSAGE);
    }

    //Metodo Excluir registro
    public void excluir(Connection conn, int cod) throws SQLException {
        String sqlExcluir = "delete FROM fornecedor WHERE Idfornecedor=" + cod;
        PreparedStatement stm = null;
        stm = conn.prepareStatement(sqlExcluir);
        stm.execute();
        conn.commit();
        JOptionPane.showMessageDialog(null, "Exclusão Executada com Sucesso!", "Mensagem do Sistema ", JOptionPane.INFORMATION_MESSAGE);
    }
}
