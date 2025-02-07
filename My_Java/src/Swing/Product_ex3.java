
package Swing;

import java.text.DecimalFormat;
import java.text.MessageFormat;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Product_ex3 extends javax.swing.JFrame {
    DecimalFormat df = new DecimalFormat("0.00");

    public Product_ex3() {
        initComponents();
        txt_subtotal.setEditable(false);
    }
    
    void Product_Item(){
        double tax=3;
        double subtotal=0.0;
        for(int i=0;i<tb_table.getRowCount();i++){
        String sprice =  tb_table.getValueAt(i, 2).toString();
        sprice=sprice.substring(0,sprice.length()-3);
        double price = Double.parseDouble(sprice);
        subtotal=subtotal+price; 
        }
        txt_subtotal.setText(String.valueOf(df.format(subtotal)));
        double ctax =( subtotal*tax)/100;
        txt_tax.setText(String.valueOf(df.format(ctax)));
        double total=subtotal+ctax;
        txt_total.setText(String.valueOf(df.format(total)));
    }
    
  
    void ChangeDollar(){
        double cash = Double.parseDouble(txt_case.getText());
        String t = txt_total.getText();
        t=t.substring(0,t.length()-1);
        double total=Double.parseDouble(t);
        double tax=total*Double.parseDouble(txt_tax.getText());
        double change = cash-total;
        txt_change.setText(df.format(change)+"$");
    }
    
     void ChangeKhmer(){
        double cash = Double.parseDouble(txt_case.getText());
        String t = txt_total.getText();
        t=t.substring(0,t.length()-1);
        double total=Double.parseDouble(t);
        total=total*4000;
         double tax=total*Double.parseDouble(txt_tax.getText());
        double change = cash-(total+tax);
        txt_change.setText(df.format(change));
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn0 = new javax.swing.JButton();
        btn_dot = new javax.swing.JButton();
        btn00 = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        btn_sting = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_table = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        txt_subtotal = new javax.swing.JTextField();
        txt_tax = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_change = new javax.swing.JTextField();
        txt_case = new javax.swing.JTextField();
        cb_pay = new javax.swing.JComboBox<>();
        btn_reset = new javax.swing.JButton();
        btn_payment = new javax.swing.JButton();
        btn_print = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(255, 51, 0)));
        jPanel5.setLayout(null);

        btn2.setBackground(new java.awt.Color(153, 255, 255));
        btn2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn2.setText("2");
        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });
        jPanel5.add(btn2);
        btn2.setBounds(90, 10, 73, 40);

        btn3.setBackground(new java.awt.Color(153, 255, 255));
        btn3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn3.setText("3");
        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });
        jPanel5.add(btn3);
        btn3.setBounds(180, 10, 73, 40);

        btn4.setBackground(new java.awt.Color(153, 255, 255));
        btn4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn4.setText("4");
        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });
        jPanel5.add(btn4);
        btn4.setBounds(10, 70, 73, 40);

        btn5.setBackground(new java.awt.Color(153, 255, 255));
        btn5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn5.setText("5");
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });
        jPanel5.add(btn5);
        btn5.setBounds(90, 70, 73, 40);

        btn6.setBackground(new java.awt.Color(153, 255, 255));
        btn6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn6.setText("6");
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });
        jPanel5.add(btn6);
        btn6.setBounds(180, 70, 73, 40);

        btn7.setBackground(new java.awt.Color(153, 255, 255));
        btn7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn7.setText("7");
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });
        jPanel5.add(btn7);
        btn7.setBounds(10, 130, 73, 40);

        btn8.setBackground(new java.awt.Color(153, 255, 255));
        btn8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn8.setText("8");
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });
        jPanel5.add(btn8);
        btn8.setBounds(90, 130, 73, 40);

        btn9.setBackground(new java.awt.Color(153, 255, 255));
        btn9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn9.setText("9");
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        jPanel5.add(btn9);
        btn9.setBounds(180, 130, 73, 40);

        btn0.setBackground(new java.awt.Color(153, 255, 255));
        btn0.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn0.setText("0");
        btn0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn0ActionPerformed(evt);
            }
        });
        jPanel5.add(btn0);
        btn0.setBounds(10, 190, 73, 40);

        btn_dot.setBackground(new java.awt.Color(153, 255, 255));
        btn_dot.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_dot.setText(".");
        btn_dot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dotActionPerformed(evt);
            }
        });
        jPanel5.add(btn_dot);
        btn_dot.setBounds(90, 190, 73, 40);

        btn00.setBackground(new java.awt.Color(153, 255, 255));
        btn00.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn00.setText("C");
        btn00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn00ActionPerformed(evt);
            }
        });
        jPanel5.add(btn00);
        btn00.setBounds(180, 190, 73, 40);

        btn1.setBackground(new java.awt.Color(153, 255, 255));
        btn1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn1.setText("1");
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });
        jPanel5.add(btn1);
        btn1.setBounds(8, 8, 73, 40);

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 260, 250));

        jPanel4.setBackground(new java.awt.Color(0, 204, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("sansserif", 1, 48), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 51, 51));
        jLabel3.setText("Enter");
        jPanel4.add(jLabel3);
        jLabel3.setBounds(90, 0, 120, 43);

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 260, 50));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 150, 300, 370);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setLayout(null);

        jButton2.setBackground(new java.awt.Color(0, 51, 153));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\My_Java\\src\\images\\cara.jpg")); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton2KeyPressed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(140, 10, 100, 110);

        btn_sting.setBackground(new java.awt.Color(0, 51, 153));
        btn_sting.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_sting.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\My_Java\\src\\images\\sting1.jpg")); // NOI18N
        btn_sting.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        btn_sting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_stingActionPerformed(evt);
            }
        });
        btn_sting.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btn_stingKeyPressed(evt);
            }
        });
        jPanel2.add(btn_sting);
        btn_sting.setBounds(20, 10, 100, 110);

        jButton20.setBackground(new java.awt.Color(0, 51, 153));
        jButton20.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton20.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\My_Java\\src\\images\\coca1.jpg")); // NOI18N
        jButton20.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jButton20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton20KeyPressed(evt);
            }
        });
        jPanel2.add(jButton20);
        jButton20.setBounds(260, 10, 100, 110);

        jButton21.setBackground(new java.awt.Color(0, 51, 153));
        jButton21.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton21.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\My_Java\\src\\images\\sting1.jpg")); // NOI18N
        jButton21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        jButton21.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton21KeyPressed(evt);
            }
        });
        jPanel2.add(jButton21);
        jButton21.setBounds(380, 10, 100, 110);

        jButton22.setBackground(new java.awt.Color(0, 51, 153));
        jButton22.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton22.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\My_Java\\src\\images\\redbull.jpg")); // NOI18N
        jButton22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jButton22.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton22KeyPressed(evt);
            }
        });
        jPanel2.add(jButton22);
        jButton22.setBounds(20, 130, 100, 110);

        jButton23.setBackground(new java.awt.Color(0, 51, 153));
        jButton23.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton23.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\My_Java\\src\\images\\vigor.jpg")); // NOI18N
        jButton23.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        jButton23.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton23KeyPressed(evt);
            }
        });
        jPanel2.add(jButton23);
        jButton23.setBounds(140, 130, 100, 110);

        jButton24.setBackground(new java.awt.Color(0, 51, 153));
        jButton24.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton24.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\My_Java\\src\\images\\funta.jpg")); // NOI18N
        jButton24.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        jButton24.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton24KeyPressed(evt);
            }
        });
        jPanel2.add(jButton24);
        jButton24.setBounds(260, 130, 100, 110);

        jButton25.setBackground(new java.awt.Color(0, 51, 153));
        jButton25.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton25.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\My_Java\\src\\images\\sting1.jpg")); // NOI18N
        jButton25.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        jButton25.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton25KeyPressed(evt);
            }
        });
        jPanel2.add(jButton25);
        jButton25.setBounds(380, 130, 100, 110);

        jButton26.setBackground(new java.awt.Color(0, 51, 153));
        jButton26.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton26.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\My_Java\\src\\images\\sting1.jpg")); // NOI18N
        jButton26.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        jButton26.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton26KeyPressed(evt);
            }
        });
        jPanel2.add(jButton26);
        jButton26.setBounds(500, 130, 100, 110);

        jButton27.setBackground(new java.awt.Color(0, 51, 153));
        jButton27.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton27.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\My_Java\\src\\images\\sting1.jpg")); // NOI18N
        jButton27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        jButton27.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton27KeyPressed(evt);
            }
        });
        jPanel2.add(jButton27);
        jButton27.setBounds(500, 10, 100, 110);

        jButton28.setBackground(new java.awt.Color(0, 51, 153));
        jButton28.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton28.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\My_Java\\src\\images\\sting1.jpg")); // NOI18N
        jButton28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        jButton28.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton28KeyPressed(evt);
            }
        });
        jPanel2.add(jButton28);
        jButton28.setBounds(620, 130, 100, 110);

        jButton29.setBackground(new java.awt.Color(0, 51, 153));
        jButton29.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton29.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\My_Java\\src\\images\\sting1.jpg")); // NOI18N
        jButton29.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        jButton29.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton29KeyPressed(evt);
            }
        });
        jPanel2.add(jButton29);
        jButton29.setBounds(620, 10, 100, 110);

        jButton30.setBackground(new java.awt.Color(0, 51, 153));
        jButton30.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton30.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\My_Java\\src\\images\\carabao.jpg")); // NOI18N
        jButton30.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        jButton30.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton30KeyPressed(evt);
            }
        });
        jPanel2.add(jButton30);
        jButton30.setBounds(20, 250, 100, 110);

        jButton31.setBackground(new java.awt.Color(0, 51, 153));
        jButton31.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton31.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\My_Java\\src\\images\\spite.jpg")); // NOI18N
        jButton31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        jButton31.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton31KeyPressed(evt);
            }
        });
        jPanel2.add(jButton31);
        jButton31.setBounds(140, 250, 100, 110);

        jButton32.setBackground(new java.awt.Color(0, 51, 153));
        jButton32.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton32.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\My_Java\\src\\images\\lactasoy.jpg")); // NOI18N
        jButton32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        jButton32.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton32KeyPressed(evt);
            }
        });
        jPanel2.add(jButton32);
        jButton32.setBounds(260, 250, 100, 110);

        jButton33.setBackground(new java.awt.Color(0, 51, 153));
        jButton33.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton33.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\My_Java\\src\\images\\sting1.jpg")); // NOI18N
        jButton33.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        jButton33.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton33KeyPressed(evt);
            }
        });
        jPanel2.add(jButton33);
        jButton33.setBounds(380, 250, 100, 110);

        jButton34.setBackground(new java.awt.Color(0, 51, 153));
        jButton34.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton34.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\My_Java\\src\\images\\sting1.jpg")); // NOI18N
        jButton34.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        jButton34.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton34KeyPressed(evt);
            }
        });
        jPanel2.add(jButton34);
        jButton34.setBounds(500, 250, 100, 110);

        jButton35.setBackground(new java.awt.Color(0, 51, 153));
        jButton35.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton35.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\My_Java\\src\\images\\sting1.jpg")); // NOI18N
        jButton35.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 51, 51)));
        jButton35.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jButton35KeyPressed(evt);
            }
        });
        jPanel2.add(jButton35);
        jButton35.setBounds(620, 250, 100, 110);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(590, 150, 740, 370);

        tb_table.setBackground(new java.awt.Color(255, 102, 102));
        tb_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Qutity", "Price"
            }
        ));
        jScrollPane1.setViewportView(tb_table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(320, 150, 250, 370);

        jLabel1.setFont(new java.awt.Font("Khmer Savuth Pen V2", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SODA MART CAMBODIA");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(400, 10, 590, 90);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\My_Java\\src\\images\\icons8-riel-100.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(270, 0, 130, 110);

        jPanel3.setBackground(new java.awt.Color(255, 51, 51));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "ETEC CENTER", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Khmer SN Kampot", 1, 24), new java.awt.Color(153, 255, 255))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1342, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 55, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 1370, 130);

        jPanel24.setBackground(new java.awt.Color(153, 153, 153));
        jPanel24.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel24.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Total                : ");
        jPanel24.add(jLabel4);
        jLabel4.setBounds(20, 110, 140, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Change           : ");
        jPanel24.add(jLabel5);
        jLabel5.setBounds(510, 110, 140, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Tax                   :");
        jPanel24.add(jLabel6);
        jLabel6.setBounds(20, 60, 140, 30);

        txt_total.setFont(new java.awt.Font("Kh Koulen", 1, 18)); // NOI18N
        txt_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_totalActionPerformed(evt);
            }
        });
        jPanel24.add(txt_total);
        txt_total.setBounds(170, 110, 220, 40);

        txt_subtotal.setFont(new java.awt.Font("Kh Koulen", 1, 18)); // NOI18N
        txt_subtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_subtotalActionPerformed(evt);
            }
        });
        jPanel24.add(txt_subtotal);
        txt_subtotal.setBounds(170, 10, 220, 40);

        txt_tax.setFont(new java.awt.Font("Kh Koulen", 1, 18)); // NOI18N
        txt_tax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_taxActionPerformed(evt);
            }
        });
        jPanel24.add(txt_tax);
        txt_tax.setBounds(170, 60, 220, 40);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Sub Total         : ");
        jPanel24.add(jLabel7);
        jLabel7.setBounds(20, 10, 140, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Payment          : ");
        jPanel24.add(jLabel8);
        jLabel8.setBounds(510, 10, 140, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Case                :");
        jPanel24.add(jLabel9);
        jLabel9.setBounds(510, 60, 140, 30);

        txt_change.setFont(new java.awt.Font("Kh Koulen", 1, 18)); // NOI18N
        txt_change.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_changeActionPerformed(evt);
            }
        });
        jPanel24.add(txt_change);
        txt_change.setBounds(660, 110, 220, 40);

        txt_case.setFont(new java.awt.Font("Kh Koulen", 1, 18)); // NOI18N
        txt_case.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_caseActionPerformed(evt);
            }
        });
        jPanel24.add(txt_case);
        txt_case.setBounds(660, 60, 220, 40);

        cb_pay.setFont(new java.awt.Font("Kh Koulen", 1, 18)); // NOI18N
        cb_pay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "USD", "KHMER", " ", " " }));
        cb_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_payActionPerformed(evt);
            }
        });
        jPanel24.add(cb_pay);
        cb_pay.setBounds(660, 10, 220, 40);

        btn_reset.setBackground(new java.awt.Color(102, 102, 102));
        btn_reset.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_reset.setForeground(new java.awt.Color(102, 255, 255));
        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        jPanel24.add(btn_reset);
        btn_reset.setBounds(1120, 10, 140, 40);

        btn_payment.setBackground(new java.awt.Color(102, 102, 102));
        btn_payment.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_payment.setForeground(new java.awt.Color(102, 255, 255));
        btn_payment.setText("Payment");
        btn_payment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_paymentActionPerformed(evt);
            }
        });
        jPanel24.add(btn_payment);
        btn_payment.setBounds(960, 10, 140, 40);

        btn_print.setBackground(new java.awt.Color(102, 102, 102));
        btn_print.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_print.setForeground(new java.awt.Color(102, 255, 255));
        btn_print.setText("Print");
        btn_print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_printActionPerformed(evt);
            }
        });
        jPanel24.add(btn_print);
        btn_print.setBounds(960, 60, 140, 40);

        btn_exit.setBackground(new java.awt.Color(255, 0, 0));
        btn_exit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_exit.setForeground(new java.awt.Color(102, 255, 255));
        btn_exit.setText("Exit");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        jPanel24.add(btn_exit);
        btn_exit.setBounds(970, 110, 290, 40);

        btn_delete.setBackground(new java.awt.Color(102, 102, 102));
        btn_delete.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(102, 255, 255));
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel24.add(btn_delete);
        btn_delete.setBounds(1120, 60, 140, 40);

        getContentPane().add(jPanel24);
        jPanel24.setBounds(0, 540, 1330, 160);

        setSize(new java.awt.Dimension(1348, 738));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_totalActionPerformed

    private void txt_taxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_taxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_taxActionPerformed

    private void txt_changeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_changeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_changeActionPerformed

    private void txt_caseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_caseActionPerformed
      
    }//GEN-LAST:event_txt_caseActionPerformed

    private void cb_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_payActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_payActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
         String number = txt_case.getText();
       if(number==""){
           txt_case.setText("6");
       }
       else{
           number=txt_case.getText()+"6";
           txt_case.setText(number);
       }
    }//GEN-LAST:event_btn6ActionPerformed

    private void jButton2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2KeyPressed

    private void btn_stingKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btn_stingKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_stingKeyPressed

    private void jButton20KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton20KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20KeyPressed

    private void jButton21KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton21KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton21KeyPressed

    private void jButton22KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton22KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22KeyPressed

    private void jButton23KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton23KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton23KeyPressed

    private void jButton24KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton24KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton24KeyPressed

    private void jButton25KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton25KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton25KeyPressed

    private void jButton26KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton26KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton26KeyPressed

    private void jButton27KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton27KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton27KeyPressed

    private void jButton28KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton28KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton28KeyPressed

    private void jButton29KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton29KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton29KeyPressed

    private void jButton30KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton30KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton30KeyPressed

    private void jButton31KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton31KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton31KeyPressed

    private void jButton32KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton32KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton32KeyPressed

    private void jButton33KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton33KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton33KeyPressed

    private void jButton34KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton34KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton34KeyPressed

    private void jButton35KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton35KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton35KeyPressed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
       String number = txt_case.getText();
       if(number==""){
           txt_case.setText("7");
       }
       else{
           number=txt_case.getText()+"7";
           txt_case.setText(number);
       }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
         String number = txt_case.getText();
       if(number==""){
           txt_case.setText("1");
       }
       else{
           number=txt_case.getText()+"1";
           txt_case.setText(number);
       }
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
         String number = txt_case.getText();
       if(number==""){
           txt_case.setText("2");
       }
       else{
           number=txt_case.getText()+"2";
           txt_case.setText(number);
       }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
         String number = txt_case.getText();
       if(number==""){
           txt_case.setText("3");
       }
       else{
           number=txt_case.getText()+"3";
           txt_case.setText(number);
       }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
         String number = txt_case.getText();
       if(number==""){
           txt_case.setText("4");
       }
       else{
           number=txt_case.getText()+"4";
           txt_case.setText(number);
       }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
         String number = txt_case.getText();
       if(number==""){
           txt_case.setText("5");
       }
       else{
           number=txt_case.getText()+"5";
           txt_case.setText(number);
       }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
         String number = txt_case.getText();
       if(number==""){
           txt_case.setText("8");
       }
       else{
           number=txt_case.getText()+"8";
           txt_case.setText(number);
       }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
         String number = txt_case.getText();
       if(number==""){
           txt_case.setText("9");
       }
       else{
           number=txt_case.getText()+"9";
           txt_case.setText(number);
       }
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn0ActionPerformed
         String number = txt_case.getText();
       if(number==""){
           txt_case.setText("0");
       }
       else{
           number=txt_case.getText()+"0";
           txt_case.setText(number);
       }
    }//GEN-LAST:event_btn0ActionPerformed

    private void btn_dotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dotActionPerformed
      if(!txt_case.getText().contains(".")){
            txt_case.setText(txt_case.getText()+btn_dot.getText());
        }
    }//GEN-LAST:event_btn_dotActionPerformed

    private void btn00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn00ActionPerformed
     txt_case.setText("");
    }//GEN-LAST:event_btn00ActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        txt_case.setText("");
        txt_change.setText("");
        txt_tax.setText("");
        txt_total.setText("");
        txt_subtotal.setText("");
        DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
        model.setRowCount(0);
        
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_stingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_stingActionPerformed
         double price=0.5;
        DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
        Object row[]={"Sting","1",price+"$"};
        model.addRow(row);
        Product_Item();
        
    }//GEN-LAST:event_btn_stingActionPerformed

    private void btn_paymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_paymentActionPerformed
        if(cb_pay.getSelectedIndex()==0){
            ChangeDollar();
        }
        else{
            ChangeKhmer();
        }
    }//GEN-LAST:event_btn_paymentActionPerformed

    private void txt_subtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_subtotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_subtotalActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          double price=1;
        DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
        Object row[]={"Cocabao","1",price+"$"};
        model.addRow(row);
        Product_Item();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        DefaultTableModel model =(DefaultTableModel)tb_table.getModel();
        int row = tb_table.getSelectedRow();
        model.removeRow(row);
        Product_Item();
        if(cb_pay.getSelectedIndex()==0){
            ChangeDollar();
        }
        else{
            ChangeKhmer();
        }
        
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
       System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_printActionPerformed
        MessageFormat header= new MessageFormat("Soda Mart Cambodia");
        MessageFormat footer = new MessageFormat("Page {0,number,integer}");
        try {
            tb_table.print(JTable.PrintMode.NORMAL,header,footer);
            
        } catch (java.awt.print.PrinterException ex) {
            System.err.format("No Print Found.....!",ex.getMessage() );
           
        }
    }//GEN-LAST:event_btn_printActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton20ActionPerformed

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
            java.util.logging.Logger.getLogger(Product_ex3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Product_ex3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Product_ex3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Product_ex3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Product_ex3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn0;
    private javax.swing.JButton btn00;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_dot;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_payment;
    private javax.swing.JButton btn_print;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_sting;
    private javax.swing.JComboBox<String> cb_pay;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_table;
    private javax.swing.JTextField txt_case;
    private javax.swing.JTextField txt_change;
    private javax.swing.JTextField txt_subtotal;
    private javax.swing.JTextField txt_tax;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
