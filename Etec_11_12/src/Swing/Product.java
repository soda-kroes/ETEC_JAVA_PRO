
package Swing;
import java.text.DecimalFormat;
import java.text.MessageFormat;
import javax.swing.ImageIcon;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Product extends javax.swing.JFrame {
    DecimalFormat df = new DecimalFormat("0.00");
 
    public Product() {
        initComponents();  
        //Set Incom For Fram
        ImageIcon image = new ImageIcon("src/Images/shop.png");
        this.setIconImage(image.getImage());
       

    }
    
    public void ProductItem(){
        double subtotal=0;
        double tax=2;
        for(int i=0;i<tb_table.getRowCount();i++){
            String sprice = tb_table.getValueAt(i, 2).toString();//2$
            sprice=sprice.substring(0, sprice.length()-1);//2
            double price = Double.parseDouble(sprice);//2=>double
            subtotal=subtotal+price;   
    }
    txt_subtotal.setText(df.format(subtotal)+"$");
    String sub = txt_subtotal.getText();//21$
    sub=sub.substring(0, sub.length()-1);//21
    double Subtotal = Double.parseDouble(sub);
    double Tax =Subtotal*tax/100;
    txt_tax.setText(df.format(Tax)+"$");
    double total=Subtotal+Tax;
    txt_total.setText(df.format(total)+"$");
    }
    
    public void ChangeDollor(){
        double cash = Double.parseDouble(txt_cash.getText());
        String stotal = txt_total.getText();
        stotal=stotal.substring(0, stotal.length()-1);
        double total = Double.parseDouble(stotal);
        if(cash>=total){
            double change = cash-total;
            txt_change.setText(df.format(change)+"$");
        }
        else{
            JOptionPane.showMessageDialog(null, "Pls Enter Money Again.");
        }
    }
    
     public void ChangeKhmer(){
        double cash = Double.parseDouble(txt_cash.getText());
        String stotal = txt_total.getText();
        stotal=stotal.substring(0, stotal.length()-1);
        double total = Double.parseDouble(stotal);
        total=total*4000;
        if(cash>=total){
            double change = cash-total;
            txt_change.setText(df.format(change)+"Riel");
        }
        else{
            JOptionPane.showMessageDialog(null, "Pls Enter Money Again.");
        }
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn3 = new com.k33ptoo.components.KButton();
        btn1 = new com.k33ptoo.components.KButton();
        btn2 = new com.k33ptoo.components.KButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btn4 = new com.k33ptoo.components.KButton();
        btn5 = new com.k33ptoo.components.KButton();
        btn6 = new com.k33ptoo.components.KButton();
        btn7 = new com.k33ptoo.components.KButton();
        btn8 = new com.k33ptoo.components.KButton();
        btn9 = new com.k33ptoo.components.KButton();
        btndot = new com.k33ptoo.components.KButton();
        btnc = new com.k33ptoo.components.KButton();
        btn0 = new com.k33ptoo.components.KButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        btn_vigor = new javax.swing.JButton();
        btn_sting = new javax.swing.JButton();
        btn_lactasoy = new javax.swing.JButton();
        btn_coca = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btn_redbull = new javax.swing.JButton();
        btn_vigor1 = new javax.swing.JButton();
        btn_sting1 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_table = new javax.swing.JTable();
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
        cb_pay = new javax.swing.JComboBox<>();
        btn_reset = new com.k33ptoo.components.KButton();
        btn_pay = new com.k33ptoo.components.KButton();
        btn_print = new com.k33ptoo.components.KButton();
        btn_exit = new com.k33ptoo.components.KButton();
        btn_remove = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        kGradientPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Cambodia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 18), new java.awt.Color(102, 255, 255))); // NOI18N
        kGradientPanel1.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Etec_7_8\\src\\Images\\icons8-drink-100.png")); // NOI18N
        kGradientPanel1.add(jLabel2);
        jLabel2.setBounds(180, 40, 120, 90);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ETEC Drink SHOP");
        kGradientPanel1.add(jLabel1);
        jLabel1.setBounds(360, 20, 560, 110);

        getContentPane().add(kGradientPanel1);
        kGradientPanel1.setBounds(0, 0, 1190, 150);

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(null);

        btn3.setText("3");
        btn3.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel1.add(btn3);
        btn3.setBounds(210, 90, 80, 30);

        btn1.setText("1");
        btn1.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(btn1);
        btn1.setBounds(30, 90, 80, 30);

        btn2.setText("2");
        btn2.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel1.add(btn2);
        btn2.setBounds(120, 90, 80, 30);

        jPanel4.setBackground(new java.awt.Color(255, 51, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255), 4));
        jPanel4.setLayout(null);

        jLabel3.setBackground(new java.awt.Color(255, 51, 51));
        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel3.setText("Enter");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(90, 0, 150, 60);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(0, 0, 310, 70);

        btn4.setText("4");
        btn4.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel1.add(btn4);
        btn4.setBounds(30, 150, 80, 30);

        btn5.setText("5");
        btn5.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel1.add(btn5);
        btn5.setBounds(120, 150, 80, 30);

        btn6.setText("6");
        btn6.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel1.add(btn6);
        btn6.setBounds(210, 150, 80, 30);

        btn7.setText("7");
        btn7.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel1.add(btn7);
        btn7.setBounds(30, 210, 80, 30);

        btn8.setText("8");
        btn8.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel1.add(btn8);
        btn8.setBounds(120, 210, 80, 30);

        btn9.setText("9");
        btn9.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel1.add(btn9);
        btn9.setBounds(210, 210, 80, 30);

        btndot.setText(".");
        btndot.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btndot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndotActionPerformed(evt);
            }
        });
        jPanel1.add(btndot);
        btndot.setBounds(120, 270, 80, 30);

        btnc.setText("C");
        btnc.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncActionPerformed(evt);
            }
        });
        jPanel1.add(btnc);
        btnc.setBounds(210, 270, 80, 30);

        btn0.setText("0");
        btn0.setFont(new java.awt.Font("Comic Sans MS", 0, 24)); // NOI18N
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel1.add(btn0);
        btn0.setBounds(30, 270, 80, 30);

        jPanel5.setBackground(new java.awt.Color(153, 204, 255));
        jPanel5.setLayout(null);

        jPanel8.setBackground(new java.awt.Color(102, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(255, 0, 0)));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 274, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 224, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel8);
        jPanel8.setBounds(20, 10, 280, 230);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(0, 70, 310, 270);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 180, 310, 340);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(null);

        jPanel6.setBackground(new java.awt.Color(153, 153, 153));
        jPanel6.setLayout(null);

        btn_vigor.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Etec_7_8\\src\\Images\\vigor.jpg")); // NOI18N
        btn_vigor.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(102, 255, 102)));
        btn_vigor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vigorActionPerformed(evt);
            }
        });
        jPanel6.add(btn_vigor);
        btn_vigor.setBounds(10, 80, 100, 110);

        btn_sting.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Etec_7_8\\src\\Images\\sting1.jpg")); // NOI18N
        btn_sting.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(102, 255, 102)));
        btn_sting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_stingActionPerformed(evt);
            }
        });
        jPanel6.add(btn_sting);
        btn_sting.setBounds(120, 80, 100, 110);

        btn_lactasoy.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Etec_7_8\\src\\Images\\lactasoy.jpg")); // NOI18N
        btn_lactasoy.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(102, 255, 102)));
        btn_lactasoy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lactasoyActionPerformed(evt);
            }
        });
        jPanel6.add(btn_lactasoy);
        btn_lactasoy.setBounds(230, 80, 100, 110);

        btn_coca.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Etec_7_8\\src\\Images\\coca1.jpg")); // NOI18N
        btn_coca.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(102, 255, 102)));
        btn_coca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cocaActionPerformed(evt);
            }
        });
        jPanel6.add(btn_coca);
        btn_coca.setBounds(450, 80, 100, 110);

        jPanel7.setBackground(new java.awt.Color(255, 102, 102));
        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Etec Drink Shop", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 12), new java.awt.Color(102, 255, 255))); // NOI18N
        jPanel7.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel4.setText("Energy Drink");
        jPanel7.add(jLabel4);
        jLabel4.setBounds(170, 10, 240, 50);

        jPanel6.add(jPanel7);
        jPanel7.setBounds(0, 0, 560, 70);

        btn_redbull.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Etec_7_8\\src\\Images\\redbull.jpg")); // NOI18N
        btn_redbull.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(102, 255, 102)));
        btn_redbull.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_redbullActionPerformed(evt);
            }
        });
        jPanel6.add(btn_redbull);
        btn_redbull.setBounds(340, 80, 100, 110);

        btn_vigor1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Etec_7_8\\src\\Images\\cara.jpg")); // NOI18N
        btn_vigor1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(102, 255, 102)));
        btn_vigor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_vigor1ActionPerformed(evt);
            }
        });
        jPanel6.add(btn_vigor1);
        btn_vigor1.setBounds(10, 220, 100, 110);

        btn_sting1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Etec_7_8\\src\\Images\\funta.jpg")); // NOI18N
        btn_sting1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(102, 255, 102)));
        btn_sting1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sting1ActionPerformed(evt);
            }
        });
        jPanel6.add(btn_sting1);
        btn_sting1.setBounds(120, 220, 100, 110);

        jButton8.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Etec_7_8\\src\\Images\\pocari.jpg")); // NOI18N
        jButton8.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(102, 255, 102)));
        jPanel6.add(jButton8);
        jButton8.setBounds(230, 220, 100, 110);

        jButton9.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Etec_7_8\\src\\Images\\redbull.jpg")); // NOI18N
        jButton9.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(102, 255, 102)));
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton9);
        jButton9.setBounds(340, 220, 100, 110);

        jButton10.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Etec_7_8\\src\\Images\\coca1.jpg")); // NOI18N
        jButton10.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(102, 255, 102)));
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel6.add(jButton10);
        jButton10.setBounds(450, 220, 100, 110);

        jPanel2.add(jPanel6);
        jPanel6.setBounds(0, 0, 560, 340);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(610, 180, 560, 340);

        tb_table.setBackground(new java.awt.Color(255, 204, 204));
        tb_table.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tb_table.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        tb_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Qty", "Price"
            }
        ));
        tb_table.setRowHeight(20);
        jScrollPane1.setViewportView(tb_table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(360, 180, 220, 340);

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setText("Total         :");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(20, 90, 140, 30);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel6.setText("Sub Total    :");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(20, 10, 130, 30);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel7.setText("Tax           : ");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(20, 50, 150, 30);

        txt_total.setEditable(false);
        txt_total.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txt_total.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_total.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel3.add(txt_total);
        txt_total.setBounds(160, 90, 190, 30);

        txt_subtotal.setEditable(false);
        txt_subtotal.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txt_subtotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_subtotal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_subtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_subtotalActionPerformed(evt);
            }
        });
        jPanel3.add(txt_subtotal);
        txt_subtotal.setBounds(160, 10, 190, 30);

        txt_tax.setEditable(false);
        txt_tax.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txt_tax.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_tax.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel3.add(txt_tax);
        txt_tax.setBounds(160, 50, 190, 30);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel8.setText("Payment      :");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(410, 10, 130, 30);

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel9.setText("Cash          :");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(410, 50, 150, 30);

        txt_cash.setEditable(false);
        txt_cash.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txt_cash.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_cash.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel3.add(txt_cash);
        txt_cash.setBounds(550, 50, 190, 30);

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel10.setText("Change       :");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(410, 90, 140, 30);

        txt_change.setEditable(false);
        txt_change.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txt_change.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_change.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jPanel3.add(txt_change);
        txt_change.setBounds(550, 90, 190, 30);

        cb_pay.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cb_pay.setForeground(new java.awt.Color(204, 204, 204));
        cb_pay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "KHR", " " }));
        cb_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_payActionPerformed(evt);
            }
        });
        jPanel3.add(cb_pay);
        cb_pay.setBounds(550, 10, 190, 30);

        btn_reset.setText("Reset");
        btn_reset.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        jPanel3.add(btn_reset);
        btn_reset.setBounds(980, 10, 150, 30);

        btn_pay.setText("Payment");
        btn_pay.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btn_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_payActionPerformed(evt);
            }
        });
        jPanel3.add(btn_pay);
        btn_pay.setBounds(800, 10, 150, 30);

        btn_print.setText("Print");
        btn_print.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });
        jPanel3.add(btn_print);
        btn_print.setBounds(800, 50, 150, 30);

        btn_exit.setText("Exit");
        btn_exit.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btn_exit.setkStartColor(new java.awt.Color(255, 0, 0));
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        jPanel3.add(btn_exit);
        btn_exit.setBounds(810, 90, 320, 30);

        btn_remove.setText("Remove");
        btn_remove.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        btn_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeActionPerformed(evt);
            }
        });
        jPanel3.add(btn_remove);
        btn_remove.setBounds(980, 50, 150, 30);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(20, 530, 1150, 130);

        setSize(new java.awt.Dimension(1200, 703));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_stingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_stingActionPerformed
        DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
        double price=1;
        Object row[]={"String","1",price+"$"};
        model.addRow(row);
        ProductItem();
    }//GEN-LAST:event_btn_stingActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        String num = txt_cash.getText();
        num=txt_cash.getText()+"1";
        txt_cash.setText(num);
        
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
       String num = txt_cash.getText();
        num=txt_cash.getText()+"2";
        txt_cash.setText(num);
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        String num = txt_cash.getText();
        num=txt_cash.getText()+"3";
        txt_cash.setText(num);
    }//GEN-LAST:event_btn3ActionPerformed

    private void btndotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndotActionPerformed
        if(!txt_cash.getText().contains(".")){
            txt_cash.setText(txt_cash.getText()+".");
        }
        
    }//GEN-LAST:event_btndotActionPerformed

    private void btncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncActionPerformed
         txt_cash.setText("");
         txt_change.setText("");
    }//GEN-LAST:event_btncActionPerformed

    private void btn_vigorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vigorActionPerformed
        DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
        double price=1;
        Object row[]={"Vigor","1",price+"$"};
        model.addRow(row);
        ProductItem();
    }//GEN-LAST:event_btn_vigorActionPerformed

    private void btn_redbullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_redbullActionPerformed
       
    }//GEN-LAST:event_btn_redbullActionPerformed

    private void btn_cocaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cocaActionPerformed
     
    }//GEN-LAST:event_btn_cocaActionPerformed

    private void btn_vigor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_vigor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_vigor1ActionPerformed

    private void btn_sting1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sting1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_sting1ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton10ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        String num = txt_cash.getText();
        num=txt_cash.getText()+"4";
        txt_cash.setText(num);       
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
       String num = txt_cash.getText();
        num=txt_cash.getText()+"5";
        txt_cash.setText(num);       
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        String num = txt_cash.getText();
        num=txt_cash.getText()+"6";
        txt_cash.setText(num);
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        String num = txt_cash.getText();
        num=txt_cash.getText()+"7";
        txt_cash.setText(num);
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
       String num = txt_cash.getText();
        num=txt_cash.getText()+"8";
        txt_cash.setText(num);     
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
       String num = txt_cash.getText();
        num=txt_cash.getText()+"9";
        txt_cash.setText(num);     
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
        String num = txt_cash.getText();
        num=txt_cash.getText()+"0";
        txt_cash.setText(num);    
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn_lactasoyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lactasoyActionPerformed
    
    }//GEN-LAST:event_btn_lactasoyActionPerformed

    private void btn_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeActionPerformed
       int row = tb_table.getSelectedRow();
       DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
       if(row==-1){
           JOptionPane.showMessageDialog(null, "Pls Select Row.");
       }
       else{
           model.removeRow(row);
           ProductItem();
           if(cb_pay.getSelectedIndex()==0){
           ChangeDollor();
       }else{
           ChangeKhmer();
       }
           
       }
    }//GEN-LAST:event_btn_removeActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        dispose();
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
       MessageFormat header = new MessageFormat("ETEC DRINK SHOP");
       MessageFormat footer = new MessageFormat("Thanks You For Your Support.");
        try {
             tb_table.print(JTable.PrintMode.NORMAL,header,footer);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }

    }//GEN-LAST:event_btn_printActionPerformed

    private void btn_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_payActionPerformed
       if(cb_pay.getSelectedIndex()==0){
           ChangeDollor();
       }else{
           ChangeKhmer();
       }
    }//GEN-LAST:event_btn_payActionPerformed

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

    private void cb_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_payActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_payActionPerformed

    private void txt_subtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_subtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_subtotalActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product().setVisible(true);
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
    private javax.swing.JButton btn_coca;
    private com.k33ptoo.components.KButton btn_exit;
    private javax.swing.JButton btn_lactasoy;
    private com.k33ptoo.components.KButton btn_pay;
    private com.k33ptoo.components.KButton btn_print;
    private javax.swing.JButton btn_redbull;
    private com.k33ptoo.components.KButton btn_remove;
    private com.k33ptoo.components.KButton btn_reset;
    private javax.swing.JButton btn_sting;
    private javax.swing.JButton btn_sting1;
    private javax.swing.JButton btn_vigor;
    private javax.swing.JButton btn_vigor1;
    private com.k33ptoo.components.KButton btnc;
    private com.k33ptoo.components.KButton btndot;
    private javax.swing.JComboBox<String> cb_pay;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
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
