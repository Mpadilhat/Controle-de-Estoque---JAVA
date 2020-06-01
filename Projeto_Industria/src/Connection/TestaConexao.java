package Connection;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class TestaConexao {

    public static void main(String[] args) throws SQLException {

        JOptionPane.showMessageDialog(null, "Testando conexão com o Banco de Dados...", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);

        try (Connection connection = new Conexao().obterConexao()) {
            JOptionPane.showMessageDialog(null, "Conexão bem sucedida!", "Mensagem do Sistema", JOptionPane.INFORMATION_MESSAGE);
        }

        

    }
}
