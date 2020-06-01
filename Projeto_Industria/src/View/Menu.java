package View;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH); //Abre tela cheia
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMIclientes = new javax.swing.JMenuItem();
        jMIfornecedores = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMIestoque_mat_prima = new javax.swing.JMenuItem();
        jMIprodFinal = new javax.swing.JMenuItem();
        jMIgera_altera_composicao = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMIContas_Pagar = new javax.swing.JMenuItem();
        jMIreceber = new javax.swing.JMenuItem();
        jMIhistoricoPagamentos = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMIencomendas = new javax.swing.JMenuItem();
        jMIordem_producao = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMIcomprar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMIcalculadora = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tela Principal");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jDesktopPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Georgia", 3, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Projeto Indústria");

        jLabel2.setFont(new java.awt.Font("Georgia", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("I'mSoft™ ");

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jDesktopPane1.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(1002, Short.MAX_VALUE)
                .addGroup(jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(56, 56, 56))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(613, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(57, 57, 57))
        );

        jMenu1.setText("Cadastro");

        jMIclientes.setText("Clientes");
        jMIclientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIclientesActionPerformed(evt);
            }
        });
        jMenu1.add(jMIclientes);

        jMIfornecedores.setText("Fornecedores");
        jMIfornecedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIfornecedoresActionPerformed(evt);
            }
        });
        jMenu1.add(jMIfornecedores);

        jMenuBar1.add(jMenu1);

        jMenu4.setText("Estoques");

        jMIestoque_mat_prima.setText("Estoque de matérias primas");
        jMIestoque_mat_prima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIestoque_mat_primaActionPerformed(evt);
            }
        });
        jMenu4.add(jMIestoque_mat_prima);

        jMIprodFinal.setText("Estoque de produto final");
        jMIprodFinal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIprodFinalActionPerformed(evt);
            }
        });
        jMenu4.add(jMIprodFinal);

        jMIgera_altera_composicao.setText("Gerar ou alterar produto final");
        jMIgera_altera_composicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIgera_altera_composicaoActionPerformed(evt);
            }
        });
        jMenu4.add(jMIgera_altera_composicao);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Financeiro");

        jMIContas_Pagar.setText("Contas a Pagar");
        jMIContas_Pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIContas_PagarActionPerformed(evt);
            }
        });
        jMenu5.add(jMIContas_Pagar);

        jMIreceber.setText("Contas a Receber");
        jMIreceber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIreceberActionPerformed(evt);
            }
        });
        jMenu5.add(jMIreceber);

        jMIhistoricoPagamentos.setText("Histórico de pagamentos");
        jMIhistoricoPagamentos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIhistoricoPagamentosActionPerformed(evt);
            }
        });
        jMenu5.add(jMIhistoricoPagamentos);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Pedidos");

        jMIencomendas.setText("Minhas Encomendas");
        jMIencomendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIencomendasActionPerformed(evt);
            }
        });
        jMenu6.add(jMIencomendas);

        jMIordem_producao.setText("Ordem de Produção");
        jMIordem_producao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIordem_producaoActionPerformed(evt);
            }
        });
        jMenu6.add(jMIordem_producao);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Comprar");

        jMIcomprar.setText("Comprar produtos");
        jMIcomprar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIcomprarActionPerformed(evt);
            }
        });
        jMenu7.add(jMIcomprar);

        jMenuBar1.add(jMenu7);

        jMenu2.setText("Úteis");

        jMIcalculadora.setText("Calculadora");
        jMIcalculadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMIcalculadoraActionPerformed(evt);
            }
        });
        jMenu2.add(jMIcalculadora);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Sair");

        jMenuItem4.setText("Sair");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        jMenu8.setText("Sobre");

        jMenuItem1.setText("Contato");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem1);

        jMenuBar1.add(jMenu8);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMIclientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIclientesActionPerformed
        TelaCadClientes tela_cad = new TelaCadClientes();
        jDesktopPane1.add(tela_cad);
        tela_cad.setVisible(true);
        tela_cad.setPosicao();
    }//GEN-LAST:event_jMIclientesActionPerformed

    private void jMIcalculadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIcalculadoraActionPerformed
        try {
            Runtime.getRuntime().exec("cmd.exe /C start calc.exe");        //Abre a calculadora
        } catch (IOException ex) {
            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jMIcalculadoraActionPerformed

    private void jMIfornecedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIfornecedoresActionPerformed
        TelaCadFornecedor tela_forn = new TelaCadFornecedor();
        jDesktopPane1.add(tela_forn);
        tela_forn.setVisible(true);
        tela_forn.setPosicao();
    }//GEN-LAST:event_jMIfornecedoresActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMIestoque_mat_primaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIestoque_mat_primaActionPerformed
        Estoque_materia estoque_materia = new Estoque_materia();
        jDesktopPane1.add(estoque_materia);
        estoque_materia.setVisible(true);
        estoque_materia.setPosicao();
    }//GEN-LAST:event_jMIestoque_mat_primaActionPerformed

    private void jMIContas_PagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIContas_PagarActionPerformed
        Contas_a_pagar contas_pagar = new Contas_a_pagar();
        jDesktopPane1.add(contas_pagar);
        contas_pagar.setVisible(true);
        contas_pagar.setPosicao();

    }//GEN-LAST:event_jMIContas_PagarActionPerformed

    private void jMIhistoricoPagamentosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIhistoricoPagamentosActionPerformed
        Historico_Contas his_contas = new Historico_Contas();
        jDesktopPane1.add(his_contas);
        his_contas.setVisible(true);
        his_contas.setPosicao();
    }//GEN-LAST:event_jMIhistoricoPagamentosActionPerformed

    private void jMIprodFinalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIprodFinalActionPerformed
        Estoque_Produto_Final estoque_prodFinal = new Estoque_Produto_Final();
        jDesktopPane1.add(estoque_prodFinal);
        estoque_prodFinal.setVisible(true);
        estoque_prodFinal.setPosicao();
    }//GEN-LAST:event_jMIprodFinalActionPerformed

    private void jMIgera_altera_composicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIgera_altera_composicaoActionPerformed
        Gera_PF_Existente_e_Altera_Composicao altera_composicao = new Gera_PF_Existente_e_Altera_Composicao();
        jDesktopPane1.add(altera_composicao);
        altera_composicao.setVisible(true);
        altera_composicao.setPosicao();
    }//GEN-LAST:event_jMIgera_altera_composicaoActionPerformed

    private void jMIencomendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIencomendasActionPerformed
        Encomendas_Receber encomendas = new Encomendas_Receber();
        jDesktopPane1.add(encomendas);
        encomendas.setVisible(true);
        encomendas.setPosicao();
    }//GEN-LAST:event_jMIencomendasActionPerformed

    private void jMIordem_producaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIordem_producaoActionPerformed
        OrdemProducao ordem_prod = new OrdemProducao();
        jDesktopPane1.add(ordem_prod);
        ordem_prod.setVisible(true);
        ordem_prod.setPosicao();
    }//GEN-LAST:event_jMIordem_producaoActionPerformed

    private void jMIcomprarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIcomprarActionPerformed
        PedidosCliente compras_cliente = new PedidosCliente();
        jDesktopPane1.add(compras_cliente);
        compras_cliente.setVisible(true);
        compras_cliente.setPosicao();
    }//GEN-LAST:event_jMIcomprarActionPerformed

    private void jMIreceberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMIreceberActionPerformed
        Contas_a_receber contas_receber = new Contas_a_receber();
        jDesktopPane1.add(contas_receber);
        contas_receber.setVisible(true);
        contas_receber.setPosicao();
    }//GEN-LAST:event_jMIreceberActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        JOptionPane.showMessageDialog(null, "I'mSoft - Desenvolvedora de Software\nContato: contato@imsoft.com", "Sobre a I'mSoft", JOptionPane.INFORMATION_MESSAGE);

    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuItem jMIContas_Pagar;
    private javax.swing.JMenuItem jMIcalculadora;
    private javax.swing.JMenuItem jMIclientes;
    private javax.swing.JMenuItem jMIcomprar;
    private javax.swing.JMenuItem jMIencomendas;
    private javax.swing.JMenuItem jMIestoque_mat_prima;
    private javax.swing.JMenuItem jMIfornecedores;
    private javax.swing.JMenuItem jMIgera_altera_composicao;
    private javax.swing.JMenuItem jMIhistoricoPagamentos;
    private javax.swing.JMenuItem jMIordem_producao;
    private javax.swing.JMenuItem jMIprodFinal;
    private javax.swing.JMenuItem jMIreceber;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem4;
    // End of variables declaration//GEN-END:variables
}
