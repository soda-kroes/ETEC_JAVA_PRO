
package Database;

import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;

public class Sigup extends javax.swing.JFrame {
    PreparedStatement ps;
    ResultSet r;
    String sql;
   int op;
   //constructor Default
    public Sigup() {
        initComponents();
    }
    
    public Sigup(int op) {
        this.op=op;
        initComponents();
        switch(op){
            case 1:{
                SetColor(255,255, 255);//light
            }break;
             case 2:{
                SetColor(102,102, 102);//dark
            }break;
        }
        
    }
    
    public void Clear(){
        txt_comfirmpass.setText("");
        txt_pass.setText("");
        txt_username.setText("");
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
    
      public void SetColor(int r,int g,int b){
        jPanel1.setBackground(new Color(r,g,b));
       txt_username.setBackground(new Color(r,g,b));
       txt_pass.setBackground(new Color(r,g,b));
       txt_comfirmpass.setBackground(new Color(r,g,b));
       btn_sigin.setBackground(new Color(r,g,b));
       btn_sigup.setBackground(new Color(r,g,b));
        
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_pass = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_comfirmpass = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        btn_sigup = new com.k33ptoo.components.KButton();
        btn_sigin = new necesario.MaterialButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText("Password");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(590, 300, 110, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Etec_7_8\\src\\Images\\icons8-male-user-100.png")); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(690, 10, 120, 100);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setText("Create Your Account? ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(590, 540, 220, 30);

        txt_username.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txt_username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt_username);
        txt_username.setBounds(590, 220, 330, 40);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Etec_7_8\\src\\Images\\icons8-unlock-private-35.png")); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(520, 350, 40, 40);

        txt_pass.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txt_pass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt_pass);
        txt_pass.setBounds(590, 330, 340, 40);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel5.setText("SIG IN YOUR ACCOUNT");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(600, 110, 320, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Etec_7_8\\src\\Images\\New_Project__1_-removebg-preview.png")); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 50, 500, 490);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel7.setText("UserName ");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(590, 190, 110, 30);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Etec_7_8\\src\\Images\\icons8-user-35.png")); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(520, 240, 40, 40);

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Etec_7_8\\src\\Images\\icons8-unlock-private-35.png")); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(520, 440, 40, 40);

        txt_comfirmpass.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txt_comfirmpass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 0, 0)));
        jPanel1.add(txt_comfirmpass);
        txt_comfirmpass.setBounds(580, 420, 340, 40);

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel10.setText("Comfirm Password");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(580, 390, 170, 30);

        btn_sigup.setText("SIG UP");
        btn_sigup.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btn_sigup.setkStartColor(new java.awt.Color(255, 0, 0));
        btn_sigup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sigupActionPerformed(evt);
            }
        });
        jPanel1.add(btn_sigup);
        btn_sigup.setBounds(590, 480, 340, 40);

        btn_sigin.setBackground(new java.awt.Color(255, 255, 255));
        btn_sigin.setForeground(new java.awt.Color(255, 0, 51));
        btn_sigin.setText("SIG IN");
        btn_sigin.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btn_sigin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_siginActionPerformed(evt);
            }
        });
        jPanel1.add(btn_sigin);
        btn_sigin.setBounds(800, 540, 100, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1040, 590);

        setSize(new java.awt.Dimension(1055, 623));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_siginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_siginActionPerformed
       Sigin in = new Sigin(op);
       in.setVisible(true);
       dispose();
    }//GEN-LAST:event_btn_siginActionPerformed

    private void btn_sigupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sigupActionPerformed
        try {
            String username = txt_username.getText();
            String pass = txt_pass.getText();
            String comfpass = txt_comfirmpass.getText();
            
            boolean Ischeck=false;
            if(username.equals("")==false){
                if(pass.equals("")==false){
                    if(comfpass.equals("")==false){
                        if(pass.equals(comfpass)){
                            Ischeck=true;
                            sql="INSERT INTO tb_login(username,password) VALUES(?,?)";
                            ps=connection().prepareStatement(sql);
                            ps.setString(1, username);
                            ps.setString(2,pass);
                            ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Create Account Completed.");
                Clear();
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid Comfirmpassword.");
              
            }
                    }
                }
            }
            if(Ischeck==false){
                JOptionPane.showMessageDialog(null, "Pls Input Your Information");
            }
                    
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
       
    }//GEN-LAST:event_btn_sigupActionPerformed

  
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Sigup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private necesario.MaterialButton btn_sigin;
    private com.k33ptoo.components.KButton btn_sigup;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txt_comfirmpass;
    private javax.swing.JPasswordField txt_pass;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
