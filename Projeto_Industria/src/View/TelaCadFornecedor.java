package View;

import Bean.Fornecedor;
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
public class TelaCadFornecedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadastro
     */
    public TelaCadFornecedor() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTFnome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTFendereco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTFemail = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        jBalterar = new javax.swing.JButton();
        jBgravar1 = new javax.swing.JButton();
        jBexcluir = new javax.swing.JButton();
        jBconsultar = new javax.swing.JButton();
        jBsair = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTFcod = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jFTFcnpj = new javax.swing.JFormattedTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        radio_alfa = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jFTFtelefone = new javax.swing.JFormattedTextField();

        setTitle("Tela de Cadastro de Fornecedor");

        jTFnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFnomeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Fornecedor:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Endereço:");

        jTFendereco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFenderecoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("E-mail:");

        jTFemail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFemailActionPerformed(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTableClientes.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, null));
        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Fornecedor", "Endereço", "E-mail", "Telefone", "CNPJ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableClientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableClientes);

        jBalterar.setBackground(new java.awt.Color(255, 255, 51));
        jBalterar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBalterar.setText("Alterar");
        jBalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBalterarActionPerformed(evt);
            }
        });

        jBgravar1.setBackground(new java.awt.Color(0, 255, 102));
        jBgravar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBgravar1.setText("Gravar");
        jBgravar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBgravar1ActionPerformed(evt);
            }
        });

        jBexcluir.setBackground(new java.awt.Color(255, 51, 51));
        jBexcluir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBexcluir.setText("Excluir");
        jBexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBexcluirActionPerformed(evt);
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

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Código:");

        jTFcod.setEditable(false);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("CNPJ:");

        try {
            jFTFcnpj.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##.###.###/####-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFTFcnpj.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTFcnpjActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("ID");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(radio_alfa);
        radio_alfa.setText("Ordem alfabética");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cadastro de Fornecedores");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Telefone:");

        try {
            jFTFtelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) # ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jTFemail, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)
                                .addComponent(jFTFcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6)
                                .addComponent(jFTFtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(53, 53, 53))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jTFnome)
                            .addComponent(jTFendereco, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jTFcod, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(jBgravar1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jRadioButton1)
                                .addGap(18, 18, 18)
                                .addComponent(radio_alfa)
                                .addGap(29, 29, 29)
                                .addComponent(jBconsultar)
                                .addGap(121, 121, 121)
                                .addComponent(jBalterar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(115, 115, 115)
                                .addComponent(jBexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(140, 140, 140)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(20, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)
                        .addGap(219, 219, 219))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBsair)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jBexcluir)
                                .addComponent(jBalterar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jBconsultar)
                                .addComponent(radio_alfa)
                                .addComponent(jRadioButton1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(383, 383, 383)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFnome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFendereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(1, 1, 1)
                        .addComponent(jFTFtelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFTFcnpj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBgravar1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jBsair)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setPosicao() { //Centraliza a tela desejada
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    public String recebe_nome;
    public String recebe_endereco;
    public String recebe_email;
    public String recebe_telefone;
    public String recebe_cnpj;
    public int recebe_id;
    public int codint;


    private void jTFnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFnomeActionPerformed

    private void jTFenderecoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFenderecoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFenderecoActionPerformed

    private void jTFemailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFemailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFemailActionPerformed

    private void jBexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexcluirActionPerformed

        try {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            Connection conn = null;
            Conexao bd = new Conexao();
            conn = bd.obterConexao();
            conn.setAutoCommit(false);
            Fornecedor cli = new Fornecedor();
            int perg = JOptionPane.showConfirmDialog(null, "Confirma Exclusão?", "Sistema", dialogButton); //AGORA FUNCIONA!
            if (perg == JOptionPane.NO_OPTION) {
            } else {
                cli.excluir(conn, codint);
                carregaGrid();
                limpa_dados();
            }
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_jBexcluirActionPerformed

    private void jBsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBsairActionPerformed

    private void jBgravar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBgravar1ActionPerformed

        // Recebe os valores da tela
        String recebeNome = jTFnome.getText();
        String recebeEndereco = jTFendereco.getText();
        String recebeEmail = jTFemail.getText();
        String recebeTelefone = jFTFtelefone.getText();
        String recebeCnpj = jFTFcnpj.getText();

        // obtem Conexão com o banco
        Connection conn = null;
        Conexao bd = new Conexao();
        try {
            conn = bd.obterConexao();
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }

        Fornecedor cli = new Fornecedor();
        cli.setNome(recebeNome);
        cli.setEndereco(recebeEndereco);
        cli.setEmail(recebeEmail);
        cli.setTelefone(recebeTelefone);
        cli.setCnpj(recebeCnpj);

        try {
            cli.incluir(conn);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Incluir no BD!", "ERRO!", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(TelaCadFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            carregaGrid();
        } catch (SQLException ex) {
            Logger.getLogger(TelaCadFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }
        limpa_dados();


    }//GEN-LAST:event_jBgravar1ActionPerformed

    private void jBconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBconsultarActionPerformed
        try {
            carregaGrid();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar tabela!", "Mensagem do Sistema ", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(TelaCadFornecedor.class.getName()).log(Level.SEVERE, null, ex);
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
            Fornecedor cli = new Fornecedor();
            recebe_nome = jTFnome.getText();
            recebe_endereco = jTFendereco.getText();
            recebe_email = jTFemail.getText();
            recebe_telefone = jFTFtelefone.getText();
            recebe_cnpj = jFTFcnpj.getText();

            cli.setNome(recebe_nome);
            cli.setEndereco(recebe_endereco);
            cli.setEmail(recebe_email);
            cli.setTelefone(recebe_telefone);
            cli.setCnpj(recebe_cnpj);

            int perg = JOptionPane.showConfirmDialog(null, "Confirma Alteração?", "Sistema", dialogButton);

            if (perg == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Alteração Cancelada!", "Mensagem do Sistema ", JOptionPane.INFORMATION_MESSAGE); //funcionando!
            } else {
                cli.alterar(conn, codint);
                // efetiva Alteração
                conn.commit();
                carregaGrid();
            }

        } catch (SQLException ex) {
            Logger.getLogger(TelaCadFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }

        limpa_dados();
    }//GEN-LAST:event_jBalterarActionPerformed

    private void jTableClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableClientesMouseClicked
        String var_cod;
        int var_Lin = 0;
        var_Lin = jTableClientes.getSelectedRow(); //retorna um inteiro
        var_cod = jTableClientes.getValueAt(var_Lin, 0).toString(); // Valor Chave da Tabela
        jTFcod.setText(var_cod);
        codint = Integer.parseInt(var_cod);

        jTFnome.setText(jTableClientes.getValueAt(var_Lin, 1).toString());
        jTFendereco.setText(jTableClientes.getValueAt(var_Lin, 2).toString());
        jTFemail.setText(jTableClientes.getValueAt(var_Lin, 3).toString());
        jFTFtelefone.setText(jTableClientes.getValueAt(var_Lin, 4).toString());
        jFTFcnpj.setText(jTableClientes.getValueAt(var_Lin, 5).toString());

    }//GEN-LAST:event_jTableClientesMouseClicked

    private void jFTFcnpjActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTFcnpjActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTFcnpjActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    //Métodos para limpar campos e mostrar dados na tabela
    public void limpa_dados() {
        jTFcod.setText("");
        jTFnome.setText("");
        jTFendereco.setText("");
        jTFemail.setText("");
        jFTFtelefone.setText("");
        jFTFcnpj.setText("");
    }

    public void carregaGrid() throws SQLException {
        //Limpar o Grid´pra não ficar com 1000 linhas
        DefaultTableModel grid0 = (DefaultTableModel) jTableClientes.getModel();
        grid0.setNumRows(0);

        //Conexão
        Connection conn = null; //Chama as conexões
        Conexao bd = new Conexao();
        conn = bd.obterConexao();

        //Prepara comandos sql
        Statement stmt = null;
        ResultSet rs = null;
        String sqlConsulta;

        if (radio_alfa.isSelected()) {
            sqlConsulta = "SELECT * FROM fornecedor order by Nome";
        } else {
            sqlConsulta = "SELECT * FROM fornecedor order by Idfornecedor";
        }
        stmt = conn.createStatement();
        rs = stmt.executeQuery(sqlConsulta);

        try {
            while (rs.next()) { //lê todos os registros
                recebe_id = rs.getInt("Idfornecedor");
                recebe_nome = rs.getString("Nome");
                recebe_endereco = rs.getString("Endereco");
                recebe_email = rs.getString("Email");
                recebe_telefone = rs.getString("Telefone");
                recebe_cnpj = rs.getString("Cnpj");

                // Mostra os valores na JTable
                DefaultTableModel grid = (DefaultTableModel) jTableClientes.getModel();
                grid.addRow(new Object[]{recebe_id, recebe_nome, recebe_endereco, recebe_email, recebe_telefone, recebe_cnpj});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar grid!", "Mensagem do Sistema ", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(TelaCadFornecedor.class.getName()).log(Level.SEVERE, null, ex);
        }

        rs.close();
        stmt.close();

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBalterar;
    private javax.swing.JButton jBconsultar;
    private javax.swing.JButton jBexcluir;
    private javax.swing.JButton jBgravar1;
    private javax.swing.JButton jBsair;
    private javax.swing.JFormattedTextField jFTFcnpj;
    private javax.swing.JFormattedTextField jFTFtelefone;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTFcod;
    private javax.swing.JTextField jTFemail;
    private javax.swing.JTextField jTFendereco;
    private javax.swing.JTextField jTFnome;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JRadioButton radio_alfa;
    // End of variables declaration//GEN-END:variables
}
