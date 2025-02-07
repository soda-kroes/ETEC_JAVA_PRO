
package Awt;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Action;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class Example3 extends JFrame implements ActionListener{
    JLabel lb_title,lb_id,lb_name,lb_gender,lb_address;
    JTextField txt_id,txt_name,txt_gender,txt_address;
    JButton btn_save,btn_exit,btn_clear;
    //for create table
    JTable tb_table;
    JScrollPane jsc;
    DefaultTableModel model;
    
    JLabel image = new JLabel(new ImageIcon("src/images/person.jpg"));
    
    
    String id,name,sex,address;

    public Example3(String id, String name, String sex, String address) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.address = address;
    }
    
    static ArrayList<Example3> list = new ArrayList();
       
    
    public Example3() {
        lb_title = new JLabel("Person Information");
        lb_title.setForeground(Color.red);
        lb_title.setBounds(50, 30, 350, 40);
        lb_title.setFont(new Font("Times New Roman", Font.BOLD, 40));
        add(lb_title);
                          
        
        lb_id = new JLabel("ID           : ");
        lb_id.setForeground(Color.WHITE);
        lb_id.setBounds(50, 100, 350, 40);
        lb_id.setFont(new Font("Cascadia Mono Light", Font.BOLD, 25));
        add(lb_id);
        
        txt_id = new JTextField();
        txt_id.setFont(new Font("Khmer SN Kampot", Font.BOLD, 15));
        txt_id.setForeground(Color.red);
        txt_id.setBounds(200, 106, 250, 35);
        add(txt_id);
        
        
        
        lb_address = new JLabel("Address : ");
        lb_address.setForeground(Color.WHITE);
        
        lb_address.setBounds(50, 400, 350, 40);
        lb_address.setFont(new Font("Cascadia Mono Light", Font.BOLD, 25));
        add(lb_address);
        
        txt_address = new JTextField();
        txt_address.setFont(new Font("Khmer SN Kampot", Font.BOLD, 15));
        txt_address.setForeground(Color.red);
        txt_address.setBounds(200, 406, 250, 35);
        add(txt_address);
        
        
        lb_name = new JLabel("Name     : ");
        lb_name.setForeground(Color.WHITE);
        
        lb_name.setBounds(50, 200, 350, 40);
        lb_name.setFont(new Font("Cascadia Mono Light", Font.BOLD, 25));
        add(lb_name);
        
        txt_name = new JTextField();
        txt_name.setFont(new Font("Khmer SN Kampot", Font.BOLD, 15));
        txt_name.setForeground(Color.red);
        txt_name.setBounds(200, 206, 250, 35);
        add(txt_name);
        
        
        lb_gender = new JLabel("Gender   : ");
        lb_gender.setForeground(Color.WHITE);
        
        lb_gender.setBounds(50, 300, 350, 40);
        lb_gender.setFont(new Font("Cascadia Mono Light", Font.BOLD, 25));
        add(lb_gender);
        
        txt_gender = new JTextField();
        txt_gender.setFont(new Font("Khmer SN Kampot", Font.BOLD, 15));
        txt_gender.setForeground(Color.red);
        txt_gender.setBounds(200, 306, 250, 35);
        add(txt_gender);
        
        btn_save = new JButton("Save");
        btn_save.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 15));
        btn_save.setBackground(Color.blue);
        btn_save.setForeground(Color.WHITE);
        btn_save.setBounds(500, 480, 100, 40);
        add(btn_save);
        
        btn_clear = new JButton("Clear");
        btn_clear.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 15));
        btn_clear.setBackground(Color.blue);
        btn_clear.setForeground(Color.WHITE);
        btn_clear.setBounds(650, 480, 100, 40);
        add(btn_clear);
        
        
        btn_exit = new JButton("Exit");
        btn_exit.setFont(new Font("Microsoft YaHei UI Light", Font.BOLD, 15));
        btn_exit.setBackground(Color.red);
        btn_exit.setForeground(Color.WHITE);
        btn_exit.setBounds(800, 480, 100, 40);
        add(btn_exit);
        
        String column[] = {"Id","Name","Gender","Address"};
        tb_table=new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(column);
        tb_table.setModel(model);
        tb_table.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        jsc = new JScrollPane(tb_table);
        jsc.setBounds(500, 105, 400, 335);
        add(jsc);
        
        btn_save.addActionListener(this);
        image.setSize(1000,700);
        add(image);
        
        btn_clear.addActionListener(this);
        btn_exit.addActionListener(this);
        
        setLayout(null);
        setSize(1000, 700);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
    }
    void Clear(){
        txt_id.setText("");
        txt_name.setText("");
        txt_gender.setText("");
        txt_address.setText("");
    }
    
    

    public static void main(String[] args) {
        new Example3();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if(e.getSource()==btn_save){
          model.setRowCount(0);
         
          String Id = txt_id.getText();
          String Name = txt_name.getText();
          String Sex = txt_gender.getText();
          String Address = txt_address.getText();
          
          Example3 per = new Example3(Id, Name, Sex, Address);
          Example3.list.add(per);
          for(int  i=0;i<Example3.list.size();i++){
              String id = Example3.list.get(i).id;
              String name = Example3.list.get(i).name;
              String sex = Example3.list.get(i).sex;
              String address = Example3.list.get(i).address;
              Object row[] = {id,name,sex,address};
              model.addRow(row);
          }
          
          
      }
      else if(e.getSource()==btn_clear){
                 Clear();
     }
      else{
          dispose();
      }
    }
    
}
