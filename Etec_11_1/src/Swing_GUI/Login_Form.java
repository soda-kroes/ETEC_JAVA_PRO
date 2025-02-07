
package Swing_GUI;

import javax.swing.JOptionPane;

public class Login_Form extends javax.swing.JFrame {
    public Login_Form() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cb_form = new javax.swing.JComboBox<>();
        txt_pass = new javax.swing.JPasswordField();
        btn_exit = new com.k33ptoo.components.KButton();
        btn_login = new com.k33ptoo.components.KButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("UserName");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(350, 120, 240, 30);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Login Form");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(360, 20, 240, 70);

        txt_name.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txt_name.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 255, 51)));
        getContentPane().add(txt_name);
        txt_name.setBounds(350, 160, 250, 40);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Password");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(350, 210, 240, 30);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Form");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(350, 300, 240, 30);

        cb_form.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cb_form.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Please Select Form", "Student System", "Product System" }));
        cb_form.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(102, 255, 102)));
        cb_form.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_formActionPerformed(evt);
            }
        });
        getContentPane().add(cb_form);
        cb_form.setBounds(350, 340, 250, 40);

        txt_pass.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txt_pass.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(0, 255, 51)));
        getContentPane().add(txt_pass);
        txt_pass.setBounds(350, 250, 250, 40);

        btn_exit.setText("Exit");
        btn_exit.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btn_exit.setkStartColor(new java.awt.Color(255, 0, 0));
        getContentPane().add(btn_exit);
        btn_exit.setBounds(490, 400, 100, 40);

        btn_login.setText("Login");
        btn_login.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        getContentPane().add(btn_login);
        btn_login.setBounds(350, 400, 100, 40);

        jPanel1.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "login", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 24), new java.awt.Color(255, 255, 255))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 356, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 414, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(280, 0, 370, 460);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Etec_7_8\\src\\Images\\login (1).png")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 280, 450);

        setSize(new java.awt.Dimension(662, 493));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cb_formActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_formActionPerformed
       
    }//GEN-LAST:event_cb_formActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        int index = cb_form.getSelectedIndex();
        switch(index){
            case 0:{
                JOptionPane.showMessageDialog(null, "Pls Select Form.");
            }break;
            case 1:{
                String username = txt_name.getText();
                String pass =txt_pass.getText();
                if(username.equals("Dara@gmail.com")){
                    if(pass.equals("12345")){
                        Student_Rigister stu = new Student_Rigister();
                        stu.setVisible(true);
                        dispose();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Invalid Password.");
                    }
                    
                }
                else{
                    JOptionPane.showMessageDialog(this, "Invalid Username.");
                }
                
            }break;
            case 2:{
                String username = txt_name.getText();
                String pass =txt_pass.getText();
                if(username.equals("Dara@gmail.com")){
                    if(pass.equals("12345")){
                        Product_Form.main(null);
                        dispose();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Invalid Password.");
                    }
                    
                }
                else{
                    JOptionPane.showMessageDialog(this, "Invalid Username.");
                }
            }break;
        }
        
    }//GEN-LAST:event_btn_loginActionPerformed

   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btn_exit;
    private com.k33ptoo.components.KButton btn_login;
    private javax.swing.JComboBox<String> cb_form;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_name;
    private javax.swing.JPasswordField txt_pass;
    // End of variables declaration//GEN-END:variables
}
