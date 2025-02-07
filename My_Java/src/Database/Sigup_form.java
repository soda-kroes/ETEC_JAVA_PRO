
package Database;

import java.awt.Color;


public class Sigup_form extends javax.swing.JFrame {

int op;
     
    public Sigup_form() {
        initComponents();
    }
    
    void setColor(int r,int g,int b){
        jPanel2.setBackground(new Color(r, g, b));
       txt_username.setBackground(new Color(r, g, b));
       txt_pass.setBackground(new Color(r, g, b));
       btn_sigin.setBackground(new Color(r, g, b));
        
    }
    
     public Sigup_form(int op) {
         this.op=op;
        initComponents();
        switch(op){
            case 1:{//Light
                setColor(255, 255, 255);
                
            }break;
            case 2:{//Dark
                setColor(102, 102, 102);
                
            }break;
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_pass = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        btn_sigup = new com.k33ptoo.components.KButton();
        jLabel8 = new javax.swing.JLabel();
        btn_sigin = new necesario.MaterialButton();
        txt_comfirmpass = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText("Password : ");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(540, 300, 140, 30);
        jPanel2.add(jLabel2);
        jLabel2.setBounds(610, 40, 0, 0);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\My_Java\\src\\images\\icons8-male-user-100.png")); // NOI18N
        jPanel2.add(jLabel3);
        jLabel3.setBounds(640, 20, 120, 100);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setText("create new account? ");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(530, 500, 210, 20);

        txt_username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(txt_username);
        txt_username.setBounds(540, 230, 260, 40);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\My_Java\\src\\images\\icons8-user-35.png")); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(470, 340, 40, 40);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel6.setText("UserName :");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(540, 200, 140, 30);

        txt_pass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(txt_pass);
        txt_pass.setBounds(530, 330, 280, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\My_Java\\src\\images\\icons8-user-35.png")); // NOI18N
        jLabel7.setText("jLabel5");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(480, 240, 40, 40);

        btn_sigup.setText("SIG UP");
        jPanel2.add(btn_sigup);
        btn_sigup.setBounds(530, 450, 290, 30);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel8.setText("SIG IN YOUR ACCOUNT");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(550, 120, 320, 60);

        btn_sigin.setBackground(new java.awt.Color(255, 255, 255));
        btn_sigin.setForeground(new java.awt.Color(255, 51, 51));
        btn_sigin.setText("Sig in");
        btn_sigin.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btn_sigin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_siginActionPerformed(evt);
            }
        });
        jPanel2.add(btn_sigin);
        btn_sigin.setBounds(720, 490, 90, 40);

        txt_comfirmpass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(txt_comfirmpass);
        txt_comfirmpass.setBounds(530, 400, 280, 40);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\My_Java\\src\\images\\icons8-user-35.png")); // NOI18N
        jLabel9.setText("jLabel5");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(470, 410, 40, 40);

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel10.setText("Comfirm Password");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(540, 370, 180, 30);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 970, 540);

        setSize(new java.awt.Dimension(983, 576));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_siginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siginActionPerformed
        Sigin_form in = new Sigin_form(op);
        in.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_siginActionPerformed

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
            java.util.logging.Logger.getLogger(Sigup_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sigup_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sigup_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sigup_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sigup_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private necesario.MaterialButton btn_sigin;
    private com.k33ptoo.components.KButton btn_sigup;
    private javax.swing.ButtonGroup buttonGroup1;
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
    private javax.swing.JPasswordField txt_comfirmpass;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
