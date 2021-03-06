/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

/**
 *
 * @author henrique
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
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

        jButtonLogin2 = new javax.swing.JButton();
        jButtonLogin1 = new javax.swing.JButton();
        jButtonLogin = new javax.swing.JButton();
        TextPassword = new javax.swing.JPasswordField();
        jLabelPassword = new javax.swing.JLabel();
        TextUser = new javax.swing.JTextField();
        jLabelUser = new javax.swing.JLabel();
        jLabelLogin = new javax.swing.JLabel();
        jLabelPanel = new javax.swing.JLabel();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonLogin2.setForeground(new java.awt.Color(255, 51, 51));
        jButtonLogin2.setText("esqueci a senha");
        jButtonLogin2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogin2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 570, 130, 10));

        jButtonLogin1.setText("Cadastrar");
        jButtonLogin1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLogin1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, 150, -1));

        jButtonLogin.setText("Entrar");
        jButtonLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLoginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 450, 150, -1));
        getContentPane().add(TextPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 410, 190, -1));

        jLabelPassword.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPassword.setText("Senha");
        getContentPane().add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, -1, -1));
        getContentPane().add(TextUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, 230, -1));

        jLabelUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabelUser.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUser.setText("E-mail");
        getContentPane().add(jLabelUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 300, 50, -1));

        jLabelLogin.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelLogin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogin.setText("Login");
        getContentPane().add(jLabelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 190, 90, -1));

        jLabelPanel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/painel-login.png"))); // NOI18N
        getContentPane().add(jLabelPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 130, -1, -1));

        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Download wallpaper 1280x720 explosion, background, light hd, hdv, 720p hd background.jpg"))); // NOI18N
        getContentPane().add(jLabelBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLoginActionPerformed
       Main menu = new Main();
       menu.setVisible(true);
    }//GEN-LAST:event_jButtonLoginActionPerformed

    private void jButtonLogin1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogin1ActionPerformed
       Cadastro cadastro = new Cadastro();
       cadastro.setVisible(true);
    }//GEN-LAST:event_jButtonLogin1ActionPerformed

    private void jButtonLogin2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLogin2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonLogin2ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField TextPassword;
    private javax.swing.JTextField TextUser;
    private javax.swing.JButton jButtonLogin;
    private javax.swing.JButton jButtonLogin1;
    private javax.swing.JButton jButtonLogin2;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelPanel;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelUser;
    // End of variables declaration//GEN-END:variables
}
