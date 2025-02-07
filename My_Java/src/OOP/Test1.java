
package OOP;

import java.util.Scanner;

class Operator{
    Scanner in = new Scanner(System.in);
    private int x,y;
    public void Input(){
        System.out.println("======= Input =======");
        System.out.print("=> Input X : ");
        x=in.nextInt();
        System.out.print("=> Input Y : ");
        y=in.nextInt();
        
    }
    public int Sum(){
        return x+y;
    }
    public int Sub(){
        return x-y;
    }
    public int Mul(){
        return x*y;
    }
    public int Div(){
        return x/y;
    }
    public void Output(){
        System.out.println("====== Output =====");
        System.out.println("Sum = "+Sum());
        System.out.println("Sub = "+Sub());
        System.out.println("Mul = "+Mul());
        System.out.println("Div = "+Div());
    }
}

public class Test1 {

    public static void main(String[] args) {
        Operator obj = new Operator();
        obj.Input();
        obj.Output();
        
        
    }
    
}
