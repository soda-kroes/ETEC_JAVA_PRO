
package introduction;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
       int code;
       String name;
       int qty;
       float price;
       double total;
        Scanner cin = new Scanner(System.in);
        
        System.out.println("----||| Input Product |||------");
        System.out.print("=> Pls Enter Code  : ");
        code=cin.nextInt();
        System.out.print("=> Pls Enter Name  : ");
        name=cin.next();
        System.out.print("=> Pls Enter Qty   : ");
        qty=cin.nextInt();
        System.out.print("=> Pls Enter Price : ");
        price=cin.nextFloat();
        total = price*qty;
        
        System.out.println("----||| Recipt |||------");
        System.out.println("Code\t Name\t Qty\t Price\t Total");
        System.out.println(code+"\t "+name+"\t "+qty+"\t "+price+"\t "+total+"USD");
    }
    
}
