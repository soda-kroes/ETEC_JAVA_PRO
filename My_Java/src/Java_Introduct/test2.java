
package Java_Introduct;

import java.util.Scanner;

public class test2 {

    public static void main(String[] args) {
        int num1,num2;
        Scanner scanf = new Scanner(System.in);
        
        System.out.print("=> Input Value1 : ");
        num1=scanf.nextInt();
        System.out.print("=> Input Value2 : ");
        num2=scanf.nextInt();
        System.out.println("****************************");
        System.out.println("Value1 = "+num1);
        System.out.println("Value2 = "+num2);
        System.out.println("Sum = "+(num1+num2));
        int sum = num1+num2;
        System.out.println(num1+" + "+num2 + " = "+sum);
        
       
    }
    
}
