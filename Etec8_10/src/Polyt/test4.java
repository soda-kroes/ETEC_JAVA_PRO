
package Polyt;

import java.util.Scanner;

abstract class  Product{
    public abstract void Input();
    public abstract int  Total();
    public abstract void Output();

}
class sub_product extends Product{
    String code,name;
    int qty;
    double price;

    @Override
    public void Input() {
        Scanner in = new Scanner(System.in);
                
    }

    @Override
    public int Total() {
        return price*qty;
        
    }

    @Override
    public void Output() {
    }
   
}


public class test4 {

   
    public static void main(String[] args) {
        sub_product obj = new sub_product();
        obj.Input();
        obj.Output();
    }
    
}
