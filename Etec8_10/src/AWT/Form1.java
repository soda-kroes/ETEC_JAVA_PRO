
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
    JLabel lb_title;
    JButton btn_ok;
    JTextField txt_gmail;
    //constructor
    public Form1() throws HeadlessException {
        
        lb_title = new JLabel("Learning Java Awt");
        lb_title.setBounds(200, 20, 300, 45);
        lb_title.setFont(new Font("Comic Sans MS", Font.BOLD, 30));
        lb_title.setForeground(Color.BLUE);
        add(lb_title);
        
        btn_ok = new JButton("Exit");
        btn_ok.setBounds(300, 300, 100, 35);
        btn_ok.setBackground(Color.black);
        btn_ok.setForeground(Color.red);
        btn_ok.setFont(new Font("Comic Sans MS", Font.BOLD, 16));
        add(btn_ok);
        
        txt_gmail = new JTextField();
        txt_gmail.setBounds(200, 150, 250, 30);
        add(txt_gmail);
       
        
        ///for button action
        btn_ok.addActionListener(this);
       
        
        //step1: create container
        setLayout(null);
        setSize(700, 500);
        setVisible(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    public static void main(String[] args) {
        new Form1();
         
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn_ok){
            dispose();
        }
        
    }
    
}
