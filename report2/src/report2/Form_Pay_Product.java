/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package report2;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author ASUS
 */
public class Form_Pay_Product extends javax.swing.JFrame {
    List<ProductList> list;
    double total;

    public Form_Pay_Product() {
        initComponents();
    }
    
     public Form_Pay_Product(double total,List<ProductList> list) {
        initComponents();
        this.total=total;
        this.list=list;
        txt_total.setText(String.valueOf(total));
    }
     
     public Collection data(){
         List<ProductList> ls = new ArrayList<>();
         for(ProductList temp: list){
             String name = temp.getName();
             int qty = temp.getQty();
             double price = temp.getPrice();
             double amount = temp.getAmount();
             ls.add(new ProductList(name, qty, price, amount));
         }
         return ls;
                 
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_pay = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        txt_total = new javax.swing.JTextField();
        txt_pay = new javax.swing.JTextField();
        cb_dis = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel2.setText("Payment");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(140, 30, 310, 70);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setText("Total");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(20, 190, 90, 30);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setText("Discout");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 270, 90, 30);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setText("Payment");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 360, 90, 30);

        btn_pay.setText("Print");
        btn_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_payActionPerformed(evt);
            }
        });
        getContentPane().add(btn_pay);
        btn_pay.setBounds(450, 530, 140, 70);

        btn_add.setText("Back");
        getContentPane().add(btn_add);
        btn_add.setBounds(40, 530, 150, 70);
        getContentPane().add(txt_total);
        txt_total.setBounds(130, 190, 330, 40);
        getContentPane().add(txt_pay);
        txt_pay.setBounds(130, 350, 330, 40);

        cb_dis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10%", "20%", "30%", "40%", "50%" }));
        cb_dis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_disActionPerformed(evt);
            }
        });
        getContentPane().add(cb_dis);
        cb_dis.setBounds(140, 247, 330, 50);

        setBounds(0, 0, 650, 673);
    }// </editor-fold>//GEN-END:initComponents

    private void cb_disActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_disActionPerformed
        double total = Double.parseDouble(txt_total.getText());
        String dis = cb_dis.getSelectedItem().toString();
        
        dis = dis.substring(0, dis.length()-1);
        double discount = Double.parseDouble(dis);
        double payment  = total-(total*discount/100);
        DecimalFormat df = new DecimalFormat("0.00");
        txt_pay.setText(df.format(payment));
        
    }//GEN-LAST:event_cb_disActionPerformed

    private void btn_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_payActionPerformed
        
	try {
            double total = Double.parseDouble(txt_total.getText());
            
            
            String dis =cb_dis.getSelectedItem().toString();
            dis=dis.substring(0, dis.length()-1);
            double discount = Double.parseDouble(dis);
            
            JasperReport jp = JasperCompileManager.compileReport("report/coffe.jrxml");
            HashMap pr = new HashMap();
            pr.put("total", total);
            pr.put("discount", discount);
            JRBeanCollectionDataSource jcd = new JRBeanCollectionDataSource(data());
            JasperPrint price = JasperFillManager.fillReport(jp, pr,jcd);
            JasperViewer.viewReport(price,false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btn_payActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
    
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Pay_Product().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_pay;
    private javax.swing.JComboBox<String> cb_dis;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txt_pay;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
