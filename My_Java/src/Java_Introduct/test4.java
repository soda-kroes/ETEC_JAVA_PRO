
package Java_Introduct;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class test4 {

 
    public static void main(String[] args) {
        int x,y,sum;
        JFrame fram = new JFrame();
        x = Integer.parseInt(JOptionPane.showInputDialog(fram,"Input X = "));
        y = Integer.parseInt(JOptionPane.showInputDialog(fram,"Input Y = "));
        sum = x+y;
        JOptionPane.showMessageDialog(null, "Sum = "+sum,"Example#1",JOptionPane.PLAIN_MESSAGE);
    }
    
}
