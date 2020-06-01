package Bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Cliente extends Cadastro { //herança

    private String cpf;

    // Colocar com set e mostrar com get  // Encapsulamento
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    ////////////////////////////////////////////////////////////////

    //Metodo Incluir registro – Classe Cliente
    public void incluir(Connection conn) throws SQLException {
        String sqlInsert = "INSERT INTO clientes(Nome, Endereco, Email, Telefone, Cpf) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement stm = null; //Prepara para enviar os dados ao Banco de Dados

        stm = conn.prepareStatement(sqlInsert);
        //Aqui, substitui a primeira interrogação pelo nome do cliente
        stm.setString(1, getNome());
        stm.setString(2, getEndereco());
        stm.setString(3, getEmail());
        stm.setString(4, getTelefone());
        stm.setString(5, getCpf());

        // o comando execute()
        stm.execute();
        JOptionPane.showMessageDialog(null, "Incluído no Banco de Clientes", "SUCESSO!", JOptionPane.WARNING_MESSAGE);
    }

    ////////////////////////////////////////////////////////////////
    public void alterar(Connection conn, int cod) throws SQLException {
        String sqlAltera;
        sqlAltera = "UPDATE clientes SET Nome=?, Endereco=?, Email=?, Telefone=?, Cpf=? WHERE Idcliente=" + cod;
        PreparedStatement stm = null;

        stm = conn.prepareStatement(sqlAltera); // envia os valores

        stm.setString(1, getNome());
        stm.setString(2, getEndereco());
        stm.setString(3, getEmail());
        stm.setString(4, getTelefone());
        stm.setString(5, getCpf());

        stm.execute();
        conn.commit();
        JOptionPane.showMessageDialog(null, "Alteração Executada com Sucesso!", "Mensagem do Sistema ", JOptionPane.INFORMATION_MESSAGE);
    }
    
    ////////////////////////////////////////////////////////////////
     //Metodo Excluir registro
    public void excluir(Connection conn, int cod) throws SQLException {
        String sqlExcluir = "delete FROM clientes WHERE Idcliente=" + cod;
        PreparedStatement stm = null;
            stm = conn.prepareStatement(sqlExcluir);
            stm.execute();
            conn.commit();
            JOptionPane.showMessageDialog(null, "Exclusão Executada com Sucesso!", "Mensagem do Sistema ", JOptionPane.INFORMATION_MESSAGE);
}
    

}
