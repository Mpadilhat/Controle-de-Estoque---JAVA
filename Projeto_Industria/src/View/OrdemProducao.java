package View;

import Bean.Encomendas_Geral;
import Bean.Estoque_prod_final;
import Connection.Conexao;
import java.awt.Dimension;
import java.sql.Connection;
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
public class OrdemProducao extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadastro
     */
    public OrdemProducao() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableOrdemProducao = new javax.swing.JTable();
        jBalterar = new javax.swing.JButton();
        jBrecebido = new javax.swing.JButton();
        jBconsultar = new javax.swing.JButton();
        jBsair = new javax.swing.JButton();
        radio_alfa = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jFTFvencimento = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Produtos a serem preparados");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTableOrdemProducao.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, null));
        jTableOrdemProducao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "IdProducao", "Produto", "Medidas", "Qtd", "Finalização"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableOrdemProducao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableOrdemProducaoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableOrdemProducao);

        jBalterar.setBackground(new java.awt.Color(255, 255, 51));
        jBalterar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBalterar.setText("Alterar");
        jBalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBalterarActionPerformed(evt);
            }
        });

        jBrecebido.setBackground(new java.awt.Color(51, 255, 51));
        jBrecebido.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBrecebido.setText("Finalizado");
        jBrecebido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBrecebidoActionPerformed(evt);
            }
        });

        jBconsultar.setBackground(new java.awt.Color(0, 204, 255));
        jBconsultar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBconsultar.setText("Consultar");
        jBconsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBconsultarActionPerformed(evt);
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
        jLabel5.setText("A produzir");

        try {
            jFTFvencimento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTFvencimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTFvencimentoActionPerformed(evt);
            }
        });

        jLabel1.setText("Entrega:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jFTFvencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jBalterar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(160, 160, 160)
                            .addComponent(jRadioButton1)
                            .addGap(18, 18, 18)
                            .addComponent(radio_alfa)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jBconsultar)
                            .addGap(274, 274, 274)
                            .addComponent(jBrecebido, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(375, 375, 375)
                                .addComponent(jBsair))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1074, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(26, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFTFvencimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBalterar)
                    .addComponent(radio_alfa)
                    .addComponent(jRadioButton1)
                    .addComponent(jBconsultar)
                    .addComponent(jBrecebido, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setPosicao() { //Centraliza a tela desejada
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    public String recebe_venc, recebe_forn, recebe_produto, recebe_medida, recebe_prod;
    public int recebe_id, codint;
    public int recebe_qtd;
    public double recebe_preco_compra, recebe_total;


    private void jBrecebidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBrecebidoActionPerformed
        try {

            int dialogButton = JOptionPane.YES_NO_OPTION;

            int perg = JOptionPane.showConfirmDialog(null, "Confirma Finalização?", "Sistema", dialogButton); //FUNCIONA AGORA!
            if (perg == JOptionPane.NO_OPTION) {
            } else {

                Connection conn = null; //Chama as conexões
                Conexao bd = new Conexao();
                conn = bd.obterConexao(); //Abre a conexão
                conn.setAutoCommit(false);

                //Clique do mouse
                String var_cod;
                int var_Lin = 0;

                var_Lin = jTableOrdemProducao.getSelectedRow(); //retorna um inteiro
                var_cod = jTableOrdemProducao.getValueAt(var_Lin, 0).toString(); // Valor Chave da Tabela

                String recebe_descricao = jTableOrdemProducao.getValueAt(var_Lin, 1).toString();
                int qtd = Integer.parseInt(jTableOrdemProducao.getValueAt(var_Lin, 3).toString());

                //Atualiza o estoque de Produtos finais
                Estoque_prod_final est_prod = new Estoque_prod_final();

                est_prod.adicionaProduto(conn, recebe_descricao, qtd);

                //Apaga a encomenda
                Encomendas_Geral enc = new Encomendas_Geral();
                enc.Finalizado(conn, codint);

                carregaGrid();
                limpa_dados();
            }

        } catch (SQLException ex) {
            Logger.getLogger(Encomendas_Receber.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jBrecebidoActionPerformed

    private void jBsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBsairActionPerformed

    private void jBconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBconsultarActionPerformed
        try {
            carregaGrid();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar tabela!", "Mensagem do Sistema ", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(OrdemProducao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBconsultarActionPerformed

    private void jBalterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBalterarActionPerformed

        try {
            Connection conn = null;
            int dialogButton = JOptionPane.YES_NO_OPTION;
            // obtem conexao com o banco

            Conexao bd = new Conexao();
            conn = bd.obterConexao();

            conn.setAutoCommit(false);
            // Altera dados do Aluno
            Encomendas_Geral enc = new Encomendas_Geral();
            String recebe_data = jFTFvencimento.getText();

            enc.setVencimento(recebe_data);

            int perg = JOptionPane.showConfirmDialog(null, "Confirma Alteração na data de chegada?", "Sistema", dialogButton);

            if (perg == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Alteração Cancelada!", "Mensagem do Sistema ", JOptionPane.INFORMATION_MESSAGE); //funcionando!
            } else {
                enc.alterarEntrega(conn, codint);
                // efetiva Alteração
                conn.commit();
                carregaGrid();
            }
        } catch (SQLException ex) {
            Logger.getLogger(OrdemProducao.class.getName()).log(Level.SEVERE, null, ex);
        }
        limpa_dados();


    }//GEN-LAST:event_jBalterarActionPerformed

    private void jTableOrdemProducaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableOrdemProducaoMouseClicked
        String var_cod;
        int var_Lin = 0;
        var_Lin = jTableOrdemProducao.getSelectedRow(); //retorna um inteiro
        var_cod = jTableOrdemProducao.getValueAt(var_Lin, 0).toString(); // Valor Chave da Tabela

        codint = Integer.parseInt(var_cod);

        jFTFvencimento.setText(jTableOrdemProducao.getValueAt(var_Lin, 6).toString());

    }//GEN-LAST:event_jTableOrdemProducaoMouseClicked

    private void jFTFvencimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTFvencimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTFvencimentoActionPerformed

    //Métodos para limpar campos e mostrar dados na tabela
    public void limpa_dados() {
        jFTFvencimento.setText("");
    }

    public void carregaGrid() throws SQLException {
        //Limpar o Grid´pra não ficar com 1000 linhas
        DefaultTableModel grid0 = (DefaultTableModel) jTableOrdemProducao.getModel();
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
            sqlConsulta = "Select * from ordem_producao order by Produto";
        } else {
            sqlConsulta = "Select * from ordem_producao order by IdProducao";
        }
        stmt = conn.createStatement();
        rs = stmt.executeQuery(sqlConsulta); //Executa o select

        try {
            while (rs.next()) { //lê todos os registros
                recebe_id = rs.getInt("IdProducao");
                recebe_produto = rs.getString("Produto");
                recebe_medida = rs.getString("Medidas");
                recebe_qtd = rs.getInt("QtdProd");
                recebe_venc = rs.getString("Entrega");

                // Mostra os valores na JTable
                DefaultTableModel grid = (DefaultTableModel) jTableOrdemProducao.getModel();
                grid.addRow(new Object[]{recebe_id, recebe_produto, recebe_medida, recebe_qtd, recebe_venc});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar grid!", "Mensagem do Sistema ", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(OrdemProducao.class.getName()).log(Level.SEVERE, null, ex);
        }

        rs.close();
        stmt.close();

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBalterar;
    private javax.swing.JButton jBconsultar;
    private javax.swing.JButton jBrecebido;
    private javax.swing.JButton jBsair;
    private javax.swing.JFormattedTextField jFTFvencimento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableOrdemProducao;
    private javax.swing.JRadioButton radio_alfa;
    // End of variables declaration//GEN-END:variables
}
