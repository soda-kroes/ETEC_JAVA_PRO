package Report11;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;
import report11.list_product;


public class Payment extends javax.swing.JFrame {
    
     PreparedStatement ps;
     ResultSet r;
     String sql;
     List<list_product> list = new ArrayList<>();
     double total;
     DecimalFormat df = new DecimalFormat("0.00$");
  
    public Payment() {
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
    
    
    public Collection data(){
        List<list_product> ls = new ArrayList<>();
        for(list_product temp : list){
            String name = temp.getName();
            int qty = temp.getQty();
            double price = temp.getPrice();
            double amount = temp.getAmount();
            ls.add(new list_product(name, qty, price, amount));
            
        }
        return ls;
        
        
    }
    
    
    
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
               list.add(new list_product(name, qty, price, amount));
               total=total+amount;
               txt_total.setText(df.format(total));
               txt_disprice.setText("0.00$");
               txt_payment.setText(df.format(total));
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

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_return = new javax.swing.JTextField();
        txt_total = new javax.swing.JTextField();
        txt_disprice = new javax.swing.JTextField();
        txt_payment = new javax.swing.JTextField();
        txt_recieve = new javax.swing.JTextField();
        cb_discount = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_table = new javax.swing.JTable();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btn_print = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total          : ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 230, 150, 30);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Discount(%)   : ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 290, 150, 30);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Discount($)   : ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 350, 150, 30);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cash Return    :");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 530, 150, 30);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Payment       : ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 410, 150, 30);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cash Receive   : ");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(20, 470, 160, 30);

        txt_return.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        getContentPane().add(txt_return);
        txt_return.setBounds(190, 520, 220, 40);

        txt_total.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        getContentPane().add(txt_total);
        txt_total.setBounds(190, 230, 220, 40);

        txt_disprice.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txt_disprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_dispriceActionPerformed(evt);
            }
        });
        getContentPane().add(txt_disprice);
        txt_disprice.setBounds(190, 350, 220, 40);

        txt_payment.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        getContentPane().add(txt_payment);
        txt_payment.setBounds(190, 410, 220, 40);

        txt_recieve.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txt_recieve.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_recieveKeyReleased(evt);
            }
        });
        getContentPane().add(txt_recieve);
        txt_recieve.setBounds(190, 470, 220, 40);

        cb_discount.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cb_discount.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0%", "10%", "20%", "30%", "40%", "50%", " " }));
        cb_discount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_discountActionPerformed(evt);
            }
        });
        getContentPane().add(cb_discount);
        cb_discount.setBounds(190, 290, 220, 40);

        tb_table.setBackground(new java.awt.Color(255, 153, 153));
        tb_table.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        tb_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "name", "qty", "price", "amount"
            }
        ));
        tb_table.setRowHeight(20);
        jScrollPane1.setViewportView(tb_table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(430, 230, 510, 280);

        kGradientPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "AMAZONE CAFE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 0, 14), new java.awt.Color(204, 255, 255))); // NOI18N
        kGradientPanel1.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(204, 255, 255));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Payment");
        kGradientPanel1.add(jLabel2);
        jLabel2.setBounds(310, 30, 230, 60);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Soda_Report\\src\\images\\icons8-cash-100.png")); // NOI18N
        kGradientPanel1.add(jLabel1);
        jLabel1.setBounds(180, 20, 170, 110);

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Soda_Report\\src\\images\\LOGO-removebg-preview.png")); // NOI18N
        kGradientPanel1.add(jLabel10);
        jLabel10.setBounds(820, 30, 120, 80);

        getContentPane().add(kGradientPanel1);
        kGradientPanel1.setBounds(0, 0, 1020, 130);

        jLabel6.setBackground(new java.awt.Color(204, 255, 255));
        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 255));
        jLabel6.setText("AMAZONE CAFE");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(490, 160, 450, 50);

        btn_print.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btn_print.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Soda_Report\\src\\images\\icons8-send-to-printer-35.png")); // NOI18N
        btn_print.setText("Print");
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });
        getContentPane().add(btn_print);
        btn_print.setBounds(740, 520, 130, 50);

        btn_back.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        btn_back.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Soda_Report\\src\\images\\icons8-back-arrow-35.png")); // NOI18N
        btn_back.setText("Back");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        getContentPane().add(btn_back);
        btn_back.setBounds(520, 520, 130, 50);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(5, 5, 5, 5, new java.awt.Color(204, 0, 0)));
        jPanel1.setLayout(null);
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 130, 960, 460);

        setSize(new java.awt.Dimension(976, 628));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cb_discountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_discountActionPerformed
       String stotal = txt_total.getText();
       stotal = stotal.substring(0,stotal.length()-1);
       double total = Double.parseDouble(stotal);
       
       String sdis = cb_discount.getSelectedItem().toString();
       sdis=sdis.substring(0, sdis.length()-1);
       int discount = Integer.parseInt(sdis);
       
       double disprice = total*discount/100;
       double payment=total-disprice;
       txt_disprice.setText(df.format(disprice));
       txt_payment.setText(df.format(payment));
       
       
        
    
        
     
    }//GEN-LAST:event_cb_discountActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      Select();
    }//GEN-LAST:event_formWindowOpened

    private void txt_recieveKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_recieveKeyReleased
       String spay = txt_payment.getText();
       spay=spay.substring(0, spay.length()-1);
       double payment = Double.parseDouble(spay);
       
       double recieve = Double.parseDouble(txt_recieve.getText());
       double ret = recieve-payment;
       txt_return.setText(df.format(ret));
    }//GEN-LAST:event_txt_recieveKeyReleased

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        
	try {
            
            String stotal = txt_total.getText();
            stotal = stotal.substring(0,stotal.length()-1);
            double total = Double.parseDouble(stotal);
            
              String sdis = cb_discount.getSelectedItem().toString();
              sdis=sdis.substring(0, sdis.length()-1);
              double discount = Double.parseDouble(sdis);
              
              
              String sdisprice = txt_disprice.getText();
              sdisprice = sdisprice.substring(0, sdisprice.length()-1);
              double disprice = Double.parseDouble(sdisprice);
              
              String pay = txt_payment.getText();
              pay=pay.substring(0, pay.length()-1);
              double payment = Double.parseDouble(pay);
              
              double recieve = Double.parseDouble(txt_recieve.getText());
              
              String sreturn = txt_return.getText();
              sreturn = sreturn.substring(0, sreturn.length()-1);
              double returned = Double.parseDouble(sreturn);
              
            
            
            JasperReport jp = JasperCompileManager.compileReport("report/report11.jrxml");
            HashMap pr = new HashMap();
            pr.put("total", total);
            pr.put("discount", discount/100);
            pr.put("disprice", disprice);
            pr.put("payment", payment);
            pr.put("recieve", recieve);
            pr.put("returned", returned);
            JRBeanCollectionDataSource jcd = new JRBeanCollectionDataSource(data());
            JasperPrint price = JasperFillManager.fillReport(jp, pr,jcd);
            JasperViewer.viewReport(price,false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }                 
       
    }//GEN-LAST:event_btn_printActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        Add_Product add = new Add_Product();
        add.setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    private void txt_dispriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_dispriceActionPerformed
       
    }//GEN-LAST:event_txt_dispriceActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_print;
    private javax.swing.JComboBox<String> cb_discount;
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
    private javax.swing.JScrollPane jScrollPane1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JTable tb_table;
    private javax.swing.JTextField txt_disprice;
    private javax.swing.JTextField txt_payment;
    private javax.swing.JTextField txt_recieve;
    private javax.swing.JTextField txt_return;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
