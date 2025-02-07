
package AWT;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Test_Form extends JFrame implements ActionListener{
    JLabel lb_title ,lb_name;
    JButton btn_exit;
    JTextField txt_name;
    
    //constructor
    public Test_Form() throws HeadlessException {
        lb_title = new JLabel("Hello Java Programing");
        lb_title.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        lb_title.setForeground(Color.red);
        lb_title.setBounds(90, 30, 350, 50);
        add(lb_title);
        
        btn_exit = new JButton("Exit");
        btn_exit.setBounds(190,  300,100,35);
        btn_exit.setFont(new Font("Comic Sans MS", Font.PLAIN, 18));
        btn_exit.setBackground(Color.blue);
        btn_exit.setForeground(new Color(175,238,238));
        add(btn_exit);
        
        lb_name = new JLabel("Name  : ");
        lb_name.setBounds(50, 200, 150, 40);
        lb_name.setFont(new Font("Comic Sans MS", Font.BOLD, 18));
        add(lb_name);
        
        
        txt_name = new JTextField();
        txt_name.setBounds(190, 200, 250, 35);
        txt_name.setFont(new Font("Comic Sans MS", Font.PLAIN, 16));
        txt_name.setForeground(Color.gray);
        add(txt_name);
        
        btn_exit.addActionListener(this);
        
        
        ///create container step 1
        setLayout(null);
        setSize(500, 500);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    public static void main(String[] args) {
        new Test_Form();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn_exit){
            //System.exit(0);
            dispose();
        }
       
    }
    
}
