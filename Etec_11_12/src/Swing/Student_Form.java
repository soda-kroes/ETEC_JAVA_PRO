
package Swing;

import java.awt.Image;
import java.io.File;
import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class Student_Form extends javax.swing.JFrame {
    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");

    
    public Student_Form() {
        initComponents();
    }
    void Clear(){
        txt_id.setText("");
        txt_name.setText("");
        gender_groub.clearSelection();
        txt_date.setDate(null);
        cb_course.setSelectedIndex(0);
        cb_time.setSelectedIndex(0);
        txt_price.setText("");
        day_groub.clearSelection();
        txt_phone.setText("");
        txt_image.setText("");
        cb_room.setSelectedIndex(0);
        lb_image.setIcon(null);
       
    }
    void Search(String str){
        DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        tb_table.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        gender_groub = new javax.swing.ButtonGroup();
        day_groub = new javax.swing.ButtonGroup();
        kGradientPanel1 = new com.k33ptoo.components.KGradientPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        rd_female = new javax.swing.JRadioButton();
        rd_male = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_price = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cb_time = new javax.swing.JComboBox<>();
        cb_course = new javax.swing.JComboBox<>();
        ch_sat = new javax.swing.JCheckBox();
        ch_mon = new javax.swing.JCheckBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_phone = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cb_room = new javax.swing.JComboBox<>();
        txt_search = new javax.swing.JTextField();
        txt_image = new javax.swing.JTextField();
        lb_image = new javax.swing.JLabel();
        btn_image = new com.k33ptoo.components.KButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_table = new rojeru_san.complementos.RSTableMetro();
        btn_delete = new necesario.MaterialButton();
        btn_exit = new necesario.MaterialButton();
        btn_clear = new necesario.MaterialButton();
        btn_update = new necesario.MaterialButton();
        btn_save = new necesario.MaterialButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        kGradientPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "ETEC CENTER", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Comic Sans MS", 1, 14), new java.awt.Color(204, 255, 255))); // NOI18N
        kGradientPanel1.setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Etec_7_8\\src\\Images\\New Project.png")); // NOI18N
        kGradientPanel1.add(jLabel3);
        jLabel3.setBounds(160, 30, 80, 80);

        jLabel1.setFont(new java.awt.Font("Khmer OS Muol Light", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 255, 255));
        jLabel1.setText("មជ្ឈមណ្ឌលវិស្វកម្មបច្ចេកវិទ្យា​ និង អេឡិចត្រូនិច");
        kGradientPanel1.add(jLabel1);
        jLabel1.setBounds(380, 20, 600, 60);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 255, 255));
        jLabel2.setText("Enginering Of Technology And Electronic Center");
        kGradientPanel1.add(jLabel2);
        jLabel2.setBounds(440, 70, 480, 26);

        getContentPane().add(kGradientPanel1);
        kGradientPanel1.setBounds(0, 0, 1410, 120);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jLabel4.setText("Stu_Id  : ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 310, 130, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Etec_7_8\\src\\Images\\icons8-student-100.png")); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(370, 130, 110, 100);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel6.setText("Student Register");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(510, 150, 320, 60);

        txt_id.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txt_id.setForeground(new java.awt.Color(153, 153, 153));
        txt_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_id.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 255)));
        getContentPane().add(txt_id);
        txt_id.setBounds(180, 310, 230, 30);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jLabel7.setText("Date    : ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(70, 500, 110, 30);

        txt_name.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txt_name.setForeground(new java.awt.Color(153, 153, 153));
        txt_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_name.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 255)));
        getContentPane().add(txt_name);
        txt_name.setBounds(180, 370, 230, 30);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jLabel8.setText("Name    : ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(70, 370, 110, 30);

        gender_groub.add(rd_female);
        rd_female.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        rd_female.setText("Female");
        rd_female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd_femaleActionPerformed(evt);
            }
        });
        getContentPane().add(rd_female);
        rd_female.setBounds(310, 440, 130, 26);

        gender_groub.add(rd_male);
        rd_male.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        rd_male.setText("Male");
        getContentPane().add(rd_male);
        rd_male.setBounds(180, 440, 80, 26);

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jLabel9.setText("Gender  : ");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(70, 440, 110, 30);

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jLabel10.setText("Course  : ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(480, 310, 130, 30);

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jLabel11.setText("Day     : ");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(480, 500, 110, 30);

        txt_price.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txt_price.setForeground(new java.awt.Color(153, 153, 153));
        txt_price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_price.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 255)));
        getContentPane().add(txt_price);
        txt_price.setBounds(590, 440, 230, 30);

        jLabel12.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jLabel12.setText("Time    : ");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(480, 370, 110, 30);

        jLabel13.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jLabel13.setText("Price    : ");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(480, 440, 110, 30);

        cb_time.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        cb_time.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:00am-10:00am", "11:00am-12:00pm", "5:00pm-6:00pm", "7:00pm-8:00pm" }));
        cb_time.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        getContentPane().add(cb_time);
        cb_time.setBounds(590, 370, 230, 40);

        cb_course.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        cb_course.setForeground(new java.awt.Color(204, 204, 204));
        cb_course.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C/C++/OPP", "JAVA PRO", "FLUTTER DART", "WEBSITE", "NETWORK" }));
        cb_course.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        getContentPane().add(cb_course);
        cb_course.setBounds(590, 310, 230, 40);

        day_groub.add(ch_sat);
        ch_sat.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        ch_sat.setText("Sat_Sun");
        getContentPane().add(ch_sat);
        ch_sat.setBounds(710, 500, 110, 26);

        day_groub.add(ch_mon);
        ch_mon.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        ch_mon.setText("Mon_Fri");
        getContentPane().add(ch_mon);
        ch_mon.setBounds(590, 500, 110, 26);

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jLabel14.setText("Phone   : ");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(880, 310, 130, 30);

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jLabel15.setText("Search  : ");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(880, 500, 110, 30);

        txt_phone.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txt_phone.setForeground(new java.awt.Color(153, 153, 153));
        txt_phone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_phone.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 255)));
        getContentPane().add(txt_phone);
        txt_phone.setBounds(980, 310, 230, 28);

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jLabel16.setText("Image   : ");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(880, 370, 110, 30);

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 1, 20)); // NOI18N
        jLabel17.setText("Room    : ");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(880, 440, 110, 30);

        cb_room.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        cb_room.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ETEC01", "ETEC02", "ETEC03" }));
        cb_room.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        getContentPane().add(cb_room);
        cb_room.setBounds(980, 440, 230, 40);

        txt_search.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txt_search.setForeground(new java.awt.Color(153, 153, 153));
        txt_search.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_search.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 255)));
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });
        getContentPane().add(txt_search);
        txt_search.setBounds(980, 500, 230, 30);

        txt_image.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        txt_image.setForeground(new java.awt.Color(153, 153, 153));
        txt_image.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_image.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(0, 153, 255)));
        getContentPane().add(txt_image);
        txt_image.setBounds(980, 370, 230, 30);

        lb_image.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lb_image);
        lb_image.setBounds(1250, 300, 120, 120);

        btn_image.setText("Image");
        btn_image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imageActionPerformed(evt);
            }
        });
        getContentPane().add(btn_image);
        btn_image.setBounds(1250, 450, 130, 40);

        tb_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Stu_Id", "Name", "Gender", "Date", "Course", "Time", "Price", "Day", "Phone", "Image", "Room"
            }
        ));
        tb_table.setRowHeight(20);
        tb_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 550, 1330, 170);

        btn_delete.setBackground(new java.awt.Color(0, 0, 255));
        btn_delete.setForeground(new java.awt.Color(204, 255, 255));
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_delete);
        btn_delete.setBounds(960, 190, 120, 40);

        btn_exit.setBackground(new java.awt.Color(255, 102, 102));
        btn_exit.setForeground(new java.awt.Color(204, 255, 255));
        btn_exit.setText("Exit");
        getContentPane().add(btn_exit);
        btn_exit.setBounds(960, 240, 320, 40);

        btn_clear.setBackground(new java.awt.Color(0, 0, 255));
        btn_clear.setForeground(new java.awt.Color(204, 255, 255));
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        getContentPane().add(btn_clear);
        btn_clear.setBounds(1150, 190, 120, 40);

        btn_update.setBackground(new java.awt.Color(0, 0, 255));
        btn_update.setForeground(new java.awt.Color(204, 255, 255));
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_update);
        btn_update.setBounds(1150, 130, 120, 40);

        btn_save.setBackground(new java.awt.Color(0, 0, 255));
        btn_save.setForeground(new java.awt.Color(204, 255, 255));
        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        getContentPane().add(btn_save);
        btn_save.setBounds(960, 130, 120, 40);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1410, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 120, 1410, 610);

        setSize(new java.awt.Dimension(1426, 763));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rd_femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd_femaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rd_femaleActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        
        int id = Integer.parseInt(txt_id.getText());
       String name = txt_name.getText();
       String gender;
       if(rd_male.isSelected()){
           gender="Male";
       }
       else {
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
       else{
           day="Sat_Sun";
       }
       String phone = txt_phone.getText();
       String image = txt_image.getText();
       String room = cb_room.getSelectedItem().toString();
       Student_lst stu = new Student_lst(id, name, gender, date, course, time, price, day, phone, image, room);
       Student_lst.list.add(stu);
       
        DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
         model.setRowCount(0);
       for(int i=0;i<Student_lst.list.size();i++){
          
           Object row[]={
             Student_lst.list.get(i).id,
             Student_lst.list.get(i).name,
             Student_lst.list.get(i).gender,
             Student_lst.list.get(i).date,
             Student_lst.list.get(i).course,
             Student_lst.list.get(i).time,
             Student_lst.list.get(i).price,
             Student_lst.list.get(i).day,
             Student_lst.list.get(i).phone,
             Student_lst.list.get(i).image,
             Student_lst.list.get(i).room,
           };
           model.addRow(row);
           JOptionPane.showMessageDialog(null, "Insert Student Success.");
           Clear();
           
           
       }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_imageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imageActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        txt_image.setText(filename);
        ImageIcon icon = new ImageIcon(filename);
        lb_image.setIcon(icon);
    
     
    }//GEN-LAST:event_btn_imageActionPerformed

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
            JOptionPane.showMessageDialog(null, e);
        }
        cb_course.setSelectedItem(model.getValueAt(row, 4).toString());
        cb_time.setSelectedItem(model.getValueAt(row, 5).toString());
        txt_price.setText(model.getValueAt(row, 6).toString());
        String day = model.getValueAt(row, 7).toString();
        if(day.equals("Mon_Fri")){
            ch_mon.setSelected(true);
        }
        else{
            ch_sat.setSelected(true);
        }
        txt_phone.setText(model.getValueAt(row, 8).toString());
        txt_image.setText(model.getValueAt(row, 9).toString());
        cb_room.setSelectedItem(model.getValueAt(row, 10).toString());
        lb_image.setIcon(new javax.swing.ImageIcon(model.getValueAt(row, 9).toString()));
    }//GEN-LAST:event_tb_tableMouseClicked

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
       int row = tb_table.getSelectedRow();
       if(row==-1){
           JOptionPane.showMessageDialog(null, "Pls Select Row Before Update.");
       }
       else{
        int id = Integer.parseInt(txt_id.getText());
       String name = txt_name.getText();
       String gender;
       if(rd_male.isSelected()){
           gender="Male";
       }
       else {
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
       else{
           day="Sat_Sun";
       }
       String phone = txt_phone.getText();
       String image = txt_image.getText();
       String room = cb_room.getSelectedItem().toString();
       Student_lst stu = new Student_lst(id, name, gender, date, course, time, price, day, phone, image, room);
       Student_lst.list.set(row, stu);
       DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
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
       JOptionPane.showMessageDialog(null, "Update Success.");
       Clear();
           
       }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        int row = tb_table.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
        if(row!=-1){
            Student_lst.list.remove(row);
            model.setRowCount(0);
            JOptionPane.showMessageDialog(null, "Delete Success.");
        }
        else{
            JOptionPane.showMessageDialog(null, "Pls Select Row.");
            Clear();
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
       Clear();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        String itemp = txt_search.getText();
        Search(itemp);
    }//GEN-LAST:event_txt_searchKeyReleased

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
            java.util.logging.Logger.getLogger(Student_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private necesario.MaterialButton btn_clear;
    private necesario.MaterialButton btn_delete;
    private necesario.MaterialButton btn_exit;
    private com.k33ptoo.components.KButton btn_image;
    private necesario.MaterialButton btn_save;
    private necesario.MaterialButton btn_update;
    private javax.swing.JComboBox<String> cb_course;
    private javax.swing.JComboBox<String> cb_room;
    private javax.swing.JComboBox<String> cb_time;
    private javax.swing.JCheckBox ch_mon;
    private javax.swing.JCheckBox ch_sat;
    private javax.swing.ButtonGroup day_groub;
    private javax.swing.ButtonGroup gender_groub;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lb_image;
    private javax.swing.JRadioButton rd_female;
    private javax.swing.JRadioButton rd_male;
    private rojeru_san.complementos.RSTableMetro tb_table;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_image;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
