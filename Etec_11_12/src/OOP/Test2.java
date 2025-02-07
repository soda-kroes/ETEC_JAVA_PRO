
package OOP;

import java.util.Scanner;

class Demo{
    public int a,b;

    public Demo() {
        a=20;
        b=10;
    }
    public Demo(int a,int b){
        this.a=a;
        this.b=b;
    }
    public void Input(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter A: ");
        a=in.nextInt();
        System.out.print("Enter B: ");
        b=in.nextInt();
    }
    
    
    public void Output(){
        System.out.println("A = "+a);
        System.out.println("B = "+b);
        System.out.println("A + B = "+(a+b));
    }
}

public class Test2 {
    public static void main(String[] args) {
        System.out.println("----Use Default Constructor-----");
        Demo obj = new Demo();
        obj.Output();
        System.out.println("----Use Constructor With Parameter-----");
        Demo obj1 = new Demo(2, 4);
        obj1.Output();
        System.out.println("----Use Function Input-----");
        obj.Input();
        obj.Output();
        
    }
    
}
