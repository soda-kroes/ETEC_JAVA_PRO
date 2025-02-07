
package Database;



import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;


public class Student_Form1 extends javax.swing.JFrame {
    PreparedStatement ps;
    ResultSet r;
    String sql;

    public Student_Form1() {
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
        return con;
    }
      
      void Clear_Field(){
          txt_id.setText("");
          txt_name.setText("");
          txt_gender.setText("");
          txt_score.setText("");
      }
      
      
    void GetData(){
        try {
           sql = "SELECT * FROM form_student1";
            ps = connection().prepareStatement(sql);
            r=ps.executeQuery();
            DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
            while(r.next()){
                Object row[] = {
                    r.getInt(1),
                    r.getString(2),
                    r.getString(3),
                    r.getDouble(4),
                };
                model.addRow(row);
            }
   
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }
  
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_score = new javax.swing.JTextField();
        txt_id = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_gender = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_table = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        btn_exit = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Database/AddStudent.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(340, 10, 130, 150);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Score             :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(120, 410, 200, 30);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Stu_Id          : ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(120, 210, 200, 30);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Name            :  ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(120, 270, 200, 30);

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("Gender          : ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(120, 340, 200, 30);

        txt_score.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        getContentPane().add(txt_score);
        txt_score.setBounds(300, 410, 310, 40);

        txt_id.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });
        getContentPane().add(txt_id);
        txt_id.setBounds(300, 210, 310, 40);

        txt_name.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        getContentPane().add(txt_name);
        txt_name.setBounds(300, 270, 310, 40);

        txt_gender.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        getContentPane().add(txt_gender);
        txt_gender.setBounds(300, 340, 310, 40);

        tb_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Stu_Id", "Name", "Gender", "Score"
            }
        ));
        tb_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tb_table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(640, 210, 630, 240);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 255, 255));
        jLabel7.setText("Student Information");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(540, 70, 510, 50);

        btn_exit.setFont(new java.awt.Font("AKbalthom Chamnap Chhun", 1, 14)); // NOI18N
        btn_exit.setText("Exit");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        getContentPane().add(btn_exit);
        btn_exit.setBounds(1150, 460, 110, 40);

        btn_add.setFont(new java.awt.Font("AKbalthom Chamnap Chhun", 1, 14)); // NOI18N
        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        getContentPane().add(btn_add);
        btn_add.setBounds(640, 460, 110, 40);

        btn_update.setFont(new java.awt.Font("AKbalthom Chamnap Chhun", 1, 14)); // NOI18N
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_update);
        btn_update.setBounds(760, 460, 110, 40);

        btn_delete.setFont(new java.awt.Font("AKbalthom Chamnap Chhun", 1, 14)); // NOI18N
        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_delete);
        btn_delete.setBounds(890, 460, 110, 40);

        btn_clear.setFont(new java.awt.Font("AKbalthom Chamnap Chhun", 1, 14)); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        getContentPane().add(btn_clear);
        btn_clear.setBounds(1020, 460, 110, 40);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Student", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Kh Ang Hand-T.Chhim 2", 1, 36), new java.awt.Color(153, 255, 255))); // NOI18N
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1320, 170);

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 170, 1320, 340);

        setSize(new java.awt.Dimension(1333, 551));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
         try {
            String name = txt_name.getText();
            String gender = txt_gender.getText();
            double score = Double.parseDouble(txt_score.getText());
            sql = "INSERT INTO form_student1(name,gender,score) VALUES(?,?,?)";
            ps=connection().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, gender);
            ps.setDouble(3, score);
            ps.executeUpdate();
            int id=0;
            for(int i=0;i<tb_table.getRowCount();i++){
                id = Integer.parseInt(tb_table.getValueAt(i, 0).toString());
            }
            id++;
            Object row[]={id,name,gender,score};
             DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
             model.addRow(row);
             Clear_Field();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
         
    }//GEN-LAST:event_btn_addActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        GetData();
    }//GEN-LAST:event_formWindowOpened

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        try {
            int id = Integer.parseInt(txt_id.getText());
            String name = txt_name.getText();
            String gender = txt_gender.getText();
            double score = Double.parseDouble(txt_score.getText());
            sql = "UPDATE form_student1 SET name=?,gender=?,score=? WHERE id=?";
            ps=connection().prepareStatement(sql);
            ps.setString(1, name);
            ps.setString(2, gender);
            ps.setDouble(3, score);
            ps.setInt(4 , id);
            ps.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
            int row = tb_table.getSelectedRow();
            model.setValueAt(id, row, 0);
            model.setValueAt(name, row, 1);
            model.setValueAt(gender, row, 2);
            model.setValueAt(score, row, 3);
            Clear_Field();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_btn_updateActionPerformed

    private void tb_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_tableMouseClicked
        DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
        int row = tb_table.getSelectedRow();
        txt_id.setText(model.getValueAt(row, 0).toString());
        txt_name.setText(model.getValueAt(row, 1).toString());
        txt_gender.setText(model.getValueAt(row, 2).toString());
        txt_score.setText(model.getValueAt(row, 3).toString());
    }//GEN-LAST:event_tb_tableMouseClicked

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        Clear_Field();
    }//GEN-LAST:event_btn_clearActionPerformed

    
    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        try {
            int id = Integer.parseInt(txt_id.getText());
            sql = "DELETE FROM form_student1 WHERE id=?";
            ps=connection().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            DefaultTableModel model = (DefaultTableModel)tb_table.getModel();
            int row = tb_table.getSelectedRow();
            model.removeRow(row);
            Clear_Field();
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
      dispose();
    }//GEN-LAST:event_btn_exitActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Student_Form1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_update;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tb_table;
    private javax.swing.JTextField txt_gender;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_score;
    // End of variables declaration//GEN-END:variables
}

