package Report11;


import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import com.mysql.jdbc.Connection;

public class Add_Product extends javax.swing.JFrame {
    PreparedStatement ps;
    ResultSet r;
    String sql;

    public Add_Product() {
        initComponents();

    }
    
    public Connection connection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/java11","root","");
            System.out.println("Completed.....");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Connection Error: "+e.getMessage());
        }
        return con;}
    
    
    public void Select(){
        try {
            sql="SELECT *FROM tb_amazon";
            ps=connection().prepareStatement(sql);
            r=ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
            while(r.next()){
               String name = r.getString(1);
               int qty = r.getInt(2);
               double price=r.getDouble(3);
               double amount=r.getDouble(4);
               Object row[]={name,qty,price,amount};
               model.addRow(row);
               
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_table = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        js_greentea = new javax.swing.JSpinner();
        js_mocha = new javax.swing.JSpinner();
        js_blacktea = new javax.swing.JSpinner();
        js_lemontea = new javax.swing.JSpinner();
        js_latte = new javax.swing.JSpinner();
        js_chocolate = new javax.swing.JSpinner();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        btn_delete = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        btn_pay = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));
        jPanel1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jPanel1.setLayout(null);

        kGradientPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "PHNOM PENH", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 18), new java.awt.Color(204, 204, 255))); // NOI18N
        kGradientPanel1.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(204, 255, 255));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("AMAZONE CAFE");
        kGradientPanel1.add(jLabel1);
        jLabel1.setBounds(320, 40, 450, 50);
        kGradientPanel1.add(jLabel7);
        jLabel7.setBounds(180, 20, 0, 90);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\report_soda\\src\\images\\LOGO-removebg-preview.png")); // NOI18N
        kGradientPanel1.add(jLabel2);
        jLabel2.setBounds(130, 30, 120, 80);

        jPanel1.add(kGradientPanel1);
        kGradientPanel1.setBounds(0, 0, 980, 120);

        tb_table.setBackground(new java.awt.Color(255, 153, 153));
        tb_table.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tb_table.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        tb_table.setForeground(new java.awt.Color(0, 0, 0));
        tb_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Qty", "Price", "Amount"
            }
        ));
        tb_table.setRowHeight(20);
        jScrollPane1.setViewportView(tb_table);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(30, 340, 540, 240);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\report_soda\\src\\images\\GREEN_TEA.png")); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(810, 160, 120, 120);
        jPanel1.add(js_greentea);
        js_greentea.setBounds(820, 290, 100, 30);
        jPanel1.add(js_mocha);
        js_mocha.setBounds(670, 290, 100, 30);
        jPanel1.add(js_blacktea);
        js_blacktea.setBounds(510, 290, 100, 30);
        jPanel1.add(js_lemontea);
        js_lemontea.setBounds(350, 290, 100, 30);
        jPanel1.add(js_latte);
        js_latte.setBounds(190, 290, 100, 30);
        jPanel1.add(js_chocolate);
        js_chocolate.setBounds(40, 290, 100, 30);

        jLabel8.setBackground(new java.awt.Color(255, 153, 153));
        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("GREEN-TEA");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(820, 130, 90, 21);

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CHOCOLATE");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(40, 130, 90, 21);

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("CHOCOLATE");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(40, 130, 90, 21);

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText(" LATTE CAFE");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(190, 130, 110, 21);

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("LEMON-TEA");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(350, 130, 100, 21);

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("BLACK-TEA");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(520, 130, 90, 21);

        jLabel20.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\report_soda\\src\\images\\CHOCOLATE.png")); // NOI18N
        jPanel1.add(jLabel20);
        jLabel20.setBounds(30, 160, 120, 120);

        jLabel21.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\report_soda\\src\\images\\LATTE.png")); // NOI18N
        jPanel1.add(jLabel21);
        jLabel21.setBounds(180, 160, 120, 120);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\report_soda\\src\\images\\LEMON_TEA.png")); // NOI18N
        jPanel1.add(jLabel5);
        jLabel5.setBounds(340, 160, 120, 120);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\report_soda\\src\\images\\BLACK_TEA.png")); // NOI18N
        jPanel1.add(jLabel4);
        jLabel4.setBounds(500, 160, 120, 120);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\report_soda\\src\\images\\MOCHA (1).png")); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(660, 160, 120, 120);
        jPanel1.add(jLabel11);
        jLabel11.setBounds(660, 160, 120, 120);

        jPanel3.setBackground(new java.awt.Color(255, 153, 153));

        jLabel19.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("MOCHA");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(660, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel19)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(30, 130, 900, 20);

        btn_delete.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btn_delete.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\report_soda\\src\\images\\icons8-close-40.png")); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_delete);
        btn_delete.setBounds(790, 370, 160, 50);

        btn_add.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btn_add.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\report_soda\\src\\images\\icons8-add-40.png")); // NOI18N
        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel1.add(btn_add);
        btn_add.setBounds(590, 370, 160, 50);

        btn_reset.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btn_reset.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\report_soda\\src\\images\\icons8-reset-40.png")); // NOI18N
        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        jPanel1.add(btn_reset);
        btn_reset.setBounds(590, 470, 160, 50);

        btn_pay.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btn_pay.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\report_soda\\src\\images\\icons8-cash-in-hand-40.png")); // NOI18N
        btn_pay.setText("Payment");
        btn_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_payActionPerformed(evt);
            }
        });
        jPanel1.add(btn_pay);
        btn_pay.setBounds(790, 470, 160, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 980, 600);

        setSize(new java.awt.Dimension(989, 633));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
          Select();
    }//GEN-LAST:event_formWindowOpened

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
       DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
       //chocolate
       int qty_chocolate = (int)js_chocolate.getValue();
       if(qty_chocolate>0){
           String name="Chocolate";
           double price=1.5;
           double amount = qty_chocolate*price;
           Object row[]={name,qty_chocolate,price,amount};
           model.addRow(row);
          
           try {
               sql="INSERT INTO tb_amazon(name,qty,price,amount) VALUES(?,?,?,?)";
               ps=connection().prepareStatement(sql);
               ps.setString(1, name);
               ps.setInt(2, qty_chocolate);
               ps.setDouble(3, price);
               ps.setDouble(4, amount);
               int index=ps.executeUpdate();
               if(index>0){
                   JOptionPane.showMessageDialog(null, "Product Add Success.");
                   js_chocolate.setValue(0);
               }
               else{
                    JOptionPane.showMessageDialog(null, "Product Add Not Success.");
               
                   
               }
               
           } catch (Exception e) {
               JOptionPane.showMessageDialog(this, e);
           }
           
           
       }
       
       //latte
        int qty_latte = (int)js_latte.getValue();
       if(qty_latte>0){
           String name="Latte";
           double price=1.5;
           double amount = qty_latte*price;
           Object row[]={name,qty_latte,price,amount};
           model.addRow(row);
          
           try {
               sql="INSERT INTO tb_amazon(name,qty,price,amount) VALUES(?,?,?,?)";
               ps=connection().prepareStatement(sql);
               ps.setString(1, name);
               ps.setInt(2, qty_latte);
               ps.setDouble(3, price);
               ps.setDouble(4, amount);
               int index=ps.executeUpdate();
               if(index>0){
                   JOptionPane.showMessageDialog(null, "Product Add Success.");
                   js_latte.setValue(0);
               }
               else{
                    JOptionPane.showMessageDialog(null, "Product Add Not Success.");
               
                   
               }
               
           } catch (Exception e) {
               JOptionPane.showMessageDialog(this, e);
           }
           
           
       }
       
       
     
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        try {
            int row = tb_table.getSelectedRow();
            String name = tb_table.getValueAt(row, 0).toString();
            sql="DELETE FROM tb_amazon WHERE name=?";
            ps=connection().prepareStatement(sql);
            ps.setString(1, name);
            ps.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
            model.removeRow(row);
            JOptionPane.showMessageDialog(null, "Delete Success.");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
        
            
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        try {
            sql="DELETE FROM tb_amazon";
            ps=connection().prepareStatement(sql);
            ps.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
            model.setRowCount(0);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
      
       
      
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_payActionPerformed
      Payment pay = new Payment();
      pay.setVisible(true);
      dispose();
    }//GEN-LAST:event_btn_payActionPerformed

  
    public static void main(String args[]) {
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_pay;
    private javax.swing.JButton btn_reset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner js_blacktea;
    private javax.swing.JSpinner js_chocolate;
    private javax.swing.JSpinner js_greentea;
    private javax.swing.JSpinner js_latte;
    private javax.swing.JSpinner js_lemontea;
    private javax.swing.JSpinner js_mocha;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JTable tb_table;
    // End of variables declaration//GEN-END:variables
}
