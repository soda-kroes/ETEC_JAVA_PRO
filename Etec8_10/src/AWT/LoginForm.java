
package AWT;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class LoginForm extends JFrame implements ActionListener{
    JLabel lb_title,lb_gmail,lb_pass;
    JButton btn_login,btn_exit;
    JTextField txt_gmail;
    JPasswordField txt_pass;
    //for image background
    JLabel image = new JLabel(new ImageIcon("src/Images/man.png"));
    
    //create Constructor
   
    public LoginForm() throws HeadlessException {
        
        lb_title = new JLabel("Login Form ");
        lb_title.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
        lb_title.setBounds(160, 15, 200, 45);
        lb_title.setForeground(Color.red);
        add(lb_title);
        
        
         //gmail
        lb_gmail = new JLabel("Gmail     : ");
        lb_gmail.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
        lb_gmail.setBounds(50, 100, 150, 45);
        lb_gmail.setForeground(Color.red);
        add(lb_gmail);
        
        txt_gmail = new JTextField();
        txt_gmail.setBounds(200, 105, 250, 35);
        txt_gmail.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        txt_gmail.setForeground(new Color(189,183,107));
        add(txt_gmail);
        
           
         //pass
        lb_pass = new JLabel("Password : "); 
        lb_pass.setFont(new Font("Comic Sans MS", Font.BOLD, 25));
        lb_pass.setBounds(50, 200, 150, 45);
        lb_pass.setForeground(Color.red);
        add(lb_pass);
        
        txt_pass = new JPasswordField();
        txt_pass.setBounds(200, 205, 250, 35);
        txt_pass.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        txt_pass.setForeground(new Color(189,183,107));
        add(txt_pass);
        //btn_Login
        
        btn_login = new JButton("Login");
        btn_login.setBounds(200, 280, 100, 35);
        btn_login.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        btn_login.setBackground(Color.blue);
        btn_login.setForeground(Color.white);
        add(btn_login);
        // btn_Exit
         
        btn_exit = new JButton("Exit");
        btn_exit.setBounds(350, 280, 100, 35);
        btn_exit.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        btn_exit.setBackground(Color.red);
        btn_exit.setForeground(Color.white);
        add(btn_exit);
        
        
//        JPanel background = new JPanel();
//        background.setSize(500, 500);
//        background.setBackground(Color.BLACK);
//        add(background);
      
        
        //for images
        image.setSize(500, 500);
        
        add(image);
        
        //add action
        btn_login.addActionListener(this);
        btn_exit.addActionListener(this);
        
        //create container
        setLayout(null);
        setSize(500, 500);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        
    }

    public static void main(String[] args) {
        new LoginForm();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn_login){
            String gmail = txt_gmail.getText();//dara
            String pass  = txt_pass.getText();//123
            if(gmail.equals("dara@gmail.com") && pass.equals("12345")){
//               PersonForm.main(null);
//               dispose();
                 PersonForm per = new PersonForm();
//                 per.setVisible(true);
                   per.show();
                 dispose();
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid UserName Or Password.");
            }
        }
        else{
            dispose();
        }
    }
    
}
