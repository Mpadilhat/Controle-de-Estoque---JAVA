package View;

import Bean.Datas;
import Bean.Dividas;
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
public class Contas_a_pagar extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadastro
     */
    public Contas_a_pagar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableContasPagar = new javax.swing.JTable();
        jBalterar = new javax.swing.JButton();
        jBpagar = new javax.swing.JButton();
        jBconsultar = new javax.swing.JButton();
        jBsair = new javax.swing.JButton();
        radio_alfa = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jFTFvencimento = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();

        setTitle("Tela de Contas a Pagar");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTableContasPagar.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, null));
        jTableContasPagar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "IdDivida", "Fornecedor", "Produto", "Preco compra (R$)", "Qtd", "Total a pagar", "Vencimento"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
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

        jBalterar.setBackground(new java.awt.Color(255, 255, 51));
        jBalterar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBalterar.setText("Alterar");
        jBalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBalterarActionPerformed(evt);
            }
        });

        jBpagar.setBackground(new java.awt.Color(51, 255, 51));
        jBpagar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBpagar.setText("Pagar");
        jBpagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBpagarActionPerformed(evt);
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
        jLabel5.setText("Contas a Pagar");

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

        jLabel1.setText("Alterar vencimento:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jFTFvencimento, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jBalterar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(158, 158, 158)))
                        .addGap(160, 160, 160)
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(radio_alfa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBconsultar)
                        .addGap(274, 274, 274)
                        .addComponent(jBpagar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(376, 376, 376)
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBsair))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1074, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(jBpagar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
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


    private void jBpagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBpagarActionPerformed
        try {

            int dialogButton = JOptionPane.YES_NO_OPTION;

            String data = jFTFvencimento.getText(); //Pega a data de vencimento
            Datas datas = new Datas();
            String dataPag = datas.data_paraBD(); //pega data de pagamento

            int perg = JOptionPane.showConfirmDialog(null, "Confirma pagamento?", "Sistema", dialogButton); //FUNCIONA AGORA!
            if (perg == JOptionPane.NO_OPTION) {
            } else {

                Connection conn = null; //Chama as conexões
                Conexao bd = new Conexao();
                conn = bd.obterConexao(); //Abre a conexão
                conn.setAutoCommit(false);

                //Prepara comandos sql
                Statement stmt = null; //Parâmetros, valores a serem informados
                ResultSet rs = null; //Pega os resultados do select

                String sqlPegaDados = "SELECT Fornecedor, Produto, Preco_compra, QtdProd, Total_pagar, Vencimento  FROM contas_pagar WHERE IdDivida='" + codint + "'";
                stmt = conn.createStatement();
                rs = stmt.executeQuery(sqlPegaDados); //Executa o select                    ;

                while (rs.next()) { //Pega os dados dessa tabela, pois serão adicionados em outra e removidos daqui.
                    recebe_forn = rs.getString("Fornecedor");
                    recebe_prod = rs.getString("Produto");
                    recebe_preco_compra = rs.getDouble("Preco_compra");
                    recebe_qtd = rs.getInt("QtdProd");
                    recebe_total = rs.getDouble("Total_pagar");
                    recebe_venc = rs.getString("Vencimento");
                }

////////////////////////////////////////////////////////////////////////////////////////////////
                //Manda para a tela de histórico de contas
                Dividas div = new Dividas();

                div.setFornecedor(recebe_forn);
                div.setDescricao(recebe_prod);
                div.setPrecoCompra(recebe_preco_compra);
                div.setQtd(recebe_qtd);
                div.setTotal(recebe_total);
                div.setVencimento(recebe_venc);
                
                div.pagar(conn, codint, dataPag);

                carregaGrid();
                limpa_dados();
            }

        } catch (SQLException ex) {
            Logger.getLogger(Contas_a_pagar.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jBpagarActionPerformed

    private void jBsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBsairActionPerformed

    private void jBconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBconsultarActionPerformed
        try {
            carregaGrid();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar tabela!", "Mensagem do Sistema ", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Contas_a_pagar.class.getName()).log(Level.SEVERE, null, ex);
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
            Dividas div = new Dividas();
            String recebe_data = jFTFvencimento.getText();

            div.setVencimento(recebe_data);

            int perg = JOptionPane.showConfirmDialog(null, "Confirma Alteração no Vencimento?", "Sistema", dialogButton);

            if (perg == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Alteração Cancelada!", "Mensagem do Sistema ", JOptionPane.INFORMATION_MESSAGE); //funcionando!
            } else {
                div.alterar(conn, codint);
                // efetiva Alteração
                conn.commit();
                carregaGrid();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Contas_a_pagar.class.getName()).log(Level.SEVERE, null, ex);
        }
        limpa_dados();

      

    }//GEN-LAST:event_jBalterarActionPerformed

    private void jTableContasPagarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableContasPagarMouseClicked
        String var_cod;
        int var_Lin = 0;
        var_Lin = jTableContasPagar.getSelectedRow(); //retorna um inteiro
        var_cod = jTableContasPagar.getValueAt(var_Lin, 0).toString(); // Valor Chave da Tabela

        codint = Integer.parseInt(var_cod);

        jFTFvencimento.setText(jTableContasPagar.getValueAt(var_Lin, 6).toString());

    }//GEN-LAST:event_jTableContasPagarMouseClicked

    private void jFTFvencimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTFvencimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTFvencimentoActionPerformed

    //Métodos para limpar campos e mostrar dados na tabela
    public void limpa_dados() {
        jFTFvencimento.setText("");
    }

    public void carregaGrid() throws SQLException {
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
            sqlConsulta = "Select * from contas_pagar order by Fornecedor";
        } else {
            sqlConsulta = "Select * from contas_pagar order by IdDivida";
        }
        stmt = conn.createStatement();
        rs = stmt.executeQuery(sqlConsulta); //Executa o select

        try {
            while (rs.next()) { //lê todos os registros
                recebe_id = rs.getInt("IdDivida");
                recebe_forn = rs.getString("Fornecedor");
                recebe_produto = rs.getString("Produto");
                recebe_preco_compra = rs.getDouble("Preco_compra");
                recebe_qtd = rs.getInt("QtdProd");
                recebe_total = rs.getDouble("Total_pagar");
                recebe_venc = rs.getString("Vencimento");

                // Mostra os valores na JTable
                DefaultTableModel grid = (DefaultTableModel) jTableContasPagar.getModel();
                grid.addRow(new Object[]{recebe_id, recebe_forn, recebe_produto, recebe_preco_compra, recebe_qtd, recebe_total, recebe_venc});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar grid!", "Mensagem do Sistema ", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Contas_a_pagar.class.getName()).log(Level.SEVERE, null, ex);
        }

        rs.close();
        stmt.close();

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBalterar;
    private javax.swing.JButton jBconsultar;
    private javax.swing.JButton jBpagar;
    private javax.swing.JButton jBsair;
    private javax.swing.JFormattedTextField jFTFvencimento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableContasPagar;
    private javax.swing.JRadioButton radio_alfa;
    // End of variables declaration//GEN-END:variables
}
