
package AWT;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class Login_form extends JFrame implements ActionListener{
    JLabel lb_title,lb_gmail,lb_pass;
    JTextField txt_gmail;
    JPasswordField txt_pass;
    JButton btn_login,btn_exit;
    JLabel image = new JLabel(new ImageIcon("C:\\Users\\ASUS\\OneDrive\\Documents\\NetBeansProjects\\Etec_11_12\\src\\Images\\man.jpg"));
    
    
    //Constructor
    public Login_form() throws HeadlessException {
        lb_title = new JLabel("Login Form");
        lb_title.setBounds(150, 30, 300, 55);
        lb_title.setForeground(Color.white);
        lb_title.setFont(new Font("Comic Sans MS", Font.BOLD, 40));
        add(lb_title);
        
        lb_gmail = new JLabel("Gmail        : ");
        lb_gmail.setBounds(50, 130, 200, 30);
        lb_gmail.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        lb_gmail.setForeground(Color.white);
        add(lb_gmail);
        
        txt_gmail = new JTextField();
        txt_gmail.setBounds(200, 130, 250, 35);
        txt_gmail.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        txt_gmail.setForeground(Color.gray);
        add(txt_gmail);
        
        
        lb_pass = new JLabel("Password    : ");
        lb_pass.setBounds(50, 230, 200, 30);
        lb_pass.setForeground(Color.white);
        lb_pass.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        add(lb_pass);
        
        txt_pass = new JPasswordField();
        txt_pass.setBounds(200, 230, 250, 35);
        txt_pass.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        txt_pass.setForeground(Color.gray);
        add(txt_pass);
        
        
        btn_login = new JButton("Login");
        btn_login.setBounds(200, 300, 100, 35);
        btn_login.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        btn_login.setForeground(Color.white);
        btn_login.setBackground(Color.blue);
        add(btn_login);
        
        btn_exit = new JButton("Exit");
        btn_exit.setBounds(350, 300, 100, 35);
        btn_exit.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        btn_exit.setForeground(Color.white);
        btn_exit.setBackground(Color.RED);
        add(btn_exit);
        //Add Action Button
        btn_exit.addActionListener(this);
        btn_login.addActionListener(this);
        
        //image
        image.setSize(500, 450);
        add(image);
     //create container(step1)
        setLayout(null);
        setSize(500, 450);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
   
    public static void main(String[] args) {
       new Login_form();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==btn_login){
           String gmail = txt_gmail.getText();//dara@gmail.com
           String pass = txt_pass.getText();//dara123
           if(gmail.equals("dara@gmail.com")){
               if(pass.equals("dara123")){
                   JOptionPane.showMessageDialog(null, "Login Success.");
                   //Person_Form.main(null);
                  // Person_Form per = new Person_Form();
                   //per.setVisible(true);
//                   Person_Form per = new Person_Form();
//                   per.show();
//                   dispose();
                     Student_Form.main(null);
                     dispose();
                  
               }
               else {
                   JOptionPane.showMessageDialog(null, "Invalid Password.");
               }
           }
           else{
               JOptionPane.showMessageDialog(null, "Invalid Gmail.");
           }
       }
       else{
          // System.exit(0);
           dispose();
       }
    }
    
}
