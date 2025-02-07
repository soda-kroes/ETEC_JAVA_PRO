
package Introduction;

import java.awt.Frame;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Test1 {
    
    public static void main(String[] args) {
        JFrame fram = new JFrame();
        int x,y,sum;
        x=Integer.parseInt(JOptionPane.showInputDialog(fram,"Pls Enter X : "));
        y=Integer.parseInt(JOptionPane.showInputDialog(fram,"Pls Enter Y : "));
        sum=x+y;
        JOptionPane.showMessageDialog(fram, "Sum of x + y = "+sum,"Exaple#1",JOptionPane.PLAIN_MESSAGE);
        
    }
    
}
