
package Awt;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
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
import javax.swing.plaf.ComboBoxUI;
import javax.swing.table.DefaultTableModel;

public class Student  extends JFrame implements ActionListener{
    JLabel lb_title,lb_id,lb_name,lb_sex,lb_subject,lb_time;
    JTextField txt_id,txt_name;
    JRadioButton rd_male,rd_female;
    JComboBox cb_time,cb_subject;
    JButton btn_save,btn_update,btn_delete,btn_sort,btn_exit,btn_clear,btn_reset;
    JLabel image = new JLabel(new ImageIcon("src/images/color1.jpg"));
    
    JTable tb_table;
    JScrollPane js;
    DefaultTableModel model;
    
  
    
    
    public Student(){
        
        lb_title = new JLabel("Student Information");
        lb_title.setBounds(50, 50, 400, 40);
        lb_title.setFont(new Font("Times New Roman", Font.BOLD, 40));
        lb_title.setForeground(Color.red);
        add(lb_title);
        
        lb_id = new JLabel("ID            : ");
        lb_id.setBounds(50, 150, 100, 20);
        lb_id.setFont(new Font("Bahnschrift SemiBold", Font.BOLD, 20));
        lb_id.setForeground(Color.WHITE);
        add(lb_id);
        
        txt_id=new JTextField();
        txt_id.setFont(new Font("Bahnschrift Light", Font.BOLD, 15));
        txt_id.setForeground(new Color(169,169,169));
        txt_id.setBounds(180, 145, 300, 35);
        add(txt_id);
        
        
        lb_name = new JLabel("Name      : ");
        lb_name.setBounds(50, 250, 100, 20);
        lb_name.setFont(new Font("Bahnschrift SemiBold", Font.BOLD, 20));
          lb_name.setForeground(Color.WHITE);
        add(lb_name);
        
        txt_name=new JTextField();
        txt_name.setForeground(new Color(169,169,169));
        txt_name.setFont(new Font("Bahnschrift Light", Font.BOLD, 15));
        txt_name.setBounds(180, 245, 300, 35);
        add(txt_name);
        
        lb_sex = new JLabel("Gender   : ");
        lb_sex.setBounds(50, 350, 100, 20);
        lb_sex.setFont(new Font("Bahnschrift SemiBold", Font.BOLD, 20));
          lb_sex.setForeground(Color.WHITE);
        add(lb_sex);
        
        rd_male = new JRadioButton("male");
        rd_male.setFont(new Font("Bahnschrift SemiBold", Font.BOLD, 20));
        rd_male.setBounds(180, 345, 100, 30);
        add(rd_male);
        
        rd_female = new JRadioButton("female");
        rd_female.setFont(new Font("Bahnschrift SemiBold", Font.BOLD, 20));
        rd_female.setBounds(380, 345, 100, 30);
        add(rd_female);
        
        
        
        lb_subject = new JLabel("Course  : ");
        lb_subject.setBounds(50, 450, 100, 20);
          lb_subject.setForeground(Color.WHITE);
        lb_subject.setFont(new Font("Bahnschrift SemiBold", Font.BOLD, 20));
        add(lb_subject);
        
        
        String course[] = {"Java Programing","C# Programing","Kotlin Programgin","Swift Programing","Flutter & Dart"};
        cb_subject = new JComboBox<>(course);
        cb_subject.setFont(new Font("AKbalthom Chamnap Chhun", Font.BOLD, 15));
        cb_subject.setBounds(180, 445, 300, 35);
        add(cb_subject);
        
        
        lb_time = new JLabel("Time     : ");
        lb_time.setForeground(Color.WHITE);
        
        lb_time.setBounds(50, 550, 100, 20);
        lb_time.setFont(new Font("Bahnschrift SemiBold", Font.BOLD, 20));
        add(lb_time);
        
        
        String time[] = {"10:00am-11:00am","12:00pm-13:00pm","7:00-8:00pm","8:00pm-9:00pm"};
       
        cb_time = new JComboBox<>(time);
        cb_time.setFont(new Font("AKbalthom Chamnap Chhun", Font.BOLD, 15));
        cb_time.setBounds(180, 545, 300, 35);
        add(cb_time);
        
        
        btn_save= new JButton("Save");
        btn_save.setBackground(Color.CYAN);
        btn_save.setBounds(550, 550, 100, 35);
        btn_save.setFont(new Font("Khmer SN Kampot", Font.BOLD, 15));
        add(btn_save);
        
        btn_update= new JButton("Update");
         btn_update.setBackground(Color.CYAN);
        btn_update.setBounds(670, 550, 100, 35);
        btn_update.setFont(new Font("Khmer SN Kampot", Font.BOLD, 15));
        add(btn_update);
        
        btn_delete= new JButton("Delete");
        btn_delete.setBackground(Color.CYAN);
        btn_delete.setBounds(790, 550, 100, 35);
        btn_delete.setFont(new Font("Khmer SN Kampot", Font.BOLD, 15));
        add(btn_delete);
        
        btn_sort= new JButton("Sort");
         btn_sort.setBackground(Color.CYAN);
        btn_sort.setBounds(910, 550, 100, 35);
        btn_sort.setFont(new Font("Khmer SN Kampot", Font.BOLD, 15));
        add(btn_sort);
        
        btn_clear= new JButton("Clear");
        btn_clear.setBackground(Color.CYAN);
        btn_clear.setBounds(1030, 550, 100, 35);
        btn_clear.setFont(new Font("Khmer SN Kampot", Font.BOLD, 15));
        add(btn_clear);
        
        
        
        btn_reset= new JButton("Reset");
        btn_reset.setBackground(Color.CYAN);
        btn_reset.setBounds(1145, 550, 100, 35);
        btn_reset.setFont(new Font("Khmer SN Kampot", Font.BOLD, 15));
        add(btn_reset);
        

        
        btn_exit= new JButton("Exit");
        btn_exit.setBackground(Color.RED);
        btn_exit.setBounds(1150, 600, 100, 35);
        btn_exit.setFont(new Font("Khmer SN Kampot", Font.BOLD, 15));
        add(btn_exit);
        
        
       
        btn_save.addActionListener(this);
        btn_clear.addActionListener(this);
        btn_update.addActionListener(this);
        btn_delete.addActionListener(this);
        btn_exit.addActionListener(this);
        btn_reset.addActionListener(this);
        btn_sort.addActionListener(this);
        
        

        
    
        
        
        
        
        
        String col[] = {"Stu_id","Name","Gender","Course","Time"};
       
        tb_table=new JTable();
        model=new DefaultTableModel();
        model.setColumnIdentifiers(col);
        tb_table.setModel(model);
        js = new JScrollPane(tb_table);
        tb_table.setFont(new Font("Times New Roman", Font.BOLD, 15));
        tb_table.setBackground(new Color(244,164,96));
        js.setBounds(550, 140, 690, 400);
        add(js);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(rd_male);
        bg.add(rd_female );
         
        
       
        setLayout(null);
        setSize(1300, 700);
         image.setSize(1300, 700);
         add(image);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    void Clear(){
        ButtonGroup bg = new ButtonGroup();
        txt_id.setText("");
        txt_name.setText("");
        bg.add(rd_male);
        bg.add(rd_female);
        bg.clearSelection(); 
        cb_subject.setSelectedIndex(0);
        cb_time.setSelectedIndex(0);

      
    }
    

    public static void main(String[] args) {
        new Student();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn_save){
            model.setRowCount(0);
            int id=Integer.parseInt(txt_id.getText());
            String name = txt_name.getText();
            String gender;
            if(rd_male.isSelected()){
                gender="male";
                
            }
            else{
                gender="female";
            }
            String course = cb_subject.getSelectedItem().toString();
            String time = cb_time.getSelectedItem().toString();
            StudentList stu = new StudentList(id, name, gender, course, time);
         
          
            StudentList.list.add(stu);
            for(int i=0;i<StudentList.list.size();i++){
                int Id = StudentList.list.get(i).getId();
                String Name = StudentList.list.get(i).getName();
                String Gender = StudentList.list.get(i).getSex();
                String Course = StudentList.list.get(i).getCourse();
                String Time = StudentList.list.get(i).getTime();
               
                
                Object col[] = {Id,Name,Gender,Course,Time};
                model.addRow(col);
                Clear();
            }
    
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
                else {
                    gender="Female";
                }
                String course = cb_subject.getSelectedItem().toString();
                String time = cb_time.getSelectedItem().toString();
             
                StudentList stu = new StudentList(id, name, gender, course, time);
                StudentList.list.set(row, stu);
                model.setValueAt(id, row, 0);
                model.setValueAt(name, row, 1);
                model.setValueAt(gender, row, 2);
                model.setValueAt(course, row, 3);
                model.setValueAt(time, row, 4);
                Clear();
                 
            }
            else{
                JOptionPane.showMessageDialog(null, "Please Selete Row.");
            }
        }
        else if(e.getSource()==btn_delete){
            int row = tb_table.getSelectedRow();
            if(row==-1){
                JOptionPane.showMessageDialog(null, "Please Selete Row.");
                
            }
            
            else{
                StudentList.list.remove(row);
                model.removeRow(row);
                Clear();
            }
        }
        else if(e.getSource()==btn_sort){
            Collections.sort(StudentList.list,Comparator.comparing(StudentList::getId));
             model.setRowCount(0);
             for(int i=0;i<StudentList.list.size();i++){
                int Id = StudentList.list.get(i).getId();
                String Name = StudentList.list.get(i).getName();
                String Gender = StudentList.list.get(i).getSex();
                String Course = StudentList.list.get(i).getCourse();
                String Time = StudentList.list.get(i).getTime();
                
                Object col[] = {Id,Name,Gender,Course,Time};
                model.addRow(col);
            }
        }
        else if(e.getSource()==btn_reset){
            StudentList.list.clear();
            model.setRowCount(0);
            for(int i=0;i<StudentList.list.size();i++){
                int Id = StudentList.list.get(i).getId();
                String Name = StudentList.list.get(i).getName();
                String Gender = StudentList.list.get(i).getSex();
                String Course = StudentList.list.get(i).getCourse();
                String Time = StudentList.list.get(i).getTime();
                
                Object col[] = {Id,Name,Gender,Course,Time};
                model.addRow(col);
            }
            
        }

        else if(e.getSource()==btn_exit){
            dispose();
        }
    }


   
}
