
package Database;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class Singin_DB extends javax.swing.JFrame {
    
    PreparedStatement ps;
    ResultSet r;
    String sql;

    public Singin_DB() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_pass = new javax.swing.JPasswordField();
        btn_singin = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txt_name = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 60)); // NOI18N
        jLabel1.setText("Admin");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(280, 20, 280, 50);

        jLabel2.setFont(new java.awt.Font("AKbalthom Choeung Ek", 1, 24)); // NOI18N
        jLabel2.setText("Email   ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(270, 110, 100, 20);

        txt_email.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(txt_email);
        txt_email.setBounds(260, 140, 280, 40);

        jLabel3.setFont(new java.awt.Font("AKbalthom Choeung Ek", 1, 24)); // NOI18N
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(270, 200, 120, 20);

        txt_pass.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(txt_pass);
        txt_pass.setBounds(260, 230, 270, 40);

        btn_singin.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_singin.setText("Singin");
        btn_singin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_singinActionPerformed(evt);
            }
        });
        getContentPane().add(btn_singin);
        btn_singin.setBounds(430, 390, 100, 40);

        btn_back.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        getContentPane().add(btn_back);
        btn_back.setBounds(250, 390, 100, 40);

        jLabel4.setFont(new java.awt.Font("AKbalthom Choeung Ek", 1, 24)); // NOI18N
        jLabel4.setText("Name");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(270, 290, 210, 20);

        txt_name.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(txt_name);
        txt_name.setBounds(260, 320, 270, 40);

        setSize(new java.awt.Dimension(608, 517));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        Login_DB login = new Login_DB();
        login.show();
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_singinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_singinActionPerformed
        try {
                                int id=0;
                        String gmail=txt_email.getText();
                        String password =txt_pass.getText();
                        String name = txt_name.getText();
                        sql = "INSERT INTO admin (gmail,password,name) VALUE(?,?,?)";
                        ps=connection().prepareStatement(sql);
                        ps.setString(1, gmail);
                        ps.setString(2, password);
                        ps.setString(3, name);
                        ps.executeUpdate();
            
                        JOptionPane.showMessageDialog(null, "Add Admin Successfully.");
            
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, e);
                    }
    }//GEN-LAST:event_btn_singinActionPerformed


    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Singin_DB().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_singin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txt_email;
    private javax.swing.JPasswordField txt_name;
    private javax.swing.JPasswordField txt_pass;
    // End of variables declaration//GEN-END:variables
}
