
package Loop;

import java.util.Scanner;


public class ConvertNumber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int option;
        String ans;
        do{
            System.out.println("---------||| Menu Choice |||----------");
            System.out.println("[1]. Convert Decimal To Binary");
            System.out.println("[2]. Convert Binary  To Decimal");
            System.out.println("[3]. Convert Decimal To Octal");
            System.out.println("[4]. Convert Octal   To Decimal");
            System.out.println("[5]. Convert Decimal To Hexadecimal");
            System.out.println("[6]. Convert Hexadecimal To Decimal");
            System.out.println("[7]. Exit Application");
            System.out.println("-----------------(^_^)---------------");
            System.out.print("=> Pls Choose One Option[1-7] : ");
            option=in.nextInt();
            switch(option){
                case 1:{
                    System.out.println("[1]. Convert Decimal To Binary");
                    System.out.print("Pls Enter Decimal Number : ");
                    int dec=in.nextInt();
                    System.err.println("Binary Number is : "+Integer.toBinaryString(dec));
                     //System.out.println(Integer.toBinaryString(dec));
                    
                }break;
                
                case 2:{
                     System.out.println("[2]. Convert Binary  To Decimal");
                     System.out.print("=> Pls Enter Binary Number : ");
                     String bin=in.next();
                     int dec=Integer.parseInt(bin,2);  
                     System.err.println("Decimal Number is : "+dec);  
                     
                }break;
                
                case 3:{
                     System.out.println("[3]. Convert Decimal To Octal");
                     System.out.print("=> Pls Enter Decimal Number : ");
                     int dec=in.nextInt();
                     System.err.println("Octal Number is : "+Integer.toOctalString(dec));
                      
                    
                }break;
                case 4:{
                     System.out.println("[4]. Convert Octal   To Decimal");
                     System.out.print("=> Pls Enter Octal Number : ");
                     String octal=in.next();
                     int deciml=Integer.parseInt(octal,8);  
                     System.err.println("Decimal Number is : "+deciml); 
                    
                }break;
                
                case 5:{
                     System.out.println("[5]. Convert Decimal To Hexadecimal");
                     System.out.print("=> Pls Enter Decimal Number : ");
                     int dec=in.nextInt();
                     System.err.println("Hexadecimal Number is : "+Integer.toHexString(dec));
                }break;
                case 6:{
                    System.out.println("[6]. Convert Hexadecimal To Decimal");
                    System.out.print("=> Pls Enter Hexadecimal Number : ");
                    String hex = in.next();
                    System.out.println("Enter Hexadecimal Number : ");
                    int dec=Integer.parseInt(hex,16);  
                    System.err.println("Decimal Number is : "+dec);
                }break;
            }
            
            System.out.print("Pls Enter 'Yes' To Continues : ");
            ans=in.next();
                    
            
        }while(ans.equalsIgnoreCase("yes"));
    }
    
}
