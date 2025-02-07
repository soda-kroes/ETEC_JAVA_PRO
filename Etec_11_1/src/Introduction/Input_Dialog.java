
package Introduction;

import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Input_Dialog {

 
    public static void main(String[] args) {
        JFrame fram = new JFrame();
        int a,b,sum;
        a=Integer.parseInt(JOptionPane.showInputDialog(fram,"=> Pls Enter Value Of A : "));
        b=Integer.parseInt(JOptionPane.showInputDialog(fram,"=> Pls Enter Value Of B : "));
        sum=a+b;
        
        JOptionPane.showMessageDialog(null, "Sum Of A+ B = "+sum,"Examle#1",
                JOptionPane.PLAIN_MESSAGE);
    }
    
}
