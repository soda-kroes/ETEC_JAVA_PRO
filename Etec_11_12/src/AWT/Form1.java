
package AWT;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Form1 extends JFrame implements ActionListener{
    JLabel title,lb_id;
    JButton btn_exit;
    JTextField txt1;
    
    //Constructor
    public Form1() throws HeadlessException {
        
        title = new JLabel("Hello Java Programing");
        title.setBounds(75, 20, 350, 45);
        title.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        title.setForeground(Color.blue);
        add(title);
        
        
        btn_exit = new JButton("Exit");
        btn_exit.setBounds(200, 300, 100, 35);
        btn_exit.setFont(new Font("Comic Sans MS", Font.PLAIN, 20));
        btn_exit.setBackground(Color.cyan);
        btn_exit.setForeground(new Color(210,105,30));
        add(btn_exit);
        
        lb_id = new JLabel("Id     : ");
        lb_id.setBounds(100, 180, 150, 35);
        lb_id.setFont(new Font("Comic Sans MS", Font.BOLD, 20));
        add(lb_id);
        
        
        txt1 = new JTextField();
        txt1.setBounds(200, 180,250 , 35);
        add(txt1);
        
        
        btn_exit.addActionListener(this);
        
        
        //Container(step1)
        setLayout(null);
        setSize(500, 500);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }

    
    public static void main(String[] args) {
        new Form1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       System.exit(0);
    }
    
}
