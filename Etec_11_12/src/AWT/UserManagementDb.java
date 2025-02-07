
package AWT;
import com.mysql.jdbc.Connection;
import java.awt.Color;
import java.awt.Font;

import javax.swing.*;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.*;

import javax.swing.table.DefaultTableModel;


public class UserManagementDb extends JFrame implements ActionListener,MouseListener{
    
    PreparedStatement ps;
    ResultSet r;
    String sql;
    
    JLabel lb_title,lb_id,lb_name,lb_age,lb_city;
    JTextField txt_id,txt_name,txt_age,txt_city;
    JButton btn_add,btn_update,btn_delete,btn_reset,btn_exit;
    JTable tb_table;
    JScrollPane js;
    DefaultTableModel model;
 //   JLabel image = new JLabel(new ImageIcon("C:\\Users\\ASUS\\OneDrive\\Desktop\\AMAZONE\\a1.png"));
    
    
    public Connection connection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/user","root","");
            System.out.println("Completed.....");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Connection Error: "+e.getMessage());
        }
        return con;}
    
    
    public void SelectData(){
        try {
            sql="Select *From tb_user";
            ps=connection().prepareStatement(sql);
            r=ps.executeQuery();
           
            while(r.next()){
                Object row[]={
                    r.getInt(1),
                    r.getString(2),
                    r.getString(3),
                    r.getString(4),
                    
                };
                model.addRow(row);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    void ClearField(){
        txt_name.setText("");
        txt_age.setText("");
        txt_city.setText("");
    }

    public UserManagementDb() throws HeadlessException {
        
        connection();
        lb_title = new JLabel("User Management System");
        lb_title.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
        lb_title.setBounds(90, 10, 550, 60);
    
        add(lb_title);
        
        lb_id = new JLabel("ID      : ");
        lb_id.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        lb_id.setBounds(50, 100, 350, 50);
        add(lb_id);
        txt_id = new JTextField("Id Auto");
        txt_id.setEditable(false);
        txt_id.setHorizontalAlignment(JTextField.CENTER);
        txt_id.setBounds(150, 108, 300, 35);
        txt_id.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        add(txt_id);
        
        
        lb_name = new JLabel("Name  : ");
        lb_name.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        lb_name.setBounds(50, 180, 350, 50);
        add(lb_name);
        txt_name = new JTextField();
        txt_name.setBounds(150, 188, 300, 35);
        txt_name.setHorizontalAlignment(JTextField.CENTER);
        txt_name.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        add(txt_name);
        
        
         lb_age = new JLabel("Age    : ");
        lb_age.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        lb_age.setBounds(50, 260, 350, 50);
        add(lb_age);
        txt_age = new JTextField();
        txt_age.setBounds(150, 268, 300, 35);
        txt_age.setHorizontalAlignment(JTextField.CENTER);
        txt_age.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        add(txt_age);
        
        
         lb_city = new JLabel("City     : ");
        lb_city.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        lb_city.setBounds(50, 340, 350, 50);
        add(lb_city);
        txt_city = new JTextField();
        txt_city.setBounds(150, 348, 300, 35);
        txt_city.setHorizontalAlignment(JTextField.CENTER);
        txt_city.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        add(txt_city);
        
        btn_add = new JButton("Add");
        btn_add.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        btn_add.setBounds(500, 400, 100, 35);
        btn_add.setBackground(Color.blue);
        btn_add.setForeground(Color.white);
        add(btn_add);
        
        btn_update = new JButton("Update");
        btn_update.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        btn_update.setBounds(615, 400, 100, 35);
        btn_update.setBackground(Color.blue);
        btn_update.setForeground(Color.white);
        add(btn_update);
        
         btn_delete = new JButton("delete");
        btn_delete.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        btn_delete.setBounds(730, 400, 100, 35);
        btn_delete.setBackground(Color.blue);
        btn_delete.setForeground(Color.white);
        add(btn_delete);
        
         btn_reset = new JButton("Reset");
        btn_reset.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        btn_reset.setBounds(850, 400, 100, 35);
        btn_reset.setBackground(Color.blue);
        btn_reset.setForeground(Color.white);
        add(btn_reset);
        
        btn_reset.addActionListener(this);
        
        
         
         btn_exit = new JButton("Exit");
        btn_exit.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        btn_exit.setBounds(965, 400, 100, 35);
        btn_exit.setBackground(Color.blue);
        btn_exit.setForeground(Color.white);
        btn_exit.setBackground(Color.red);
        add(btn_exit);
        
        btn_add.addActionListener(this);
        btn_update.addActionListener(this);
        btn_delete.addActionListener(this);
        btn_reset.addActionListener(this);
       
        
        String col[]={"Id","Name","Age","City"};
        tb_table=new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(col);
        tb_table.setModel(model);
        
        js = new JScrollPane(tb_table);
        js.setBounds(500, 108, 565, 270);
       
        add(js);
        
        tb_table.addMouseListener(this);
        setLayout(null);
        setSize(1100,500);
        setVisible(true);
        JPanel back = new JPanel();
        back.setBackground(new Color(176,196,222));
        back.setSize(1100, 500);
        add(back);
        setLocationRelativeTo(null);
       
        setDefaultCloseOperation(EXIT_ON_CLOSE);
         SelectData();
    }
    

    public static void main(String[] args) {
        new UserManagementDb();
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        try {
           
            String name = txt_name.getText();
            String age = txt_age.getText();
            String city = txt_city.getText();
            if(e.getSource()==btn_add){
                sql = "INSERT INTO tb_user (name,age,city) values(?,?,?)";
                ps = connection().prepareStatement(sql);
                ps.setString(1, name);
                ps.setString(2, age);
                ps.setString(3, city);
                ps.executeUpdate();
                int id=0;
                for(int i=0;i<tb_table.getRowCount();i++){
                    id=Integer.parseInt(tb_table.getValueAt(i, 0).toString());
                }
                id++;
               
                Object row[]={id,name,age,city};
                model.addRow(row);
                JOptionPane.showMessageDialog(null, "Insert Data Success.");
                ClearField();
  
            }
            else if(e.getSource()==btn_update){
                //update  database
                int Id = Integer.parseInt(txt_id.getText());
                String Name = txt_name.getText();
                String Age = txt_age.getText();
                String City = txt_city.getText();
                sql = "UPDATE tb_user SET name=?,age=?,city=? WHERE id=?";
                ps=connection().prepareStatement(sql);
                ps.setString(1, Name);
                ps.setString(2, Age);
                ps.setString(3, City);
                ps.setInt(4, Id);
                ps.executeUpdate();
                //update table
                int row = tb_table.getSelectedRow();
                model.setValueAt(Id, row, 0);
                model.setValueAt(Name,row,1);
                model.setValueAt(Age, row, 2);
                model.setValueAt(City, row, 3);
                JOptionPane.showMessageDialog(null, "Update Success.");
                ClearField();
                
            }
            else if(e.getSource()==btn_delete){
                int ID = Integer.parseInt(txt_id.getText());
                sql = "DELETE FROM tb_user WHERE id=?";
                ps=connection().prepareStatement(sql);
                ps.setInt(1, ID);
                ps.executeUpdate();
                //delete table
                int row = tb_table.getSelectedRow();
                model.removeRow(row);
                JOptionPane.showMessageDialog(null, "Delete Success.");
                ClearField();
            }
            else if(e.getSource()==btn_reset){
                sql="DELETE FROM tb_user";
                ps=connection().prepareStatement(sql);
                ps.executeUpdate();
                model.setRowCount(0);
                JOptionPane.showMessageDialog(null, "Resete Success.");
                ClearField();
            }
            else {
                dispose();
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
         
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
         int row = tb_table.getSelectedRow();
         txt_id.setText(model.getValueAt(row, 0).toString());
         txt_name.setText(model.getValueAt(row, 1).toString());
         txt_age.setText(model.getValueAt(row, 2).toString());
         txt_city.setText(model.getValueAt(row, 3).toString());
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

   
   
    
}
