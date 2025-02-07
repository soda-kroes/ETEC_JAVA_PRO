
package Inheritance;

import java.util.Scanner;
//sigle inheritance
class Test1{//base class ,super class
    protected int x,y,z;
    //inher data member
    //inher constructor
    //inher function member
}
class Test2 extends Test1{
    protected int a;
    
    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.print("Pls Enter A : ");
        a=in.nextInt();
        System.out.print("Pls Enter X : ");
        x=in.nextInt();
        System.out.print("Pls Enter Y : ");
        y=in.nextInt();
        System.out.print("Pls Enter Z : ");
        z=in.nextInt();
    }
    public void Output(){
        System.out.println("A = "+a);
        System.out.println("X = "+x);
        System.out.println("Y = "+y);
        System.out.println("Z = "+z);
    }
    
}

public class sigleinher {

    
    public static void main(String[] args) {
        Test2 obj = new Test2();
        obj.input();
        obj.Output();
    }
    
}
