
package Hastable;

import java.util.Scanner;


public class Product {
    int code;
    String name;
    int qty;
    double price;
    //default constructor

    public Product() {
    }
    //constructor with parameter

    public Product(int code, String name, int qty, double price) {
        this.code = code;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }
    public void Input(){
        Scanner in = new Scanner(System.in);
        System.out.print("Pls Enter Code  : ");
        code=in.nextInt();
        System.out.print("Pls Enter Name  : ");
        name=in.next();
        System.out.print("Pls Enter Qty   : ");
        qty=in.nextInt();
        System.out.print("Pls Enter Price : ");
        price=in.nextDouble();
                
    }
    public void Output(){
        System.out.println(code+"\t "+name+"\t "+qty+"\t "+price+"$");
    }
     public void Header(){
        System.out.println("Code\t Name\t Qty\t Price");
    }
    
}
