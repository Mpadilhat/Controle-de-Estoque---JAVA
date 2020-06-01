package Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexao {

    public java.sql.Connection obterConexao() throws SQLException {
        try {
           //DriverManager faz a comunicação com os drivers para usar o MYSQL  
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/projeto_industria", "root", "");
            //getConnection é um método estático, padrão JDBC, que recebe o banco que vamos conectar

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERRO NA CONEXÃO!", "Mensagem do Sistema", JOptionPane.WARNING_MESSAGE);
        }
        return null;
    }

}
