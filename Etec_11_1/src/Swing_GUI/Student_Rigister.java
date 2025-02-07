
package Swing_GUI;

import java.awt.Image;
import java.io.File;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Student_Rigister extends javax.swing.JFrame {
    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
    ImageIcon icon = new ImageIcon("src/Images/update.png");
 
    public Student_Rigister() {
        initComponents();
    }
    
    public void Clear(){
        txt_id.setText("");
        txt_name.setText("");
        groub_gender.clearSelection();
        txt_date.setDate(null);
        cb_course.setSelectedIndex(0);
        cb_time.setSelectedIndex(0);
        txt_price.setText("");
        groub_day.clearSelection();
        txt_phone.setText("");
        txt_image.setText("");
        cb_room.setSelectedIndex(0);
        lb_image.setIcon(null);
    }
    
    public void Search(String str){
        DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        tb_table.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }
    
   

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groub_gender = new javax.swing.ButtonGroup();
        groub_day = new javax.swing.ButtonGroup();
        jScrollPane2 = new javax.swing.JScrollPane();
        rSTableMetro1 = new rojeru_san.complementos.RSTableMetro();
        jLabel2 = new javax.swing.JLabel();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_price = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        rd_female = new javax.swing.JRadioButton();
        rd_male = new javax.swing.JRadioButton();
        txt_date = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        cb_room = new javax.swing.JComboBox<>();
        cb_course = new javax.swing.JComboBox<>();
        txt_name = new javax.swing.JTextField();
        ch_sat = new javax.swing.JCheckBox();
        ch_mon = new javax.swing.JCheckBox();
        txt_phone = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txt_search = new javax.swing.JTextField();
        cb_time = new javax.swing.JComboBox<>();
        txt_image = new javax.swing.JTextField();
        lb_image = new javax.swing.JLabel();
        btn_exit = new com.k33ptoo.components.KButton();
        btn_image = new com.k33ptoo.components.KButton();
        btn_add = new com.k33ptoo.components.KButton();
        btn_update = new com.k33ptoo.components.KButton();
        btn_delete = new com.k33ptoo.components.KButton();
        btn_clear = new com.k33ptoo.components.KButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tb_table = new rojeru_san.complementos.RSTableMetro();
        jPanel1 = new javax.swing.JPanel();

        rSTableMetro1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(rSTableMetro1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(390, 100, 0, 0);

        kGradientPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "ETEC CENTER", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 14), new java.awt.Color(204, 255, 255))); // NOI18N
        kGradientPanel1.setForeground(new java.awt.Color(204, 255, 255));
        kGradientPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Khmer OS Muol Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("មជ្ឈមណ្ឌលវិស្វកម្មបច្ចេកវិទ្យា និង អេឡិចត្រូនិច");
        kGradientPanel1.add(jLabel1);
        jLabel1.setBounds(330, 10, 600, 60);

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Etec_11_1\\src\\Images\\New Project.png")); // NOI18N
        kGradientPanel1.add(jLabel4);
        jLabel4.setBounds(210, 30, 80, 80);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 255, 255));
        jLabel6.setText("Enginnering of Technology and Electronic Center");
        kGradientPanel1.add(jLabel6);
        jLabel6.setBounds(400, 70, 450, 26);

        getContentPane().add(kGradientPanel1);
        kGradientPanel1.setBounds(0, 0, 1370, 120);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setText("Stu_ID : ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 290, 100, 26);

        txt_id.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txt_id.setForeground(new java.awt.Color(102, 102, 102));
        txt_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_id);
        txt_id.setBounds(150, 290, 250, 30);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel8.setText("Name   : ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 340, 100, 26);

        txt_price.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txt_price.setForeground(new java.awt.Color(102, 102, 102));
        txt_price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_price);
        txt_price.setBounds(560, 390, 260, 30);

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel9.setText("Gender :");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 390, 100, 26);

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel10.setText("Date   : ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 440, 100, 26);

        groub_gender.add(rd_female);
        rd_female.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        rd_female.setText("Female");
        getContentPane().add(rd_female);
        rd_female.setBounds(310, 390, 100, 21);

        groub_gender.add(rd_male);
        rd_male.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        rd_male.setText("Male");
        getContentPane().add(rd_male);
        rd_male.setBounds(150, 390, 60, 21);
        getContentPane().add(txt_date);
        txt_date.setBounds(150, 440, 250, 28);

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel11.setText("Course  :");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(450, 290, 100, 26);

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel12.setText("Time    : ");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(450, 340, 100, 26);

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel13.setText("Price    :");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(450, 390, 100, 26);

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel14.setText("Day     : ");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(450, 440, 100, 26);

        cb_room.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cb_room.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ETEC01", "ETEC02", "ETEC03", "ETEC004", " " }));
        getContentPane().add(cb_room);
        cb_room.setBounds(960, 370, 250, 40);

        cb_course.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cb_course.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Java Programming", "C/C++/OPP", "Flutter&Dart", "Network", "Website" }));
        getContentPane().add(cb_course);
        cb_course.setBounds(560, 280, 260, 40);

        txt_name.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txt_name.setForeground(new java.awt.Color(102, 102, 102));
        txt_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_name);
        txt_name.setBounds(150, 340, 250, 30);

        groub_day.add(ch_sat);
        ch_sat.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        ch_sat.setText("Sat_Sun");
        getContentPane().add(ch_sat);
        ch_sat.setBounds(710, 440, 110, 21);

        groub_day.add(ch_mon);
        ch_mon.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        ch_mon.setText("Mon_Fri");
        getContentPane().add(ch_mon);
        ch_mon.setBounds(560, 440, 90, 21);

        txt_phone.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txt_phone.setForeground(new java.awt.Color(102, 102, 102));
        txt_phone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_phone);
        txt_phone.setBounds(960, 280, 250, 30);

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel15.setText("Phone   : ");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(860, 280, 100, 26);

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel16.setText("Imge    : ");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(860, 330, 100, 26);

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel17.setText("Room    : ");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(860, 380, 100, 26);

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel18.setText("Search  : ");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(860, 430, 100, 26);

        txt_search.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txt_search.setForeground(new java.awt.Color(102, 102, 102));
        txt_search.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });
        getContentPane().add(txt_search);
        txt_search.setBounds(960, 430, 250, 30);

        cb_time.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cb_time.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10:00am-11:00am", "11:00am-12:00pm", "5:00pm-6:00pm", "7:00pm-8:00pm", " " }));
        getContentPane().add(cb_time);
        cb_time.setBounds(560, 330, 260, 40);

        txt_image.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txt_image.setForeground(new java.awt.Color(102, 102, 102));
        txt_image.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(txt_image);
        txt_image.setBounds(960, 330, 250, 30);

        lb_image.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lb_image);
        lb_image.setBounds(1240, 280, 120, 120);

        btn_exit.setText("Exit");
        btn_exit.setkStartColor(new java.awt.Color(255, 51, 51));
        getContentPane().add(btn_exit);
        btn_exit.setBounds(940, 220, 270, 30);

        btn_image.setText("Image");
        btn_image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imageActionPerformed(evt);
            }
        });
        getContentPane().add(btn_image);
        btn_image.setBounds(1240, 410, 120, 30);

        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        getContentPane().add(btn_add);
        btn_add.setBounds(940, 130, 120, 30);

        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_update);
        btn_update.setBounds(1090, 130, 120, 30);

        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_delete);
        btn_delete.setBounds(940, 180, 120, 30);

        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        getContentPane().add(btn_clear);
        btn_clear.setBounds(1090, 180, 120, 30);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel7.setText("Student Rigister");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(490, 160, 310, 51);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Etec_11_1\\src\\Images\\icons8-student-100 (6).png")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(350, 140, 110, 100);

        tb_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tb_table);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(20, 490, 1320, 160);

        jPanel1.setBackground(new java.awt.Color(102, 153, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 120, 1370, 550);

        setSize(new java.awt.Dimension(1383, 704));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
       
        int id = Integer.parseInt(txt_id.getText());//1001
       String name = txt_name.getText();
       String gender;
       if(rd_male.isSelected()){
           gender="Male";
       }
       else{
           gender="Female";
       }
       String date = sdf.format(txt_date.getDate());
       String course = cb_course.getSelectedItem().toString();
       String time = cb_time.getSelectedItem().toString();
       double price = Double.parseDouble(txt_price.getText());
       String day;
       if(ch_mon.isSelected()){
           day="Mon_Fri";
       }
       else {
           day="Sat_Sun";
       }
       String phone = txt_phone.getText();
       String image = txt_image.getText();
       String room = cb_room.getSelectedItem().toString();
       studentlist stu = new studentlist(id, name, gender, date, course, time, price, day, phone, image, room);
       studentlist.list.add(stu);
       DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
       model.setRowCount(0);
       for(int i=0;i<studentlist.list.size();i++){
           
   
           Object row[]={
               studentlist.list.get(i).id,
               studentlist.list.get(i).name,
               studentlist.list.get(i).gender,
               studentlist.list.get(i).date,
               studentlist.list.get(i).course,
               studentlist.list.get(i).time,
               studentlist.list.get(i).price,
               studentlist.list.get(i).day,
               studentlist.list.get(i).phone,
               studentlist.list.get(i).image,
               studentlist.list.get(i).room,
               
           };
           model.addRow(row);
           JOptionPane.showMessageDialog(null, "Insert Data Success.");
             Clear();
           
       }
       
       
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_imageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imageActionPerformed
       
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        txt_image.setText(filename);
        ImageIcon icon = new ImageIcon(filename);
        lb_image.setIcon(icon);
    }//GEN-LAST:event_btn_imageActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        Clear();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void tb_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_tableMouseClicked
        DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
        int row = tb_table.getSelectedRow();
        txt_id.setText(model.getValueAt(row, 0).toString());
        txt_name.setText(model.getValueAt(row, 1).toString());
        String gender = model.getValueAt(row, 2).toString();
        if(gender.equals("Male")){
            rd_male.setSelected(true);
        }
        else {
            rd_female.setSelected(true);
        }
        try {
            java.util.Date obj = sdf.parse(model.getValueAt(row, 3).toString());
            txt_date.setDate(obj);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
        cb_course.setSelectedItem(model.getValueAt(row, 4).toString());
        cb_time.setSelectedItem(model.getValueAt(row, 5).toString());
        txt_price.setText(model.getValueAt(row, 6).toString());
        String day = model.getValueAt(row, 7).toString();
        if(day.equals("Mon_Fri")){
            ch_mon.setSelected(true);
        }
        else {
            ch_sat.setSelected(true);
        }
        txt_phone.setText(model.getValueAt(row, 8).toString());
        txt_image.setText(model.getValueAt(row, 9).toString());
        cb_room.setSelectedItem(model.getValueAt(row, 10));
        lb_image.setIcon(new javax.swing.ImageIcon(model.getValueAt(row, 9).toString()));
    }//GEN-LAST:event_tb_tableMouseClicked

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
       DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
       int row = tb_table.getSelectedRow();
       if(row==-1){
           JOptionPane.showMessageDialog(null, "Pls Select Row.");
       }
       else{
             int id = Integer.parseInt(txt_id.getText());//1001
           String name = txt_name.getText();
          String gender;
       if(rd_male.isSelected()){
           gender="Male";
       }
       else{
           gender="Female";
       }
       String date = sdf.format(txt_date.getDate());
       String course = cb_course.getSelectedItem().toString();
       String time = cb_time.getSelectedItem().toString();
       double price = Double.parseDouble(txt_price.getText());
       String day;
       if(ch_mon.isSelected()){
           day="Mon_Fri";
       }
       else {
           day="Sat_Sun";
       }
       String phone = txt_phone.getText();
       String image = txt_image.getText();
       String room = cb_room.getSelectedItem().toString();
       studentlist stu = new studentlist(id, name, gender, date, course, time, price, day, phone, image, room);
       studentlist.list.set(row, stu);
       model.setValueAt(id, row, 0);
       model.setValueAt(name, row, 1);
       model.setValueAt(gender, row, 2);
       model.setValueAt(date, row, 3);
       model.setValueAt(course, row, 4);
       model.setValueAt(time, row, 5);
       model.setValueAt(price, row, 6);
       model.setValueAt(day, row, 7);
       model.setValueAt(phone, row, 8);
       model.setValueAt(image, row, 9);
       model.setValueAt(room, row, 10);
       JOptionPane.showMessageDialog(null, "Update Success.", "Student Register", JOptionPane.PLAIN_MESSAGE, icon);
       
       
       }
       
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
       DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
       int row = tb_table.getSelectedRow();
       if(row!=-1){
           studentlist.list.remove(row);
           model.removeRow(row);
           JOptionPane.showMessageDialog(null, "Delete Success.");
           Clear();
       }
       else{
           JOptionPane.showMessageDialog(null, "Pls Select Row.");
       }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
       String search = txt_search.getText();
        Search(search);
    }//GEN-LAST:event_txt_searchKeyReleased

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Rigister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton btn_add;
    private com.k33ptoo.components.KButton btn_clear;
    private com.k33ptoo.components.KButton btn_delete;
    private com.k33ptoo.components.KButton btn_exit;
    private com.k33ptoo.components.KButton btn_image;
    private com.k33ptoo.components.KButton btn_update;
    private javax.swing.JComboBox<String> cb_course;
    private javax.swing.JComboBox<String> cb_room;
    private javax.swing.JComboBox<String> cb_time;
    private javax.swing.JCheckBox ch_mon;
    private javax.swing.JCheckBox ch_sat;
    private javax.swing.ButtonGroup groub_day;
    private javax.swing.ButtonGroup groub_gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lb_image;
    private rojeru_san.complementos.RSTableMetro rSTableMetro1;
    private javax.swing.JRadioButton rd_female;
    private javax.swing.JRadioButton rd_male;
    private rojeru_san.complementos.RSTableMetro tb_table;
    private com.toedter.calendar.JDateChooser txt_date;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_image;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
