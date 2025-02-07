
package AWT;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class Student_Form extends JFrame implements ActionListener{
    JLabel lb_title,lb_id,lb_name,lb_sex,lb_course,lb_time;
    JTextField txt_id,txt_name;
    JRadioButton rd_male,rd_female;
    JComboBox cb_course,cb_time;
    JButton btn_save,btn_updat,btn_delete,btn_clear,btn_sort,btn_reset,btn_logout,btn_exit;
    JLabel image = new JLabel(new ImageIcon("src/Images/back.png"));
    //for table
    JTable tb_table;
    JScrollPane js;
    DefaultTableModel model;
            
    
    public Student_Form() throws HeadlessException {
        lb_title = new JLabel("Student Register");
        lb_title.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
        lb_title.setBounds(50, 10, 400, 60);
        add(lb_title);
        //ID
        lb_id = new JLabel("Stu_Id    : ");
        lb_id.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        lb_id.setBounds(50, 100, 200, 40);
        add(lb_id);
        
        txt_id = new JTextField();
        txt_id.setBounds(200, 105, 300, 35);
        txt_id.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        txt_id.setForeground(Color.gray);
        add(txt_id);
        //Name
        lb_name = new JLabel("Name     : ");
        lb_name.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        lb_name.setBounds(50, 180, 200, 40);
        add(lb_name);
        
        txt_name = new JTextField();
        txt_name.setBounds(200, 185, 300, 35);
        txt_name.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        txt_name.setForeground(Color.gray);
        add(txt_name);
        
         lb_sex = new JLabel("Gender   : ");
        lb_sex.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        lb_sex.setBounds(50, 260, 200, 40);
        add(lb_sex);
        
        rd_male = new JRadioButton("Male");
        rd_male.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        rd_male.setBounds(200, 263, 100, 40);
        add(rd_male);
        
         rd_female = new JRadioButton("Female");
        rd_female.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        rd_female.setBounds(380, 263, 100, 40);
        add(rd_female);
        
        
         lb_course = new JLabel("Course   : ");
        lb_course.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        lb_course.setBounds(50, 340, 200, 40);
        add(lb_course);
        
        
        String col[]={"","C/C++/OPP","Java Programing","Csharp Programing","Flutter&Dart","Network"};
        cb_course = new JComboBox(col);
        cb_course.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        cb_course.setBounds(200, 345, 300, 35);
        add(cb_course);
        
        
        lb_time = new JLabel("Time  : ");
        lb_time.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        lb_time.setBounds(50, 420, 200, 40);
        add(lb_time);
        
        
        String time[]={"","10:00am-11:00am","11:00am-12:00pm","5:00pm-6:00pm","7:00pm-8:00pm"};
        cb_time = new JComboBox(time);
        cb_time.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        cb_time.setBounds(200, 425, 300, 35);
        add(cb_time);
        
        
        
        String tb_col[]={"Stu_Id","Name","Gender","Course","Time"};
        tb_table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(tb_col);
        tb_table.setModel(model);
        js = new JScrollPane(tb_table);
        js.setBounds(550, 100, 580, 300);
        add(js);
        
        btn_save = new JButton("Save");
        btn_save.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        btn_save.setBounds(550, 425, 100, 35);
        btn_save.setBackground(Color.blue);
        btn_save.setForeground(Color.WHITE);
        add(btn_save);
        
         btn_updat = new JButton("Update");
        btn_updat.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        btn_updat.setBounds(670, 425, 100, 35);
        btn_updat.setBackground(Color.blue);
        btn_updat.setForeground(Color.WHITE);
        add(btn_updat);
        
        btn_delete = new JButton("Delete");
        btn_delete.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        btn_delete.setBounds(790, 425, 100, 35);
        btn_delete.setBackground(Color.blue);
        btn_delete.setForeground(Color.WHITE);
        add(btn_delete);
        
           btn_clear = new JButton("Clear");
        btn_clear.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        btn_clear.setBounds(910, 425, 100, 35);
        btn_clear.setBackground(Color.blue);
        btn_clear.setForeground(Color.WHITE);
        add(btn_clear);
        
          btn_sort = new JButton("Sort");
        btn_sort.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        btn_sort.setBounds(1030, 425, 100, 35);
        btn_sort.setBackground(Color.blue);
        btn_sort.setForeground(Color.WHITE);
        add(btn_sort);
        
        
         
        btn_reset = new JButton("Reset");
        btn_reset.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        btn_reset.setBounds(1030, 470, 100, 35);
        btn_reset.setBackground(Color.blue);
        btn_reset.setForeground(Color.WHITE);
        add(btn_reset);
        
        btn_exit = new JButton("Exit");
        btn_exit.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        btn_exit.setBounds(910, 470, 100, 35);
        btn_exit.setBackground(Color.ORANGE);
        btn_exit.setForeground(Color.WHITE);
        add(btn_exit);
        
        
        btn_logout = new JButton("Logout");
        btn_logout.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        btn_logout.setBounds(790, 470, 100, 35);
        btn_logout.setBackground(Color.red);
        
        btn_logout.setForeground(Color.WHITE);
        add(btn_logout);
        
        
        
        ButtonGroup obj = new ButtonGroup();
        obj.add(rd_male);
        obj.add(rd_female);
        
        //Action For Button
        btn_logout.addActionListener(this);
        btn_save.addActionListener(this);
        btn_clear.addActionListener(this);
        btn_updat.addActionListener(this);
        btn_delete.addActionListener(this);
        btn_sort.addActionListener(this);
        btn_reset.addActionListener(this);
        
        image.setSize(1200, 600);
        add(image);
        //create container
        setLayout(null);
        setSize(1200,600);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    void ClearField(){
        txt_id.setText("");
        txt_name.setText("");
        ButtonGroup obj = new ButtonGroup();
        obj.add(rd_male);
        obj.add(rd_female);
        obj.clearSelection();
        cb_course.setSelectedIndex(0);
        cb_time.setSelectedIndex(0);
        
    }
    
    public void getData(){
        model.setRowCount(0);
        for(int i=0;i<Studentlist.list.size();i++){
                int Id = Studentlist.list.get(i).getId();
                String Name = Studentlist.list.get(i).getName();
                String Gender = Studentlist.list.get(i).getGender();
                String Course = Studentlist.list.get(i).getCourse();
                String Time = Studentlist.list.get(i).getTime();
                Object row[]={Id,Name,Gender,Course,Time};
                model.addRow(row);
                ClearField();
            }
    }
    
    
    public static void main(String[] args) {
        new Student_Form();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn_logout){
            Login_Form.main(null);
            dispose();
        }
        else if(e.getSource()==btn_save){
            
            int id = Integer.parseInt(txt_id.getText());//1001
            String name = txt_name.getText();//Dara
            String gender;
            if(rd_male.isSelected()){
                gender="Male";
                
            }
            else{
                gender="Female";
            }
            String course = cb_course.getSelectedItem().toString();
            String time = cb_time.getSelectedItem().toString();
            Studentlist stu = new Studentlist(id, name, gender, course, time);
            Studentlist.list.add(stu);
            getData();
            
            
        }
        else if(e.getSource()==btn_clear){
            ClearField();
        }
        else if(e.getSource()==btn_updat){
            int row = tb_table.getSelectedRow();
            if(row==-1){
                JOptionPane.showMessageDialog(null, "Pls Select Row Before Update.");
            }
            else{
                //Update List
            int id = Integer.parseInt(txt_id.getText());//1001
            String name = txt_name.getText();//Dara
            String gender;
            if(rd_male.isSelected()){
                gender="Male";
                
            }
            else{
                gender="Female";
            }
            String course = cb_course.getSelectedItem().toString();
            String time = cb_time.getSelectedItem().toString();
            Studentlist stu = new Studentlist(id, name, gender, course, time);
            Studentlist.list.set(row, stu);
            //Update Table
            model.setValueAt(id, row, 0);
            model.setValueAt(name, row, 1);
            model.setValueAt(gender, row, 2);
            model.setValueAt(course, row, 3);
            model.setValueAt(time, row, 4);
            }
            
            
            
        }
        else if(e.getSource()==btn_delete){
            int row = tb_table.getSelectedRow();
            if(row!=-1){
                Studentlist.list.remove(row);
                model.removeRow(row);
   
            }
            else{
                JOptionPane.showMessageDialog(null, "Pls Select Row Before Update.");
            }
        }
        else if(e.getSource()==btn_sort){
         Collections.sort(Studentlist.list,Comparator.comparing(Studentlist::getId));
         getData();
        }
        else if(e.getSource()==btn_reset){
            model.setRowCount(0);
        }
        
    }
    
}
