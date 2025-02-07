
package AWT;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.ButtonGroup;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class Student_Form extends JFrame implements ActionListener{
    JLabel lb_title1,lb_titel2,lb_id,lb_name,lb_gender,lb_course,lb_time;
    JTextField txt_id,txt_name;
    JRadioButton rd_male,rd_female;
    JComboBox cb_course,cb_time;
    JButton btn_save,btn_update,btn_delete,btn_clear,btn_sort,btn_logout,btn_reset,btn_exit;
    //JLabel image = new JLabel(new ImageIcon("src/Images/color1.png"));
    
    JTable tb_table;
    JScrollPane js;
    DefaultTableModel model;

    public Student_Form() throws HeadlessException {
        
        lb_title1 = new JLabel("Student Register");
        lb_title1.setBounds(30, 20, 300, 50);
        lb_title1.setForeground(Color.red);
        lb_title1.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
        add(lb_title1);
        
        
        lb_id = new JLabel("Stu_Id    : ");
        lb_id.setBounds(30, 100, 200, 40);
        lb_id.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
        add(lb_id);
        txt_id = new JTextField();
        txt_id.setBounds(200, 105, 250, 35);
        txt_id.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        txt_id.setForeground(Color.gray);
        add(txt_id);
        
        
        lb_name = new JLabel("Name     : ");
        lb_name.setBounds(30, 200, 200, 40);
        lb_name.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
        add(lb_name);
        txt_name= new JTextField();
        txt_name.setBounds(200, 205, 250, 35);
        txt_name.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        txt_name.setForeground(Color.gray);
        add(txt_name);
        
        lb_gender = new JLabel("Gender    : ");
        lb_gender.setBounds(30, 300, 200, 40);
        lb_gender.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
        add(lb_gender);
        
        rd_male = new JRadioButton("Male");
        rd_male.setBounds(200, 305, 100, 40);
        rd_male.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        add(rd_male);
        
        rd_female = new JRadioButton("Female");
        rd_female.setBounds(350, 305, 100, 40);

        rd_female.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        add(rd_female);
        
        lb_course = new JLabel("Course    : ");
        lb_course.setBounds(30, 400, 200, 40);
        lb_course.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
        add(lb_course);
        
        String course[]={"","C/C++/OOP","Java Programging","Network","Csharp Programing","Flutter&Dart"};
        cb_course = new JComboBox(course);
        cb_course.setBounds(200, 405, 250, 35);
        cb_course.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        add(cb_course);
        
         lb_time = new JLabel("Time      : ");
        lb_time.setBounds(30, 500, 200, 40);
        lb_time.setFont(new Font("Comic Sans MS", Font.BOLD, 22));
        add(lb_time);
        
        String time[]={"","9:00am-10:00am","11:00am-12:15pm","5:00pm-6:15pm","7:00pm-8:00pm"};
        cb_time = new JComboBox(time);
        cb_time.setBounds(200, 505, 250, 35);
        cb_time.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        add(cb_time);
        
        String column[]={"Stu_Id","Name","Gender","Course","Time"};
        tb_table=new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(column);
        tb_table.setModel(model);
        js = new JScrollPane(tb_table);
        tb_table.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));
        js.setBounds(530, 100, 540, 390);
        add(js);
        
        btn_save = new JButton("Save");
        btn_save.setBounds(530, 505, 100, 35);
        btn_save.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        btn_save.setBackground(Color.blue);
        btn_save.setForeground(Color.white);
        add(btn_save);
        
        btn_update = new JButton("Update");
        btn_update.setBounds(650, 505, 100, 35);
        btn_update.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        btn_update.setBackground(Color.blue);
        btn_update.setForeground(Color.white);
        add(btn_update);
        
        
         btn_delete = new JButton("Delete");
        btn_delete.setBounds(770, 505, 100, 35);
        btn_delete.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        btn_delete.setBackground(Color.blue);
        btn_delete.setForeground(Color.white);
        add(btn_delete);
        
         btn_clear = new JButton("Clear");
        btn_clear.setBounds(890, 505, 100, 35);
        btn_clear.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        btn_clear.setBackground(Color.blue);
        btn_clear.setForeground(Color.white);
        add(btn_clear);
        
          btn_sort = new JButton("Sort");
        btn_sort.setBounds(890, 550, 100, 35);
        btn_sort.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        btn_sort.setBackground(Color.blue);
        btn_sort.setForeground(Color.white);
        add(btn_sort);
        
           btn_reset = new JButton("Reset");
        btn_reset.setBounds(770, 550, 100, 35);
        btn_reset.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        btn_reset.setBackground(new Color(255,140,0));
        btn_reset.setForeground(Color.white);
        add(btn_reset);
        
         btn_logout = new JButton("Logout");
        btn_logout.setBounds(650, 550, 100, 35);
        btn_logout.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        btn_logout.setBackground(new Color(255,20,147));
        btn_logout.setForeground(Color.white);
        add(btn_logout);
        
        btn_exit = new JButton("Exit");
        btn_exit.setBounds(530, 550, 100, 35);
        btn_exit.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        btn_exit.setBackground(Color.red);
        btn_exit.setForeground(Color.white);
        add(btn_exit);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(rd_male);
        bg.add(rd_female);
        
        btn_save.addActionListener(this);
        btn_clear.addActionListener(this);
        btn_update.addActionListener(this);
        btn_delete.addActionListener(this);
        btn_sort.addActionListener(this);
        btn_reset.addActionListener(this);
        btn_logout.addActionListener(this);
        btn_exit.addActionListener(this);
        
        
        
//        image.setSize(1100,650);
//        add(image);
        setLayout(null);
        setSize(1100, 650);
        setVisible(true);
        
        setLocationRelativeTo(null);
        JPanel panel= new JPanel();
        panel.setBackground(new Color(47,79,79));
        panel.setSize(1100, 650);
        add(panel);
        
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    
    
    
    

    
    public static void main(String[] args) {
        new Student_Form();
        
    }
    public void Clear(){
        txt_id.setText("");
        txt_name.setText("");
        ButtonGroup bg = new ButtonGroup();
        bg.add(rd_male);
        bg.add(rd_female);
        bg.clearSelection();
         //rd_male.setSelected(true);
        cb_course.setSelectedIndex(0);
        cb_time.setSelectedIndex(0);
    }
    
    public void GetData(){
        model.setRowCount(0);
        for(int i=0;i<StudentList.list.size();i++){
            int id = StudentList.list.get(i).getId();
            String name = StudentList.list.get(i).getName();
            String gender = StudentList.list.get(i).getGender();
            String course = StudentList.list.get(i).getCourse();
            String time = StudentList.list.get(i).getTime();
            Object row[]={id,name,gender,course,time};
             model.addRow(row);
        }
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn_save){
            int id = Integer.parseInt(txt_id.getText());
            String name = txt_name.getText();
            String gender;
            if(rd_male.isSelected()){
                gender="Male";
            }
            else{
                gender="Female";
            }
            String course = cb_course.getSelectedItem().toString();
            String time = cb_time.getSelectedItem().toString();
            StudentList stu = new StudentList(id, name, gender, course, time);
            StudentList.list.add(stu);
            GetData();
           JOptionPane.showMessageDialog(null, "Insert Data Success.");
           Clear();
            
        }
        else if(e.getSource()==btn_clear){
            Clear();
            
        }
        else if(e.getSource()==btn_update){
            int row = tb_table.getSelectedRow();
            if(row!=-1){
                int id = Integer.parseInt(txt_id.getText());
            String name = txt_name.getText();
            String gender;
            if(rd_male.isSelected()){
                gender="Male";
            }
            else{
                gender="Female";
            }
            String course = cb_course.getSelectedItem().toString();
            String time = cb_time.getSelectedItem().toString();
            StudentList stu = new StudentList(id, name, gender, course, time);
            StudentList.list.set(row, stu);
            model.setValueAt(id, row, 0);
            model.setValueAt(name, row, 1);
            model.setValueAt(gender, row, 2);
            model.setValueAt(course, row, 3);
            model.setValueAt(time, row, 4);
            Clear();
            JOptionPane.showMessageDialog(null, "Update Success.");
                
            }
            else{
                JOptionPane.showMessageDialog(null, "Pls Select Row.");
            }
        }
        else if(e.getSource()==btn_delete){
            int row = tb_table.getSelectedRow();
            if(row==-1){
                JOptionPane.showMessageDialog(null, "Pls Select Row.");
            }
            else{
                StudentList.list.remove(row);
                model.removeRow(row);
                Clear();
                JOptionPane.showMessageDialog(null, "Delete Success.");
                
            }
        }
        else if(e.getSource()==btn_sort){
            Collections.sort(StudentList.list,Comparator.comparing(StudentList::getId));
            GetData();
            JOptionPane.showMessageDialog(null, "Sort Success.");
        }
        else if(e.getSource()==btn_reset){
            StudentList.list.clear();
            GetData();
        }
        else if(e.getSource()==btn_logout){
            Login_form.main(null);
            dispose();
        }
        else{
            dispose();
        }
       
    }
    
}
