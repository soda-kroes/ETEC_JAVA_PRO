
package Loop;

import java.util.Scanner;


public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int option;
        do{
            System.out.println("-------------||| M E N U |||-----------");
            System.out.println("[1].Convert Decimal to Binary");
            System.out.println("[2].Convert Binary to  Decimal");
            System.out.println("[3].Convert Decimal to Octal");
            System.out.println("[4].Convert Ocatal  to Decimal");
            System.out.println("[5].Convert Decimal to Hexadecimal");
            System.out.println("[6].Convert Hexadecimal to  Decimal");
            System.out.println("[7].Exit Application");
            System.out.println("--------------(^_^)--------------------");
            System.out.print("=> Pls Choose One Option[1-7] : ");
            option=scan.nextInt();
            switch(option){
                case 1:{
                    System.out.println("[1].Convert Decimal to Binary");
                    System.out.print("Pls Enter Decimal Number : ");
                    int dec = scan.nextInt();
                    System.out.println("Binary Number Is: "+Integer.toBinaryString(dec));
                    
                }break;
                case 2:{
                     System.out.println("[2].Convert Binary to  Decimal");
                     System.out.print("Pls Enter Binary Number : ");
                     String bin = scan.next();
                     int dec = Integer.parseInt(bin, 2);
                     System.out.println("Deimal Number Is: "+dec);
                }break;
                case 3:{
                     System.out.println("[3].Convert Decimal to Octal");
                     System.out.print("Pls Enter Decimal Number: ");
                     int dec = scan.nextInt();
                     System.out.println("Octal Number Is: "+Integer.toOctalString(dec));
                    
                }break;
                case 4:{
                    System.out.println("[4].Convert Octal  to Decimal");
                    System.out.print("Pls Enter Octal Number : ");
                    String octal = scan.next();
                    int dec = Integer.parseInt(octal, 8);
                    System.out.println("Deimal Number Is: "+dec);
                    
                    
                }break;
            }
            
        }while(option!=0);
        
        
        
    }
    
}
