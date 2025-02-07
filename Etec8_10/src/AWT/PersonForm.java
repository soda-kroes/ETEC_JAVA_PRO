
package AWT;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.DefaultButtonModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class PersonForm extends JFrame implements ActionListener{
    JLabel lb_title,lb_name,lb_id,lb_gender,lb_add;
    JTextField txt_id,txt_name,txt_add;
    JRadioButton rd_male,rd_female;
    
    JButton btn_save,btn_clear,btn_exit;
    
    JLabel image = new JLabel(new ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Etec8_10\\src\\Images\\color.png"));
    
   
    //constructor
      String id,name,gender,address;
    public PersonForm(String id, String name, String gender, String address) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.address = address;
    }
   static ArrayList<PersonForm> list = new ArrayList<>();
    
    
    
    //For Table
    JTable tb_table;
    JScrollPane js;
    DefaultTableModel model;
    
    //constructor
    
    //font => Comic Sans MS
    public PersonForm() throws HeadlessException {
        
        lb_title = new JLabel("Person Information");
        lb_title.setBounds(100, 20, 400, 35);
        lb_title.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
          lb_title.setForeground(Color.white);
        add(lb_title);
        
        //ID
        lb_id = new JLabel("Per_Id  : ");
        lb_id.setBounds(50, 100, 200, 30);
        lb_id.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
        lb_id.setForeground(Color.white);
        add(lb_id);
        
        txt_id = new JTextField();
        txt_id.setBounds(200, 100, 250, 35);
        txt_id.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
        txt_id.setForeground(new Color(95,158,160));
        add(txt_id);
        
        //NAME
        lb_name = new JLabel("Name    : ");
        lb_name.setBounds(50, 180, 200, 30);
        lb_name.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
        lb_name.setForeground(Color.white);
        add(lb_name);
        
        txt_name = new JTextField();
        txt_name.setBounds(200, 180, 250, 35);
        txt_name.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
        txt_name.setForeground(new Color(95,158,160));
        add(txt_name);
        
        
        //Gender
        lb_gender = new JLabel("Gender  : ");
        lb_gender.setBounds(50, 260, 200, 30);
        lb_gender.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
          lb_gender.setForeground(Color.white);
        add(lb_gender);
        
        rd_male = new JRadioButton("Male");
        rd_male.setBounds(200, 263, 100, 30);
        rd_male.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        add(rd_male);
        
        rd_female = new JRadioButton("Female");
        rd_female.setBounds(350, 263, 100, 30);
        rd_female.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        add(rd_female);
        
        //address
        

        lb_add = new JLabel("Address  : ");
        lb_add.setBounds(50, 340, 200, 30);
        lb_add.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
          lb_add.setForeground(Color.white);
        add(lb_add);
        
        txt_add = new JTextField();
        txt_add.setBounds(200, 343, 250, 35);
        txt_add.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
        txt_add.setForeground(new Color(95,158,160));
        add(txt_add);
        
        
        //button save
        btn_save = new JButton("Save");
        btn_save.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        btn_save.setBounds(500, 400, 100, 35);
        btn_save.setBackground(Color.BLUE);
        btn_save.setForeground(Color.white);
        add(btn_save);
        
         //button clear
        btn_clear = new JButton("Clear");
        btn_clear.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        btn_clear.setBounds(710, 400, 100, 35);
        btn_clear.setBackground(Color.BLUE);
        btn_clear.setForeground(Color.white);
        add(btn_clear);
        
           //button exit
        btn_exit = new JButton("Exit");
        btn_exit.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        btn_exit.setBounds(900, 400, 100, 35);
        btn_exit.setBackground(Color.RED);
        btn_exit.setForeground(Color.white);
        add(btn_exit);
        
        
        
        
        //creat table
        String column[]={"Per_Id","Name","Gender","Address"};
        model = new DefaultTableModel();
        tb_table = new JTable();
        model.setColumnIdentifiers(column);
        tb_table.setModel(model);
        tb_table.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
        js = new JScrollPane(tb_table);
        js.setBounds(500, 100, 500, 280);
        add(js);
       
       
       
        image.setSize(1100, 600);
        add(image);
        
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(rd_male);
        bg.add(rd_female);
        
        rd_male.setSelected(true);
        
        
        
        //action button
        btn_save.addActionListener(this);
        btn_clear.addActionListener(this);
        btn_exit.addActionListener(this);
        //step
        setLayout(null);
        setSize(1100, 600);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
    }
    

    
    public static void main(String[] args) {
        new PersonForm();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn_save){
            model.setRowCount(0);
            String Id = txt_id.getText();//1001
            String Name = txt_name.getText();//Kok Koko
            String Gender;
            if(rd_male.isSelected()){
                Gender="Male";
            }
            else{
                Gender="Female";
            }
            String Address = txt_add.getText();//Takeo
            
            PersonForm per = new PersonForm(Id, Name, Gender, Address);
            PersonForm.list.add(per);
            for(int i=0;i<PersonForm.list.size();i++){
                String id = PersonForm.list.get(i).id;
                String name = PersonForm.list.get(i).name;
                String gender = PersonForm.list.get(i).gender;
                String address = PersonForm.list.get(i).address;
                Object row[]={id,name,gender,address};
                model.addRow(row);
            }
        }
        else if(e.getSource()==btn_clear){
            txt_id.setText("");
            txt_name.setText("");
            txt_add.setText("");
            ButtonGroup bg = new ButtonGroup();
            bg.add(rd_male);
            bg.add(rd_female);
            bg.clearSelection();
            
        }
        else{
            dispose();
        }
        
    }
    
}
