
package Swing;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Employee_Form extends javax.swing.JFrame {
    DefaultTableModel model;
    
    public Employee_Form() {
        initComponents();
        model = new DefaultTableModel();
        String col[]={"Emp_Id","Name","Gender","Address","Position","Phone","Salary"};
        model.setColumnIdentifiers(col);
        tb_table.setModel(model);
    }
    
    public void ClearField(){
        txt_id.setText("");
        txt_name.setText("");
        groub_gender.clearSelection();
        txt_address.setText("");
        cb_position.setSelectedIndex(0);
        txt_phone.setText("");
        txt_salary.setText("");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groub_gender = new javax.swing.ButtonGroup();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_salary = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_address = new javax.swing.JTextField();
        txt_phone = new javax.swing.JTextField();
        rd_female = new javax.swing.JRadioButton();
        rd_male = new javax.swing.JRadioButton();
        cb_position = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setText("Name       : ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(80, 220, 130, 30);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setText("Emp_Id     : ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(80, 160, 130, 30);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setText("Salary      : ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(80, 500, 130, 30);

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel6.setText("Gender     : ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(80, 280, 130, 30);

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel7.setText("Address    : ");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(80, 330, 130, 30);

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel8.setText("Position     : ");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(80, 390, 130, 30);

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel9.setText("Phone       : ");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(80, 450, 130, 30);

        txt_salary.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        getContentPane().add(txt_salary);
        txt_salary.setBounds(220, 500, 270, 40);

        txt_id.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        getContentPane().add(txt_id);
        txt_id.setBounds(220, 160, 270, 40);

        txt_name.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        getContentPane().add(txt_name);
        txt_name.setBounds(220, 220, 270, 40);

        txt_address.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        getContentPane().add(txt_address);
        txt_address.setBounds(220, 320, 270, 40);

        txt_phone.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        getContentPane().add(txt_phone);
        txt_phone.setBounds(220, 440, 270, 40);

        groub_gender.add(rd_female);
        rd_female.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        rd_female.setText("Female");
        getContentPane().add(rd_female);
        rd_female.setBounds(370, 280, 110, 30);

        groub_gender.add(rd_male);
        rd_male.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        rd_male.setText("Male");
        getContentPane().add(rd_male);
        rd_male.setBounds(230, 280, 70, 30);

        cb_position.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        cb_position.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Network", "IT Support", "Website", "Mobile" }));
        getContentPane().add(cb_position);
        cb_position.setBounds(220, 380, 270, 40);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 4, 4, 4, new java.awt.Color(51, 51, 255)));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 140, 1280, 430);

        setSize(new java.awt.Dimension(1296, 609));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
       // DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
        int row = tb_table.getSelectedRow();
        if(row==-1){
            JOptionPane.showMessageDialog(null, "Pls Select Row.");
        }
        else {
            
        int id = Integer.parseInt(txt_id.getText());
        String name = txt_name.getText();
        String gender;
        if(rd_male.isSelected()){
            gender="Male";
        }
        else {
            gender="Female";
        }
        String address = txt_address.getText();
        String position = cb_position.getSelectedItem().toString();
        String phone = txt_phone.getText();
        double salary = Double.parseDouble(txt_salary.getText());
        EmployeeList emp = new EmployeeList(id, name, gender, address, position, phone, salary);
        EmployeeList.list.set(row, emp);
        //update table
        model.setValueAt(id, row, 0);
        model.setValueAt(name, row, 1);
        model.setValueAt(gender, row, 2);
        model.setValueAt(address, row, 3);
        model.setValueAt(position, row, 4);
        model.setValueAt(phone, row, 5);
        model.setValueAt(salary, row, 6);
        ClearField();
        
            
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
       // DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
        model.setRowCount(0);
        int id = Integer.parseInt(txt_id.getText());
        String name = txt_name.getText();
        String gender;
        if(rd_male.isSelected()){
            gender="Male";
        }
        else {
            gender="Female";
        }
        String address = txt_address.getText();
        String position = cb_position.getSelectedItem().toString();
        String phone = txt_phone.getText();
        double salary = Double.parseDouble(txt_salary.getText());
        EmployeeList emp = new EmployeeList(id, name, gender, address, position, phone, salary);
        EmployeeList.list.add(emp);
        for(int i=0;i<EmployeeList.list.size();i++){
            Object col[]={
                EmployeeList.list.get(i).Id,
                EmployeeList.list.get(i).name,
                EmployeeList.list.get(i).gender,
                EmployeeList.list.get(i).address,
                EmployeeList.list.get(i).position,
                EmployeeList.list.get(i).phone,
                 EmployeeList.list.get(i).salary,   
            };
            model.addRow(col);
            ClearField();
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void tb_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_tableMouseClicked
       int row = tb_table.getSelectedRow();
      // DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
       txt_id.setText(model.getValueAt(row, 0).toString());
       txt_name.setText(model.getValueAt(row, 1).toString());
       String gender = (model.getValueAt(row, 2).toString());
       if(gender.equals("Male")){
           rd_male.setSelected(true);
       }
       else {
           rd_female.setSelected(true);
       }
       txt_address.setText(model.getValueAt(row, 3).toString());
       cb_position.setSelectedItem(model.getValueAt(row, 4).toString());
       txt_phone.setText(model.getValueAt(row, 5).toString());
       txt_salary.setText(model.getValueAt(row, 6).toString());
       
    }//GEN-LAST:event_tb_tableMouseClicked

    private void btn_refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_refreshActionPerformed
        ClearField();
    }//GEN-LAST:event_btn_refreshActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        int row = tb_table.getSelectedRow();
        //DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
        if(row!=-1){
            EmployeeList.list.remove(row);
            model.removeRow(row);
            ClearField();
            JOptionPane.showMessageDialog(null, "Delete Success.");
        }
        else{
            JOptionPane.showMessageDialog(null, "Pls Select Row.");
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(Employee_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Employee_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Employee_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Employee_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Employee_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_position;
    private javax.swing.ButtonGroup groub_gender;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rd_female;
    private javax.swing.JRadioButton rd_male;
    private javax.swing.JTextField txt_address;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_phone;
    private javax.swing.JTextField txt_salary;
    // End of variables declaration//GEN-END:variables
}
