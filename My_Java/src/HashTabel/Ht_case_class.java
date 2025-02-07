
package HashTabel;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

class Product{
    int code;
    String name;
    int qty;
    double price;

    public Product() {
    }

    public Product(int code, String name, int qty, double price) {
        this.code = code;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }
    void Input(){
        Scanner in = new Scanner(System.in);
        System.out.print("=> Enter Code : ");
        code=in.nextInt();
        System.out.print("=> Enter Name : ");
        name=in.next();
        System.out.print("=> Enter Qty  : ");
        qty=in.nextInt();
        System.out.print("=> Enter Price : ");
        price=in.nextDouble();    
    }
    void Output(){
        System.out.println(code+"\t "+name+"\t "+qty+"\t "+price);
    }
    
    
}

public class Ht_case_class {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Hashtable<Integer,Product> ht = new Hashtable<>();
        Product pro = new Product();
        int op=0,i,n;
        do{
            System.out.println("1. Input");
            System.out.println("2. Output");
            System.out.println("3. Search");
            System.out.println("4. Update");
            System.out.println("5. Clear");
            System.out.println("6. Exit");
            System.out.print("Pls Choose One Option : ");
            op=in.nextInt();
            switch(op){
                case 1:{
                     System.out.println("1. Input");
                     System.out.print("=> Pls Enter Number Of Product : ");
                     n=in.nextInt();
                     for(i=0;i<n;i++){
                         System.out.println("----[Product#"+(i+1)+"]----");
                         pro = new Product();
                         pro.Input();
                         ht.put(i, pro);
                     }
                     System.out.println("Input Success.");
                    
                }break;
                case 2:{
                     System.out.println("2. Output");
                     for(Map.Entry<Integer,Product> m : ht.entrySet()){
                         m.getValue().Output();
                     }
                     
                    
                }break;
                case 3:{
                     System.out.println("3. Search");
                     int s_code;
                     System.out.println("=> Pls Enter Code For Search : ");
                     s_code=in.nextInt();
                     for(Map.Entry<Integer,Product> m : ht.entrySet()){
                         if(s_code==m.getValue().code){
                             m.getValue().Output();
                             System.out.println("Search Found.");
                         }
                     }
                    
                }break;
                case 4:{
                      System.out.println("3. Search");
                     int s_code;
                     System.out.println("=> Pls Enter Code For Search : ");
                     s_code=in.nextInt();
                     for(Map.Entry<Integer,Product> m : ht.entrySet()){
                         if(s_code==m.getValue().code){
                             m.getValue().Input();
                             System.out.println("Search Found.");
                         }
                     }
                    
                }break;
            }
            
            
        }while(op!=6);
                
        
    }
    
}
