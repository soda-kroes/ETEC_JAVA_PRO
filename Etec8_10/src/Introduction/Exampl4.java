
package Introduction;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Exampl4 {

 
    public static void main(String[] args) {
        JFrame fram = new JFrame();
        int a,b,sum;
        a=Integer.parseInt(JOptionPane.showInputDialog(fram,"Enter A : "));
        b=Integer.parseInt(JOptionPane.showInputDialog(fram,"Enter B : "));
        sum=a+b;
        
        JOptionPane.showMessageDialog(null, "A + B = "+sum,"Example#1",JOptionPane.PLAIN_MESSAGE);
    }
    
}
 