
package Inheritance;

import java.util.Scanner;
//Sigle Inheritance
class Test1{
    protected int a,b;
}

class Test2 extends Test1{
    private int c;
    
    public void Input(){
        Scanner in= new Scanner(System.in);
        System.out.println("-------||| INPUT |||--------");
        System.out.print("Input A : ");
        a=in.nextInt();
        System.out.print("Input B : ");
        b=in.nextInt();
        System.out.print("Input C : ");
        c=in.nextInt(); 
    }
    public void Output(){
        System.out.println("A = "+a);
        System.out.println("B = "+b);
        System.out.println("C = "+c);
    }
}

public class Examle1 {

    
    public static void main(String[] args) {
       Test2 obj = new Test2();
       obj.Input();
       obj.Output();
    }
    
}
