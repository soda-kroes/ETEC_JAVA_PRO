
package Awt;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Example2 extends JFrame implements ActionListener{
    JLabel lb_title,lb_gmail,lb_pass;
    JButton btn_login,btn_exit;
    JPasswordField txt_pass;
    JTextField txt_gmail;
    JLabel image = new JLabel(new ImageIcon("src/images/color.jpg"));
    
           

    public Example2() {
        
        lb_title = new JLabel("Login Form");
        lb_title.setBounds(140, 30, 250, 40);
        lb_title.setFont(new Font("Times New Roman", Font.BOLD, 40));
        lb_title.setForeground(new Color(0,191,255));
        add(lb_title);
        
        lb_gmail = new JLabel("Gmail      : ");
        lb_gmail.setBounds(50, 120, 200, 30);
        lb_gmail.setFont(new Font("Khmer Mondulkiri", Font.BOLD, 20));
        lb_gmail.setForeground(Color.blue);
        add(lb_gmail);
        
        txt_gmail = new JTextField();
        txt_gmail.setFont(new Font("Cascadia Mono SemiBold", Font.BOLD, 15));
        txt_gmail.setBounds(200, 120, 250, 35);
        add(txt_gmail);
        
        
        
         lb_pass = new JLabel("Password   : ");
        lb_pass.setBounds(50, 200, 200, 30);
        lb_pass.setFont(new Font("Khmer Mondulkiri", Font.BOLD, 20));
        lb_pass.setForeground(Color.blue);
        add(lb_pass);
        
        txt_pass = new JPasswordField();
        txt_pass.setFont(new Font("Cascadia Mono SemiBold", Font.BOLD, 15));
        txt_pass.setBounds(200, 200, 250, 35);
        add(txt_pass);
        
        btn_login = new JButton("Login");
        btn_login.setBounds(200, 250, 80, 35);
        btn_login.setFont(new Font("AKbalthom KhmerLight", Font.BOLD, 18));
        btn_login.setForeground(Color.BLUE);
        btn_login.setBackground(Color.CYAN);
        add(btn_login);
        
        btn_exit = new JButton("Exit");
        btn_exit.setBounds(370, 250, 80, 35);
        btn_exit.setFont(new Font("AKbalthom KhmerLight", Font.BOLD, 18));
        btn_exit.setForeground(Color.black);
        btn_exit.setBackground(Color.red);
        add(btn_exit);
        
        btn_login.addActionListener(this);
        btn_exit.addActionListener(this);
        
        
        image.setSize(500, 400);
        add(image);
        setLayout(null);
        setSize(500, 400);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
    }
    
    
    
    

    public static void main(String[] args) {
        new Example2();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()== btn_login){
           String Gmail = txt_gmail.getText();
           String Pass = txt_pass.getText();
           if(Gmail.equals("soda@gmail.com")){
               if(Pass.equals("12345")){
                   Example3.main(null);
                  
               }
               else{
                   JOptionPane.showMessageDialog(null, "Invalid Password.");
               }
           }
           else{
               JOptionPane.showMessageDialog(null, "Invalid Gmail.");
           }
       }
       else{
           dispose();
       }
    }
    
}
