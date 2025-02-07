
package HashTabel;

import java.util.Hashtable;
import java.util.Map;

class Product{
    int code;
    String name;
    int qty;
    float price;

    public Product(int code, String name, int qty, float price) {
        this.code = code;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }
}


public class HashTabel_With_Class {

    public static void main(String[] args) {
        Hashtable<Integer,Product> list = new Hashtable<>();
        
        Product pro1 = new Product(1001, "Coca", 10, 1.3f);
        Product pro2 = new Product(1002, "Sting", 11, 1.3f);
        Product pro3 = new Product(1003, "Coffe", 12, 1.3f);
        Product pro4 = new Product(1004, "Pepsi", 14, 1.3f);
        list.put(4, pro1);
        list.put(3, pro2);
        list.put(2, pro3);
        list.put(1, pro4);
        
        System.out.println("============== Product =================");
        System.out.println("Code\t Name\t Qty\t Price");
        System.out.println("--------------------------------");
        
        for(Map.Entry all:list.entrySet()){
            Product pro=(Product) all.getValue();
            System.out.println(pro.code+"\t "+pro.name+"\t "+pro.qty+"\t "+pro.price);
        }
        
        list.remove(3);
        System.out.println("========== After Remove ==============");
         for(Map.Entry all:list.entrySet()){
            Product pro=(Product) all.getValue();
            System.out.println(pro.code+"\t "+pro.name+"\t "+pro.qty+"\t "+pro.price);
        }
        
    }
    
}
