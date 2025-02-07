
package report1;

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


public class Form_Pay extends javax.swing.JFrame {
    double total;
    List<Product_List> list;

    //default constrcutor
    public Form_Pay() {
        initComponents();
    }
    //constructor with parameter
     public Form_Pay(double total,List<Product_List> list) {
        initComponents();
        this.total=total;
        this.list=list;
        txt_total.setText(String.valueOf(total));
        
    }
     
     Collection data(){
         List<Product_List> ls = new ArrayList<>();//new list
         for(Product_List temp: list){
             String name = temp.getName();
             int qty = temp.getQty();
             double price = temp.getPrice();
             double amount = temp.getAmount();
             ls.add(new Product_List(name, qty, price, amount));

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
        jLabel6 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        txt_pay = new javax.swing.JTextField();
        btn_print = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        cb_dis = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\report1\\src\\images\\icons8-cofee-100.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 0, 110, 120);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel3.setText("Payment");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(190, 30, 280, 60);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setText("Total    : ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 160, 100, 30);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setText("Discount : ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 240, 120, 30);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel6.setText("Payment : ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 330, 120, 30);

        txt_total.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        getContentPane().add(txt_total);
        txt_total.setBounds(190, 160, 270, 40);

        txt_pay.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txt_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_payActionPerformed(evt);
            }
        });
        getContentPane().add(txt_pay);
        txt_pay.setBounds(190, 330, 270, 40);

        btn_print.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btn_print.setText("Print");
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });
        getContentPane().add(btn_print);
        btn_print.setBounds(350, 420, 110, 40);

        btn_back.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        getContentPane().add(btn_back);
        btn_back.setBounds(180, 420, 100, 40);

        cb_dis.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        cb_dis.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10%", "20%", "30%", "40%", "50%", " " }));
        cb_dis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_disActionPerformed(evt);
            }
        });
        getContentPane().add(cb_dis);
        cb_dis.setBounds(190, 237, 270, 40);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 560, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 550, 560);

        setSize(new java.awt.Dimension(564, 568));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
      try {
          double total = Double.parseDouble(txt_total.getText());//90
           String dis = cb_dis.getSelectedItem().toString();//50%
           dis=dis.substring(0, dis.length()-1);
           double discount = Double.parseDouble(dis);
           
            JasperReport jp = JasperCompileManager.compileReport("report/etec.jrxml");
            HashMap pr = new HashMap();
            
            pr.put("total", total);
            pr.put("discount", discount);
            

            JRBeanCollectionDataSource jcd = new JRBeanCollectionDataSource(data());
            JasperPrint price = JasperFillManager.fillReport(jp, pr,jcd);
            JasperViewer.viewReport(price,false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btn_printActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
      Form_Buy buy = new Form_Buy();
      buy.setVisible(true);
      dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    private void cb_disActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_disActionPerformed
        DecimalFormat df = new DecimalFormat("0.00");
        double total = Double.parseDouble(txt_total.getText());
        String dis = cb_dis.getSelectedItem().toString();//50%
        dis=dis.substring(0, dis.length()-1);
        double discount = Double.parseDouble(dis);
        double payment=total-(total*discount/100);
        txt_pay.setText(df.format(payment));
    }//GEN-LAST:event_cb_disActionPerformed

    private void txt_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_payActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_payActionPerformed

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
            java.util.logging.Logger.getLogger(Form_Pay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Pay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Pay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Pay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Pay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_print;
    private javax.swing.JComboBox<String> cb_dis;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_pay;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
