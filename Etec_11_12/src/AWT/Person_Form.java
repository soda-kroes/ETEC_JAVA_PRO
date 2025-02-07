
package AWT;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;



public class Person_Form extends JFrame implements ActionListener{
    JLabel lb_title,lb_id,lb_name,lb_sex,lb_add;
    JTextField txt_id,txt_name,txt_sex,txt_add;
    JButton btn_save,btn_clear,btn_exit;
    
   

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn_save){
            model.setRowCount(0);
            String id = txt_id.getText();//1001
            String name = txt_name.getText();//dara
            String gender = txt_sex.getText();//male
            String address = txt_add.getText();//kompot
            
            list_person per = new list_person(id, name, gender, address);
            list_person.list.add(per);
            boolean b=false;
            for(int i=0;i<list_person.list.size();i++){
                String Id = list_person.list.get(i).id;
                String Name = list_person.list.get(i).name;
                String Sex = list_person.list.get(i).gender;
                String Add = list_person.list.get(i).add;
                 Object row[]={Id,Name,Sex,Add};
              if(Id.equals("")){
                  if(Name.equals("")){
                      if(Sex.equals("")){
                          if(Add.equals("")){                  
                             
                          }
                      }
                  }
              }
              else{
                  model.addRow(row);
                  clear();
              }
            }
            
            
                
           
        }
        else if(e.getSource()==btn_clear){
           clear();
        }
    }
    
  

      void clear(){
         txt_id.setText("");
            txt_name.setText("");
            txt_sex.setText("");
            txt_add.setText("");
    }
  
    
    
    
    

    //For Table
    JTable tb_table;
    JScrollPane jsc;
    DefaultTableModel model;
    
    //for background
    JLabel image = new JLabel(new ImageIcon("src/Images/color1.png"));
    
    //constractor
    public Person_Form() throws HeadlessException {
        
        lb_title = new JLabel("Person Information");
        lb_title.setBounds(50, 10, 400, 60);
        lb_title.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
        lb_title.setForeground(Color.blue);
        add(lb_title);
        
        //id
        lb_id = new JLabel("Id         : ");
        lb_id.setBounds(50, 110, 200, 40);
        lb_id.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        add(lb_id);
        
        txt_id = new JTextField();
        txt_id.setBounds(200, 115, 250, 35);
        txt_id.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        txt_id.setForeground(Color.gray);
        add(txt_id);
        
        //Name
        lb_name = new JLabel("Name     : ");
        lb_name.setBounds(50, 210, 200, 40);
        lb_name.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        add(lb_name);
        
        txt_name = new JTextField();
        txt_name.setBounds(200, 215, 250, 35);
        txt_name.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        txt_name.setForeground(Color.gray);
        add(txt_name);
        
        
        //sex
         lb_sex = new JLabel("Gender   : ");
        lb_sex.setBounds(50, 310, 200, 40);
        lb_sex.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        add(lb_sex);
        
        txt_sex = new JTextField();
        txt_sex.setBounds(200, 315, 250, 35);
        txt_sex.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        txt_sex.setForeground(Color.gray);
        add(txt_sex);
        //address
        lb_add = new JLabel("Address  : ");
        lb_add.setBounds(50, 410, 200, 40);
        lb_add.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        add(lb_add);
        
        txt_add = new JTextField();
        txt_add.setBounds(200, 415, 250, 35);
        txt_add.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        txt_add.setForeground(Color.gray);
        add(txt_add);
        
        //for table
        String colum[]={"ID","NAME","GENDER","ADDRESS"};
        tb_table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(colum);
        tb_table.setModel(model);
        jsc = new JScrollPane(tb_table);
        jsc.setBounds(500, 115, 450, 335);
        add(jsc);
        
        //for  button
        btn_save = new JButton("Save");
        btn_save.setBounds(500, 470, 100, 35);
        btn_save.setBackground(Color.blue);
        btn_save.setForeground(Color.white);
        btn_save.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        add(btn_save);
        
         btn_clear = new JButton("Clear");
        btn_clear.setBounds(680, 470, 100, 35);
        btn_clear.setBackground(Color.blue);
        btn_clear.setForeground(Color.white);
        btn_clear.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        add(btn_clear);
        
        
        
         btn_exit = new JButton("Exit");
        btn_exit.setBounds(850, 470, 100, 35);
        btn_exit.setBackground(Color.red);
        btn_exit.setForeground(Color.white);
        btn_exit.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        add(btn_exit);
        
        //action
        btn_save.addActionListener(this);
        btn_clear.addActionListener(this);
        
        
        image.setSize(1000, 600);
        add(image);
        
        
        //Create Container
        setLayout(null);
        setSize(1000, 600);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    

    
    public static void main(String[] args) {
        new Person_Form();
                
    }
    
}
