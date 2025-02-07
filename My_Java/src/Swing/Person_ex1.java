
package Swing;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;






public class Person_ex1 extends javax.swing.JFrame {
    DefaultTableModel model;

    public Person_ex1() {
        initComponents();
        String col[] = {"ID","Name","Gender","Address"};
        model = new DefaultTableModel();
        model.setColumnIdentifiers(col);
        tb_table.setModel(model);
    }
    void ClearFiel(){
        txt_id.setText("");
        txt_name.setText("");
        txt_gender.setText("");
        txt_address.setText("");
    }
    void GetData(){
        for(int i=0;i<Person_List.list.size();i++){
            Object col[]={
                 Person_List.list.get(i).getId(),
                 Person_List.list.get(i).getName(),
                 Person_List.list.get(i).getSex(),
                 Person_List.list.get(i).getAddress(),
            };
            model.addRow(col);
           
           
            
        }
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_address = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_gender = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_table = new javax.swing.JTable();
        btn_exit = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Kh Rayuth HD 13", 1, 48)); // NOI18N
        jLabel1.setText("Person Information");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(390, 20, 500, 120);

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\My_Java\\src\\images\\icons8-student-100.png")); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(260, 20, 100, 110);

        jLabel3.setFont(new java.awt.Font("Cascadia Mono", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 102));
        jLabel3.setText("Address     : ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 350, 270, 30);

        jLabel4.setFont(new java.awt.Font("Cascadia Mono", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 102));
        jLabel4.setText("Per_Id      : ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 170, 270, 30);

        jLabel5.setFont(new java.awt.Font("Cascadia Mono", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 102));
        jLabel5.setText("Name        : ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 230, 210, 30);

        jLabel6.setFont(new java.awt.Font("Cascadia Mono", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 102));
        jLabel6.setText("Gender      : ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 290, 270, 30);

        txt_address.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_address.setForeground(new java.awt.Color(51, 153, 255));
        txt_address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_addressActionPerformed(evt);
            }
        });
        getContentPane().add(txt_address);
        txt_address.setBounds(290, 340, 290, 40);

        txt_id.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_id.setForeground(new java.awt.Color(51, 153, 255));
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        getContentPane().add(txt_id);
        txt_id.setBounds(290, 170, 290, 40);

        txt_name.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_name.setForeground(new java.awt.Color(51, 153, 255));
        txt_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_name);
        txt_name.setBounds(290, 230, 290, 40);

        txt_gender.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        txt_gender.setForeground(new java.awt.Color(51, 153, 255));
        txt_gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_genderActionPerformed(evt);
            }
        });
        getContentPane().add(txt_gender);
        txt_gender.setBounds(290, 280, 290, 40);

        tb_table.setBackground(new java.awt.Color(204, 204, 255));
        tb_table.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        tb_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Per_Id", "Name", "Gender", "Address"
            }
        ));
        tb_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(630, 170, 490, 210);

        btn_exit.setBackground(new java.awt.Color(255, 0, 0));
        btn_exit.setFont(new java.awt.Font("Kh Stueng Saen", 1, 14)); // NOI18N
        btn_exit.setText("Exit");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        getContentPane().add(btn_exit);
        btn_exit.setBounds(1030, 390, 90, 40);

        btn_save.setBackground(new java.awt.Color(65, 105, 225));
        btn_save.setFont(new java.awt.Font("Kh Stueng Saen", 1, 14)); // NOI18N
        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        getContentPane().add(btn_save);
        btn_save.setBounds(630, 390, 90, 40);

        btn_update.setBackground(new java.awt.Color(65, 105, 225));
        btn_update.setFont(new java.awt.Font("Kh Stueng Saen", 1, 14)); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_update);
        btn_update.setBounds(730, 390, 90, 40);

        btn_delete.setBackground(new java.awt.Color(65, 105, 225));
        btn_delete.setFont(new java.awt.Font("Kh Stueng Saen", 1, 14)); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_delete);
        btn_delete.setBounds(830, 390, 90, 40);

        btn_clear.setBackground(new java.awt.Color(65, 105, 225));
        btn_clear.setFont(new java.awt.Font("Kh Stueng Saen", 1, 14)); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        getContentPane().add(btn_clear);
        btn_clear.setBounds(930, 390, 90, 40);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\My_Java\\src\\images\\newcolor.jpg")); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 140, 1154, 320);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "ETEC CENTER", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 1, 36), new java.awt.Color(255, 51, 51))); // NOI18N
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1160, 140);

        setSize(new java.awt.Dimension(1168, 496));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_addressActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void txt_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nameActionPerformed

    private void txt_genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_genderActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
       dispose();
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        int   id = Integer.parseInt(txt_id.getText());
        String name = txt_name.getText();
        String gender = txt_gender.getText();
        String address=txt_address.getText();
        Person_List per = new Person_List(id, name, gender, address);
        Person_List.list.add(per);
        model.setRowCount(0);
        GetData();
        ClearFiel();
        
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
      int row = tb_table.getSelectedRow();
      if(row==-1){
          JOptionPane.showMessageDialog(null, "Please Selete Row");
          
      }
      else{
          int id = Integer.parseInt(txt_id.getText());
          String name = txt_name.getText();
          String sex = txt_gender.getText();
          String address = txt_address.getText();
          Person_List per = new Person_List(id, name, sex, address);
          Person_List.list.set(row, per);
          model.setValueAt(id, row, 0);
          model.setValueAt(name, row, 1);
          model.setValueAt(sex, row, 2);
          model.setValueAt(address, row, 3);
          ClearFiel();
      }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
       int row = tb_table.getSelectedRow();
       if(row==-1){
           JOptionPane.showMessageDialog(null, "Please Select Row.");
       }
       else{
           Person_List.list.remove(row);
           model.removeRow(row);
           ClearFiel();
       }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        ClearFiel();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void tb_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_tableMouseClicked
       int index = tb_table.getSelectedRow();
       txt_id.setText(model.getValueAt(index, 0).toString());
       txt_name.setText(model.getValueAt(index, 1).toString());
       txt_gender.setText(model.getValueAt(index, 2).toString());
       txt_address.setText(model.getValueAt(index, 3).toString());
    }//GEN-LAST:event_tb_tableMouseClicked

  
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Person_ex1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_table;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_gender;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_name;
    // End of variables declaration//GEN-END:variables
}
