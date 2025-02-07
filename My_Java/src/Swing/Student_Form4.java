
package Swing;
import java.awt.Image;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;


import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class Student_Form4 extends javax.swing.JFrame {
    SimpleDateFormat sdf = new SimpleDateFormat("MM/DD/YYYY");

    public Student_Form4() {
        initComponents();
    }
    void GetData(){
        DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
        for(int i=0;i<Student_List.list.size();i++){
            Object row[]={
            Student_List.list.get(i).getId(),
            Student_List.list.get(i).getName(),
            Student_List.list.get(i).getGender(),
            Student_List.list.get(i).getDate(),
            Student_List.list.get(i).getCourse(),
            Student_List.list.get(i).getTime(),
            Student_List.list.get(i).getPrice(),
            Student_List.list.get(i).getDay(),
            Student_List.list.get(i).getPhone(),
            Student_List.list.get(i).getImage(),
            Student_List.list.get(i).getRoom(),
       };
            model.addRow(row);
        }
        
    }
    
    void SearchData(String str){
        DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
        TableRowSorter<DefaultTableModel> trs  = new TableRowSorter<>(model);
        tb_table.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }
    
    void ClearFiel(){
        txt_id.setText("");
        txt_name.setText("");
        groub_gender.clearSelection();
        txt_date.setDate(new Date());
        cb_course.setSelectedIndex(0);
        cb_room.setSelectedIndex(0);
        txt_price.setText("");
        groub_day.clearSelection();
        txt_tell.setText("");
        txt_image.setText("");
        lbimage.setIcon(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groub_gender = new javax.swing.ButtonGroup();
        groub_day = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_date = new com.toedter.calendar.JDateChooser();
        txt_id = new javax.swing.JTextField();
        txt_price = new javax.swing.JTextField();
        rd_female = new javax.swing.JRadioButton();
        rd_male = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cb_room = new javax.swing.JComboBox<>();
        cb_course = new javax.swing.JComboBox<>();
        txt_image = new javax.swing.JTextField();
        ch_sat = new javax.swing.JCheckBox();
        ch_mon = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        txt_tell = new javax.swing.JTextField();
        cb_time = new javax.swing.JComboBox<>();
        txt_search = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_table = new javax.swing.JTable();
        btn_update = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        btn_image = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        lbimage = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Khmer OS Muol Light", 1, 30)); // NOI18N
        jLabel1.setText("មជ្ឈមណ្ឌលវិស្វកម្មបច្ចេកវិទ្យា និង អេឡិចត្រូនិច");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(330, 10, 810, 80);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 30)); // NOI18N
        jLabel2.setText("Engineering Of  Technology and Electronic Center");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(380, 70, 680, 60);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Date             : ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 480, 120, 20);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setText("Day             : ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(510, 480, 120, 20);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setText("Name           : ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 380, 120, 20);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setText("Gender        : ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 430, 120, 20);
        getContentPane().add(txt_date);
        txt_date.setBounds(170, 470, 240, 40);

        txt_id.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        getContentPane().add(txt_id);
        txt_id.setBounds(170, 320, 240, 40);

        txt_price.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_priceActionPerformed(evt);
            }
        });
        getContentPane().add(txt_price);
        txt_price.setBounds(630, 420, 240, 40);

        groub_gender.add(rd_female);
        rd_female.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rd_female.setText("Female");
        getContentPane().add(rd_female);
        rd_female.setBounds(320, 430, 100, 21);

        groub_gender.add(rd_male);
        rd_male.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        rd_male.setText("Male");
        getContentPane().add(rd_male);
        rd_male.setBounds(170, 430, 90, 21);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setText("Id                 : ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 330, 120, 20);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Search          : ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(940, 480, 120, 20);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Time             : ");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(510, 380, 120, 20);

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Price            : ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(510, 430, 120, 20);

        cb_room.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cb_room.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Etec01", "Etec02", "Etec03", "Etec04" }));
        getContentPane().add(cb_room);
        cb_room.setBounds(1070, 420, 240, 40);

        cb_course.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cb_course.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Basic code", "Java programing", "Dart&flutter", "Network", "Website", " ", " " }));
        getContentPane().add(cb_course);
        cb_course.setBounds(630, 310, 240, 40);

        txt_image.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_imageActionPerformed(evt);
            }
        });
        getContentPane().add(txt_image);
        txt_image.setBounds(1070, 370, 240, 40);

        groub_day.add(ch_sat);
        ch_sat.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        ch_sat.setText("Sat_Sun");
        getContentPane().add(ch_sat);
        ch_sat.setBounds(780, 480, 110, 24);

        ch_mon.setBackground(new java.awt.Color(255, 51, 51));
        groub_day.add(ch_mon);
        ch_mon.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        ch_mon.setText("Mon_Fri");
        getContentPane().add(ch_mon);
        ch_mon.setBounds(630, 480, 110, 24);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Course         : ");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(510, 320, 120, 20);

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("Tell              : ");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(940, 320, 120, 20);

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setText("Image          : ");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(940, 380, 120, 20);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setText("Room            : ");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(940, 430, 120, 20);

        txt_name.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_name);
        txt_name.setBounds(170, 370, 240, 40);

        txt_tell.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_tell.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_tellActionPerformed(evt);
            }
        });
        getContentPane().add(txt_tell);
        txt_tell.setBounds(1070, 310, 240, 40);

        cb_time.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        cb_time.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:00am-10:00am", "12:00am-1:00am", "2:00pm-3:00pm", "6:00pm-7:00pm" }));
        getContentPane().add(cb_time);
        cb_time.setBounds(630, 370, 240, 40);

        txt_search.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
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
        txt_search.setBounds(1070, 470, 240, 40);

        tb_table.setBackground(new java.awt.Color(204, 204, 204));
        tb_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Gender", "Date", "Course", "Time", "Price", "Day", "Telll", "Image", "Room"
            }
        ));
        tb_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 520, 1270, 200);

        btn_update.setBackground(new java.awt.Color(102, 255, 204));
        btn_update.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_update);
        btn_update.setBounds(260, 730, 110, 40);

        btn_save.setBackground(new java.awt.Color(102, 255, 204));
        btn_save.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        getContentPane().add(btn_save);
        btn_save.setBounds(40, 730, 110, 40);

        btn_exit.setBackground(new java.awt.Color(255, 51, 51));
        btn_exit.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_exit.setText("Exit");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        getContentPane().add(btn_exit);
        btn_exit.setBounds(1200, 730, 110, 40);

        btn_delete.setBackground(new java.awt.Color(102, 255, 204));
        btn_delete.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_delete);
        btn_delete.setBounds(480, 730, 110, 40);

        btn_clear.setBackground(new java.awt.Color(102, 255, 204));
        btn_clear.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        getContentPane().add(btn_clear);
        btn_clear.setBounds(710, 730, 110, 40);

        btn_image.setBackground(new java.awt.Color(102, 255, 204));
        btn_image.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_image.setText("Image");
        btn_image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imageActionPerformed(evt);
            }
        });
        getContentPane().add(btn_image);
        btn_image.setBounds(950, 730, 110, 40);

        jPanel1.setBackground(new java.awt.Color(255, 51, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "ETEC CENTER", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel16.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\My_Java\\src\\images\\logo_ETEC.jpg")); // NOI18N
        jLabel16.setText("jLabel16");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1046, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel16)
                .addGap(0, 1, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1330, 150);

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel15.setText("Student Register");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(530, 180, 260, 70);

        jLabel17.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\My_Java\\src\\images\\icons8-manager-100.png")); // NOI18N
        getContentPane().add(jLabel17);
        jLabel17.setBounds(410, 160, 100, 100);

        jPanel4.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 140, 10, 640);

        jPanel6.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel6);
        jPanel6.setBounds(1310, 110, 10, 670);

        jPanel7.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1320, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel7);
        jPanel7.setBounds(0, 780, 1320, 10);

        jPanel8.setBackground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1310, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel8);
        jPanel8.setBounds(0, 150, 1310, 10);

        lbimage.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lbimage);
        lbimage.setBounds(1110, 180, 110, 110);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1300, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 160, 1300, 620);

        setSize(new java.awt.Dimension(1338, 827));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_priceActionPerformed
        
    }//GEN-LAST:event_txt_priceActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
      
    }//GEN-LAST:event_txt_idActionPerformed

    private void txt_imageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_imageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_imageActionPerformed

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void txt_tellActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_tellActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_tellActionPerformed

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        dispose();
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
       ClearFiel();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_imageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imageActionPerformed
       
        
         JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        txt_image.setText(filename);
        Image getAbsolutePath=null;
        ImageIcon icon = new ImageIcon(filename);
        Image image = icon.getImage().getScaledInstance(btn_image.getWidth(), lbimage.getHeight(), Image.SCALE_SMOOTH);
       lbimage.setIcon(icon);
       
      
    }//GEN-LAST:event_btn_imageActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
        int id=Integer.parseInt(txt_id.getText());
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
        String time=cb_time.getSelectedItem().toString();
        float price = Float.parseFloat(txt_price.getText());
        String day ;
        if(ch_mon.isSelected()==true){
            day="Mon-Fri";
        }
        else{
            day="Sat-Sun";
        }
        String tell=txt_tell.getText();
        String image=txt_image.getText();
        String room = cb_room.getSelectedItem().toString();
        Student_List stu = new Student_List(id, name, gender, date, course, time, day, tell, image, room, price);
        Student_List.list.add(stu);
        model.setRowCount(0);
        GetData();
        
        ClearFiel();
    }//GEN-LAST:event_btn_saveActionPerformed

    private void tb_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_tableMouseClicked
       int index = tb_table.getSelectedRow();
       DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
       txt_id.setText(model.getValueAt(index, 0).toString());
       txt_name.setText(model.getValueAt(index, 1).toString());
       String gender=model.getValueAt(index, 2).toString();
       if(gender.equals("Male")){
           rd_male.setSelected(true);
       }
       else{
           rd_female.setSelected(true);
       }
        try {
            java.util.Date obj = sdf.parse(model.getValueAt(index, 3).toString());
            txt_date.setDate(obj);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
        cb_course.setSelectedItem(model.getValueAt(index, 4).toString());
        cb_time.setSelectedItem(model.getValueAt(index, 5).toString());
        txt_price.setText(model.getValueAt(index, 6).toString());
        String day = model.getValueAt(index, 7).toString();
        if(day.equals("Mon-Fri")){
            ch_mon.setSelected(true);
        }
        else{
            ch_sat.setSelected(true);
        }
        txt_tell.setText(model.getValueAt(index, 8).toString());
        txt_image.setText(model.getValueAt(index, 9).toString());
        cb_room.setSelectedItem(model.getValueAt(index, 10).toString());
        
        
    }//GEN-LAST:event_tb_tableMouseClicked

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
       DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
       int row = tb_table.getSelectedRow();
       if(row==-1){
           JOptionPane.showMessageDialog(null, "Pls Select Row........!");
       }
       else{
           int id = Integer.parseInt(txt_id.getText());
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
       float price = Float.parseFloat(txt_price.getText());
       String day;
       if(ch_mon.isSelected()){
           day="Mon-Fri";
       }
       else{
           day="Sat-Sun";
       }
       String tell = txt_tell.getText();
       String image = txt_image.getText();
       String room = cb_room.getSelectedItem().toString();
       Student_List stu = new Student_List(id, name, gender, date, course, time, day, room, image, room, price);
       Student_List.list.set(row, stu);
      
       model.setValueAt(id, row, 0);
       model.setValueAt(name, row, 1);
       model.setValueAt(gender, row, 2);
       model.setValueAt(date, row, 3);
       model.setValueAt(course, row, 4);
       model.setValueAt(time, row, 5);
       model.setValueAt(price, row, 6);
       model.setValueAt(day, row, 7);
       model.setValueAt(tell, row, 8);
       model.setValueAt(image, row, 9);
       model.setValueAt(room, row, 10);
       ClearFiel();
       }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
       int row = tb_table.getSelectedRow();
       DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
       if(row==-1){
           JOptionPane.showMessageDialog(null, "Pls Select Row......!");
       }
       else{
           Student_List.list.remove(row);
           model.removeRow(row);
           ClearFiel();
       }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        String item = txt_search.getText();
        SearchData(item);
    }//GEN-LAST:event_txt_searchKeyReleased

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Form4().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_image;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_update;
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
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbimage;
    private javax.swing.JRadioButton rd_female;
    private javax.swing.JRadioButton rd_male;
    private javax.swing.JTable tb_table;
    private com.toedter.calendar.JDateChooser txt_date;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_image;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_tell;
    // End of variables declaration//GEN-END:variables


}
