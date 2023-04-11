/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios;

/**
 *
 * @author deuna
 */
public class frmPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form frmPrincipal
     */
    public frmPrincipal() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dpnDesk = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuOperacional = new javax.swing.JMenu();
        mnuOperacionalFinanceiro = new javax.swing.JMenuItem();
        mnuOperacionalEstoque = new javax.swing.JMenuItem();
        mnuOperacionalUsuarios = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        mnuOperacionalCadastroUsuarios = new javax.swing.JMenuItem();
        mnuOperacionalTrocaUsuario = new javax.swing.JMenuItem();
        mnuOperacionalTrocaSenha = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        mnuOperacionalSair = new javax.swing.JMenuItem();
        mnuMovimentação = new javax.swing.JMenu();
        mnuMovimentaçãoCadastrarcliente = new javax.swing.JMenuItem();
        mnuMovimentaçãoNovaVenda = new javax.swing.JMenuItem();
        mnuAjuda = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de vendas:");
        setBackground(new java.awt.Color(204, 204, 255));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1920, 1080));
        setResizable(false);

        dpnDesk.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout dpnDeskLayout = new javax.swing.GroupLayout(dpnDesk);
        dpnDesk.setLayout(dpnDeskLayout);
        dpnDeskLayout.setHorizontalGroup(
            dpnDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1920, Short.MAX_VALUE)
        );
        dpnDeskLayout.setVerticalGroup(
            dpnDeskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 927, Short.MAX_VALUE)
        );

        mnuOperacional.setIcon(new javax.swing.ImageIcon("C:\\Users\\deuna\\Documents\\GitHub\\AplicacaoVendas\\src\\main\\java\\images\\icone Modulo operacional.png")); // NOI18N
        mnuOperacional.setText("Operacional");
        mnuOperacional.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/venda-rapida.png"))); // NOI18N

        mnuOperacionalFinanceiro.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mnuOperacionalFinanceiro.setText("Financeiro");
        mnuOperacional.add(mnuOperacionalFinanceiro);

        mnuOperacionalEstoque.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mnuOperacionalEstoque.setText("Estoque");
        mnuOperacionalEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuOperacionalEstoqueActionPerformed(evt);
            }
        });
        mnuOperacional.add(mnuOperacionalEstoque);

        mnuOperacionalUsuarios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mnuOperacionalUsuarios.setIcon(new javax.swing.ImageIcon("C:\\Users\\deuna\\Documents\\GitHub\\AplicacaoVendas\\src\\main\\java\\images\\Icone Cadastro.png")); // NOI18N
        mnuOperacionalUsuarios.setText("Usuarios");
        mnuOperacionalUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuOperacionalUsuariosActionPerformed(evt);
            }
        });
        mnuOperacional.add(mnuOperacionalUsuarios);
        mnuOperacional.add(jSeparator1);

        mnuOperacionalCadastroUsuarios.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mnuOperacionalCadastroUsuarios.setText("Cadastro Usuario");
        mnuOperacionalCadastroUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuOperacionalCadastroUsuariosActionPerformed(evt);
            }
        });
        mnuOperacional.add(mnuOperacionalCadastroUsuarios);

        mnuOperacionalTrocaUsuario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mnuOperacionalTrocaUsuario.setText("Trocar Usuario");
        mnuOperacionalTrocaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuOperacionalTrocaUsuarioActionPerformed(evt);
            }
        });
        mnuOperacional.add(mnuOperacionalTrocaUsuario);

        mnuOperacionalTrocaSenha.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mnuOperacionalTrocaSenha.setText("Trocar Senha");
        mnuOperacional.add(mnuOperacionalTrocaSenha);
        mnuOperacional.add(jSeparator2);

        mnuOperacionalSair.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mnuOperacionalSair.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mnuOperacionalSair.setText("Sair");
        mnuOperacionalSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuOperacionalSairActionPerformed(evt);
            }
        });
        mnuOperacional.add(mnuOperacionalSair);

        jMenuBar1.add(mnuOperacional);

        mnuMovimentação.setIcon(new javax.swing.ImageIcon("C:\\Users\\deuna\\Documents\\GitHub\\AplicacaoVendas\\src\\main\\java\\images\\vendas.png")); // NOI18N
        mnuMovimentação.setText("Movimentação");

        mnuMovimentaçãoCadastrarcliente.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mnuMovimentaçãoCadastrarcliente.setIcon(new javax.swing.ImageIcon("C:\\Users\\deuna\\Documents\\GitHub\\AplicacaoVendas\\src\\main\\java\\images\\Icone Cadastro.png")); // NOI18N
        mnuMovimentaçãoCadastrarcliente.setText("Cadastrar Cliente");
        mnuMovimentação.add(mnuMovimentaçãoCadastrarcliente);

        mnuMovimentaçãoNovaVenda.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mnuMovimentaçãoNovaVenda.setIcon(new javax.swing.ImageIcon("C:\\Users\\deuna\\Documents\\GitHub\\AplicacaoVendas\\src\\main\\java\\images\\Nova Venda.png")); // NOI18N
        mnuMovimentaçãoNovaVenda.setText("Nova Venda");
        mnuMovimentaçãoNovaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuMovimentaçãoNovaVendaActionPerformed(evt);
            }
        });
        mnuMovimentação.add(mnuMovimentaçãoNovaVenda);

        jMenuBar1.add(mnuMovimentação);

        mnuAjuda.setIcon(new javax.swing.ImageIcon("C:\\Users\\deuna\\Documents\\GitHub\\AplicacaoVendas\\src\\main\\java\\images\\help-desk.png")); // NOI18N
        mnuAjuda.setText("Ajuda");

        jMenuItem1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jMenuItem1.setIcon(new javax.swing.ImageIcon("C:\\Users\\deuna\\Documents\\GitHub\\AplicacaoVendas\\src\\main\\java\\images\\help.png")); // NOI18N
        jMenuItem1.setText("Solicitar Suporte Técnico");
        mnuAjuda.add(jMenuItem1);

        jMenuBar1.add(mnuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnDesk, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dpnDesk)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void mnuOperacionalEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuOperacionalEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuOperacionalEstoqueActionPerformed

    private void mnuOperacionalSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuOperacionalSairActionPerformed
    this.dispose();
    }//GEN-LAST:event_mnuOperacionalSairActionPerformed

    private void mnuOperacionalTrocaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuOperacionalTrocaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuOperacionalTrocaUsuarioActionPerformed

    private void mnuMovimentaçãoNovaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuMovimentaçãoNovaVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuMovimentaçãoNovaVendaActionPerformed

    private void mnuOperacionalUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuOperacionalUsuariosActionPerformed
      frmUsuarios mUsuarios = new frmUsuarios();  
      dpnDesk.add(mUsuarios);
      mUsuarios.show();
    }//GEN-LAST:event_mnuOperacionalUsuariosActionPerformed

    private void mnuOperacionalCadastroUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuOperacionalCadastroUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuOperacionalCadastroUsuariosActionPerformed

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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dpnDesk;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JMenu mnuAjuda;
    private javax.swing.JMenu mnuMovimentação;
    private javax.swing.JMenuItem mnuMovimentaçãoCadastrarcliente;
    private javax.swing.JMenuItem mnuMovimentaçãoNovaVenda;
    private javax.swing.JMenu mnuOperacional;
    private javax.swing.JMenuItem mnuOperacionalCadastroUsuarios;
    private javax.swing.JMenuItem mnuOperacionalEstoque;
    private javax.swing.JMenuItem mnuOperacionalFinanceiro;
    private javax.swing.JMenuItem mnuOperacionalSair;
    private javax.swing.JMenuItem mnuOperacionalTrocaSenha;
    private javax.swing.JMenuItem mnuOperacionalTrocaUsuario;
    private javax.swing.JMenuItem mnuOperacionalUsuarios;
    // End of variables declaration//GEN-END:variables
}
