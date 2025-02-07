
package Poly;

import java.util.Scanner;

abstract class Product{
    abstract void Input();
    abstract double Total();
    abstract void Output();
    
}
class Etec extends Product{ 
    int code,qty;
    String name;
    double price;

    @Override
    void Input() {
        Scanner in = new Scanner(System.in);
        System.out.println("-------||| Input Product |||--------");
        System.out.print("=> Pls Enter Code : ");
        code=in.nextInt();
        System.out.print("=> Pls Enter Name : ");
        name=in.next();
        System.out.print("=> Pls Enter Qty  : ");
        qty=in.nextInt();
        System.out.print("=> Pls Enter Price : ");
        price=in.nextDouble();
       
    }

    @Override
    void Output() {
        System.out.println(code+"\t "+name+"\t "+qty+"\t "+price+"\t "+Total());
        
    }

    @Override
    double Total() {
        return price*qty;
    }
    
}
public class Ex2 {
    public static void main(String[] args) {
        Etec obj = new Etec();
        obj.Input();
        obj.Output();
    }
    
}
