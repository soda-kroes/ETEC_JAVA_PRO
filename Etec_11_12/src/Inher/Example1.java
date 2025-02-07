
package Inher;

import java.util.Scanner;

class Test1{//Base Class,Super Class
    protected int a,b,c;   
}

class Test2 extends Test1{//Sub Class
    protected int d;
    
    public void Input(){
        Scanner in = new Scanner(System.in);
        System.out.print("=> Pls Enter A : ");
        a=in.nextInt();
        System.out.print("=> Pls Enter B : ");
        b=in.nextInt();
        System.out.print("=> Pls Enter C : ");
        c=in.nextInt();
        System.out.print("=> Pls Enter D : ");
        d=in.nextInt();
    }
    int Sum(){
        return a+b+c+d;
    }
    public void Output(){
        System.out.println("A = "+a);
        System.out.println("B = "+b);
        System.out.println("C = "+c);
        System.out.println("D = "+d);
       // System.out.println("Sum = "+Sum());
    }a
}

public class Example1 {

    public static void main(String[] args) {
        Test2 obj = new Test2();
        obj.Input();
        obj.Output();
        System.out.println("Sum = "+obj.Sum());
    }
    
}
