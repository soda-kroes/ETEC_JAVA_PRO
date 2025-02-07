
package Loop;

import java.awt.SystemColor;
import java.util.Scanner;


public class ConvertNumber {

   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int option;
        do{
            System.out.println("-----------|||| Menu Choice ||||----------");
            System.out.println("[1].=> Convert Decimal to Binary");
            System.out.println("[2].=> Convert Binary  to Decimal");
            System.out.println("[3].=> Convert Decimal to Octal");
            System.out.println("[4].=> Convert Octal  to  Decimal");
            System.out.println("[5].=> Convert Decimal to Hexadecimal");
            System.out.println("[6].=> Convert Hexadecimal  to  Decimal");
            System.out.println("[7] => Exit Application");
            System.out.println("------------------(^_^)--------------------");
            System.out.print("Pls Choose One Option[1-7]: ");
            option=in.nextInt();
            switch(option){
                case 1:{
                    System.out.println("[1].=> Convert Decimal to Binary");
                    System.out.print("=> Pls Enter Decimal Number : ");
                    int dec=in.nextInt();
                    System.err.println("Binary Number is: "+Integer.toBinaryString(dec));
                    
                }break;
                case 2:{
                    System.out.println("[2].=> Convert Binary  to Decimal");
                    System.out.print("Pls Enter Binary Number : ");
                    String bin=in.next();
                    int dec=Integer.parseInt(bin, 2);
                    System.err.println("Decimal Number is: "+dec);
                    
                }break;
                case 3:{
                      System.out.println("[3].=> Convert Decimal to Octal");
                      System.out.print("Pls Enter Decimal Number : ");
                      int dec=in.nextInt();
                      System.err.println("Octal Number is: "+Integer.toOctalString(dec));
                    
                }break;
                case 4:{
                     System.out.println("[4].=> Convert Octal  to  Decimal");
                     System.out.print("Pls Enter Octal Number : ");
                     String oct=in.next();
                     int dec=Integer.parseInt(oct, 8);
                     System.err.println("Decimal Number is: "+dec);
                     
                    
                }break;
            }
            
            
        }while(option!=0);
    }
    
}
