
package report1;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Form_Buy extends javax.swing.JFrame {
    List<Product_List> list = new ArrayList<>();
    int count;
    double total;

    public Form_Buy() {
        initComponents();
    }
    

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_amount = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_qty = new javax.swing.JTextField();
        txt_price = new javax.swing.JTextField();
        btn_pay = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btn_add = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(546, 569));
        setMinimumSize(new java.awt.Dimension(546, 559));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText("Amount :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(80, 410, 120, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\report1\\src\\images\\icons8-cofee-100.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 0, 110, 120);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel3.setText("ETEC COFFEE LAB");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(160, 30, 360, 60);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setText("Name : ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 160, 120, 30);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setText("Qty   : ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 240, 120, 30);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel6.setText("Price  : ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 330, 120, 30);

        txt_amount.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        getContentPane().add(txt_amount);
        txt_amount.setBounds(170, 410, 270, 40);

        txt_name.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        getContentPane().add(txt_name);
        txt_name.setBounds(170, 160, 270, 40);

        txt_qty.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        getContentPane().add(txt_qty);
        txt_qty.setBounds(170, 240, 270, 40);

        txt_price.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txt_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_priceActionPerformed(evt);
            }
        });
        getContentPane().add(txt_price);
        txt_price.setBounds(170, 330, 270, 40);

        btn_pay.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btn_pay.setText("Payment");
        btn_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_payActionPerformed(evt);
            }
        });
        getContentPane().add(btn_pay);
        btn_pay.setBounds(330, 490, 110, 40);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        btn_add.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(276, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(490, Short.MAX_VALUE)
                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(70, 70, 70))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 550, 600);

        setSize(new java.awt.Dimension(564, 611));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
       String name = txt_name.getText();
       int qty = Integer.parseInt(txt_qty.getText());
       double price = Double.parseDouble(txt_price.getText());
       double amount=price*qty;
       total=amount+total;
       list.add(new Product_List(name, qty, price, amount));
       count++;
       btn_add.setText("Add("+count+")");
       txt_name.setText("");
       txt_price.setText("");
       txt_qty.setText("");
       txt_amount.setText("");
       
    }//GEN-LAST:event_btn_addActionPerformed

    private void txt_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_priceActionPerformed
        DecimalFormat df = new DecimalFormat("0.00");
        int qty = Integer.parseInt(txt_qty.getText());
        double price = Double.parseDouble(txt_price.getText());
        double amount = price*qty;
        txt_amount.setText(df.format(amount));
    }//GEN-LAST:event_txt_priceActionPerformed

    private void btn_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_payActionPerformed
       Form_Pay pay = new Form_Pay(total, list);
       pay.setVisible(true);
       //Form_Pay.main(null);
       dispose();
    }//GEN-LAST:event_btn_payActionPerformed

  
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Buy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_pay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_amount;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_qty;
    // End of variables declaration//GEN-END:variables
}
