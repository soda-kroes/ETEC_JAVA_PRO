/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package report2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Form_Add_Product extends javax.swing.JFrame {

    List<ProductList> list = new ArrayList<>();
    double total;
    int count;
    public Form_Add_Product() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_pay = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        txt_qty = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_amout = new javax.swing.JTextField();
        txt_price = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText("Amount : ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 430, 100, 30);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel2.setText("ETEC COFFE LAB");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 30, 310, 70);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setText("Name : ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 190, 90, 30);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setText("Qty  : ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 270, 90, 30);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setText("Price :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 350, 90, 30);

        btn_pay.setText("Payment");
        btn_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_payActionPerformed(evt);
            }
        });
        getContentPane().add(btn_pay);
        btn_pay.setBounds(450, 530, 140, 70);

        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        getContentPane().add(btn_add);
        btn_add.setBounds(40, 530, 150, 70);
        getContentPane().add(txt_qty);
        txt_qty.setBounds(130, 270, 330, 40);
        getContentPane().add(txt_name);
        txt_name.setBounds(130, 190, 330, 40);
        getContentPane().add(txt_amout);
        txt_amout.setBounds(130, 440, 330, 40);

        txt_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_priceActionPerformed(evt);
            }
        });
        getContentPane().add(txt_price);
        txt_price.setBounds(130, 360, 330, 40);

        setBounds(0, 0, 650, 673);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        String name  = txt_name.getText();
        int qty = Integer.parseInt(txt_qty.getText());
        double price = Double.parseDouble(txt_price.getText());
        double amount = price*qty;
        total=amount+total;
        list.add(new ProductList(name, qty, price, amount));
        count++;
        btn_add.setText("Add("+count+")");
        
    }//GEN-LAST:event_btn_addActionPerformed

    private void txt_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_priceActionPerformed
        DecimalFormat df = new DecimalFormat("0.00");
        int qty = Integer.parseInt(txt_qty.getText());
       double price = Double.parseDouble(txt_price.getText());
       double amount=price*qty;
       txt_amout.setText(df.format(amount));
    }//GEN-LAST:event_txt_priceActionPerformed

    private void btn_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_payActionPerformed
       Form_Pay_Product pay = new Form_Pay_Product(total, list);
       pay.setVisible(true);
       dispose();
    }//GEN-LAST:event_btn_payActionPerformed

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
            java.util.logging.Logger.getLogger(Form_Add_Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Add_Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Add_Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Add_Product.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Add_Product().setVisible(true);
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
    private javax.swing.JTextField txt_amout;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_qty;
    // End of variables declaration//GEN-END:variables
}
