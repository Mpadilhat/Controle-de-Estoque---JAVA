package View;

import Bean.Datas;
import Bean.Encomendas_Geral;
import Connection.Conexao;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 20171inf0295
 */
public class Historico_Contas extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadastro
     */
    public Historico_Contas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableContasPagar = new javax.swing.JTable();
        jBlimparContasRecebidas = new javax.swing.JButton();
        jBconsultarPagas = new javax.swing.JButton();
        jBsair = new javax.swing.JButton();
        radio_alfa = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        radio_alfa1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jBconsultarRecebidas = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableContasReceber = new javax.swing.JTable();
        jBlimparContasPagas = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setTitle("Tela de Histórico de Contas ");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTableContasPagar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, null));
        jTableContasPagar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "IdPagamento", "Fornecedor", "Produto", "Preço compra (R$)", "Quantidade", "Total pago", "Vencimento", "Data do pagamento", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableContasPagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableContasPagarMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableContasPagar);

        jBlimparContasRecebidas.setBackground(new java.awt.Color(255, 51, 51));
        jBlimparContasRecebidas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBlimparContasRecebidas.setText("Limpar Histórico");
        jBlimparContasRecebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimparContasRecebidasActionPerformed(evt);
            }
        });

        jBconsultarPagas.setBackground(new java.awt.Color(0, 204, 255));
        jBconsultarPagas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBconsultarPagas.setText("Consultar");
        jBconsultarPagas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBconsultarPagasActionPerformed(evt);
            }
        });

        jBsair.setBackground(new java.awt.Color(0, 0, 0));
        jBsair.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBsair.setForeground(new java.awt.Color(255, 255, 255));
        jBsair.setText("Sair");
        jBsair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsairActionPerformed(evt);
            }
        });

        buttonGroup1.add(radio_alfa);
        radio_alfa.setText("Ordem alfabética");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("ID");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Contas Pagas");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Contas Recebidas");

        buttonGroup2.add(radio_alfa1);
        radio_alfa1.setText("Ordem alfabética");

        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setSelected(true);
        jRadioButton2.setText("ID");

        jBconsultarRecebidas.setBackground(new java.awt.Color(0, 204, 255));
        jBconsultarRecebidas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBconsultarRecebidas.setText("Consultar");
        jBconsultarRecebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBconsultarRecebidasActionPerformed(evt);
            }
        });

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTableContasReceber.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, null));
        jTableContasReceber.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "IdPagamento", "Cliente", "Produto", "Preço venda (R$)", "Quantidade", "Total recebido", "Vencimento", "Data de recebimento", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableContasReceber.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableContasReceberMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableContasReceber);

        jBlimparContasPagas.setBackground(new java.awt.Color(255, 51, 51));
        jBlimparContasPagas.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBlimparContasPagas.setText("Limpar Histórico");
        jBlimparContasPagas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBlimparContasPagasActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(376, 376, 376)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBsair))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1074, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(radio_alfa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBconsultarPagas)
                        .addGap(687, 687, 687)
                        .addComponent(jBlimparContasPagas, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(402, 402, 402))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1074, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton2)
                                .addGap(18, 18, 18)
                                .addComponent(radio_alfa1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBconsultarRecebidas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jBlimparContasRecebidas, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBsair)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radio_alfa)
                    .addComponent(jRadioButton1)
                    .addComponent(jBconsultarPagas)
                    .addComponent(jBlimparContasPagas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBlimparContasRecebidas)
                    .addComponent(radio_alfa1)
                    .addComponent(jRadioButton2)
                    .addComponent(jBconsultarRecebidas))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setPosicao() { //Centraliza a tela desejada
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    public String recebe_data, recebe_forn, recebe_produto, recebe_data_pag, recebe_status, recebe_cliente, recebe_dtPag;
    public int recebe_id, codint;
    public int recebe_qtd;
    public double recebe_preco_compra, recebe_total_pago, recebe_total, recebe_preco_venda;


    private void jBlimparContasRecebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimparContasRecebidasActionPerformed

        try {
            //Excluir o histórico
            
            int dialogButton = JOptionPane.YES_NO_OPTION;

            //Conexão
            Connection conn = null; //Chama as conexões
            Conexao bd = new Conexao();
            conn = bd.obterConexao(); //Abre a conexão
            conn.setAutoCommit(false);

            PreparedStatement stm = null;

            String sqlExcluir = "delete FROM historico_contasRecebidas";
            
            int perg = JOptionPane.showConfirmDialog(null, "Confirma exclusão?", "Sistema", dialogButton); //FUNCIONA AGORA!
            if (perg == JOptionPane.NO_OPTION) {
            } else {
                stm = conn.prepareStatement(sqlExcluir);

                stm.execute();
                conn.commit();
            }

            carregaGrid2();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao limpar histórico!", "Mensagem do Sistema ", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Historico_Contas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jBlimparContasRecebidasActionPerformed

    private void jBsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBsairActionPerformed

    private void jBconsultarPagasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBconsultarPagasActionPerformed
        try {
            carregaGrid1();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar tabela!", "Mensagem do Sistema ", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Historico_Contas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBconsultarPagasActionPerformed

    private void jTableContasPagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableContasPagarMouseClicked
        String var_cod;
        int var_Lin = 0;
        var_Lin = jTableContasPagar.getSelectedRow(); //retorna um inteiro
        var_cod = jTableContasPagar.getValueAt(var_Lin, 0).toString(); // Valor Chave da Tabela

        codint = Integer.parseInt(var_cod);

    }//GEN-LAST:event_jTableContasPagarMouseClicked

    private void jBconsultarRecebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBconsultarRecebidasActionPerformed
        try {
            carregaGrid2();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar tabela!", "Mensagem do Sistema ", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Historico_Contas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBconsultarRecebidasActionPerformed

    private void jTableContasReceberMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableContasReceberMouseClicked
        String var_cod;
        int var_Lin = 0;
        var_Lin = jTableContasReceber.getSelectedRow(); //retorna um inteiro
        var_cod = jTableContasReceber.getValueAt(var_Lin, 0).toString(); // Valor Chave da Tabela

        codint = Integer.parseInt(var_cod);
    }//GEN-LAST:event_jTableContasReceberMouseClicked

    private void jBlimparContasPagasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBlimparContasPagasActionPerformed

        try {
            //Excluir o histórico

            int dialogButton = JOptionPane.YES_NO_OPTION;

            //Conexão
            Connection conn = null; //Chama as conexões
            Conexao bd = new Conexao();
            conn = bd.obterConexao(); //Abre a conexão
            conn.setAutoCommit(false);

            PreparedStatement stm = null;

            String sqlExcluir = "delete FROM historico_contasPagas";

            int perg = JOptionPane.showConfirmDialog(null, "Confirma exclusão?", "Sistema", dialogButton); //FUNCIONA AGORA!
            if (perg == JOptionPane.NO_OPTION) {
            } else {
                stm = conn.prepareStatement(sqlExcluir);

                stm.execute();
                conn.commit();
            }

            carregaGrid1();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao limpar histórico!", "Mensagem do Sistema ", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Historico_Contas.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jBlimparContasPagasActionPerformed

    //Método para mostrar dados na tabela
    public void carregaGrid1() throws SQLException {
        //Limpar o Grid´pra não ficar com 1000 linhas
        DefaultTableModel grid0 = (DefaultTableModel) jTableContasPagar.getModel();
        grid0.setNumRows(0);

        //Conexão
        Connection conn = null; //Chama as conexões
        Conexao bd = new Conexao();
        conn = bd.obterConexao(); //Abre a conexão

        //Prepara comandos sql
        Statement stmt = null; //Parâmetros, valores a serem informados
        ResultSet rs = null; //Pega os resultados do select
        String sqlConsulta;

        if (radio_alfa.isSelected()) {
            sqlConsulta = "Select * from historico_contasPagas order by Fornecedor";
        } else {
            sqlConsulta = "Select * from historico_contasPagas order by IdPagamento";
        }
        stmt = conn.createStatement();
        rs = stmt.executeQuery(sqlConsulta); //Executa o select

        String data_pag;
        String data_certa;

        try {
            while (rs.next()) { //lê todos os registros
                recebe_id = rs.getInt("IdPagamento");
                recebe_forn = rs.getString("Fornecedor");
                recebe_produto = rs.getString("Produto");
                recebe_preco_compra = rs.getDouble("Preco_compra");
                recebe_qtd = rs.getInt("QtdProd");
                recebe_total_pago = rs.getDouble("Total_pago");
                recebe_data = rs.getString("Vencimento");
                recebe_data_pag = rs.getString("Data_pagamento");
                recebe_status = rs.getString("Status");

                //Converte data de pagamento
                Datas datas = new Datas();
                data_pag = (recebe_data_pag).replace("-", "/");
                data_certa = datas.data_normal(data_pag); //recebe a data convertida

                // Mostra os valores na JTable
                DefaultTableModel grid = (DefaultTableModel) jTableContasPagar.getModel();
                grid.addRow(new Object[]{recebe_id, recebe_forn, recebe_produto, recebe_preco_compra, recebe_qtd, recebe_total_pago, recebe_data, data_certa, recebe_status});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar grid!", "Mensagem do Sistema ", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Historico_Contas.class.getName()).log(Level.SEVERE, null, ex);
        }

        rs.close();
        stmt.close();

    }

    public void carregaGrid2() throws SQLException {
        //Limpar o Grid´pra não ficar com 1000 linhas
        DefaultTableModel grid0 = (DefaultTableModel) jTableContasReceber.getModel();
        grid0.setNumRows(0);

        //Conexão
        Connection conn = null; //Chama as conexões
        Conexao bd = new Conexao();
        conn = bd.obterConexao(); //Abre a conexão

        //Prepara comandos sql
        Statement stmt = null; //Parâmetros, valores a serem informados
        ResultSet rs = null; //Pega os resultados do select
        String sqlConsulta;

        if (radio_alfa.isSelected()) {
            sqlConsulta = "Select * from historico_contasRecebidas order by Cliente";
        } else {
            sqlConsulta = "Select * from historico_contasRecebidas order by IdPagamento";
        }
        stmt = conn.createStatement();
        rs = stmt.executeQuery(sqlConsulta); //Executa o select

        Datas datas = new Datas();
        String dataCerta;

        try {
            while (rs.next()) { //lê todos os registros
                recebe_id = rs.getInt("IdPagamento");
                recebe_cliente = rs.getString("Cliente");
                recebe_produto = rs.getString("Produto");
                recebe_preco_venda = rs.getDouble("Preco_venda");
                recebe_qtd = rs.getInt("Qtd");
                recebe_total = rs.getDouble("Total");
                recebe_data = rs.getString("Vencimento");
                recebe_dtPag = rs.getString("Data_pagamento");
                recebe_status = rs.getString("Status");

                dataCerta = datas.data_normal(recebe_dtPag.replace("-","/"));
                
                // Mostra os valores na JTable
                DefaultTableModel grid = (DefaultTableModel) jTableContasReceber.getModel();
                grid.addRow(new Object[]{recebe_id, recebe_cliente, recebe_produto, recebe_preco_venda, recebe_qtd, recebe_total, recebe_data, dataCerta, recebe_status});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar grid!", "Mensagem do Sistema ", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Historico_Contas.class.getName()).log(Level.SEVERE, null, ex);
        }

        rs.close();
        stmt.close();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jBconsultarPagas;
    private javax.swing.JButton jBconsultarRecebidas;
    private javax.swing.JButton jBlimparContasPagas;
    private javax.swing.JButton jBlimparContasRecebidas;
    private javax.swing.JButton jBsair;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTableContasPagar;
    private javax.swing.JTable jTableContasReceber;
    private javax.swing.JRadioButton radio_alfa;
    private javax.swing.JRadioButton radio_alfa1;
    // End of variables declaration//GEN-END:variables
}
