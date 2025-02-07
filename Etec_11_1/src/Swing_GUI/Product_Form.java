
package Swing_GUI;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Product_Form extends javax.swing.JFrame {

    //constructor
    public Product_Form() {
        initComponents();
    }
    public void ProductItem(){
        DecimalFormat df = new DecimalFormat("0.00");
        double subtotal=0;
        double tax=2;
        for(int i=0;i<tb_table.getRowCount();i++){
            String sprice = tb_table.getValueAt(i, 2).toString();//1$
            sprice = sprice.substring(0, sprice.length()-1);//1 string
            double price = Double.parseDouble(sprice);//1 double
            subtotal=subtotal+price;
        }
        txt_subtotal.setText(df.format(subtotal)+"$");
        
        String ssubtotal = txt_subtotal.getText();
        ssubtotal=ssubtotal.substring(0, ssubtotal.length()-1);
        double Subtotal = Double.parseDouble(ssubtotal);
        double Tax=tax/100;
        txt_tax.setText(df.format(Tax)+"$");
        double total = Tax+Subtotal;
        txt_total.setText(df.format(total)+"$");
    }
    
    public void Dollor(){
        DecimalFormat df = new DecimalFormat("0.00");
        String Total = txt_total.getText();
        Total=Total.substring(0,Total.length()-1);
        double total = Double.parseDouble(Total);
        
        double cash = Double.parseDouble(txt_cash.getText());
        if(cash>=total){
            double chage = cash-total;
            txt_change.setText(df.format(chage)+"$");
        }
        else{
            JOptionPane.showMessageDialog(this, "Pls Input Money Again.");
        }
        
    }
    
    public void Riel(){
        DecimalFormat df = new DecimalFormat("0.00");
        String Total = txt_total.getText();
        Total=Total.substring(0,Total.length()-1);
        double total = Double.parseDouble(Total);
        total=total*4000;
        
        double cash = Double.parseDouble(txt_cash.getText());
        if(cash>=total){
            double chage = cash-total;
            txt_change.setText(df.format(chage)+"Riel");
        }
        else{
            JOptionPane.showMessageDialog(this, "Pls Input Money Again.");
        }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn_carabao = new javax.swing.JButton();
        btn_vigor = new javax.swing.JButton();
        btn_funta = new javax.swing.JButton();
        btn_coca = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        txt_subtotal = new javax.swing.JTextField();
        txt_tax = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_cash = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_change = new javax.swing.JTextField();
        btn_delete = new com.k33ptoo.components.KButton();
        btn_reset = new com.k33ptoo.components.KButton();
        btn_pay = new com.k33ptoo.components.KButton();
        btn_exit = new com.k33ptoo.components.KButton();
        btn_print = new com.k33ptoo.components.KButton();
        cb_pay = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        kButton15 = new com.k33ptoo.components.KButton();
        kButton11 = new com.k33ptoo.components.KButton();
        kButton5 = new com.k33ptoo.components.KButton();
        btn2 = new com.k33ptoo.components.KButton();
        kButton7 = new com.k33ptoo.components.KButton();
        kButton9 = new com.k33ptoo.components.KButton();
        kButton13 = new com.k33ptoo.components.KButton();
        kButton14 = new com.k33ptoo.components.KButton();
        kButton10 = new com.k33ptoo.components.KButton();
        kButton6 = new com.k33ptoo.components.KButton();
        btn1 = new com.k33ptoo.components.KButton();
        kButton12 = new com.k33ptoo.components.KButton();
        kButton16 = new com.k33ptoo.components.KButton();
        kButton17 = new com.k33ptoo.components.KButton();
        btn3 = new com.k33ptoo.components.KButton();
        kButton22 = new com.k33ptoo.components.KButton();
        kButton23 = new com.k33ptoo.components.KButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        kGradientPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "CAMBODIA MART", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 14), new java.awt.Color(204, 255, 255))); // NOI18N
        kGradientPanel1.setkStartColor(new java.awt.Color(255, 0, 0));
        kGradientPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("ETEC DRINK SHOP");
        kGradientPanel1.add(jLabel1);
        jLabel1.setBounds(410, 20, 480, 80);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Etec_11_1\\src\\Images\\icons8-drink-100 (1).png")); // NOI18N
        kGradientPanel1.add(jLabel2);
        jLabel2.setBounds(160, 20, 110, 90);

        getContentPane().add(kGradientPanel1);
        kGradientPanel1.setBounds(0, 0, 1130, 120);

        tb_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Qty", "Price"
            }
        ));
        jScrollPane1.setViewportView(tb_table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(330, 140, 210, 320);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(255, 102, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "ETEC DRINK SHOP", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 12), new java.awt.Color(204, 255, 255))); // NOI18N
        jPanel5.setLayout(null);

        jLabel4.setBackground(new java.awt.Color(153, 255, 255));
        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 30)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 255, 255));
        jLabel4.setText("ITEM PRODUCT");
        jPanel5.add(jLabel4);
        jLabel4.setBounds(140, 10, 300, 40);

        jPanel2.add(jPanel5);
        jPanel5.setBounds(0, 0, 540, 60);

        btn_carabao.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Etec_7_8\\src\\Images\\cara.jpg")); // NOI18N
        jPanel2.add(btn_carabao);
        btn_carabao.setBounds(410, 70, 100, 110);

        btn_vigor.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Etec_11_1\\src\\Images\\vigor.png")); // NOI18N
        btn_vigor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vigorActionPerformed(evt);
            }
        });
        jPanel2.add(btn_vigor);
        btn_vigor.setBounds(10, 70, 100, 110);

        btn_funta.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Etec_7_8\\src\\Images\\funta.jpg")); // NOI18N
        btn_funta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_funtaActionPerformed(evt);
            }
        });
        jPanel2.add(btn_funta);
        btn_funta.setBounds(150, 70, 100, 110);

        btn_coca.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Etec_7_8\\src\\Images\\coca1.jpg")); // NOI18N
        jPanel2.add(btn_coca);
        btn_coca.setBounds(280, 70, 100, 110);
        jPanel2.add(jButton5);
        jButton5.setBounds(410, 200, 100, 110);
        jPanel2.add(jButton6);
        jButton6.setBounds(280, 200, 100, 110);
        jPanel2.add(jButton7);
        jButton7.setBounds(150, 200, 100, 110);
        jPanel2.add(jButton8);
        jButton8.setBounds(10, 200, 100, 110);

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 530, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 260, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel6);
        jPanel6.setBounds(0, 60, 530, 260);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(570, 140, 530, 320);

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setText("Total       : ");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(20, 100, 140, 26);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel6.setText("Sub Total  : ");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(20, 20, 130, 26);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel7.setText("Tax         :");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(20, 60, 140, 26);

        txt_total.setEditable(false);
        txt_total.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txt_total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_total.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 255)));
        jPanel3.add(txt_total);
        txt_total.setBounds(150, 100, 220, 23);

        txt_subtotal.setEditable(false);
        txt_subtotal.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txt_subtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_subtotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 255)));
        jPanel3.add(txt_subtotal);
        txt_subtotal.setBounds(150, 20, 220, 23);

        txt_tax.setEditable(false);
        txt_tax.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txt_tax.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_tax.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 255)));
        jPanel3.add(txt_tax);
        txt_tax.setBounds(150, 60, 220, 23);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel8.setText("Payment   : ");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(410, 20, 130, 26);

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel9.setText("Cash       :");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(410, 60, 120, 26);

        txt_cash.setEditable(false);
        txt_cash.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txt_cash.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_cash.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 255)));
        jPanel3.add(txt_cash);
        txt_cash.setBounds(540, 60, 220, 23);

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel10.setText("Change     : ");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(410, 100, 140, 26);

        txt_change.setEditable(false);
        txt_change.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txt_change.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_change.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 204, 255)));
        jPanel3.add(txt_change);
        txt_change.setBounds(540, 100, 220, 23);

        btn_delete.setText("Delete");
        btn_delete.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel3.add(btn_delete);
        btn_delete.setBounds(950, 20, 100, 30);

        btn_reset.setText("Reset");
        btn_reset.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        jPanel3.add(btn_reset);
        btn_reset.setBounds(950, 70, 100, 30);

        btn_pay.setText("Payment");
        btn_pay.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btn_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_payActionPerformed(evt);
            }
        });
        jPanel3.add(btn_pay);
        btn_pay.setBounds(810, 20, 100, 30);

        btn_exit.setText("Exit");
        btn_exit.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btn_exit.setkStartColor(new java.awt.Color(255, 0, 0));
        jPanel3.add(btn_exit);
        btn_exit.setBounds(810, 110, 240, 30);

        btn_print.setText("Print");
        btn_print.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });
        jPanel3.add(btn_print);
        btn_print.setBounds(810, 70, 100, 30);

        cb_pay.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cb_pay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Riel", "Dollor", " " }));
        jPanel3.add(cb_pay);
        cb_pay.setBounds(540, 20, 220, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(20, 470, 1090, 150);

        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(null);

        kButton15.setText("1");
        jPanel4.add(kButton15);
        kButton15.setBounds(220, 330, 80, 30);

        kButton11.setText("9");
        kButton11.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        kButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton11ActionPerformed(evt);
            }
        });
        jPanel4.add(kButton11);
        kButton11.setBounds(210, 210, 80, 30);

        kButton5.setText("6");
        kButton5.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        kButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(kButton5);
        kButton5.setBounds(210, 160, 80, 30);

        btn2.setText("2");
        btn2.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel4.add(btn2);
        btn2.setBounds(110, 110, 80, 30);

        kButton7.setText("5");
        kButton7.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        kButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton7ActionPerformed(evt);
            }
        });
        jPanel4.add(kButton7);
        kButton7.setBounds(110, 160, 80, 30);

        kButton9.setText("8");
        kButton9.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        kButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton9ActionPerformed(evt);
            }
        });
        jPanel4.add(kButton9);
        kButton9.setBounds(110, 210, 80, 30);

        kButton13.setText("1");
        jPanel4.add(kButton13);
        kButton13.setBounds(120, 330, 80, 30);

        kButton14.setText("1");
        jPanel4.add(kButton14);
        kButton14.setBounds(20, 330, 80, 30);

        kButton10.setText("7");
        kButton10.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        kButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton10ActionPerformed(evt);
            }
        });
        jPanel4.add(kButton10);
        kButton10.setBounds(10, 210, 80, 30);

        kButton6.setText("4");
        kButton6.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        kButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton6ActionPerformed(evt);
            }
        });
        jPanel4.add(kButton6);
        kButton6.setBounds(10, 160, 80, 30);

        btn1.setText("1");
        btn1.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel4.add(btn1);
        btn1.setBounds(10, 110, 80, 30);

        kButton12.setText("C");
        kButton12.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        kButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton12ActionPerformed(evt);
            }
        });
        jPanel4.add(kButton12);
        kButton12.setBounds(210, 260, 80, 30);

        kButton16.setText(".");
        kButton16.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        kButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton16ActionPerformed(evt);
            }
        });
        jPanel4.add(kButton16);
        kButton16.setBounds(110, 260, 80, 30);

        kButton17.setText("0");
        kButton17.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        kButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton17ActionPerformed(evt);
            }
        });
        jPanel4.add(kButton17);
        kButton17.setBounds(10, 260, 80, 30);

        btn3.setText("3");
        btn3.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel4.add(btn3);
        btn3.setBounds(210, 110, 80, 30);

        kButton22.setText("2");
        kButton22.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jPanel4.add(kButton22);
        kButton22.setBounds(110, 110, 80, 30);

        kButton23.setText("2");
        kButton23.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jPanel4.add(kButton23);
        kButton23.setBounds(110, 110, 80, 30);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(51, 51, 51)));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 0, 255));
        jLabel11.setText("Enter");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(246, Short.MAX_VALUE))
        );

        jPanel4.add(jPanel1);
        jPanel1.setBounds(0, 0, 300, 320);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(10, 140, 300, 320);

        setSize(new java.awt.Dimension(1139, 664));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        String num = txt_cash.getText()+"1";
        txt_cash.setText(num);
       
        
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        String num = txt_cash.getText()+"2";
        txt_cash.setText(num);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        String num = txt_cash.getText()+"3";
        txt_cash.setText(num);
    }//GEN-LAST:event_btn3ActionPerformed

    private void kButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton6ActionPerformed
        String num = txt_cash.getText()+"4";
        txt_cash.setText(num);
    }//GEN-LAST:event_kButton6ActionPerformed

    private void kButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton7ActionPerformed
       String num = txt_cash.getText()+"5";
        txt_cash.setText(num);
    }//GEN-LAST:event_kButton7ActionPerformed

    private void kButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton5ActionPerformed
        String num = txt_cash.getText()+"6";
        txt_cash.setText(num);
    }//GEN-LAST:event_kButton5ActionPerformed

    private void kButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton10ActionPerformed
        String num = txt_cash.getText()+"7";
        txt_cash.setText(num);
    }//GEN-LAST:event_kButton10ActionPerformed

    private void kButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton9ActionPerformed
        String num = txt_cash.getText()+"8";
        txt_cash.setText(num);
    }//GEN-LAST:event_kButton9ActionPerformed

    private void kButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton11ActionPerformed
       String num = txt_cash.getText()+"9";
        txt_cash.setText(num);
    }//GEN-LAST:event_kButton11ActionPerformed

    private void kButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton17ActionPerformed
       String num = txt_cash.getText()+"0";
        txt_cash.setText(num);
    }//GEN-LAST:event_kButton17ActionPerformed

    private void kButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton16ActionPerformed
      if(!txt_cash.getText().contains(".")){
          txt_cash.setText(txt_cash.getText()+".");
          
      }
    }//GEN-LAST:event_kButton16ActionPerformed

    private void kButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton12ActionPerformed
       txt_cash.setText("");
       txt_change.setText("");
    }//GEN-LAST:event_kButton12ActionPerformed

    private void btn_vigorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vigorActionPerformed
       DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
       double price=1;
       Object row[]={"Vigor","1",price+"$"};
       model.addRow(row);
       ProductItem();
       
       
    }//GEN-LAST:event_btn_vigorActionPerformed

    private void btn_funtaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_funtaActionPerformed
        DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
       double price=1;
       Object row[]={"Fanta","1",price+"$"};
       model.addRow(row);
       ProductItem();
    }//GEN-LAST:event_btn_funtaActionPerformed

    private void btn_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_payActionPerformed
       if(cb_pay.getSelectedIndex()==0){
           Riel();
       }   
       else{
           Dollor();
       }
    }//GEN-LAST:event_btn_payActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        int row = tb_table.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
        if(row==-1){
            JOptionPane.showMessageDialog(null,"Pls Select Row Before Delete.");
        }
        else{
            model.removeRow(row);
            ProductItem();
            if(cb_pay.getSelectedIndex()==0){
           Riel();
       }   
       else{
           Dollor();
       }
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
       DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
       model.setRowCount(0);
       
       txt_subtotal.setText("");
       txt_tax.setText("");
       txt_total.setText("");
       cb_pay.setSelectedIndex(0);
       txt_cash.setText("");
       txt_change.setText("");
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
       MessageFormat header  = new MessageFormat("ETEC DRINK SHOP");
       MessageFormat footer = new MessageFormat("Thanks You For Your Support.");
        try {
            tb_table.print(JTable.PrintMode.NORMAL, header, footer);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btn_printActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btn1;
    private com.k33ptoo.components.KButton btn2;
    private com.k33ptoo.components.KButton btn3;
    private javax.swing.JButton btn_carabao;
    private javax.swing.JButton btn_coca;
    private com.k33ptoo.components.KButton btn_delete;
    private com.k33ptoo.components.KButton btn_exit;
    private javax.swing.JButton btn_funta;
    private com.k33ptoo.components.KButton btn_pay;
    private com.k33ptoo.components.KButton btn_print;
    private com.k33ptoo.components.KButton btn_reset;
    private javax.swing.JButton btn_vigor;
    private javax.swing.JComboBox<String> cb_pay;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private com.k33ptoo.components.KButton kButton10;
    private com.k33ptoo.components.KButton kButton11;
    private com.k33ptoo.components.KButton kButton12;
    private com.k33ptoo.components.KButton kButton13;
    private com.k33ptoo.components.KButton kButton14;
    private com.k33ptoo.components.KButton kButton15;
    private com.k33ptoo.components.KButton kButton16;
    private com.k33ptoo.components.KButton kButton17;
    private com.k33ptoo.components.KButton kButton22;
    private com.k33ptoo.components.KButton kButton23;
    private com.k33ptoo.components.KButton kButton5;
    private com.k33ptoo.components.KButton kButton6;
    private com.k33ptoo.components.KButton kButton7;
    private com.k33ptoo.components.KButton kButton9;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JTable tb_table;
    private javax.swing.JTextField txt_cash;
    private javax.swing.JTextField txt_change;
    private javax.swing.JTextField txt_subtotal;
    private javax.swing.JTextField txt_tax;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
