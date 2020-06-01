package View;

import Bean.Contas;
import Bean.Estoque_mat_prima;
import Connection.Conexao;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 20171inf0295
 */
public class Estoque_materia extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadastro
     */
    public Estoque_materia() {
        initComponents();
        preencherCBProdutos();
        preencherCBForn();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTFdescricao = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEstoqueMateria = new javax.swing.JTable();
        jBalterar = new javax.swing.JButton();
        jBgravar1 = new javax.swing.JButton();
        jBexcluir = new javax.swing.JButton();
        jBconsultar = new javax.swing.JButton();
        jBsair = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTFcod = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTFmedida = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jCBcomprar_materia = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jFTFqtd_comprar = new javax.swing.JFormattedTextField();
        jbCompraMateria = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jFTFqtdParcelas = new javax.swing.JFormattedTextField();
        jLabel5 = new javax.swing.JLabel();
        radio_alfa = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jCBfornecedor = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jFTFpreco_compra = new javax.swing.JFormattedTextField();
        jFTFqtd = new javax.swing.JFormattedTextField();

        setTitle("Estoque de matérias-primas");

        jTFdescricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFdescricaoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Descrição:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Quantidade:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Fornecedor:");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTableEstoqueMateria.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, null));
        jTableEstoqueMateria.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Descrição", "Qtd", "Medida", "Fornecedor", "R$ Preço p/ unid. medida (R$)"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableEstoqueMateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableEstoqueMateriaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEstoqueMateria);

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

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Preço p/ unidade de medida:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Medida:");

        jTFmedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFmedidaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("R$");

        jSeparator2.setForeground(new java.awt.Color(0, 51, 51));
        jSeparator2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3), "Comprar mais materia", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N
        jPanel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jCBcomprar_materia.setMaximumRowCount(100);
        jCBcomprar_materia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jCBcomprar_materia.setName(""); // NOI18N
        jCBcomprar_materia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBcomprar_materiaActionPerformed(evt);
            }
        });

        jLabel9.setText("Produto:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("x");

        jFTFqtd_comprar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFTFqtd_comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTFqtd_comprarActionPerformed(evt);
            }
        });

        jbCompraMateria.setBackground(new java.awt.Color(0, 204, 204));
        jbCompraMateria.setText("Comprar");
        jbCompraMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCompraMateriaActionPerformed(evt);
            }
        });

        jLabel12.setText("Quantidade:");

        jLabel13.setText("Número de parcelas:");

        jFTFqtdParcelas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCBcomprar_materia, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10))
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jFTFqtd_comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jFTFqtdParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jbCompraMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBcomprar_materia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jFTFqtd_comprar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFTFqtdParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCompraMateria))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Estoque de matérias primas");

        buttonGroup1.add(radio_alfa);
        radio_alfa.setText("Ordem alfabética");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("ID");

        jCBfornecedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jCBfornecedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBfornecedorActionPerformed(evt);
            }
        });

        jButton1.setText("+");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("↻");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jFTFpreco_compra.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        jFTFqtd.setEditable(false);
        jFTFqtd.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel8)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jFTFpreco_compra, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(36, 36, 36)
                            .addComponent(jBgravar1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jCBfornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jTFcod, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel3)
                                    .addComponent(jFTFqtd, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jTFmedida, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jTFdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(305, 305, 305)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(282, Short.MAX_VALUE))
            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(radio_alfa)
                        .addGap(18, 18, 18)
                        .addComponent(jBconsultar)
                        .addGap(121, 121, 121)
                        .addComponent(jBalterar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139)
                        .addComponent(jBexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jBsair)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(203, 203, 203))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(12, 12, 12)
                                .addComponent(jTFcod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTFdescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTFmedida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jFTFqtd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCBfornecedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(11, 11, 11)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jBgravar1)
                            .addComponent(jFTFpreco_compra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jBexcluir)
                            .addComponent(jBalterar)
                            .addComponent(jBconsultar)
                            .addComponent(radio_alfa)
                            .addComponent(jRadioButton1))
                        .addGap(32, 32, 32)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBsair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.getAccessibleContext().setAccessibleName("Comprar mais matéria");

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
    public double recebe_preco_compra;
    public int recebe_id;
    public int codint;
    public int parcelas;
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
            Estoque_mat_prima est_mat = new Estoque_mat_prima();
            int perg = JOptionPane.showConfirmDialog(null, "Confirma Exclusão?", "Sistema", dialogButton); //FUNCIONA AGORA!
            if (perg == JOptionPane.NO_OPTION) {
            } else {
                est_mat.excluir(conn, codint);
            }
            carregaGrid();
            limpa_dados();

        } catch (SQLException ex) {
            Logger.getLogger(Estoque_materia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBexcluirActionPerformed

    private void jBsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBsairActionPerformed

    private void jBgravar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBgravar1ActionPerformed

        // Recebe os valores da tela
        String recebeDesc = jTFdescricao.getText();
        int recebeQtd = 0; //Só cadastra, pois não comprou ainda
        String recebeMed = jTFmedida.getText();
        String recebeForn = jCBfornecedor.getSelectedItem().toString();
        double recebePreco_compra = Double.parseDouble(jFTFpreco_compra.getText().replace(",", "."));

        // obtem Conexão com o banco
        Connection conn = null;
        Conexao bd = new Conexao();
        try {
            conn = bd.obterConexao();
        } catch (SQLException ex) {
            Logger.getLogger(Estoque_materia.class.getName()).log(Level.SEVERE, null, ex);
        }
        Estoque_mat_prima est_mat = new Estoque_mat_prima();
        est_mat.setDescricao(recebeDesc);
        est_mat.setQtd(recebeQtd);
        est_mat.setUnidade(recebeMed);
        est_mat.setFornecedor(recebeForn);
        est_mat.setPrecoCompra(recebePreco_compra);

        try {
            est_mat.incluir(conn);
        } catch (SQLException ex) {
            Logger.getLogger(Estoque_materia.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            carregaGrid();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não salve com campos em branco!", "Mensagem do Sistema ", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Estoque_materia.class.getName()).log(Level.SEVERE, null, ex);
        }
        limpa_dados();
        preencherCBProdutos();


    }//GEN-LAST:event_jBgravar1ActionPerformed

    private void jBconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBconsultarActionPerformed
        try {
            carregaGrid();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar tabela!", "Mensagem do Sistema ", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Estoque_materia.class.getName()).log(Level.SEVERE, null, ex);
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
            Estoque_mat_prima est_mat = new Estoque_mat_prima();
            recebe_descricao = jTFdescricao.getText();
//            recebe_qtd = Integer.parseInt(jFTFqtd.getText());
            recebe_medida = jTFmedida.getText();
            recebe_forn = jCBfornecedor.getSelectedItem().toString();
            recebe_preco_compra = Double.parseDouble((jFTFpreco_compra.getText().replace(",", ".")));

            est_mat.setDescricao(recebe_descricao);
//            est_mat.setQtd(recebe_qtd);
            est_mat.setUnidade(recebe_medida);
            est_mat.setFornecedor(recebe_forn);
            est_mat.setPrecoCompra(recebe_preco_compra);

            int perg = JOptionPane.showConfirmDialog(null, "Confirma Alteração?", "Sistema", dialogButton);

            if (perg == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "Alteração Cancelada!", "Mensagem do Sistema ", JOptionPane.INFORMATION_MESSAGE); //funcionando!
            } else {
                est_mat.alterar(conn, codint);
                // efetiva Alteração
                conn.commit();
                carregaGrid();

            }

        } catch (SQLException ex) {
            Logger.getLogger(Estoque_materia.class.getName()).log(Level.SEVERE, null, ex);
        }
        limpa_dados();

    }//GEN-LAST:event_jBalterarActionPerformed

    private void jTableEstoqueMateriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEstoqueMateriaMouseClicked
        String var_cod;
        int var_Lin = 0;
        var_Lin = jTableEstoqueMateria.getSelectedRow(); //retorna um inteiro
        var_cod = jTableEstoqueMateria.getValueAt(var_Lin, 0).toString(); // Valor Chave da Tabela
        jTFcod.setText(var_cod);
        codint = Integer.parseInt(var_cod);

        jTFdescricao.setText(jTableEstoqueMateria.getValueAt(var_Lin, 1).toString());
        jFTFqtd.setText(jTableEstoqueMateria.getValueAt(var_Lin, 2).toString());
        jFTFqtd.setEnabled(false); // BLOQUEAR A EDIÇÃO DA QTD 
        jTFmedida.setText(jTableEstoqueMateria.getValueAt(var_Lin, 3).toString());
        jCBfornecedor.setSelectedItem(jTableEstoqueMateria.getValueAt(var_Lin, 4).toString());
        jFTFpreco_compra.setText(jTableEstoqueMateria.getValueAt(var_Lin, 5).toString());

    }//GEN-LAST:event_jTableEstoqueMateriaMouseClicked

    private void jTFmedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFmedidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFmedidaActionPerformed

    private void jFTFqtd_comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTFqtd_comprarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTFqtd_comprarActionPerformed

    private void jCBcomprar_materiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBcomprar_materiaActionPerformed

    }//GEN-LAST:event_jCBcomprar_materiaActionPerformed

    private void jbCompraMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCompraMateriaActionPerformed
        try {
            int quantComprar = Integer.parseInt(jFTFqtd_comprar.getText());
            recebe_descricao = jCBcomprar_materia.getSelectedItem().toString();
            parcelas = Integer.parseInt(jFTFqtdParcelas.getText()); //Pega a data de vencimento

            Connection conn = null; //Chama as conexões
            Conexao bd = new Conexao();
            conn = bd.obterConexao(); //Abre a conexão

            //Prepara comandos sql
            Statement stmt = null; //Parâmetros, valores a serem informados
            ResultSet rs = null; //Pega os resultados do select

            String sqlPegaDados = "SELECT Fornecedor, Preco_compra FROM estoque_materia WHERE Descricao='" + recebe_descricao + "'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sqlPegaDados); //Executa o select                    ; 

            while (rs.next()) { //lê todos os registros
                recebe_forn = rs.getString("Fornecedor");
                recebe_preco_compra = rs.getDouble("Preco_compra");
            }

            double totalCompra = quantComprar * recebe_preco_compra; //Total a pagar
            JOptionPane.showMessageDialog(null, "Total da compra: R$" + totalCompra, "Compra Efetuada com Sucesso! ", JOptionPane.INFORMATION_MESSAGE);

            ///////////////////////////////////////////////////////////
            Contas cont = new Contas();
            double valParcelas = cont.Calcula_parcelas(parcelas, totalCompra); //calcula o valor das parcelas
            Estoque_mat_prima estMatPrima = new Estoque_mat_prima();

            //Mostrar as parcelas
            DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
            Date hoje = new Date();
            String datah;
            datah = formatador.format(hoje); //Trabalha as datas de vencimento

            Calendar c = Calendar.getInstance();
            c.setTime(hoje);

            int i;

            estMatPrima.setFornecedor(recebe_forn);
            estMatPrima.setDescricao(recebe_descricao);
            estMatPrima.setPrecoCompra(recebe_preco_compra);
            estMatPrima.setQtd(quantComprar);
//            estMatPrima.setTotal(totalCompra);

            estMatPrima.AdicionaEncomendas(conn, totalCompra); //Adiciona na tela de encomendas

//            estMatPrima.adicionaMateria(conn, recebe_descricao, quantComprar); //adicona a materia no estoque
            for (i = 0; i < parcelas; i++) {
                c.add(Calendar.MONTH, +1); //Acrescentar 1 mês na data atual
                Date dataAvante = c.getTime(); //Classe Data de novo

                //Manda para a tela de contas a pagar
                estMatPrima.setTotal(valParcelas);
                estMatPrima.setVencimento(formatador.format(dataAvante));
                estMatPrima.AdicionaContaPagar(conn); //Adiciona itens no estoque
            }

            jFTFqtd_comprar.setText(""); //Limpa os campos usados
            jFTFqtdParcelas.setText("");

        } catch (SQLException ex) {
            Logger.getLogger(Estoque_materia.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            carregaGrid();
        } catch (SQLException ex) {
            Logger.getLogger(Estoque_materia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbCompraMateriaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TelaCadFornecedor tela_Forn = new TelaCadFornecedor();
        Menu.jDesktopPane1.add(tela_Forn);
        tela_Forn.setVisible(true);
        tela_Forn.setPosicao();
        preencherCBForn();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCBfornecedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBfornecedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBfornecedorActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.update(getGraphics()); //Atualiza a tela
        preencherCBForn();
        preencherCBProdutos();
    }//GEN-LAST:event_jButton2ActionPerformed

    //Métodos para limpar campos e mostrar dados na tabela
    public void limpa_dados() {
        jTFcod.setText("");
        jTFdescricao.setText("");
        jFTFqtd.setText("");
        jTFmedida.setText("");
        jCBfornecedor.setSelectedItem(0);
        jFTFpreco_compra.setText("");
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void carregaGrid() throws SQLException {
        //Limpar o Grid´pra não ficar com 1000 linhas
        DefaultTableModel grid0 = (DefaultTableModel) jTableEstoqueMateria.getModel();
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
            sqlConsulta = "Select * from estoque_materia order by Descricao";
        } else {
            sqlConsulta = "Select * from estoque_materia order by Idmateria";
        }
        stmt = conn.createStatement();
        rs = stmt.executeQuery(sqlConsulta); //Executa o select

        try {
            while (rs.next()) { //lê todos os registros
                recebe_id = rs.getInt("Idmateria");
                recebe_descricao = rs.getString("Descricao");
                recebe_qtd = rs.getInt("Qtd");
                recebe_medida = rs.getString("Unid_medida");
                recebe_forn = rs.getString("Fornecedor");
                recebe_preco_compra = rs.getDouble("Preco_compra");

                // Mostra os valores na JTable
                DefaultTableModel grid = (DefaultTableModel) jTableEstoqueMateria.getModel();
                grid.addRow(new Object[]{recebe_id, recebe_descricao, recebe_qtd, recebe_medida, recebe_forn, recebe_preco_compra});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar grid!", "Mensagem do Sistema ", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Estoque_materia.class.getName()).log(Level.SEVERE, null, ex);
        }

        rs.close();
        stmt.close();
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void preencherCBProdutos() {

        try {
            //Limpar o ComboBox pra não ficar com 1000 linhas
            jCBcomprar_materia.removeAllItems();

            //Conexão
            Conexao bd = new Conexao();
            Connection conn = bd.obterConexao(); //Abre a conexão

            //Prepara comandos sql
            Statement stmt = conn.createStatement();
            String sqlConsulta = "Select Descricao from estoque_materia order by Descricao";

            ResultSet rs = stmt.executeQuery(sqlConsulta); //Executa o select

            rs.first();  //pega sempre a primeira linha

            do {
                jCBcomprar_materia.addItem(rs.getString("Descricao"));
            } while (rs.next());  //lê todos os registros
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao colocar no CB!", "Mensagem do Sistema ", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Estoque_materia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void preencherCBForn() {

        try {
            //Limpar o ComboBox pra não ficar com 1000 linhas
            jCBfornecedor.removeAllItems();

            //Conexão
            Conexao bd = new Conexao();
            Connection conn = bd.obterConexao(); //Abre a conexão

            //Prepara comandos sql
            Statement stmt = conn.createStatement();
            String sqlConsulta = "Select Nome from Fornecedor order by Nome";

            ResultSet rs = stmt.executeQuery(sqlConsulta); //Executa o select

            rs.first();  //pega sempre a primeira linha

            do {
                jCBfornecedor.addItem(rs.getString("Nome"));
            } while (rs.next());  //lê todos os registros
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao colocar no CB de Fornecedor!", "Mensagem do Sistema ", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(Estoque_materia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jBalterar;
    private javax.swing.JButton jBconsultar;
    private javax.swing.JButton jBexcluir;
    private javax.swing.JButton jBgravar1;
    private javax.swing.JButton jBsair;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jCBcomprar_materia;
    private javax.swing.JComboBox<String> jCBfornecedor;
    private javax.swing.JFormattedTextField jFTFpreco_compra;
    private javax.swing.JFormattedTextField jFTFqtd;
    private javax.swing.JFormattedTextField jFTFqtdParcelas;
    private javax.swing.JFormattedTextField jFTFqtd_comprar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTFcod;
    private javax.swing.JTextField jTFdescricao;
    private javax.swing.JTextField jTFmedida;
    private javax.swing.JTable jTableEstoqueMateria;
    private javax.swing.JButton jbCompraMateria;
    private javax.swing.JRadioButton radio_alfa;
    // End of variables declaration//GEN-END:variables
}
