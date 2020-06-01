package Bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Dividas extends Produto {

    private String vencimento, cliente;
    private double total, preco_venda;

    public String getVencimento() {
        return vencimento;
    }

    public void setVencimento(String venc) {
        this.vencimento = venc;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double tot) {
        this.total = tot;
    }
    
    
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    
     public double  getPrecoVenda() {
        return preco_venda;
    }

    public void setPrecoVenda(double preco_venda) {
        this.preco_venda = preco_venda;
    }
   

    ////////////////////////////////////////////////////////////////
    public void alterar(Connection conn, int cod) throws SQLException {
        String sqlAltera;
        sqlAltera = "UPDATE contas_pagar SET Vencimento=? WHERE IdDivida=" + cod;
        PreparedStatement stm = null;

        stm = conn.prepareStatement(sqlAltera); // envia os valores

        stm.setString(1, getVencimento());

        stm.execute();
        conn.commit();
        JOptionPane.showMessageDialog(null, "Alteração Executada com Sucesso!", "Mensagem do Sistema ", JOptionPane.INFORMATION_MESSAGE);
    }

    ////////////////////////////////////////////////////////////////
    //Mover registro para o histórico e deletar da tabela atual
    public void pagar(Connection conn, int cod, String data) throws SQLException {

        String status = "Pago";

        String sqlInsert = "INSERT INTO historico_contasPagas(Fornecedor, Produto, Preco_compra, QtdProd, Total_pago, Vencimento, Data_pagamento, Status) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement stm = null;
        stm = conn.prepareStatement(sqlInsert);

        stm.setString(1, getFornecedor());
        stm.setString(2, getDescricao());
        stm.setDouble(3, getPrecoCompra());
        stm.setInt(4, getQtd());
        stm.setDouble(5, getTotal());
        stm.setString(6, getVencimento());
        stm.setString(7, data);
        stm.setString(8, status);

        stm.execute();
        conn.commit();

        //Excluir registro da tabela atual
        String sqlExcluir = "delete FROM contas_pagar WHERE IdDivida=" + cod;

        stm = conn.prepareStatement(sqlExcluir);
        stm.execute();
        conn.commit();

        JOptionPane.showMessageDialog(null, "Conta paga com Sucesso!", "Mensagem do Sistema ", JOptionPane.INFORMATION_MESSAGE);
    }
    
    ////////////////////////////////////////////////////////////////
    public void alterarReceber(Connection conn, int cod) throws SQLException {
        String sqlAltera;
        sqlAltera = "UPDATE contas_receber SET Vencimento=? WHERE IdRec=" + cod;
        PreparedStatement stm = null;

        stm = conn.prepareStatement(sqlAltera); // envia os valores

        stm.setString(1, getVencimento());

        stm.execute();
        conn.commit();
        JOptionPane.showMessageDialog(null, "Alteração Executada com Sucesso!", "Mensagem do Sistema ", JOptionPane.INFORMATION_MESSAGE);
    }
    
    //Mover registro para o histórico e deletar da tabela atual
    public void receber(Connection conn, int cod, String data) throws SQLException {

        String status = "Recebido";

        String sqlInsert = "INSERT INTO historico_contasRecebidas(Cliente, Produto, Preco_venda, Qtd, Total, Vencimento, Data_pagamento, Status) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        PreparedStatement stm = null;
        stm = conn.prepareStatement(sqlInsert);

        stm.setString(1, getCliente());
        stm.setString(2, getDescricao());
        stm.setDouble(3, getPrecoVenda());
        stm.setInt(4, getQtd());
        stm.setDouble(5, getTotal());
        stm.setString(6, getVencimento());
        stm.setString(7, data);
        stm.setString(8, status);

        stm.execute();
        conn.commit();

        //Excluir registro da tabela atual
        String sqlExcluir = "delete FROM contas_receber WHERE IdRec=" + cod;

        stm = conn.prepareStatement(sqlExcluir);
        stm.execute();
        conn.commit();

        JOptionPane.showMessageDialog(null, "Conta recebida com Sucesso!", "Mensagem do Sistema ", JOptionPane.INFORMATION_MESSAGE);
    }

}

