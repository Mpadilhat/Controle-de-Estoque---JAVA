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
public class Estoque_Produto_Final extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadastro
     */
    public Estoque_Produto_Final() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTFdescricao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEstoqueProdutoFinal = new javax.swing.JTable();
        jBalterar = new javax.swing.JButton();
        jBexcluir = new javax.swing.JButton();
        jBconsultarProdFinal = new javax.swing.JButton();
        jBsair = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTFcod = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTFmedida = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        radio_alfa = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jbProduzMateria = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableGeraProduto = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableEstoque = new javax.swing.JTable();
        jTFmedidas = new javax.swing.JTextField();
        jTFnomeProduto = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jBconsultarMaterial = new javax.swing.JButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        radio_alfa1 = new javax.swing.JRadioButton();
        jBremoveLinha = new javax.swing.JButton();
        jBchamaTelaMaterial = new javax.swing.JButton();
        jBgerarProd_AlteraComposicao = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jFTFquant = new javax.swing.JFormattedTextField();
        jFTFpreco_unid = new javax.swing.JFormattedTextField();

        setTitle("Estoque de Produto Final");

        jTFdescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFdescricaoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Produto:");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTableEstoqueProdutoFinal.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, null));
        jTableEstoqueProdutoFinal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "IDProduto", "Produto", "Medidas", "Qtd", "Preço por unidade (R$)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableEstoqueProdutoFinal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEstoqueProdutoFinalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEstoqueProdutoFinal);

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

        jBconsultarProdFinal.setBackground(new java.awt.Color(0, 204, 255));
        jBconsultarProdFinal.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBconsultarProdFinal.setText("Consultar");
        jBconsultarProdFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBconsultarProdFinalActionPerformed(evt);
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

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Preço p/ unidade:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Medidas:");

        jTFmedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFmedidaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("R$");

        jSeparator2.setForeground(new java.awt.Color(0, 51, 51));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Estoque de Produto Final");

        buttonGroup1.add(radio_alfa);
        radio_alfa.setText("Ordem alfabética");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("ID");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Cadastrar produto final", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 20))); // NOI18N

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setText("Estoque de matérias:");

        jLabel12.setText("Medidas:");

        jbProduzMateria.setBackground(new java.awt.Color(51, 255, 0));
        jbProduzMateria.setText("Cadastrar");
        jbProduzMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProduzMateriaActionPerformed(evt);
            }
        });

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTableGeraProduto.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, null));
        jTableGeraProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Matéria", "Quantidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableGeraProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableGeraProdutoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableGeraProduto);

        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTableEstoque.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, null));
        jTableEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "IDMateria", "Matéria", "Qtd"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableEstoque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEstoqueMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTableEstoque);

        jTFmedidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFmedidasActionPerformed(evt);
            }
        });

        jTFnomeProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFnomeProdutoActionPerformed(evt);
            }
        });

        jLabel13.setText("Nome do produto:");

        jBconsultarMaterial.setBackground(new java.awt.Color(0, 204, 255));
        jBconsultarMaterial.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jBconsultarMaterial.setText("Consultar");
        jBconsultarMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBconsultarMaterialActionPerformed(evt);
            }
        });

        buttonGroup2.add(jRadioButton2);
        jRadioButton2.setSelected(true);
        jRadioButton2.setText("ID");

        buttonGroup2.add(radio_alfa1);
        radio_alfa1.setText("Ordem alfabética");

        jBremoveLinha.setText("Remover linha");
        jBremoveLinha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBremoveLinhaActionPerformed(evt);
            }
        });

        jBchamaTelaMaterial.setText("Novo material");
        jBchamaTelaMaterial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBchamaTelaMaterialActionPerformed(evt);
            }
        });

        jBgerarProd_AlteraComposicao.setText("Gerar produto existente");
        jBgerarProd_AlteraComposicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBgerarProd_AlteraComposicaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton2)
                        .addGap(18, 18, 18)
                        .addComponent(radio_alfa1)
                        .addGap(18, 18, 18)
                        .addComponent(jBconsultarMaterial))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jBchamaTelaMaterial)))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFnomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTFmedidas, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbProduzMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 643, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jBgerarProd_AlteraComposicao, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBremoveLinha)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFmedidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12)
                            .addComponent(jTFnomeProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(jbProduzMateria))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jBconsultarMaterial)
                                .addComponent(radio_alfa1)
                                .addComponent(jRadioButton2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBchamaTelaMaterial)
                    .addComponent(jBgerarProd_AlteraComposicao)
                    .addComponent(jBremoveLinha))
                .addGap(67, 67, 67))
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setText("Quantidade:");

        jFTFquant.setEditable(false);
        jFTFquant.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFTFquant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTFquantActionPerformed(evt);
            }
        });

        jFTFpreco_unid.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#,##0.00"))));
        jFTFpreco_unid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTFpreco_unidActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jFTFpreco_unid, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)
                            .addComponent(jBalterar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12))
                        .addComponent(jLabel1)
                        .addComponent(jLabel4)
                        .addComponent(jTFcod, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTFdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFmedida, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jFTFquant, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(180, 180, 180)
                        .addComponent(jBsair))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 885, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(radio_alfa)
                        .addGap(18, 18, 18)
                        .addComponent(jBconsultarProdFinal)
                        .addGap(348, 348, 348)
                        .addComponent(jBexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(69, 69, 69))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBsair)
                                .addGap(40, 40, 40))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBconsultarProdFinal)
                            .addComponent(radio_alfa)
                            .addComponent(jRadioButton1)
                            .addComponent(jBexcluir)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jLabel4)
                        .addGap(12, 12, 12)
                        .addComponent(jTFcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFmedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFTFquant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jBalterar)
                            .addComponent(jFTFpreco_unid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setPosicao() { //Centraliza a tela desejada
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    public String recebe_descricao;
    public int recebe_qtd;
    public String recebe_medida;
    public String recebe_forn;
    public double recebe_preco;
    public int recebe_id;
    public int codint;
    private void jTFdescricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFdescricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFdescricaoActionPerformed

    private void jBexcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBexcluirActionPerformed
        try {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            Connection conn = null;
            Conexao bd = new Conexao();
            conn = bd.obterConexao();
            conn.setAutoCommit(false);

            Estoque_prod_final est_prod = new Estoque_prod_final();
            int perg = JOptionPane.showConfirmDialog(null, "Confirma Exclusão?", "Sistema", dialogButton); //FUNCIONA AGORA!
            if (perg == JOptionPane.NO_OPTION) {
            } else {
                est_prod.excluir(conn, codint);
            }

            carregaGridProdFinal();
            limpa_dados();
        } catch (SQLException ex) {
            Logger.getLogger(Estoque_Produto_Final.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBexcluirActionPerformed

    private void jBsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBsairActionPerformed

    private void jBconsultarProdFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBconsultarProdFinalActionPerformed
        try {
            carregaGridProdFinal();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar tabela!", "Mensagem do Sistema ", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Estoque_Produto_Final.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBconsultarProdFinalActionPerformed

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
            recebe_descricao = jTFdescricao.getText();
//            recebe_qtd = Integer.parseInt(jFTFqtd.getText());
            recebe_medida = jTFmedida.getText();
            recebe_preco = Double.parseDouble((jFTFpreco_unid.getText()).replace(",", "."));

            est_prod.setProduto(recebe_descricao);
//            est_mat.setQtd(recebe_qtd);
            est_prod.setMedidas(recebe_medida);
            est_prod.setPrecoVenda(recebe_preco);

            int perg = JOptionPane.showConfirmDialog(null, "Confirma Alteração?", "Sistema", dialogButton);

            if (perg == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Alteração Cancelada!", "Mensagem do Sistema ", JOptionPane.INFORMATION_MESSAGE); //funcionando!
            } else {
                est_prod.alterar(conn, codint);
                // efetiva Alteração
                conn.commit();
            }

        } catch (SQLException ex) {
            Logger.getLogger(Estoque_Produto_Final.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Não deixe campos em branco!", "Mensagem do Sistema ", JOptionPane.ERROR_MESSAGE);
        }
        limpa_dados();
        try {
            carregaGridProdFinal();
        } catch (SQLException ex) {
            Logger.getLogger(Estoque_Produto_Final.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jBalterarActionPerformed

    private void jTableEstoqueProdutoFinalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEstoqueProdutoFinalMouseClicked
        String var_cod;
        int var_Lin = 0;
        var_Lin = jTableEstoqueProdutoFinal.getSelectedRow(); //retorna um inteiro
        var_cod = jTableEstoqueProdutoFinal.getValueAt(var_Lin, 0).toString(); // Valor Chave da Tabela
        jTFcod.setText(var_cod);
        codint = Integer.parseInt(var_cod);

        jTFdescricao.setText(jTableEstoqueProdutoFinal.getValueAt(var_Lin, 1).toString());
        jTFmedida.setText(jTableEstoqueProdutoFinal.getValueAt(var_Lin, 2).toString());
        jFTFquant.setText(jTableEstoqueProdutoFinal.getValueAt(var_Lin, 3).toString());
        jFTFquant.setEnabled(false);
        jFTFpreco_unid.setText(jTableEstoqueProdutoFinal.getValueAt(var_Lin, 4).toString());

    }//GEN-LAST:event_jTableEstoqueProdutoFinalMouseClicked

    private void jTFmedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFmedidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFmedidaActionPerformed

    private void jbProduzMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProduzMateriaActionPerformed

        try {
            int num_linhas = jTableGeraProduto.getRowCount(); //Número de linhas comanda o for
//            JOptionPane.showMessageDialog(null, "Linhas: " + num_linhas, "Contador! ", JOptionPane.INFORMATION_MESSAGE);

            String[] material = new String[10];
            int i;

            for (i = 0; i < num_linhas; i++) { //Armazena o produto de todas as linhas
                material[i] = (jTableEstoque.getValueAt(i, 1).toString()); //Não deixa adicionar 2x o mesmo produto!
            }

            int[] qtd_desejada = new int[10]; //Digita a quantidade e aperta enter, senão dá erro (NULO)!

            for (i = 0; i < num_linhas; i++) { //Armazena a quantidade desejada que foi digitada em todas as linhas
                qtd_desejada[i] = Integer.parseInt(jTableGeraProduto.getValueAt(i, 2).toString()); //Esta já é a tabela de criação!
            }

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            //Conexão com BD
            Connection conn = null; //Chama as conexões
            Conexao bd = new Conexao();

            conn = bd.obterConexao(); //Abre a conexão

            //Incluir nos produtos finais
            Estoque_prod_final est_prod = new Estoque_prod_final();
            recebe_descricao = jTFnomeProduto.getText();
            recebe_medida = jTFmedidas.getText();

            est_prod.setProduto(recebe_descricao);
            est_prod.setQtd(0); //Só cria na tabela
            est_prod.setMedidas(recebe_medida);

            est_prod.incluir(conn);

            JOptionPane.showMessageDialog(null, "Edite o preço na tabela acima", "Editar:", JOptionPane.PLAIN_MESSAGE);

            for (i = 0; i < num_linhas; i++) {
                est_prod.incluirComposicao(conn, qtd_desejada[i], material[i], recebe_descricao); //Manda para  a tabela de composicao
            }

            DefaultTableModel gridCriaProd = (DefaultTableModel) jTableGeraProduto.getModel();
            gridCriaProd.setNumRows(0); //limpa tabela
            jTFnomeProduto.setText("");
            jTFmedidas.setText("");
            carregaGridProdFinal();
            carregaGridMateria();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não deixe campos em branco!", "Mensagem do Sistema ", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Estoque_Produto_Final.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jbProduzMateriaActionPerformed

    private void jTableGeraProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableGeraProdutoMouseClicked


    }//GEN-LAST:event_jTableGeraProdutoMouseClicked

    private void jTableEstoqueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEstoqueMouseClicked
        String var_cod;
        int var_Lin = 0;
        var_Lin = jTableEstoque.getSelectedRow(); //retorna um inteiro
        var_cod = jTableEstoque.getValueAt(var_Lin, 0).toString(); // Valor Chave da Tabela

//        codint = Integer.parseInt(var_cod);
        int cod = Integer.parseInt(var_cod);
        String materia = jTableEstoque.getValueAt(var_Lin, 1).toString();

        DefaultTableModel gridCriaProd = (DefaultTableModel) jTableGeraProduto.getModel();
        gridCriaProd.addRow(new Object[]{cod, materia});

    }//GEN-LAST:event_jTableEstoqueMouseClicked

    private void jTFmedidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFmedidasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFmedidasActionPerformed

    private void jTFnomeProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFnomeProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFnomeProdutoActionPerformed

    private void jBconsultarMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBconsultarMaterialActionPerformed
        try {
            carregaGridMateria();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar tabela de Matérias!", "Mensagem do Sistema ", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Estoque_Produto_Final.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBconsultarMaterialActionPerformed

    private void jFTFquantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTFquantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTFquantActionPerformed

    private void jBremoveLinhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBremoveLinhaActionPerformed
        DefaultTableModel gridCriaProd = (DefaultTableModel) jTableGeraProduto.getModel();
        gridCriaProd.removeRow(jTableGeraProduto.getSelectedRow());
    }//GEN-LAST:event_jBremoveLinhaActionPerformed

    private void jBchamaTelaMaterialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBchamaTelaMaterialActionPerformed
        Estoque_materia estoque_materia = new Estoque_materia();
        jDesktopPane1.add(estoque_materia);
        estoque_materia.setVisible(true);
        estoque_materia.setPosicao();
    }//GEN-LAST:event_jBchamaTelaMaterialActionPerformed

    private void jBgerarProd_AlteraComposicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBgerarProd_AlteraComposicaoActionPerformed
        Gera_PF_Existente_e_Altera_Composicao altera_composicao = new Gera_PF_Existente_e_Altera_Composicao();
        jDesktopPane1.add(altera_composicao);
        altera_composicao.setVisible(true);
        altera_composicao.setPosicao();
        altera_composicao.preencherCBProdFinal();
        altera_composicao.preencherCBmateria();
    }//GEN-LAST:event_jBgerarProd_AlteraComposicaoActionPerformed

    private void jFTFpreco_unidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTFpreco_unidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTFpreco_unidActionPerformed

    //Métodos para limpar campos e mostrar dados na tabela
    public void limpa_dados() {
        jTFcod.setText("");
        jTFdescricao.setText("");
        jTFmedida.setText("");
        jFTFpreco_unid.setText("");
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void carregaGridProdFinal() throws SQLException {
        //Limpar o Grid´pra não ficar com 1000 linhas
        DefaultTableModel grid0 = (DefaultTableModel) jTableEstoqueProdutoFinal.getModel();
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
            sqlConsulta = "Select * from estoque_prod_final order by Produto";
        } else {
            sqlConsulta = "Select * from estoque_prod_final order by Idproduto";
        }
        stmt = conn.createStatement();
        rs = stmt.executeQuery(sqlConsulta); //Executa o select

        try {
            while (rs.next()) { //lê todos os registros
                recebe_id = rs.getInt("Idproduto");
                recebe_descricao = rs.getString("Produto");
                recebe_medida = rs.getString("Medidas");
                recebe_qtd = rs.getInt("Qtd");
                recebe_preco = rs.getDouble("Preco_unit");

                // Mostra os valores na JTable
                DefaultTableModel grid = (DefaultTableModel) jTableEstoqueProdutoFinal.getModel();
                grid.addRow(new Object[]{recebe_id, recebe_descricao, recebe_medida, recebe_qtd, recebe_preco});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar Estoque de Produtos!", "Mensagem do Sistema ", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Estoque_Produto_Final.class.getName()).log(Level.SEVERE, null, ex);
        }

        rs.close();
        stmt.close();
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void carregaGridMateria() throws SQLException {
        //Limpar o Grid´pra não ficar com 1000 linhas
        DefaultTableModel grid0 = (DefaultTableModel) jTableEstoque.getModel();
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
            sqlConsulta = "Select Idmateria, Descricao, Qtd from estoque_materia order by Descricao";
        } else {
            sqlConsulta = "Select Idmateria, Descricao, Qtd from estoque_materia order by Idmateria";
        }
        stmt = conn.createStatement();
        rs = stmt.executeQuery(sqlConsulta); //Executa o select

        try {
            while (rs.next()) { //lê todos os registros
                recebe_id = rs.getInt("Idmateria");
                recebe_descricao = rs.getString("Descricao");
                recebe_qtd = rs.getInt("Qtd");

                // Mostra os valores na JTable
                DefaultTableModel grid = (DefaultTableModel) jTableEstoque.getModel();
                grid.addRow(new Object[]{recebe_id, recebe_descricao, recebe_qtd});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar estoque de Matérias!", "Mensagem do Sistema ", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Estoque_Produto_Final.class.getName()).log(Level.SEVERE, null, ex);
        }

        rs.close();
        stmt.close();
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jBalterar;
    private javax.swing.JButton jBchamaTelaMaterial;
    private javax.swing.JButton jBconsultarMaterial;
    private javax.swing.JButton jBconsultarProdFinal;
    private javax.swing.JButton jBexcluir;
    private javax.swing.JButton jBgerarProd_AlteraComposicao;
    private javax.swing.JButton jBremoveLinha;
    private javax.swing.JButton jBsair;
    private javax.swing.JFormattedTextField jFTFpreco_unid;
    private javax.swing.JFormattedTextField jFTFquant;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTFcod;
    private javax.swing.JTextField jTFdescricao;
    private javax.swing.JTextField jTFmedida;
    private javax.swing.JTextField jTFmedidas;
    private javax.swing.JTextField jTFnomeProduto;
    private javax.swing.JTable jTableEstoque;
    private javax.swing.JTable jTableEstoqueProdutoFinal;
    private javax.swing.JTable jTableGeraProduto;
    private javax.swing.JButton jbProduzMateria;
    private javax.swing.JRadioButton radio_alfa;
    private javax.swing.JRadioButton radio_alfa1;
    // End of variables declaration//GEN-END:variables
}
