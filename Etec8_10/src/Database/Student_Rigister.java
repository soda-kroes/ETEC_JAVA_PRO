
package Database;

import com.mysql.jdbc.Connection;
import java.io.File;

import java.sql.*;


import java.sql.ResultSet;



import java.text.SimpleDateFormat;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;




public class Student_Rigister extends javax.swing.JFrame {
    PreparedStatement ps;
    ResultSet r;
    String sql;
    
    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/YYYY");
  
   
    //constructor
    public Student_Rigister() {
        initComponents();
    }
    
    void Search(String str){
        DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
        TableRowSorter<DefaultTableModel> trs = new TableRowSorter<>(model);
        tb_table.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(str));
    }
    
    public void GetDataFromDb(){
       try{
            sql="Select *From student_db";
            ps=connection().prepareStatement(sql);
            r=ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
            while(r.next()){
                Object row[] = {
                    r.getInt(1),
                    r.getString(2),
                    r.getString(3),
                    r.getString(4),
                    r.getString(5),
                    r.getString(6),
                    r.getFloat(7),
                    r.getString(8),
                    r.getString(9),
                    r.getString(10),
                    r.getString(11),
                         
                };
                model.addRow(row);
            }
           
       }catch(Exception e){
           JOptionPane.showMessageDialog(this, e);
       }
        
    }
    
    
    
    
    
    
    Connection connection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/db8-12","root","");
            System.out.println("Completed.....");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Connection Error: "+e.getMessage());
            
        }
        return con;}

    

  

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groub_day = new javax.swing.ButtonGroup();
        groub_gender = new javax.swing.ButtonGroup();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_table = new javax.swing.JTable();
        txt_date = new com.toedter.calendar.JDateChooser();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
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

        txt_id.setEditable(false);
        txt_id.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        txt_id.setForeground(new java.awt.Color(102, 102, 102));
        txt_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_id.setText("ID_AUTO");
        getContentPane().add(txt_id);
        txt_id.setBounds(150, 290, 250, 30);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel8.setText("Name   : ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 340, 100, 26);

        txt_price.setEditable(false);
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
        rd_female.setBounds(310, 390, 100, 25);

        groub_gender.add(rd_male);
        rd_male.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        rd_male.setText("Male");
        getContentPane().add(rd_male);
        rd_male.setBounds(150, 390, 60, 25);

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
        cb_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_courseActionPerformed(evt);
            }
        });
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
        ch_sat.setBounds(710, 440, 110, 25);

        groub_day.add(ch_mon);
        ch_mon.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        ch_mon.setText("Mon_Fri");
        getContentPane().add(ch_mon);
        ch_mon.setBounds(560, 440, 90, 25);

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

        tb_table.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        tb_table.setForeground(new java.awt.Color(255, 51, 51));
        tb_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Gender", "Date", "Course", "Time", "Price", "Day", "Phone", "Image", "Room"
            }
        ));
        tb_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 470, 1330, 190);
        getContentPane().add(txt_date);
        txt_date.setBounds(150, 430, 240, 27);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 120, 1370, 580);

        jMenu3.setText("File");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Student_pro\\src\\image\\home.png")); // NOI18N
        jMenuItem1.setText("Home");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Student_pro\\src\\image\\logout.png")); // NOI18N
        jMenuItem2.setText("Logout");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        setSize(new java.awt.Dimension(1383, 741));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
       int row = tb_table.getSelectedRow();
       DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
       txt_id.setText(model.getValueAt(row, 0).toString());
       txt_name.setText(model.getValueAt(row, 1).toString());
       String gender = model.getValueAt(row, 2).toString();
       if(gender.equals("Male")){
           rd_male.setSelected(true);
       }
       else{
           rd_female.setSelected(true);
       }
        try {
            java.util.Date obj = sdf.parse(model.getValueAt(row, 3).toString());
            txt_date.setDate(obj);
        } catch (Exception e) {
        }
        cb_course.setSelectedItem(model.getValueAt(row, 4));
        cb_time.setSelectedItem(model.getValueAt(row, 5));
        txt_price.setText(model.getValueAt(row, 6).toString());
        String day = model.getValueAt(row, 7).toString();
        if(day.equals("Mon-Fri")){
            ch_mon.setSelected(true);
        }
        else{
            ch_sat.setSelected(true);
        }
        txt_phone.setText(model.getValueAt(row, 8).toString());
        txt_image.setText(model.getValueAt(row, 9).toString());
        cb_room.setSelectedItem(model.getValueAt(row,10));
        lb_image.setIcon(new javax.swing.ImageIcon(model.getValueAt(row, 9).toString()));
        
        
    }//GEN-LAST:event_tb_tableMouseClicked

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        String str = txt_search.getText();
        Search(str);
    }//GEN-LAST:event_txt_searchKeyReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       GetDataFromDb();
    }//GEN-LAST:event_formWindowOpened

    private void cb_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_courseActionPerformed
      int index = cb_course.getSelectedIndex();
      double price=0;
      if(index==0){
          price=90;
      }
      else if(index==1){
          price=100;
      }
      else if(index==2){
          price=110;
      }
      else if(index==3){
          price=120;
      }
      else if(index==4){
          price=130;
      }
      txt_price.setText(String.valueOf(price));
      
    }//GEN-LAST:event_cb_courseActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
       
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
   
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
   
    }//GEN-LAST:event_btn_clearActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        try {
            int id = Integer.parseInt(txt_id.getText());
            sql="Delete From student_db Where id=?" ;
            ps=connection().prepareStatement(sql);
            ps.setInt(1,id);
            ps.executeUpdate();
            int row = tb_table.getSelectedRow();
            DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
            model.removeRow(row);
           
        } catch (Exception e) {
        }
   

    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
           try {
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
            double price = Double.parseDouble(txt_price.getText());
            String day;
            if(ch_mon.isSelected()){
                day="Mon-Fri";
            }
            else{
                day="Sat-Sun";
            }
            String phone=txt_phone.getText();
            String image = txt_image.getText();
            String room = cb_room.getSelectedItem().toString();
             sql="UPDATE student_db SET name=?,gender=?,date=?,course=?,time=?,price=?,day=?,phone=?,image=?,room=? WHERE id=? ";

            ps=connection().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, gender);
            ps.setString(3, date);
            ps.setString(4, course);
            ps.setString(5, time);
            ps.setDouble(6, price);
            ps.setString(7, day);
            ps.setString(8, phone);
            ps.setString(9, image);
            ps.setString(10, room);
            ps.setInt(11, id);
            ps.executeUpdate();
            int row = tb_table.getSelectedRow();
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
            
          
            JOptionPane.showMessageDialog(null, "Update Completed.");
  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }                
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
           try {
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
                day="Mon-Fri";
            }
            else{
                day="Sat-Sun";
            }
            String phone=txt_phone.getText();
            String image = txt_image.getText();
            String room = cb_room.getSelectedItem().toString();
            
            sql="INSERT INTO student_db(name,gender,date,course,time,price,day,phone,image,room) VALUES(?,?,?,?,?,?,?,?,?,?)";
            ps=connection().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, gender);
            ps.setString(3, date);
            ps.setString(4, course);
            ps.setString(5, time);
            ps.setDouble(6, price);
            ps.setString(7, day);
            ps.setString(8, phone);
            ps.setString(9, image);
            ps.setString(10, room);
            ps.executeUpdate();
            int id=0;
            for(int i=0;i<tb_table.getRowCount();i++){
                id = Integer.parseInt(tb_table.getValueAt(i, 0).toString());
                
            }
            id++;
            DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
            Object row[]={id,name,gender,date,course,time,price,phone,image,room};
            model.addRow(row);
          
            JOptionPane.showMessageDialog(null, "Insert Completed.");
  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
       

    }//GEN-LAST:event_btn_addActionPerformed

    
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
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.k33ptoo.components.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lb_image;
    private javax.swing.JRadioButton rd_female;
    private javax.swing.JRadioButton rd_male;
    private javax.swing.JTable tb_table;
    private com.toedter.calendar.JDateChooser txt_date;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_image;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}
