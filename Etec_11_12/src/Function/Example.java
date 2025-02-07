
package Function;

import java.util.Scanner;

public class Example {
   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dec;
        System.out.println("Decimal To Binary");
        System.out.println("Enter Decimal Number : ");
        dec=in.nextInt();
        System.out.println(Integer.toBinaryString(dec));  
        
        
        System.out.println("Binary To Decimal");
        String binary;
        System.out.println("Enter Binary Number : ");
        binary=in.next();
        int decimal=Integer.parseInt(binary,2);  
        System.out.println(decimal);  
        
        
         System.out.println("Decimal To Octal");
         System.out.println("Enter Decimal Number : ");
         int dec_octal=in.nextInt();
        System.out.println(Integer.toOctalString(dec_octal));  
        
         System.out.println("Octal To Decimal");
        
        System.out.println("Enter Octal Number : ");
        String octalString=in.next();
        //Converting octal number into decimal  
        int deciml=Integer.parseInt(octalString,8);  
        //Printing converted decimal number  
        System.out.println(deciml);  
        
          System.out.println("Decimal To Hexa");
          System.out.println("Enter Decimal Num :  ");
          int d=in.nextInt();
          System.out.println(Integer.toHexString(d)); 
          
          
           System.out.println("Hexa To Decimal");
          
        String hex = in.next();
        System.out.println("Enter Hexa : ");
        int decima=Integer.parseInt(hex,16);  
        System.out.println(decima);  
       
        
         
        
        
    }
    
}
