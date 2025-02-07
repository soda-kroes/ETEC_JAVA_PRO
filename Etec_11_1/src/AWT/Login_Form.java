
package AWT;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
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

public class Login_Form extends JFrame implements ActionListener{
    JLabel lb_title,lb_gmail,lb_pass;
    JTextField txt_gmail;
    JPasswordField txt_pass;
    JButton btn_login,btn_exit;
    JLabel image = new JLabel(new ImageIcon("src/Images/spinder.jpg"));
    
    //Contractor 
    public Login_Form() throws HeadlessException {
        
        lb_title = new JLabel("Login Form");
        lb_title.setBounds(150, 10, 300, 50);
        lb_title.setFont(new Font("Comic Sans MS", Font.BOLD, 35));
        lb_title.setForeground(Color.white);
        add(lb_title); 
        
        lb_gmail = new JLabel("Gmail       : ");
        lb_gmail.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        lb_gmail.setBounds(50, 120, 200, 40);
        lb_gmail.setForeground(Color.white);
        add(lb_gmail);
        
        txt_gmail = new JTextField();
        txt_gmail.setBounds(200, 125, 250, 35);
        txt_gmail.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        txt_gmail.setForeground(Color.gray);
        add(txt_gmail);
        
        
         
        lb_pass = new JLabel("Password   : ");
        lb_pass.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        lb_pass.setBounds(50, 220, 200, 40);
        lb_pass.setForeground(Color.white);
        add(lb_pass);
        
        txt_pass = new JPasswordField();
        txt_pass.setBounds(200, 225, 250, 35);
        txt_pass.setFont(new Font("Comic Sans MS", Font.BOLD, 15));
        txt_pass.setForeground(Color.gray);
        add(txt_pass);
        
        btn_login = new JButton("Login");
        btn_login.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        btn_login.setBounds(200, 280, 100, 35);
        btn_login.setBackground(Color.blue);
        btn_login.setForeground(Color.white);
        add(btn_login);
        
        
        btn_exit = new JButton("Exit");
        btn_exit.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        btn_exit.setBounds(350, 280, 100, 35);
        btn_exit.setBackground(Color.red);
        btn_exit.setForeground(Color.white);
        
        add(btn_exit);
        btn_login.addActionListener(this);
        btn_exit.addActionListener(this);
        
        //create container
        image.setSize(500, 500);
        add(image);
        setLayout(null);
        setSize(500, 500);
//        JPanel obj = new JPanel();
//        obj.setBackground(Color.gray);
//        obj.setSize(500, 500);
//        add(obj);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    public static void main(String[] args) {
       new Login_Form();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn_login){
            String gmail = txt_gmail.getText();//dara
            String pass  = txt_pass.getText();//12345
            if(gmail.equals("dara@gmail.com")){
                if(pass.equals("12345")){
                   
                    JOptionPane.showMessageDialog(null, "Login Success.");
                    Student_Form.main(null);
                    dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid Password.");
                }
                
            }
            else {
                JOptionPane.showMessageDialog(null, "Invalid Gmail.");
            }
        }
        else{
            System.exit(0);
           // dispose();
        }
    }
    
}
