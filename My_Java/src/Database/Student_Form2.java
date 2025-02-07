
package Database;


import com.mysql.jdbc.Connection;
import java.awt.Image;
import java.io.File;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Student_Form2 extends javax.swing.JFrame {
    PreparedStatement ps;
    ResultSet r;
    String sql;
    public Student_Form2() {
        initComponents();
    }
    
    
       
    
   Connection connection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/student_form","root","");
            System.out.println("Completed.....");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Connection Error: "+e.getMessage());
        }
        return con;}
   
        void GetData(){
            try {
                sql = "SELECT * FROM form_student2";
                ps=connection().prepareStatement(sql);
                r=ps.executeQuery();
                DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
                while(r.next()){
                    Object row[]={
                        r.getInt(1),
                        r.getString(2),
                        r.getString(3),
                        r.getString(4),
                        r.getString(5),
                        r.getDouble(6),
                        r.getString(7),
                        r.getString(8),
                    };
                    model.addRow(row);
                }

            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
        
          Void ClearField(){
            txt_id.setText("");
            txt_name.setText("");
            groub_gender.clearSelection();
            groub_day.clearSelection();
            txt_image.setText("");
            txt_pay.setText("");
            cb_corse.setSelectedIndex(0);
            lb_image.setIcon(null);
            return null;
        }
        
   
               
   
   
   

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groub_gender = new javax.swing.ButtonGroup();
        groub_day = new javax.swing.ButtonGroup();
        lb_image = new javax.swing.JLabel();
        btn_image = new javax.swing.JButton();
        txt_image = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        rd_male = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txt_pay = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rd_female = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        cb_corse = new javax.swing.JComboBox<>();
        ch_sat = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ch_day = new javax.swing.JCheckBox();
        txt_name = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        txt_address = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_table = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btn_exit = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        lb_image.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        getContentPane().add(lb_image);
        lb_image.setBounds(1260, 150, 110, 130);

        btn_image.setBackground(new java.awt.Color(153, 255, 153));
        btn_image.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        btn_image.setText("Brower");
        btn_image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_imageActionPerformed(evt);
            }
        });
        getContentPane().add(btn_image);
        btn_image.setBounds(1080, 290, 120, 40);

        txt_image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_imageActionPerformed(evt);
            }
        });
        getContentPane().add(txt_image);
        txt_image.setBounds(1220, 290, 190, 40);

        jPanel1.setBackground(new java.awt.Color(255, 0, 51));
        jPanel1.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Hanuman", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Payment     : ");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 450, 150, 30);

        groub_gender.add(rd_male);
        rd_male.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        rd_male.setForeground(new java.awt.Color(255, 255, 255));
        rd_male.setText("Male");
        jPanel1.add(rd_male);
        rd_male.setBounds(210, 210, 120, 36);

        jLabel6.setFont(new java.awt.Font("Hanuman", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Address        : ");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(30, 290, 170, 30);

        txt_pay.setFont(new java.awt.Font("AKbalthom Chamnap Chhun", 0, 18)); // NOI18N
        jPanel1.add(txt_pay);
        txt_pay.setBounds(208, 441, 290, 50);

        jLabel5.setFont(new java.awt.Font("Hanuman", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Gender         : ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 210, 170, 30);

        groub_gender.add(rd_female);
        rd_female.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        rd_female.setForeground(new java.awt.Color(255, 255, 255));
        rd_female.setText("Female");
        jPanel1.add(rd_female);
        rd_female.setBounds(370, 210, 130, 36);

        jLabel2.setFont(new java.awt.Font("Hanuman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Day            : ");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 520, 170, 30);

        cb_corse.setFont(new java.awt.Font("AKbalthom Chamnap Chhun", 0, 18)); // NOI18N
        cb_corse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Basic Code", "Mobile app", "Computer app", "Website", "Network", " " }));
        cb_corse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_corseActionPerformed(evt);
            }
        });
        jPanel1.add(cb_corse);
        cb_corse.setBounds(206, 360, 290, 50);

        groub_day.add(ch_sat);
        ch_sat.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        ch_sat.setForeground(new java.awt.Color(255, 255, 255));
        ch_sat.setText("Sat-Sun");
        jPanel1.add(ch_sat);
        ch_sat.setBounds(360, 520, 130, 30);

        jLabel7.setFont(new java.awt.Font("Hanuman", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Course         :");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 370, 170, 30);

        jLabel3.setFont(new java.awt.Font("Hanuman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Stu_Id          : ");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 50, 170, 30);

        jLabel4.setFont(new java.awt.Font("Hanuman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Name           : ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 130, 170, 30);

        groub_day.add(ch_day);
        ch_day.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        ch_day.setForeground(new java.awt.Color(255, 255, 255));
        ch_day.setText("Mon-Fri");
        jPanel1.add(ch_day);
        ch_day.setBounds(210, 520, 140, 30);

        txt_name.setFont(new java.awt.Font("AKbalthom Chamnap Chhun", 0, 18)); // NOI18N
        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });
        jPanel1.add(txt_name);
        txt_name.setBounds(200, 120, 290, 50);

        txt_id.setFont(new java.awt.Font("AKbalthom Chamnap Chhun", 0, 18)); // NOI18N
        txt_id.setText("Id_Auto");
        jPanel1.add(txt_id);
        txt_id.setBounds(200, 40, 290, 50);

        txt_address.setFont(new java.awt.Font("AKbalthom Chamnap Chhun", 0, 18)); // NOI18N
        jPanel1.add(txt_address);
        txt_address.setBounds(206, 281, 290, 50);

        tb_table.setBackground(new java.awt.Color(255, 153, 153));
        tb_table.setFont(new java.awt.Font("Hanuman", 0, 14)); // NOI18N
        tb_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Stu_Id", "Name", "Gender", "Address", "Course", "Payment", "Day", "Image"
            }
        ));
        tb_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_table);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(506, 230, 640, 311);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(280, 120, 1160, 590);

        jPanel2.setBackground(new java.awt.Color(255, 0, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("AKbalthom Chamnap Chhun", 1, 36), new java.awt.Color(0, 255, 102))); // NOI18N

        jLabel1.setBackground(new java.awt.Color(255, 102, 102));
        jLabel1.setFont(new java.awt.Font("Segoe Print", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("STUDENT OF IT AT ETEC CENTER");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(137, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 910, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(280, 0, 1150, 120);

        jPanel3.setBackground(new java.awt.Color(102, 255, 255));
        jPanel3.setLayout(null);

        jLabel9.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\My_Java\\src\\images\\AddStudent.png")); // NOI18N
        jPanel3.add(jLabel9);
        jLabel9.setBounds(10, -10, 140, 140);

        jLabel11.setFont(new java.awt.Font("Candara", 1, 36)); // NOI18N
        jLabel11.setText("Student");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(150, 40, 150, 60);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 300, 120);

        btn_exit.setFont(new java.awt.Font("kh itsupport4kh", 1, 24)); // NOI18N
        btn_exit.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\My_Java\\src\\images\\icons8-close-50.png")); // NOI18N
        btn_exit.setText("Exit");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        getContentPane().add(btn_exit);
        btn_exit.setBounds(50, 600, 190, 60);

        btn_add.setFont(new java.awt.Font("kh itsupport4kh", 1, 24)); // NOI18N
        btn_add.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\My_Java\\src\\images\\icons8-add-50.png")); // NOI18N
        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        getContentPane().add(btn_add);
        btn_add.setBounds(50, 280, 190, 60);

        btn_update.setFont(new java.awt.Font("kh itsupport4kh", 1, 24)); // NOI18N
        btn_update.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\My_Java\\src\\images\\icons8-available-updates-50.png")); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_update);
        btn_update.setBounds(50, 360, 190, 60);

        btn_delete.setFont(new java.awt.Font("kh itsupport4kh", 1, 24)); // NOI18N
        btn_delete.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\My_Java\\src\\images\\icons8-remove-48.png")); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_delete);
        btn_delete.setBounds(50, 440, 190, 60);

        btn_refresh.setFont(new java.awt.Font("kh itsupport4kh", 1, 24)); // NOI18N
        btn_refresh.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\My_Java\\src\\images\\icons8-repeat-50.png")); // NOI18N
        btn_refresh.setText("Refresh");
        btn_refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_refreshActionPerformed(evt);
            }
        });
        getContentPane().add(btn_refresh);
        btn_refresh.setBounds(50, 520, 190, 60);

        jPanel4.setBackground(new java.awt.Color(0, 102, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Menu Choice", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("AKbalthom Chamnap Chhun", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel4.setLayout(null);

        jPanel5.setBackground(new java.awt.Color(51, 255, 51));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel12.setBackground(new java.awt.Color(51, 255, 255));
        jLabel12.setFont(new java.awt.Font("AKbalthom Chamnap Chhun", 1, 48)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 0, 51));
        jLabel12.setText("Enter ");
        jLabel12.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(204, 0, 51)));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jPanel4.add(jPanel5);
        jPanel5.setBounds(20, 70, 240, 60);

        getContentPane().add(jPanel4);
        jPanel4.setBounds(0, 120, 280, 590);

        setSize(new java.awt.Dimension(1450, 722));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void btn_imageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_imageActionPerformed
            
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String filename = f.getAbsolutePath();
        txt_image.setText(filename);
        ImageIcon icon = new ImageIcon(filename);
        lb_image.setIcon(icon);
            
    }//GEN-LAST:event_btn_imageActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        GetData();
    }//GEN-LAST:event_formWindowOpened

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
            String address = txt_address.getText();
            String course  = cb_corse.getSelectedItem().toString();
            double payment = Double.parseDouble(txt_pay.getText());
            String day;
            if(ch_day.isSelected()){
                day="Mon-Fri";
            }
            else{
                day="Sat-Sun";
            }
            String image = txt_image.getText();
            sql="INSERT INTO form_student2(name,gender,address,course,payment,day,image)VALUES(?,?,?,?,?,?,?)";
            ps=connection().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, gender);
            ps.setString(3, address);
            ps.setString(4, course);
            ps.setDouble(5, payment);
            ps.setString(6, day);
            ps.setString(7, image);
            ps.executeUpdate();
            
            int id=0;
             for(int i=0;i<tb_table.getRowCount();i++){
                 id = Integer.parseInt(tb_table.getValueAt(i, 0).toString());
             }
             id++;
             Object row[]={id,name,gender,address,course,payment,day,image};
             DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
             model.addRow(row);
             ClearField();
             
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btn_addActionPerformed

    private void cb_corseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_corseActionPerformed
       int op = cb_corse.getSelectedIndex();
       double price=0.0;
       switch(op){
           case 0:{
               price=99.00;
           }break;
           case 1:{
               price=69.00;
           }break;
           case 2:{
               price=79.00;
           }break;
           case 3:{
               price=89.00;
           }break;
           case 4:{
               price=59.00;
           }break;
           
       }
       txt_pay.setText(String.valueOf(price));
    }//GEN-LAST:event_cb_corseActionPerformed

    private void tb_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_tableMouseClicked
        int row = tb_table.getSelectedRow();
        DefaultTableModel model  = (DefaultTableModel)tb_table.getModel();
        txt_id.setText(model.getValueAt(row,0).toString());
        txt_name.setText(model.getValueAt(row, 1).toString());
        String gender = tb_table.getValueAt(row, 2).toString();
        if(gender.equals("Male")){
            rd_male.setSelected(true);
        }
        else{
            rd_female.setSelected(true);
        }
        txt_address.setText(model.getValueAt(row, 3).toString());
        cb_corse.setSelectedItem(model.getValueAt(row, 4).toString());
        txt_pay.setText(model.getValueAt(row, 5).toString());
        String day = tb_table.getValueAt(row, 6).toString();
        if(day.equals("Mon-Fri")){
            ch_day.setSelected(true);
        }
        else{
            ch_sat.setSelected(true);
        }
        txt_image.setText(model.getValueAt(row, 7).toString());
        lb_image.setIcon(new javax.swing.ImageIcon(tb_table.getValueAt(row, 7).toString()));
       // lb_image.setIcon(new javax.swing.ImageIcon(tb_table.getValueAt(row, row)))
                
    }//GEN-LAST:event_tb_tableMouseClicked

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
            String address = txt_address.getText();
            String course = cb_corse.getSelectedItem().toString();
            double payment = Double.parseDouble(txt_pay.getText());
            String day;
            if(ch_day.isSelected()){
                day="Mon-Fri";
            }
            else{
                day="Sat-Sun";
            }
            sql = "UPDATE form_student2 SET name=?,gender=?,address=?,course=?,payment=?,day=? WHERE id=?";
            ps=connection().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, gender);
            ps.setString(3, address);
            ps.setString(4, course);
            ps.setDouble(5, payment);
            ps.setString(6, day);
            ps.setInt(7, id);
            ps.executeUpdate();
            
          
            DefaultTableModel model= (DefaultTableModel)tb_table.getModel();
              int row = tb_table.getSelectedRow();
            model.setValueAt(name, row, 1);
            model.setValueAt(gender, row, 2);
            model.setValueAt(address, row, 3);
            model.setValueAt(course, row, 4);
            model.setValueAt(payment, row, 5);
            model.setValueAt(day, row, 6);
          
            
            
        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
         try {
            int row = tb_table.getSelectedRow();
            
            DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
            int id = Integer.parseInt(txt_id.getText());
            sql = "DELETE FROM form_student2 WHERE id=?";
            ps=connection().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            model.removeRow(row);
            ClearField();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
       ClearField();
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
       dispose();
    }//GEN-LAST:event_btn_exitActionPerformed

    private void txt_imageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_imageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_imageActionPerformed

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
            java.util.logging.Logger.getLogger(Student_Form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Student_Form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Student_Form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Student_Form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Form2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_image;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_update;
    private javax.swing.JComboBox<String> cb_corse;
    private javax.swing.JCheckBox ch_day;
    private javax.swing.JCheckBox ch_sat;
    private javax.swing.ButtonGroup groub_day;
    private javax.swing.ButtonGroup groub_gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lb_image;
    private javax.swing.JRadioButton rd_female;
    private javax.swing.JRadioButton rd_male;
    private javax.swing.JTable tb_table;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_image;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_pay;
    // End of variables declaration//GEN-END:variables
}
