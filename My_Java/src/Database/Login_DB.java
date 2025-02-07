
package Database;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.awt.Color;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Login_DB extends javax.swing.JFrame {
    
    PreparedStatement ps;
    ResultSet r;
    String sql;
    public Login_DB() {
        initComponents();
    }
    
    
     Connection connection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student_form","root","");
            System.out.println("Completed.....");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Connection Error: "+e.getMessage());
        }
        return con;}

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jp = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_pass = new javax.swing.JPasswordField();
        ch_dark = new javax.swing.JCheckBox();
        ch_light = new javax.swing.JCheckBox();
        btn_sigin = new javax.swing.JButton();
        btn_login1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jp.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 60)); // NOI18N
        jLabel1.setText("Admin");
        jp.add(jLabel1);
        jLabel1.setBounds(390, 20, 230, 50);

        jLabel2.setFont(new java.awt.Font("AKbalthom Choeung Ek", 1, 24)); // NOI18N
        jLabel2.setText("Email   ");
        jp.add(jLabel2);
        jLabel2.setBounds(360, 120, 100, 20);

        txt_email.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jp.add(txt_email);
        txt_email.setBounds(350, 150, 280, 40);

        jLabel3.setFont(new java.awt.Font("AKbalthom Choeung Ek", 1, 24)); // NOI18N
        jLabel3.setText("Password");
        jp.add(jLabel3);
        jLabel3.setBounds(360, 210, 120, 20);

        txt_pass.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jp.add(txt_pass);
        txt_pass.setBounds(350, 240, 270, 40);

        buttonGroup1.add(ch_dark);
        ch_dark.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        ch_dark.setText("Dark");
        ch_dark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ch_darkActionPerformed(evt);
            }
        });
        jp.add(ch_dark);
        ch_dark.setBounds(600, 390, 70, 19);

        buttonGroup1.add(ch_light);
        ch_light.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        ch_light.setText("Light");
        ch_light.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ch_lightActionPerformed(evt);
            }
        });
        jp.add(ch_light);
        ch_light.setBounds(600, 360, 70, 19);

        btn_sigin.setBackground(new java.awt.Color(255, 255, 255));
        btn_sigin.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_sigin.setText("Sigin");
        btn_sigin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_siginActionPerformed(evt);
            }
        });
        jp.add(btn_sigin);
        btn_sigin.setBounds(530, 290, 90, 40);

        btn_login1.setBackground(new java.awt.Color(255, 255, 255));
        btn_login1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_login1.setText("Login");
        btn_login1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_login1ActionPerformed(evt);
            }
        });
        jp.add(btn_login1);
        btn_login1.setBounds(360, 290, 90, 40);

        getContentPane().add(jp);
        jp.setBounds(0, 0, 680, 420);

        setSize(new java.awt.Dimension(696, 455));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ch_lightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ch_lightActionPerformed
        jp.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_ch_lightActionPerformed

    private void ch_darkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ch_darkActionPerformed
        jp.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_ch_darkActionPerformed

    private void btn_login1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_login1ActionPerformed
         try {
            String Gmail = txt_email.getText();
            String Pass = txt_pass.getText();
            sql = "SELECT *FROM admin WHERE gmail= '"+Gmail+ "' && password= '"+Pass+"'";
            ps=connection().prepareStatement(sql);
            r=ps.executeQuery();
            
            if(r.next()){
                JOptionPane.showMessageDialog(null, "Wellcome To Login.");
            }
            else{
                JOptionPane.showMessageDialog(null, "Password Or Email is Invalid...!");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btn_login1ActionPerformed

    private void btn_siginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siginActionPerformed
        Singin_DB singin = new Singin_DB();
        singin.show();
    }//GEN-LAST:event_btn_siginActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_DB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login1;
    private javax.swing.JButton btn_sigin;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox ch_dark;
    private javax.swing.JCheckBox ch_light;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jp;
    private javax.swing.JTextField txt_email;
    private javax.swing.JPasswordField txt_pass;
    // End of variables declaration//GEN-END:variables
}
