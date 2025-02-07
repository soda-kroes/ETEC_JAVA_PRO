
package Database;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.*;


public class Sigin extends javax.swing.JFrame {
    PreparedStatement ps;
    ResultSet r;
    String sql;
    
    int op;
    public Sigin() {
        initComponents();
        ch_light.setSelected(true);
    }
    
    //constructor with parameter
     public Sigin(int op) {
         this.op=op;
        initComponents();
        ch_light.setSelected(true);
        switch(op){
            case 1:{
                SetColor(255,255, 255);//light
                ch_light.setSelected(true);
            }break;
             case 2:{
                SetColor(102,102, 102);//dark
                ch_dark.setSelected(true);
            }break;
        }
        
    }
     
      public com.mysql.jdbc.Connection connection(){
        com.mysql.jdbc.Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/java11","root","");
            System.out.println("Completed.....");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Connection Error: "+e.getMessage());
        }
        return con;}
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        Jpanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_pass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        ch_dark = new javax.swing.JCheckBox();
        ch_light = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_sigin = new com.k33ptoo.components.KButton();
        btn_sigup = new necesario.MaterialButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        Jpanel.setBackground(new java.awt.Color(255, 255, 255));
        Jpanel.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText("Password");
        Jpanel.add(jLabel1);
        jLabel1.setBounds(590, 290, 110, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Etec_7_8\\src\\Images\\icons8-male-user-100.png")); // NOI18N
        Jpanel.add(jLabel2);
        jLabel2.setBounds(690, 10, 120, 100);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setText("Create Your Account? ");
        Jpanel.add(jLabel3);
        jLabel3.setBounds(590, 450, 220, 30);

        txt_username.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txt_username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        Jpanel.add(txt_username);
        txt_username.setBounds(590, 220, 330, 40);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Etec_7_8\\src\\Images\\icons8-unlock-private-35.png")); // NOI18N
        Jpanel.add(jLabel4);
        jLabel4.setBounds(520, 350, 40, 40);

        txt_pass.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txt_pass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        Jpanel.add(txt_pass);
        txt_pass.setBounds(590, 330, 340, 40);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel5.setText("SIG IN YOUR ACCOUNT");
        Jpanel.add(jLabel5);
        jLabel5.setBounds(600, 110, 320, 40);

        buttonGroup1.add(ch_dark);
        ch_dark.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        ch_dark.setText("DARK-MODE");
        ch_dark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ch_darkActionPerformed(evt);
            }
        });
        Jpanel.add(ch_dark);
        ch_dark.setBounds(780, 520, 170, 26);

        buttonGroup1.add(ch_light);
        ch_light.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        ch_light.setText("LIGHT-MODE");
        ch_light.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ch_lightActionPerformed(evt);
            }
        });
        Jpanel.add(ch_light);
        ch_light.setBounds(590, 520, 170, 26);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Etec_7_8\\src\\Images\\New_Project__1_-removebg-preview.png")); // NOI18N
        Jpanel.add(jLabel6);
        jLabel6.setBounds(20, 50, 500, 490);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel7.setText("UserName ");
        Jpanel.add(jLabel7);
        jLabel7.setBounds(590, 190, 110, 30);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Etec_7_8\\src\\Images\\icons8-user-35.png")); // NOI18N
        Jpanel.add(jLabel8);
        jLabel8.setBounds(520, 240, 40, 40);

        btn_sigin.setText("SIN IN");
        btn_sigin.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btn_sigin.setkStartColor(new java.awt.Color(255, 0, 0));
        btn_sigin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_siginActionPerformed(evt);
            }
        });
        Jpanel.add(btn_sigin);
        btn_sigin.setBounds(590, 390, 340, 40);

        btn_sigup.setBackground(new java.awt.Color(255, 255, 255));
        btn_sigup.setForeground(new java.awt.Color(255, 0, 51));
        btn_sigup.setText("REGISTER");
        btn_sigup.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btn_sigup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sigupActionPerformed(evt);
            }
        });
        Jpanel.add(btn_sigup);
        btn_sigup.setBounds(800, 450, 100, 40);

        getContentPane().add(Jpanel);
        Jpanel.setBounds(0, 0, 1040, 590);

        setSize(new java.awt.Dimension(1055, 623));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    public void SetColor(int r,int g,int b){
        Jpanel.setBackground(new Color(r,g,b));
       txt_username.setBackground(new Color(r,g,b));
       txt_pass.setBackground(new Color(r,g,b));
       btn_sigup.setBackground(new Color(r,g,b));
        
    }
    private void ch_darkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ch_darkActionPerformed
        SetColor(102, 102, 102);
        op=2;
     
    }//GEN-LAST:event_ch_darkActionPerformed

    private void ch_lightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ch_lightActionPerformed
        SetColor(255, 255, 255);
        op=1;
       
    }//GEN-LAST:event_ch_lightActionPerformed

    private void btn_sigupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sigupActionPerformed
       Sigup up = new Sigup(op);
       up.setVisible(true);
       dispose();
    }//GEN-LAST:event_btn_sigupActionPerformed

    private void btn_siginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siginActionPerformed
        try {
            String username = txt_username.getText();
            String pass = txt_pass.getText();
            sql="SELECT username,password FROM tb_login WHERE username=? AND password=?";
            ps=connection().prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, pass);
            r=ps.executeQuery();
            if(r.next()==true){
                JOptionPane.showMessageDialog(null,"Login Success.");
                Student_Form stu = new Student_Form();
                stu.setVisible(true);
                dispose();
            }
            else {
                JOptionPane.showMessageDialog(null, "Invalid Username Or Password.");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
        
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
            java.util.logging.Logger.getLogger(Sigin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sigin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sigin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sigin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sigin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jpanel;
    private com.k33ptoo.components.KButton btn_sigin;
    private necesario.MaterialButton btn_sigup;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
