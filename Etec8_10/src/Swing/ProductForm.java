/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Swing;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */
public class ProductForm extends javax.swing.JFrame {

    public ProductForm() {
        initComponents();
    }
    
    public void MyProduct(){   
        DecimalFormat df = new DecimalFormat("0.00");
        double subtotal=0;
        double tax=2;
        for(int i=0;i<tb_table.getRowCount();i++){
            String sprice = tb_table.getValueAt(i, 2).toString();
            sprice = sprice.substring(0, sprice.length()-1);//10.5$;
            double price = Double.parseDouble(sprice);
            subtotal=subtotal+price;
        }
        txt_subtotal.setText(String.valueOf(df.format(subtotal))+"$");
        String Subtotal = txt_subtotal.getText();//90$
        Subtotal = Subtotal.substring(0,Subtotal.length()-1);
        double subTotal = Double.parseDouble(Subtotal);//90
        double Tax = subTotal*tax/100;
        txt_tax.setText(String.valueOf(Tax)+"$");
        
        double total=subTotal+Tax;
        txt_total.setText(String.valueOf(total)+"$");
        
    }
    
    public void ChangeDollor(){
        String stotal= txt_total.getText();//30$
        stotal=stotal.substring(0, stotal.length()-1);//30
        double total = Double.parseDouble(stotal);//30 is double
        String cash= txt_cash.getText();//5
        double Cash = Double.parseDouble(cash);
        if(Cash >= total){
            double change = Cash-total;
            txt_change.setText(String.valueOf(change)+"$");
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Please Enter Money Again.");
        }
    }
    public void ChangeKhmer(){
        String stotal= txt_total.getText();//30$
        stotal=stotal.substring(0, stotal.length()-1);//30
        double total = Double.parseDouble(stotal);//30 is double
        total=total*4000;
        String cash= txt_cash.getText();//5
        double Cash = Double.parseDouble(cash);
        if(Cash >= total){
            double change = Cash-total;
            txt_change.setText(String.valueOf(change)+"Riel");
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Please Enter Money Again.");
        }
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btn3 = new com.k33ptoo.components.KButton();
        btn1 = new com.k33ptoo.components.KButton();
        btn2 = new com.k33ptoo.components.KButton();
        btn7 = new com.k33ptoo.components.KButton();
        btn8 = new com.k33ptoo.components.KButton();
        btn9 = new com.k33ptoo.components.KButton();
        btn0 = new com.k33ptoo.components.KButton();
        btndot = new com.k33ptoo.components.KButton();
        btnc = new com.k33ptoo.components.KButton();
        btn4 = new com.k33ptoo.components.KButton();
        btn5 = new com.k33ptoo.components.KButton();
        btn6 = new com.k33ptoo.components.KButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        btn_pocari = new javax.swing.JButton();
        btn_sprite = new javax.swing.JButton();
        btn_string = new javax.swing.JButton();
        btn_caca = new javax.swing.JButton();
        btn_carabao = new javax.swing.JButton();
        btn_funta = new javax.swing.JButton();
        btn_redbul = new javax.swing.JButton();
        btn_lactasoy = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_table = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txt_tax = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_subtotal = new javax.swing.JTextField();
        txt_total = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_cash = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_change = new javax.swing.JTextField();
        cb_pay = new javax.swing.JComboBox<>();
        btn_reset = new com.k33ptoo.components.KButton();
        btn_exit = new com.k33ptoo.components.KButton();
        btn_pay = new com.k33ptoo.components.KButton();
        btn_print = new com.k33ptoo.components.KButton();
        btn_remove = new com.k33ptoo.components.KButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        btn3.setText("3");
        btn3.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel2.add(btn3);
        btn3.setBounds(170, 50, 70, 30);

        btn1.setText("1");
        btn1.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel2.add(btn1);
        btn1.setBounds(10, 50, 70, 30);

        btn2.setText("2");
        btn2.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel2.add(btn2);
        btn2.setBounds(90, 50, 70, 30);

        btn7.setText("7");
        btn7.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel2.add(btn7);
        btn7.setBounds(10, 150, 70, 30);

        btn8.setText("8");
        btn8.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel2.add(btn8);
        btn8.setBounds(90, 150, 70, 30);

        btn9.setText("9");
        btn9.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel2.add(btn9);
        btn9.setBounds(170, 150, 70, 30);

        btn0.setText("0");
        btn0.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel2.add(btn0);
        btn0.setBounds(10, 200, 70, 30);

        btndot.setText(".");
        btndot.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btndot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndotActionPerformed(evt);
            }
        });
        jPanel2.add(btndot);
        btndot.setBounds(90, 200, 70, 30);

        btnc.setText("C");
        btnc.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncActionPerformed(evt);
            }
        });
        jPanel2.add(btnc);
        btnc.setBounds(170, 200, 70, 30);

        btn4.setText("4");
        btn4.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel2.add(btn4);
        btn4.setBounds(10, 100, 70, 30);

        btn5.setText("5");
        btn5.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel2.add(btn5);
        btn5.setBounds(90, 100, 70, 30);

        btn6.setText("6");
        btn6.setFont(new java.awt.Font("sansserif", 0, 14)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel2.add(btn6);
        btn6.setBounds(170, 100, 70, 30);

        jPanel5.setBackground(new java.awt.Color(153, 204, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "ENTER", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 24), new java.awt.Color(102, 0, 255))); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 236, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 234, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel5);
        jPanel5.setBounds(0, 0, 250, 280);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(40, 140, 250, 280);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "PRODUCT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 14), new java.awt.Color(153, 255, 255))); // NOI18N
        jPanel3.setLayout(null);

        btn_pocari.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Etec8_10\\src\\Images\\pocari.jpg")); // NOI18N
        btn_pocari.setText("jButton3");
        btn_pocari.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 204)));
        jPanel3.add(btn_pocari);
        btn_pocari.setBounds(20, 160, 90, 110);

        btn_sprite.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Etec8_10\\src\\Images\\spite.jpg")); // NOI18N
        btn_sprite.setText("jButton3");
        btn_sprite.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 204)));
        jPanel3.add(btn_sprite);
        btn_sprite.setBounds(140, 160, 90, 110);

        btn_string.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Etec8_10\\src\\Images\\sting1.jpg")); // NOI18N
        btn_string.setText("jButton3");
        btn_string.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 204)));
        jPanel3.add(btn_string);
        btn_string.setBounds(270, 160, 90, 110);

        btn_caca.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Etec8_10\\src\\Images\\coca1.jpg")); // NOI18N
        btn_caca.setText("jButton3");
        btn_caca.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 204)));
        jPanel3.add(btn_caca);
        btn_caca.setBounds(410, 160, 90, 110);

        btn_carabao.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Etec8_10\\src\\Images\\cara.jpg")); // NOI18N
        btn_carabao.setText("jButton3");
        btn_carabao.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 204)));
        btn_carabao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_carabaoActionPerformed(evt);
            }
        });
        jPanel3.add(btn_carabao);
        btn_carabao.setBounds(20, 30, 90, 110);

        btn_funta.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Etec8_10\\src\\Images\\funta.jpg")); // NOI18N
        btn_funta.setText("jButton3");
        btn_funta.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 204)));
        btn_funta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_funtaActionPerformed(evt);
            }
        });
        jPanel3.add(btn_funta);
        btn_funta.setBounds(140, 30, 90, 110);

        btn_redbul.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Etec8_10\\src\\Images\\redbull.jpg")); // NOI18N
        btn_redbul.setText("jButton3");
        btn_redbul.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 204)));
        jPanel3.add(btn_redbul);
        btn_redbul.setBounds(270, 30, 90, 110);

        btn_lactasoy.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Etec8_10\\src\\Images\\lactasoy.jpg")); // NOI18N
        btn_lactasoy.setText("jButton3");
        btn_lactasoy.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 204)));
        jPanel3.add(btn_lactasoy);
        btn_lactasoy.setBounds(410, 30, 90, 110);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(550, 139, 550, 280);

        tb_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Qty", "Price"
            }
        ));
        jScrollPane1.setViewportView(tb_table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(300, 140, 230, 280);

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setText("Tax     :");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(20, 60, 100, 30);

        txt_tax.setEditable(false);
        txt_tax.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jPanel4.add(txt_tax);
        txt_tax.setBounds(120, 60, 190, 30);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setText("SubTotal: ");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(20, 10, 100, 30);

        txt_subtotal.setEditable(false);
        txt_subtotal.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jPanel4.add(txt_subtotal);
        txt_subtotal.setBounds(120, 10, 190, 30);

        txt_total.setEditable(false);
        txt_total.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jPanel4.add(txt_total);
        txt_total.setBounds(120, 100, 190, 30);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setText("Total   :");
        jPanel4.add(jLabel4);
        jLabel4.setBounds(20, 100, 100, 30);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setText("Payment : ");
        jPanel4.add(jLabel5);
        jLabel5.setBounds(360, 10, 100, 30);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel6.setText("Cash    :");
        jPanel4.add(jLabel6);
        jLabel6.setBounds(360, 60, 100, 30);

        txt_cash.setEditable(false);
        txt_cash.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jPanel4.add(txt_cash);
        txt_cash.setBounds(460, 60, 190, 30);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel7.setText("Chage  :");
        jPanel4.add(jLabel7);
        jLabel7.setBounds(360, 100, 100, 30);

        txt_change.setEditable(false);
        txt_change.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jPanel4.add(txt_change);
        txt_change.setBounds(460, 100, 190, 30);

        cb_pay.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cb_pay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dollor", "Khmer", " " }));
        cb_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_payActionPerformed(evt);
            }
        });
        jPanel4.add(cb_pay);
        cb_pay.setBounds(460, 16, 190, 30);

        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        jPanel4.add(btn_reset);
        btn_reset.setBounds(900, 10, 130, 30);

        btn_exit.setText("Exit");
        btn_exit.setkStartColor(new java.awt.Color(255, 0, 0));
        jPanel4.add(btn_exit);
        btn_exit.setBounds(700, 110, 330, 30);

        btn_pay.setText("Payment");
        btn_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_payActionPerformed(evt);
            }
        });
        jPanel4.add(btn_pay);
        btn_pay.setBounds(700, 10, 130, 30);

        btn_print.setText("Print");
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });
        jPanel4.add(btn_print);
        btn_print.setBounds(700, 70, 130, 30);

        btn_remove.setText("Remove");
        btn_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeActionPerformed(evt);
            }
        });
        jPanel4.add(btn_remove);
        btn_remove.setBounds(900, 70, 130, 30);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1060, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        jPanel4.add(jPanel1);
        jPanel1.setBounds(0, 0, 1060, 150);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(40, 440, 1060, 150);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("ETEC DRINK SHOP");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(300, 10, 470, 90);

        kGradientPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "PHNOM PENH", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 14), new java.awt.Color(204, 255, 255))); // NOI18N

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1126, Short.MAX_VALUE)
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );

        getContentPane().add(kGradientPanel1);
        kGradientPanel1.setBounds(0, 0, 1140, 110);

        setSize(new java.awt.Dimension(1149, 643));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        String num = txt_cash.getText();
       num = txt_cash.getText()+"4";
       txt_cash.setText(num);
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
         String num = txt_cash.getText();
       num = txt_cash.getText()+"7";
       txt_cash.setText(num);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btndotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndotActionPerformed
        String num = txt_cash.getText();
       num = txt_cash.getText()+".";
       txt_cash.setText(num);
    }//GEN-LAST:event_btndotActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        String num = txt_cash.getText();
        num = txt_cash.getText()+"1";
        txt_cash.setText(num);
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
       String num = txt_cash.getText();
       num = txt_cash.getText()+"2";
       txt_cash.setText(num);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
         String num = txt_cash.getText();
       num = txt_cash.getText()+"3";
       txt_cash.setText(num);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
         String num = txt_cash.getText();
       num = txt_cash.getText()+"5";
       txt_cash.setText(num);
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
          String num = txt_cash.getText();
       num = txt_cash.getText()+"6";
       txt_cash.setText(num);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
          String num = txt_cash.getText();
       num = txt_cash.getText()+"8";
       txt_cash.setText(num);
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
         String num = txt_cash.getText();
       num = txt_cash.getText()+"9";
       txt_cash.setText(num);
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
          String num = txt_cash.getText();
       num = txt_cash.getText()+"0";
       txt_cash.setText(num);
    }//GEN-LAST:event_btn0ActionPerformed

    private void btncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncActionPerformed
      txt_cash.setText("");
      txt_change.setText("");
    }//GEN-LAST:event_btncActionPerformed

    private void btn_carabaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_carabaoActionPerformed
      DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
      double price=1;
      Object row[]={"Caraboa","1",price+"$"};
      model.addRow(row);
      MyProduct();
    }//GEN-LAST:event_btn_carabaoActionPerformed

    private void btn_funtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_funtaActionPerformed
       DefaultTableModel model  = (DefaultTableModel)tb_table.getModel();
       double price=1;
       Object row[]={"Fanta","1",price+"$"};
       model.addRow(row);
       MyProduct();
    }//GEN-LAST:event_btn_funtaActionPerformed

    private void btn_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_payActionPerformed
      int index = cb_pay.getSelectedIndex();
      if(index==0){
          ChangeDollor();
      }
      else{
          ChangeKhmer();
      }
      
    }//GEN-LAST:event_btn_payActionPerformed

    private void cb_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_payActionPerformed
       
    }//GEN-LAST:event_cb_payActionPerformed

    private void btn_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeActionPerformed
       int row = tb_table.getSelectedRow();
       if(row==-1){
           JOptionPane.showMessageDialog(null,"Please Select Row.");
       }
       else{
           DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
           model.removeRow(row);
           MyProduct();
           
         int index = cb_pay.getSelectedIndex();
      if(index==0){
          ChangeDollor();
      }
      else{
          ChangeKhmer();
      }
      
       }
    }//GEN-LAST:event_btn_removeActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
        model.setRowCount(0);
        //do your self 
        txt_subtotal.setText("");
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
       MessageFormat header = new MessageFormat("ETEC DRINK SHOP");
       MessageFormat footer = new MessageFormat("Thanks You.....!");
        try {
            tb_table.print(JTable.PrintMode.NORMAL,header,footer);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
       
    }//GEN-LAST:event_btn_printActionPerformed
    
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
            java.util.logging.Logger.getLogger(ProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btn0;
    private com.k33ptoo.components.KButton btn1;
    private com.k33ptoo.components.KButton btn2;
    private com.k33ptoo.components.KButton btn3;
    private com.k33ptoo.components.KButton btn4;
    private com.k33ptoo.components.KButton btn5;
    private com.k33ptoo.components.KButton btn6;
    private com.k33ptoo.components.KButton btn7;
    private com.k33ptoo.components.KButton btn8;
    private com.k33ptoo.components.KButton btn9;
    private javax.swing.JButton btn_caca;
    private javax.swing.JButton btn_carabao;
    private com.k33ptoo.components.KButton btn_exit;
    private javax.swing.JButton btn_funta;
    private javax.swing.JButton btn_lactasoy;
    private com.k33ptoo.components.KButton btn_pay;
    private javax.swing.JButton btn_pocari;
    private com.k33ptoo.components.KButton btn_print;
    private javax.swing.JButton btn_redbul;
    private com.k33ptoo.components.KButton btn_remove;
    private com.k33ptoo.components.KButton btn_reset;
    private javax.swing.JButton btn_sprite;
    private javax.swing.JButton btn_string;
    private com.k33ptoo.components.KButton btnc;
    private com.k33ptoo.components.KButton btndot;
    private javax.swing.JComboBox<String> cb_pay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JTable tb_table;
    private javax.swing.JTextField txt_cash;
    private javax.swing.JTextField txt_change;
    private javax.swing.JTextField txt_subtotal;
    private javax.swing.JTextField txt_tax;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
