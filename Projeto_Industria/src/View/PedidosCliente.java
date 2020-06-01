package View;

import Bean.Contas;
import Bean.Datas;
import Bean.Encomendas_Geral;
import Bean.Estoque_prod_final;
import Connection.Conexao;
import java.awt.Dimension;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
public class PedidosCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form TelaCadastro
     */
    public PedidosCliente() {
        initComponents();
        preencherCBProdutos();
        preencherCBcli();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableComprasCliente = new javax.swing.JTable();
        jBconsultar = new javax.swing.JButton();
        jBsair = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        radio_alfa = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jCBclientes = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jFTFqtdParcelas = new javax.swing.JFormattedTextField();
        jLabel10 = new javax.swing.JLabel();
        jCBcomprar_produto = new javax.swing.JComboBox<>();
        jFTFqtd_comprar = new javax.swing.JFormattedTextField();
        jbCompraMateria = new javax.swing.JButton();
        jBverificaEstoque = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setTitle("Pedidos do Cliente");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Cliente:");

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTableComprasCliente.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, java.awt.Color.black, null));
        jTableComprasCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "IdCompra", "Produto", "Medidas", "Qtd", "Total (R$)", "Data de compra"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableComprasCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableComprasClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableComprasCliente);

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

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Compras do Cliente");

        buttonGroup1.add(radio_alfa);
        radio_alfa.setText("Data");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setSelected(true);
        jRadioButton1.setText("ID");

        jCBclientes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jCBclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBclientesActionPerformed(evt);
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

        jLabel9.setText("Produto:");

        jLabel12.setText("Quantidade:");

        jLabel13.setText("Número de parcelas:");

        jFTFqtdParcelas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("x");

        jCBcomprar_produto.setMaximumRowCount(100);
        jCBcomprar_produto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione" }));
        jCBcomprar_produto.setName(""); // NOI18N
        jCBcomprar_produto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBcomprar_produtoActionPerformed(evt);
            }
        });

        jFTFqtd_comprar.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        jFTFqtd_comprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFTFqtd_comprarActionPerformed(evt);
            }
        });

        jbCompraMateria.setBackground(new java.awt.Color(102, 255, 51));
        jbCompraMateria.setText("Comprar");
        jbCompraMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCompraMateriaActionPerformed(evt);
            }
        });

        jBverificaEstoque.setBackground(new java.awt.Color(255, 255, 102));
        jBverificaEstoque.setText("Verifica Estoque");
        jBverificaEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBverificaEstoqueActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Selecione o cliente e clique em \"CONSULTAR\" -->");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(524, 524, 524)
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(radio_alfa)
                        .addGap(18, 18, 18)
                        .addComponent(jBconsultar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBsair))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jCBcomprar_produto, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jLabel10)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jFTFqtd_comprar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(26, 26, 26)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jFTFqtdParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jCBclientes, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(6, 6, 6)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jBverificaEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbCompraMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 895, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(99, 99, 99))
            .addGroup(layout.createSequentialGroup()
                .addGap(482, 482, 482)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel5)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCBclientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jCBcomprar_produto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jFTFqtd_comprar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jFTFqtdParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbCompraMateria)
                            .addComponent(jBverificaEstoque))
                        .addGap(43, 43, 43)
                        .addComponent(jLabel4))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBconsultar)
                    .addComponent(radio_alfa)
                    .addComponent(jRadioButton1)
                    .addComponent(jBsair))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setPosicao() { //Centraliza a tela desejada
        Dimension d = this.getDesktopPane().getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }

    public String recebe_descricao, recebe_data;
    public int recebe_qtd;
    public String recebe_medida;
    public String recebe_cliente;
    public double recebe_preco;
    public int recebe_id;
    public int codint;
    public int recebe_idCli;
    private void jBsairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsairActionPerformed
        this.dispose();
    }//GEN-LAST:event_jBsairActionPerformed

    private void jBconsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBconsultarActionPerformed
        try {
            carregaGrid();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar tabela!", "Mensagem do Sistema ", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(PedidosCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jBconsultarActionPerformed

    private void jTableComprasClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableComprasClienteMouseClicked

    }//GEN-LAST:event_jTableComprasClienteMouseClicked

    private void jFTFqtd_comprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFTFqtd_comprarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFTFqtd_comprarActionPerformed

    private void jCBcomprar_produtoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBcomprar_produtoActionPerformed

    }//GEN-LAST:event_jCBcomprar_produtoActionPerformed

    private void jbCompraMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCompraMateriaActionPerformed
        try {
            int quantComprar = Integer.parseInt(jFTFqtd_comprar.getText());
            recebe_descricao = jCBcomprar_produto.getSelectedItem().toString();
            int parcelas = Integer.parseInt(jFTFqtdParcelas.getText()); //Pega a data de vencimento
            recebe_cliente = jCBclientes.getSelectedItem().toString();

            //Conexão BD
            Connection conn = null; //Chama as conexões
            Conexao bd = new Conexao();
            conn = bd.obterConexao(); //Abre a conexão

            //Prepara comandos sql
            Statement stmt = null; //Parâmetros, valores a serem informados
            ResultSet rs = null; //Pega os resultados do select

            String sqlPegaDados = "SELECT Preco_unit FROM estoque_prod_final WHERE Produto='" + recebe_descricao + "'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sqlPegaDados); //Executa o select                    ; 

            while (rs.next()) { //lê todos os registros
                recebe_preco = rs.getDouble("Preco_unit");
            }

            double totalCompra = quantComprar * recebe_preco; //Total a pagar
            JOptionPane.showMessageDialog(null, "Total da compra: R$" + totalCompra, "Compra Efetuada com Sucesso! ", JOptionPane.INFORMATION_MESSAGE);

            ///////////////////////////////////////////////////////////
            Contas cont = new Contas();
            double valParcelas = cont.Calcula_parcelas(parcelas, totalCompra); //calcula o valor das parcelas
            Estoque_prod_final estProdFinal = new Estoque_prod_final();

            //Mostrar as parcelas
            DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
            Date hoje = new Date();
            String datah;
            datah = formatador.format(hoje); //Trabalha as datas de vencimento

            Calendar c = Calendar.getInstance();
            c.setTime(hoje);

            int i;

            estProdFinal.setCliente(recebe_cliente);
            estProdFinal.setDescricao(recebe_descricao);
            estProdFinal.setPrecoVenda(recebe_preco);
            estProdFinal.setQtd(quantComprar);

            estProdFinal.removeProduto(conn, recebe_descricao, quantComprar); //remove o produto do estoque

            for (i = 0; i < parcelas; i++) {
                c.add(Calendar.MONTH, +1); //Acrescentar 1 mês na data atual
                Date dataAvante = c.getTime(); //Classe Data de novo

                //Manda para a tela de contas a pagar
                estProdFinal.setTotal(valParcelas);
                estProdFinal.setVencimento(formatador.format(dataAvante));
                estProdFinal.AdicionaContaReceber(conn); //Adiciona itens nas contas a receber
            }

//////////////////////////////////////////////////////////////////////////////////////////////            
            
            //Pega o Idcliente
            String clienteSelecionado = jCBclientes.getSelectedItem().toString();
            int pegaCod = 0;

            String sqlPegaCod = "Select Idcliente from clientes WHERE Nome = '" + clienteSelecionado + "'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sqlPegaCod);

            while (rs.next()) { //Pega o código do PF
                pegaCod = rs.getInt("Idcliente");
            }

            //Pega a data de compra e envia no formato BD
            Datas datas = new Datas();
            String dataCompra = datas.data_paraBD();

            //Manda pra tela de compras
            Encomendas_Geral enc_ger = new Encomendas_Geral();
            
            enc_ger.setDescricao(recebe_descricao);
            enc_ger.setQtd(quantComprar);
            enc_ger.setPrecoCompra(totalCompra);
            enc_ger.setVencimento(dataCompra);

            //Pega as medidas
            String sqlBusca = "Select Medidas from estoque_prod_final WHERE Produto = '" + recebe_descricao + "'";

            stmt = conn.createStatement();
            rs = stmt.executeQuery(sqlBusca); //Executa o select

            while (rs.next()) { //lê todos os registros

                recebe_medida = rs.getString("Medidas");
            }

            //Inclui na tabela de compras
            enc_ger.incluirCompra(conn, recebe_medida, pegaCod);
            
            
///////////////////////////////////////////////////////////////////////////////            

            jFTFqtd_comprar.setText(""); //Limpa os campos usados
            jFTFqtdParcelas.setText("");

        } catch (SQLException ex) {
            Logger.getLogger(PedidosCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            carregaGrid();
        } catch (SQLException ex) {
            Logger.getLogger(PedidosCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jbCompraMateriaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        TelaCadClientes tela_cli = new TelaCadClientes();
        Menu.jDesktopPane1.add(tela_cli);
        tela_cli.setVisible(true);
        tela_cli.setPosicao();
        preencherCBcli();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jCBclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBclientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCBclientesActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.update(getGraphics()); //Atualiza a tela
        preencherCBcli(); //Caso de erro ao atualizar a tela
        preencherCBProdutos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jBverificaEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBverificaEstoqueActionPerformed

        try {

            //Conexão com BD
            Connection conn = null; //Chama as conexões
            Conexao bd = new Conexao();

            try {
                conn = bd.obterConexao(); //Abre a conexão
            } catch (SQLException ex) {
                Logger.getLogger(Estoque_Produto_Final.class.getName()).log(Level.SEVERE, null, ex);
            }

            //Prepara comandos sql
            Statement stmt = null; //Parâmetros, valores a serem informados
            ResultSet rs = null; //Pega os resultados do select
            PreparedStatement stm = null;
            String sqlPegaDados;

            recebe_qtd = Integer.parseInt(jFTFqtd_comprar.getText());
            recebe_descricao = jCBcomprar_produto.getSelectedItem().toString();

            int qtd_estoque = 0; //Qtds do estoque pra comparar no final e descontar do estoque se tiver suficiente

            sqlPegaDados = "SELECT Qtd FROM estoque_prod_final WHERE Produto='" + recebe_descricao + "'";
            stmt = conn.createStatement();
            rs = stmt.executeQuery(sqlPegaDados); //Executa o select

            while (rs.next()) { //lê todos os registros
                qtd_estoque = rs.getInt("Qtd"); //Armazena as qts do estoque
            }

            if (recebe_qtd > qtd_estoque) {
                JOptionPane.showMessageDialog(null, "Desejado: " + recebe_qtd + " - " + recebe_descricao + " --> Estoque: " + qtd_estoque, "Não há estoque suficiente!", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Gasta: " + recebe_qtd + " - " + recebe_descricao + " --> Tem: " + qtd_estoque, "BELEZA!!!", JOptionPane.INFORMATION_MESSAGE);

            } //Até aqui funciona!

        } catch (SQLException ex) {
            Logger.getLogger(PedidosCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jBverificaEstoqueActionPerformed

    //Métodos para limpar campos e mostrar dados na tabela
    public void limpa_dados() {
        jFTFqtd_comprar.setText("");
        jCBclientes.setSelectedItem(0);
        jCBcomprar_produto.setSelectedItem(0);
        jFTFqtdParcelas.setText("");
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void carregaGrid() throws SQLException {
        //Limpar o Grid´pra não ficar com 1000 linhas
        DefaultTableModel grid0 = (DefaultTableModel) jTableComprasCliente.getModel();
        grid0.setNumRows(0);

        //Conexão
        Connection conn = null; //Chama as conexões
        Conexao bd = new Conexao();
        conn = bd.obterConexao(); //Abre a conexão

        //Prepara comandos sql
        Statement stmt = null; //Parâmetros, valores a serem informados
        ResultSet rs = null; //Pega os resultados do select
        String sqlConsulta;
        String sqlPegaCod;

        String clienteSelecionado = jCBclientes.getSelectedItem().toString();
        int pegaCod = 0;

        sqlPegaCod = "Select Idcliente from clientes WHERE Nome = '" + clienteSelecionado + "'";
        stmt = conn.createStatement();
        rs = stmt.executeQuery(sqlPegaCod);

        while (rs.next()) { //Pega o código do PF
            pegaCod = rs.getInt("Idcliente");
        }

        if (radio_alfa.isSelected()) {
            sqlConsulta = "Select * from compras_cliente WHERE Idcliente = '" + pegaCod + "' order by Data";
        } else {
            sqlConsulta = "Select * from compras_cliente WHERE Idcliente = '" + pegaCod + "' order by Produto";
        }
        stmt = conn.createStatement();
        rs = stmt.executeQuery(sqlConsulta); //Executa o select
        
        Datas datas = new Datas();
        String dataNormal;

        try {
            while (rs.next()) { //lê todos os registros
                recebe_id = rs.getInt("Idcompra");
                recebe_idCli = rs.getInt("Idcliente");
                recebe_descricao = rs.getString("Produto");
                recebe_medida = rs.getString("Medidas");
                recebe_qtd = rs.getInt("Qtd");
                recebe_preco = rs.getDouble("Total");
                recebe_data = (rs.getString("Data"));

                dataNormal = datas.data_normal(recebe_data.replace("-","/"));
                        
                // Mostra os valores na JTable
                DefaultTableModel grid = (DefaultTableModel) jTableComprasCliente.getModel();
                grid.addRow(new Object[]{recebe_id, recebe_descricao, recebe_medida, recebe_qtd, recebe_preco, dataNormal});
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar grid!", "Mensagem do Sistema ", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(PedidosCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        rs.close();
        stmt.close();
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void preencherCBProdutos() {

        try {
            //Limpar o ComboBox pra não ficar com 1000 linhas
            jCBcomprar_produto.removeAllItems();

            //Conexão
            Conexao bd = new Conexao();
            Connection conn = bd.obterConexao(); //Abre a conexão

            //Prepara comandos sql
            Statement stmt = conn.createStatement();
            String sqlConsulta = "Select Produto from estoque_prod_final order by Produto";

            ResultSet rs = stmt.executeQuery(sqlConsulta); //Executa o select

            rs.first();  //pega sempre a primeira linha

            do {
                jCBcomprar_produto.addItem(rs.getString("Produto"));
            } while (rs.next());  //lê todos os registros
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Nenhum Produto ainda em estoque!", "Mensagem do Sistema ", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(PedidosCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void preencherCBcli() {

        try {
            //Limpar o ComboBox pra não ficar com 1000 linhas
            jCBclientes.removeAllItems();

            //Conexão
            Conexao bd = new Conexao();
            Connection conn = bd.obterConexao(); //Abre a conexão

            //Prepara comandos sql
            Statement stmt = conn.createStatement();
            String sqlConsulta = "Select Nome from Clientes order by Nome";

            ResultSet rs = stmt.executeQuery(sqlConsulta); //Executa o select

            rs.first();  //pega sempre a primeira linha

            do {
                jCBclientes.addItem(rs.getString("Nome"));
            } while (rs.next());  //lê todos os registros
            conn.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao colocar no CB de Clientes!", "Mensagem do Sistema ", JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(PedidosCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jBconsultar;
    private javax.swing.JButton jBsair;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jBverificaEstoque;
    private javax.swing.JComboBox<String> jCBclientes;
    private javax.swing.JComboBox<String> jCBcomprar_produto;
    private javax.swing.JFormattedTextField jFTFqtdParcelas;
    private javax.swing.JFormattedTextField jFTFqtd_comprar;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableComprasCliente;
    private javax.swing.JButton jbCompraMateria;
    private javax.swing.JRadioButton radio_alfa;
    // End of variables declaration//GEN-END:variables
}
