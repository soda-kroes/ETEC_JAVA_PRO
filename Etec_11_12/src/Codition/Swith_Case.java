
package Codition;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Swith_Case {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Pls Enter Option : ");
        int op=in.nextInt();
        switch(op){
            case 1:{
                System.out.println("Monday");
            }break;
            case 2:{
                System.out.println("Tuesday");
            }break;
              case 3:{
                System.out.println("Wednesday");
            }break;
              case 4:{
                System.out.println("Thursday");
            }break;
              case 5:{
                System.out.println("Friday");
            }break;
              case 6:{
                System.out.println("Saturday");
            }break;
              case 7:{
                  JOptionPane.showMessageDialog(null, "Sunday");
            }break;
        }
    }
    
}
