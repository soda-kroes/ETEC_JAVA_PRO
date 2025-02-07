
package awtdb;

import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Singin extends javax.swing.JFrame {

   
    public Singin() {
        initComponents();
        ch_light.setSelected(true);
    }
    
      Connection connection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/user_db","root","");
            System.out.println("Completed.....");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Connection Error: "+e.getMessage());
        }
        return con;}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        panel11 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_pass = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_sigin = new com.k33ptoo.components.KButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        btn_sinup = new rojerusan.RSButtonMetro();
        ch_dark = new javax.swing.JCheckBox();
        ch_light = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        panel11.setBackground(new java.awt.Color(255, 255, 255));
        panel11.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText("PassWord");
        panel11.add(jLabel1);
        jLabel1.setBounds(680, 290, 100, 20);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Etec_7_8\\src\\Images\\icons8-male-user-100.png")); // NOI18N
        panel11.add(jLabel2);
        jLabel2.setBounds(780, 10, 110, 90);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel3.setText("SIN IN YOUR ACCOUNT");
        panel11.add(jLabel3);
        jLabel3.setBounds(680, 120, 310, 34);

        txt_username.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txt_username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        panel11.add(txt_username);
        txt_username.setBounds(680, 230, 360, 30);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setText("UserName");
        panel11.add(jLabel4);
        jLabel4.setBounds(680, 190, 100, 20);

        txt_pass.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txt_pass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        panel11.add(txt_pass);
        txt_pass.setBounds(680, 318, 370, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\My_Java\\src\\images\\icons8-user-35.png")); // NOI18N
        panel11.add(jLabel6);
        jLabel6.setBounds(630, 230, 40, 35);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\My_Java\\src\\images\\icons8-unlock-private-35.png")); // NOI18N
        panel11.add(jLabel5);
        jLabel5.setBounds(630, 320, 40, 35);

        btn_sigin.setText("SIN IN");
        panel11.add(btn_sigin);
        btn_sigin.setBounds(680, 380, 380, 40);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel7.setText("UserName");
        panel11.add(jLabel7);
        jLabel7.setBounds(680, 190, 100, 20);

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel9.setText("Create New Account? ");
        panel11.add(jLabel9);
        jLabel9.setBounds(680, 440, 210, 20);

        btn_sinup.setBackground(new java.awt.Color(255, 255, 255));
        btn_sinup.setForeground(new java.awt.Color(255, 0, 51));
        btn_sinup.setText("SIN UP");
        btn_sinup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sinupActionPerformed(evt);
            }
        });
        panel11.add(btn_sinup);
        btn_sinup.setBounds(920, 430, 80, 40);

        buttonGroup1.add(ch_dark);
        ch_dark.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        ch_dark.setText("DARK-MODE");
        ch_dark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ch_darkActionPerformed(evt);
            }
        });
        panel11.add(ch_dark);
        ch_dark.setBounds(920, 500, 140, 21);

        buttonGroup1.add(ch_light);
        ch_light.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        ch_light.setText("LIGHT-MODE");
        ch_light.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ch_lightActionPerformed(evt);
            }
        });
        panel11.add(ch_light);
        ch_light.setBounds(690, 500, 140, 21);

        getContentPane().add(panel11);
        panel11.setBounds(0, 0, 1170, 540);

        setSize(new java.awt.Dimension(1181, 569));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sinupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sinupActionPerformed
       Sigup up = new Sigup();
       up.setVisible(true);
       dispose();
    }//GEN-LAST:event_btn_sinupActionPerformed

    public void SetColor(int r,int g,int b){
        panel11.setBackground(new Color(r,g,b));
      txt_username.setBackground(new Color(r,g,b));
      txt_pass.setBackground(new Color(r,g,b));
      btn_sinup.setBackground(new Color(r,g,b));
        
    }
    private void ch_lightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ch_lightActionPerformed
        SetColor(255,255,255);
    }//GEN-LAST:event_ch_lightActionPerformed

    private void ch_darkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ch_darkActionPerformed
        SetColor(102, 102, 102);
    }//GEN-LAST:event_ch_darkActionPerformed

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
            java.util.logging.Logger.getLogger(Singin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Singin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Singin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Singin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Singin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btn_sigin;
    private rojerusan.RSButtonMetro btn_sinup;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox ch_dark;
    private javax.swing.JCheckBox ch_light;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel panel11;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
