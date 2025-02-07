
package Awt;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Example1 extends JFrame implements ActionListener{
    JLabel lb_title;
    JButton btn_exit;

    public Example1() {
        
//        JFrame frame = new JFrame(); //JFrame Creation       
//        frame.setTitle("Add Image"); 
        
        lb_title = new JLabel("Hello Etec Center");
        lb_title.setBounds(130, 50, 260, 30);
        lb_title.setFont(new Font("AKbalthom Chamnap Chhun", Font.BOLD, 30));
        add(lb_title);
        
        btn_exit = new JButton("Exit");
        btn_exit.setBounds(200, 400, 100, 30);
        add(btn_exit);
                 
        
        
        
        btn_exit.addActionListener(this);
        
        setLayout(null);
        setSize(500, 500);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
      
        
    }
    

    public static void main(String[] args) {
        new Example1();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
    
}
