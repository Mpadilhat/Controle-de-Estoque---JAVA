package View;

import Bean.Estoque_prod_final;
import Connection.Conexao;
import static View.Menu.jDesktopPane1;
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
public class Gera_PF_Existente_e_Altera_Composicao extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadastro
     */
    public Gera_PF_Existente_e_Altera_Composicao() {
        initComponents();
        preencherCBProdFinal();
        preencherCBmateria();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableComposicao = new javax.swing.JTable();
        jBalterar = new javax.swing.JButton();
        jBexcluir = new javax.swing.JButton();
        jBconsultar = new javax.swing.JButton();
        jBsair = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTFcod = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jbProduzMateria = new javax.swing.JButton();
        jVerificaEstoque = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jFTFdataFinaliza = new javax.swing.JFormattedTextField();
        jcbGeraProdutos = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jFTFqtd = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableComp = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jFTFquant = new javax.swing.JFormattedTextField();
        jcbProdutos = new javax.swing.JComboBox<>();
        jCBmateria = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setTitle("Gerar ou alterar Composição de Produto Final");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Produto:");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTableComposicao.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, null));
        jTableComposicao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "IDProduto", "Material", "Qtd"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableComposicao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableComposicaoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableComposicao);

        jBalterar.setBackground(new java.awt.Color(255, 255, 51));
        jBalterar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBalterar.setText("Alterar");
        jBalterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBalterarActionPerformed(evt);
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
        jLabel7.setText("Material:");

        jSeparator2.setForeground(new java.awt.Color(0, 51, 51));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText(" Alterar Composição do Produto");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Gerar Produto Cadastrado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 20))); // NOI18N

        jbProduzMateria.setBackground(new java.awt.Color(0, 255, 0));
        jbProduzMateria.setText("Produzir");
        jbProduzMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProduzMateriaActionPerformed(evt);
            }
        });

        jVerificaEstoque.setText("Verifica estoque");
        jVerificaEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jVerificaEstoqueActionPerformed(evt);
            }
        });

        jLabel2.setText("Data de finalização:");

        try {
            jFTFdataFinaliza.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jcbGeraProdutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jcbGeraProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbGeraProdutosActionPerformed(evt);
            }
        });

        jLabel3.setText("Produto:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("X");

        jFTFqtd.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTableComp.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, null));
        jTableComp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "IDProduto", "Material", "Qtd"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableComp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableCompMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableComp);

        jButton1.setText("Ver estoque de Produtos");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Gasta matérias  -->");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jcbGeraProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jFTFqtd, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jFTFdataFinaliza, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jVerificaEstoque, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(jbProduzMateria, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jcbGeraProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jFTFqtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jVerificaEstoque))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jFTFdataFinaliza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbProduzMateria)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Quantidade:");

        jFTFquant.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFTFquant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTFquantActionPerformed(evt);
            }
        });

        jcbProdutos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        jCBmateria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("Selecione o PRODUTO e clique aqui -->");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jTFcod, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jcbProdutos, 0, 189, Short.MAX_VALUE)
                    .addComponent(jBalterar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTFquant, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jCBmateria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBconsultar)
                        .addGap(417, 417, 417)
                        .addComponent(jBexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(115, 115, 115)
                        .addComponent(jBsair))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 1223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBsair)
                                .addGap(40, 40, 40))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel4)
                        .addGap(12, 12, 12)
                        .addComponent(jTFcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jcbProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCBmateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jFTFquant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBalterar)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBexcluir)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBconsultar)
                        .addComponent(jLabel9)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setPosicao() { //Centraliza a tela desejada
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    public String recebe_descricao;
    public int recebe_qtd;
    public String recebe_material;
    public String recebe_forn;
    public double recebe_preco;
    public int recebe_id;
    public int codint;
    private void jBexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexcluirActionPerformed
        try {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            Connection conn = null;
            Conexao bd = new Conexao();
            conn = bd.obterConexao();
            conn.setAutoCommit(false);

            String var_cod;
            int var_Lin = 0;
            var_Lin = jTableComposicao.getSelectedRow(); //retorna um inteiro
            
            recebe_descricao = jTableComposicao.getValueAt(var_Lin, 1).toString();

            Estoque_prod_final est_prod = new Estoque_prod_final();
            int perg = JOptionPane.showConfirmDialog(null, "Confirma Exclusão?", "Sistema", dialogButton); //FUNCIONA AGORA!
            if (perg == JOptionPane.NO_OPTION) {
            } else {
                est_prod.excluirLinha(conn, codint, recebe_descricao);
            }

            carregaGridComposicao();
            limpa_dados();
        } catch (SQLException ex) {
            Logger.getLogger(Gera_PF_Existente_e_Altera_Composicao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBexcluirActionPerformed

    private void jBsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBsairActionPerformed

    private void jBconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBconsultarActionPerformed
        try {
            carregaGridComposicao();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar Composição!", "Mensagem do Sistema ", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Gera_PF_Existente_e_Altera_Composicao.class.getName()).log(Level.SEVERE, null, ex);
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
            Estoque_prod_final est_prod = new Estoque_prod_final();
            recebe_qtd = Integer.parseInt(jFTFquant.getText());
            recebe_material = jCBmateria.getSelectedItem().toString();

            est_prod.setMaterial(recebe_material);
            est_prod.setQtd(recebe_qtd);

            int perg = JOptionPane.showConfirmDialog(null, "Confirma Alteração?", "Sistema", dialogButton);

            if (perg == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Alteração Cancelada!", "Mensagem do Sistema ", JOptionPane.INFORMATION_MESSAGE); //funcionando!
                limpa_dados();
            } else {
                est_prod.alterarComposicao(conn, recebe_material);
                // efetiva Alteração
                conn.commit();
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não deixe campos em branco!", "Mensagem do Sistema ", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Gera_PF_Existente_e_Altera_Composicao.class.getName()).log(Level.SEVERE, null, ex);
        }
        limpa_dados();
        try {
            carregaGridComposicao();
        } catch (SQLException ex) {
            Logger.getLogger(Gera_PF_Existente_e_Altera_Composicao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jBalterarActionPerformed

    private void jTableComposicaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableComposicaoMouseClicked
        String var_cod;
        int var_Lin = 0;
        var_Lin = jTableComposicao.getSelectedRow(); //retorna um inteiro
        var_cod = jTableComposicao.getValueAt(var_Lin, 0).toString(); // Valor Chave da Tabela
        jTFcod.setText(var_cod);
        codint = Integer.parseInt(var_cod);

        jCBmateria.setSelectedItem(jTableComposicao.getValueAt(var_Lin, 1).toString());
        jFTFquant.setText(jTableComposicao.getValueAt(var_Lin, 2).toString());


    }//GEN-LAST:event_jTableComposicaoMouseClicked

    private void jFTFquantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTFquantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTFquantActionPerformed

    private void jbProduzMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProduzMateriaActionPerformed

        try {
            int num_linhas = jTableComp.getRowCount(); //Número de linhas comanda o for
//            JOptionPane.showMessageDialog(null, "Linhas: " + num_linhas, "Contador! ", JOptionPane.INFORMATION_MESSAGE);

            String[] material = new String[10];
            int i;

            for (i = 0; i < num_linhas; i++) { //Armazena o produto de todas as linhas
                material[i] = (jTableComposicao.getValueAt(i, 1).toString()); //Não deixa adicionar 2x o mesmo produto!
            }

            int[] qtd_desejada = new int[10]; //Digita a quantidade e aperta enter, senão dá erro (NULO)!

            for (i = 0; i < num_linhas; i++) { //Armazena a quantidade desejada que foi digitada em todas as linhas
                qtd_desejada[i] = Integer.parseInt(jTableComp.getValueAt(i, 2).toString()); //Esta já é a tabela de criação!
            }

//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            //Conexão com BD
            Connection conn = null; //Chama as conexões
            Conexao bd = new Conexao();

            conn = bd.obterConexao(); //Abre a conexão

            //Prepara comandos sql
            Statement stmt = null; //Parâmetros, valores a serem informados
            ResultSet rs = null; //Pega os resultados do select
            PreparedStatement stm = null;
            String sqlPegaDados;

            int[] qtd_tabela = new int[10]; //Qtds do estoque pra comparar no final e descontar do estoque se tiver suficiente em TODOS.

            for (i = 0; i < num_linhas; i++) {

                sqlPegaDados = "SELECT Qtd FROM estoque_materia WHERE Descricao='" + material[i] + "'";
                stmt = conn.createStatement();
                rs = stmt.executeQuery(sqlPegaDados); //Executa o select

                while (rs.next()) { //lê todos os registros
                    qtd_tabela[i] = rs.getInt("Qtd"); //Armazena as qts do estoque
                }

            }

            String sqlAtualizaEstoque;

            int qtdEstoque[] = new int[10]; //Operação pra descontar as qtds

            for (i = 0; i < num_linhas; i++) {//Modo genérico! Tentar bloquear o botão até ter estoque suficiente

                qtdEstoque[i] = qtd_tabela[i] - qtd_desejada[i];
                sqlAtualizaEstoque = "UPDATE estoque_materia SET Qtd=? WHERE Descricao='" + material[i] + "'";
                stm = conn.prepareStatement(sqlAtualizaEstoque);
                stm.setInt(1, qtdEstoque[i]); //Atualiza a quantidade do estoque

                stm.execute();
            }

            //Pega dados para mandar à tela de ordem de produção
            Estoque_prod_final est_prod = new Estoque_prod_final();

            recebe_descricao = jcbGeraProdutos.getSelectedItem().toString();
            int qtd = Integer.parseInt(jFTFqtd.getText());
            String recebe_data = jFTFdataFinaliza.getText();

            String sqlPegaMedidas = "SELECT Medidas FROM estoque_prod_final WHERE Produto='" + recebe_descricao + "'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sqlPegaMedidas); //Executa o select

            String medidas = null;

            while (rs.next()) { //lê todos os registros
                medidas = rs.getString("Medidas"); //Armazena as qts do estoque
            }

            est_prod.setProduto(recebe_descricao);
            est_prod.setMedidas(medidas);
            est_prod.setVencimento(recebe_data);
            est_prod.setQtd(qtd);

            est_prod.AdicionaOrdemProducao(conn); //Manda produzir (Ordem de Produção)

            jcbGeraProdutos.setSelectedItem(0);
            jFTFqtd.setText("");
            jFTFdataFinaliza.setText("");

        } catch (SQLException ex) {
            Logger.getLogger(Gera_PF_Existente_e_Altera_Composicao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbProduzMateriaActionPerformed

    private void jVerificaEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jVerificaEstoqueActionPerformed

        try {

            DefaultTableModel grid0 = (DefaultTableModel) jTableComp.getModel();
            grid0.setNumRows(0);

            //Conexão
            Connection conn = null; //Chama as conexões
            Conexao bd = new Conexao();
            try {
                conn = bd.obterConexao(); //Abre a conexão
            } catch (SQLException ex) {
                Logger.getLogger(Gera_PF_Existente_e_Altera_Composicao.class.getName()).log(Level.SEVERE, null, ex);
            }

            //Prepara comandos sql
            Statement stmt = null; //Parâmetros, valores a serem informados
            ResultSet rs = null; //Pega os resultados do select
            String sqlConsulta = null;

            String recebe_produto = jcbGeraProdutos.getSelectedItem().toString();
            int recebe_parcelas = Integer.parseInt(jFTFqtd.getText());

            int pegaCod = 0;

            String sqlPegaCod = "Select Idproduto from estoque_prod_final WHERE Produto = '" + recebe_produto + "'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sqlPegaCod);

            while (rs.next()) { //Pega o código do PF
                pegaCod = rs.getInt("Idproduto");
            }

            sqlConsulta = "Select * from composicao_produto WHERE Idproduto ='" + pegaCod + "' order by Material";

            stmt = conn.createStatement();
            rs = stmt.executeQuery(sqlConsulta); //Executa o select

            while (rs.next()) { //lê todos os registros
                recebe_id = rs.getInt("Idproduto");
                recebe_material = rs.getString("Material");
                recebe_qtd = rs.getInt("Qtd");

                // Mostra os valores na JTable
                DefaultTableModel grid = (DefaultTableModel) jTableComp.getModel();
                grid.addRow(new Object[]{recebe_id, recebe_material, recebe_qtd * recebe_parcelas}); //Qtd que será gasta
            }

            rs.close();
            stmt.close();

            ///////////////////////////////////////////////////////////////////////////////////////////////////
            //Agora verifica se tem estoque suficiente
            int num_linhas = jTableComp.getRowCount(); //Número de linhas comanda o for
//            JOptionPane.showMessageDialog(null, "Linhas: " + num_linhas, "Contador! ", JOptionPane.INFORMATION_MESSAGE);

            String[] material = new String[10];
            int i;

            for (i = 0; i < num_linhas; i++) { //Armazena o material de todas as linhas
                material[i] = (jTableComp.getValueAt(i, 1).toString());
            }

            int[] qtd_desejada = new int[10]; //Digita a quantidade e aperta enter, senão dá erro (NULO)!

            for (i = 0; i < num_linhas; i++) { //Armazena a quantidade desejada de todas as linhas
                qtd_desejada[i] = Integer.parseInt(jTableComp.getValueAt(i, 2).toString()); //Esta já é a tabela de criação!
            }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            try {
                conn = bd.obterConexao(); //Abre a conexão
            } catch (SQLException ex) {
                Logger.getLogger(Gera_PF_Existente_e_Altera_Composicao.class.getName()).log(Level.SEVERE, null, ex);
            }

            //Prepara comandos sql
            PreparedStatement stm = null;
            String sqlPegaDados;

            int[] qtd_estoque = new int[10]; //Qtds do estoque pra comparar no final e descontar do estoque se tiver suficiente em TODOS.

            for (i = 0; i < num_linhas; i++) {

                try {
                    sqlPegaDados = "SELECT Qtd FROM estoque_materia WHERE Descricao='" + material[i] + "'";
                    stmt = conn.createStatement();
                    rs = stmt.executeQuery(sqlPegaDados); //Executa o select

                    while (rs.next()) { //lê todos os registros
                        qtd_estoque[i] = rs.getInt("Qtd"); //Armazena as qts do estoque
                    }

                    if (qtd_desejada[i] > qtd_estoque[i]) {
                        JOptionPane.showMessageDialog(null, "Desejado: " + qtd_desejada[i] + " - " + material[i] + " --> Estoque: " + qtd_estoque[i], "Não há estoque suficiente!", JOptionPane.ERROR_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Gasta: " + qtd_desejada[i] + " - " + material[i] + " --> Tem: " + qtd_estoque[i], "BELEZA!!!", JOptionPane.INFORMATION_MESSAGE);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(Gera_PF_Existente_e_Altera_Composicao.class.getName()).log(Level.SEVERE, null, ex);
                }
            } //Até aqui funciona!

        } catch (SQLException ex) {
            Logger.getLogger(Gera_PF_Existente_e_Altera_Composicao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jVerificaEstoqueActionPerformed

    private void jcbGeraProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbGeraProdutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbGeraProdutosActionPerformed

    private void jTableCompMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableCompMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTableCompMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Estoque_Produto_Final estoque_prodFinal = new Estoque_Produto_Final();
        jDesktopPane1.add(estoque_prodFinal);
        estoque_prodFinal.setVisible(true);
        estoque_prodFinal.setPosicao();
    }//GEN-LAST:event_jButton1ActionPerformed

    //Métodos para limpar campos e mostrar dados na tabela
    public void limpa_dados() {
        jTFcod.setText("");
        jcbProdutos.setSelectedItem(0);
        jCBmateria.setSelectedItem(0);
        jFTFquant.setText("");
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void carregaGridComposicao() throws SQLException {
        //Limpar o Grid´pra não ficar com 1000 linhas
        DefaultTableModel grid0 = (DefaultTableModel) jTableComposicao.getModel();
        grid0.setNumRows(0);

        //Conexão
        Connection conn = null; //Chama as conexões
        Conexao bd = new Conexao();
        conn = bd.obterConexao(); //Abre a conexão

        //Prepara comandos sql
        Statement stmt = null; //Parâmetros, valores a serem informados
        ResultSet rs = null; //Pega os resultados do select
        String sqlConsulta = null;
        String sqlPegaCod;

        String prodSelecionado = jcbProdutos.getSelectedItem().toString();
        int pegaCod = 0;

        if (prodSelecionado != "") {

            sqlPegaCod = "Select Idproduto from estoque_prod_final WHERE Produto = '" + prodSelecionado + "'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sqlPegaCod);

            while (rs.next()) { //Pega o código do PF
                pegaCod = rs.getInt("Idproduto");
            }

            sqlConsulta = "Select * from composicao_produto WHERE Idproduto = '" + pegaCod + "' order by Material";

        } else {

        }

        stmt = conn.createStatement();
        rs = stmt.executeQuery(sqlConsulta); //Executa o select

        try {
            while (rs.next()) { //lê todos os registros
                recebe_id = rs.getInt("Idproduto");
                recebe_material = rs.getString("Material");
                recebe_qtd = rs.getInt("Qtd");

                // Mostra os valores na JTable
                DefaultTableModel grid = (DefaultTableModel) jTableComposicao.getModel();
                grid.addRow(new Object[]{recebe_id, recebe_material, recebe_qtd});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar Estoque de Produtos!", "Mensagem do Sistema ", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Gera_PF_Existente_e_Altera_Composicao.class.getName()).log(Level.SEVERE, null, ex);
        }

        rs.close();
        stmt.close();
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void preencherCBProdFinal() {

        try {
            //Limpar o ComboBox pra não ficar com 1000 linhas
            jcbProdutos.removeAllItems();
            jcbGeraProdutos.removeAllItems(); //Já trabalha os dois juntos, já que recebem os mesmos valores

            //Conexão
            Conexao bd = new Conexao();
            Connection conn = bd.obterConexao(); //Abre a conexão

            //Prepara comandos sql
            Statement stmt = conn.createStatement();
            String sqlConsulta = "Select Produto from estoque_prod_final order by Produto";

            ResultSet rs = stmt.executeQuery(sqlConsulta); //Executa o select

            rs.first();  //pega sempre a primeira linha

            do {
                jcbProdutos.addItem(rs.getString("Produto"));
                jcbGeraProdutos.addItem(rs.getString("Produto"));
            } while (rs.next());  //lê todos os registros
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao colocar no CB de Produto Final!", "Mensagem do Sistema ", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Gera_PF_Existente_e_Altera_Composicao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void preencherCBmateria() {

        try {
            //Limpar o ComboBox pra não ficar com 1000 linhas
            jCBmateria.removeAllItems();

            //Conexão
            Conexao bd = new Conexao();
            Connection conn = bd.obterConexao(); //Abre a conexão

            //Prepara comandos sql
            Statement stmt = conn.createStatement();
            String sqlConsulta = "Select Material from composicao_produto order by Material";

            ResultSet rs = stmt.executeQuery(sqlConsulta); //Executa o select

            rs.first();  //pega sempre a primeira linha

            do {
                jCBmateria.addItem(rs.getString("Material"));
            } while (rs.next());  //lê todos os registros
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao colocar no CB!", "Mensagem do Sistema ", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Estoque_materia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jBalterar;
    private javax.swing.JButton jBconsultar;
    private javax.swing.JButton jBexcluir;
    private javax.swing.JButton jBsair;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jCBmateria;
    private javax.swing.JFormattedTextField jFTFdataFinaliza;
    private javax.swing.JFormattedTextField jFTFqtd;
    private javax.swing.JFormattedTextField jFTFquant;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTFcod;
    private javax.swing.JTable jTableComp;
    private javax.swing.JTable jTableComposicao;
    private javax.swing.JButton jVerificaEstoque;
    private javax.swing.JButton jbProduzMateria;
    private javax.swing.JComboBox<String> jcbGeraProdutos;
    private javax.swing.JComboBox<String> jcbProdutos;
    // End of variables declaration//GEN-END:variables
}
