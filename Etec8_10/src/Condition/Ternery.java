
package Condition;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ternery {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char option;
        System.out.print("Pls Enter Option : ");
        option=in.next().charAt(0);
        switch(option){
            case 'a':
            case 'A':{
                 System.out.println("Color Red.");
            }break;
            
            case 'b':
            case 'B':{
                 System.out.println("Color Blue.");
            }break;
            
           
            default:{
                System.out.println("This Option Not Found.");
            }break;
        }
      
    } 
}
