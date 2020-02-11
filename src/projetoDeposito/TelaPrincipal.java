
package projetoDeposito;

import javax.swing.JFrame;
import modeloConection.ConexaoBD;

public class TelaPrincipal extends javax.swing.JFrame {

   ConexaoBD conecta = new ConexaoBD();
   ForCadastro telacadastro = new ForCadastro();
   ForProdutos telaprodutos = new ForProdutos();
   ForEstoque telaEstoque = new ForEstoque();
   ForVendas telaVendas = new ForVendas();
   
   
   
    
   TelaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);//ABRIR O SISTEMA NO CENTRO DA TELA
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        conecta.conexao();//Chamando o método CONEXÃO ( para aparecer a msg na tela )após entrar na tela principal
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrameBemVindo = new javax.swing.JInternalFrame();
        TelaPrincipal = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButtonVendas = new javax.swing.JButton();
        jButtonCadastro = new javax.swing.JButton();
        jButtonProdutos = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButtonSair = new javax.swing.JButton();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItemTelaBemVindo = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jInternalFrameBemVindo.setMaximizable(true);
        jInternalFrameBemVindo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jInternalFrameBemVindo.setVisible(true);
        jInternalFrameBemVindo.getContentPane().setLayout(null);

        TelaPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        TelaPrincipal.setLayout(null);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Vendas icone_1.png"))); // NOI18N
        TelaPrincipal.add(jLabel1);
        jLabel1.setBounds(10, 10, 190, 193);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Usuario icone 3.PNG"))); // NOI18N
        TelaPrincipal.add(jLabel2);
        jLabel2.setBounds(240, 10, 190, 190);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/estoque.png"))); // NOI18N
        TelaPrincipal.add(jLabel3);
        jLabel3.setBounds(690, 10, 190, 190);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Ficha cadastro material.PNG"))); // NOI18N
        TelaPrincipal.add(jLabel4);
        jLabel4.setBounds(470, 10, 190, 190);

        jButtonVendas.setFont(new java.awt.Font("Agent Orange", 1, 18)); // NOI18N
        jButtonVendas.setText("Vendas");
        jButtonVendas.setBorder(null);
        jButtonVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVendasActionPerformed(evt);
            }
        });
        TelaPrincipal.add(jButtonVendas);
        jButtonVendas.setBounds(20, 210, 180, 40);

        jButtonCadastro.setFont(new java.awt.Font("Agent Orange", 1, 18)); // NOI18N
        jButtonCadastro.setText("Cadastro");
        jButtonCadastro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButtonCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastroActionPerformed(evt);
            }
        });
        TelaPrincipal.add(jButtonCadastro);
        jButtonCadastro.setBounds(250, 210, 180, 40);

        jButtonProdutos.setFont(new java.awt.Font("Agent Orange", 1, 18)); // NOI18N
        jButtonProdutos.setText("Produtos");
        jButtonProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProdutosActionPerformed(evt);
            }
        });
        TelaPrincipal.add(jButtonProdutos);
        jButtonProdutos.setBounds(480, 210, 180, 40);

        jButton3.setFont(new java.awt.Font("Agent Orange", 1, 18)); // NOI18N
        jButton3.setText("Estoque");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        TelaPrincipal.add(jButton3);
        jButton3.setBounds(700, 210, 180, 40);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/lupa.PNG"))); // NOI18N
        TelaPrincipal.add(jLabel5);
        jLabel5.setBounds(910, 20, 170, 170);

        jButton1.setFont(new java.awt.Font("Agent Orange", 1, 18)); // NOI18N
        jButton1.setText("pesquisa");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        TelaPrincipal.add(jButton1);
        jButton1.setBounds(910, 210, 170, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sair icone.PNG"))); // NOI18N
        TelaPrincipal.add(jLabel6);
        jLabel6.setBounds(1120, 50, 140, 130);

        jButtonSair.setFont(new java.awt.Font("Agent Orange", 1, 18)); // NOI18N
        jButtonSair.setText("SAIR");
        jButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSairActionPerformed(evt);
            }
        });
        TelaPrincipal.add(jButtonSair);
        jButtonSair.setBounds(1110, 210, 170, 40);

        jInternalFrameBemVindo.getContentPane().add(TelaPrincipal);
        TelaPrincipal.setBounds(14, 8, 1350, 420);

        getContentPane().add(jInternalFrameBemVindo);
        jInternalFrameBemVindo.setBounds(10, 20, 1440, 600);

        jMenu1.setText("Menu");

        jMenuItem4.setText("Vendas");
        jMenu1.add(jMenuItem4);

        jMenuItem1.setText("Cadastro Cliente");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Cadastro Produto");
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("Consultar Estoque");
        jMenu1.add(jMenuItem3);

        jMenuItem5.setText("Pesquisar Debitos");
        jMenu1.add(jMenuItem5);

        jMenuBar.add(jMenu1);

        jMenu2.setText("Ferramentas");

        jMenuItemTelaBemVindo.setText("Inicio");
        jMenuItemTelaBemVindo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTelaBemVindoActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItemTelaBemVindo);

        jMenuBar.add(jMenu2);

        jMenu3.setText("Sair");
        jMenuBar.add(jMenu3);

        setJMenuBar(jMenuBar);

        setSize(new java.awt.Dimension(1473, 694));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastroActionPerformed
        if(telacadastro==null) {//ABRIR SOMENTE UMA TELA DE CADASTRO
                telacadastro = new ForCadastro();
                telacadastro.setVisible(true);
                telacadastro.setResizable(false);
            }else{
                telacadastro.setVisible(true);
                telacadastro.setResizable(false);
            }
//Cadastro tela = new Cadastro();
//tela.setVisible(true);
    }//GEN-LAST:event_jButtonCadastroActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
ForCadastro tela = new ForCadastro(); 
tela.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItemTelaBemVindoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTelaBemVindoActionPerformed
            
    }//GEN-LAST:event_jMenuItemTelaBemVindoActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        jInternalFrameBemVindo.dispose(); 
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProdutosActionPerformed
        if(telaprodutos==null) {//ABRIR SOMENTE UMA TELA DE CADASTRO
                telaprodutos = new ForProdutos();
                telaprodutos.setVisible(true);
                telaprodutos.setResizable(false);
            }else{
                telaprodutos.setVisible(true);
                telaprodutos.setResizable(false);
            }
//Cadastro tela = new Cadastro();
//tela.setVisible(true);
    }//GEN-LAST:event_jButtonProdutosActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if(telaprodutos==null) {//ABRIR SOMENTE UMA TELA DE CADASTRO
                telaEstoque = new ForEstoque();
                telaEstoque.setVisible(true);
                telaEstoque.setResizable(false);
            }else{
                telaEstoque.setVisible(true);
                telaEstoque.setResizable(false);
            }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButtonVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVendasActionPerformed
        if(telaVendas==null) {//ABRIR SOMENTE UMA TELA DE CADASTRO
                telaVendas = new ForVendas();
                telaVendas.setVisible(true);
                telaVendas.setResizable(false);
            }else{
                telaVendas.setVisible(true);
                telaVendas.setResizable(false);
            }
    }//GEN-LAST:event_jButtonVendasActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TelaPrincipal;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonCadastro;
    private javax.swing.JButton jButtonProdutos;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JButton jButtonVendas;
    private javax.swing.JInternalFrame jInternalFrameBemVindo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItemTelaBemVindo;
    // End of variables declaration//GEN-END:variables
}
