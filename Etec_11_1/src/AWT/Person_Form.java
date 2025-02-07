
package AWT;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Person_Form extends JFrame implements ActionListener{
    JLabel lb_title,lb_id,lb_name,lb_gender,lb_add;
    JTextField txt_id,txt_name,txt_gender,txt_add;
    JButton btn_save,btn_clear,btn_exit;
    //for table
    JTable tb_table;
    JScrollPane js;
    DefaultTableModel model;
    
    
    //constructor
    
    public Person_Form() throws HeadlessException {
        lb_title = new JLabel("Person Information");
        lb_title.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
        lb_title.setBounds(30, 20, 500, 50);
        add(lb_title);
        //set id
        lb_id = new JLabel("Id       : ");
        lb_id.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        lb_id.setBounds(30, 100, 200, 40);
        add(lb_id);
        
        txt_id = new JTextField();
        txt_id.setBounds(180, 105, 300, 35);
        txt_id.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        txt_id.setForeground(Color.gray);
        add(txt_id);
        
        //set name
        lb_name = new JLabel("Name   : ");
        lb_name.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        lb_name.setBounds(30, 180, 200, 40);
        add(lb_name);
        
        txt_name = new JTextField();
        txt_name.setBounds(180, 185, 300, 35);
        txt_name.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        txt_name.setForeground(Color.gray);
        add(txt_name);
        
        
        //set gender
         lb_gender = new JLabel("Gender  : ");
        lb_gender.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        lb_gender.setBounds(30, 260, 200, 40);
        add(lb_gender);
        
        txt_gender = new JTextField();
        txt_gender.setBounds(180, 265, 300, 35);
        txt_gender.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        txt_gender.setForeground(Color.gray);
        add(txt_gender);
        //set address
         lb_add = new JLabel("Address : ");
        lb_add.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        lb_add.setBounds(30, 340, 200, 40);
        add(lb_add);
        
        txt_add = new JTextField();
        txt_add.setBounds(180, 345, 300, 35);
        txt_add.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        txt_add.setForeground(Color.gray);
        add(txt_add);
        
        btn_save = new JButton("Save");
        btn_save.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        btn_save.setBounds(550, 400, 100, 35);
        btn_save.setBackground(new Color(30,144,255));
        btn_save.setForeground(Color.white);
        add(btn_save);
        
        
        btn_clear = new JButton("Clear");
        btn_clear.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        btn_clear.setBounds(750, 400, 100, 35);
        btn_clear.setBackground(new Color(30,144,255));
        btn_clear.setForeground(Color.white);
        add(btn_clear);
        
         btn_exit = new JButton("Exit");
        btn_exit.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        btn_exit.setBounds(950, 400, 100, 35);
        btn_exit.setBackground(Color.red);
        btn_exit.setForeground(Color.white);
        add(btn_exit);
        //create table
        String col[]={"Id","Name","Gender","Address"};
        tb_table = new JTable();
        model = new DefaultTableModel();
        model.setColumnIdentifiers(col);
        tb_table.setModel(model);
        js = new JScrollPane(tb_table);
        js.setBounds(550, 100, 500, 280);
        add(js);
        
        btn_save.addActionListener(this);
        btn_clear.addActionListener(this);
        btn_exit.addActionListener(this);
        
        
        
        //create container
        setLayout(null);
        setSize(1100, 600);
        JPanel obj = new JPanel();
        obj.setSize(1100, 600);
        obj.setBackground(new Color(112,128,144));
        add(obj);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }

    public static void main(String[] args) {
        new Person_Form();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn_save){
            model.setRowCount(0);
            String id = txt_id.getText();//1001
            String name = txt_name.getText();//Dara
            String gender = txt_gender.getText();//Male
            String address = txt_add.getText();//Takeo
            Personlist per = new Personlist(id, name, gender, address);
            Personlist.list.add(per);
            for(int i=0;i<Personlist.list.size();i++){
                String Id = Personlist.list.get(i).id;
                String Name = Personlist.list.get(i).name;
                String Gender = Personlist.list.get(i).gender;
                String Address = Personlist.list.get(i).add;
                Object row[]={Id,Name,Gender,Address};
                model.addRow(row);
                JOptionPane.showMessageDialog(null, "Insert Data Success.");
                
            }  
        }
        else if(e.getSource()==btn_clear){
            txt_id.setText("");
            txt_name.setText("");
            txt_gender.setText("");
            txt_add.setText("");
        }
        else{
            dispose();
        }
    }
    
    
}
