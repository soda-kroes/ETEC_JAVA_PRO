
package OOP;

import java.util.Scanner;

class Test{
    private int a,b;
    //Default Constructor
    public Test() {
        a=10;
        b=5;
    }
    //Constructor Wiht Parameter
    public Test(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void Input(){
        Scanner in = new Scanner(System.in);
        System.out.println("----|| Input ||-------");
        System.out.print("Input A : ");
        a=in.nextInt();
        System.out.print("Input B : ");
        b=in.nextInt();
    }
    public int Sum(){
        return a+b;
    }
    public int Sub(){
        return a-b;
    }
    public void Output(){
        System.out.println("A = "+a);
        System.out.println("B = "+b);
        System.out.println("Sum = "+Sum());
        System.out.println("Sub = "+Sub());
    }
}
public class Ex3 {

   
    public static void main(String[] args) {
        System.out.println("---Use Default Constructor---");
        Test obj1 = new Test();
        obj1.Output();
        System.out.println("\n---Constructor With Parameter---");
        Test obj2 = new Test(50, 20);
        obj2.Output();
        obj1.Input();
        obj1.Output();
        
          
    }
    
}
