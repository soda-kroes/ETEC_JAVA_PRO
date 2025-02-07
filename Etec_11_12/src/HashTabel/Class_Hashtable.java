
package HashTabel;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

class Product{
    int code;
    String name;
    int qty;
    double price;
    
    public Product(){
        
    }
    public Product(int code, String name, int qty, double price) {
        this.code = code;
        this.name = name;
        this.qty = qty;
        this.price = price;
    }
    public void Input(){
        Scanner in = new Scanner(System.in);
        System.out.print("Pls Input Code  : ");
        code=in.nextInt();
        System.out.print("Pls Input Name  : ");
        name=in.next();
        System.out.print("Pls Input Qty   : ");
        qty=in.nextInt();
        System.out.print("Pls Input Price : ");
        price=in.nextDouble();
    }
    public void Output(){
        System.out.println(code+"\t "+name+"\t "+qty+"\t "+price);
    }
}
public class Class_Hashtable {
    static void Header(){
        System.out.println("Code\t Name\t Qty\t Price");
        System.out.println("---------------------------");
    }

  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Hashtable<Integer,Product> list = new Hashtable<>();
        int option,i,n;
        Product pro = new Product();
        do{
            System.out.println("---||| Menu Choice |||---");
            System.out.println("[1]. Input ");
            System.out.println("[2]. Output ");
            System.out.println("[3]. Search ");
            System.out.println("[4]. Update ");
            System.out.println("[5]. Clear ");
            System.out.println("[6]. Exit ");
            System.out.println("--------------------------");
            System.out.print("Pls Choose One Option[1-6]: ");
            option=in.nextInt();
            switch(option){
                case 1:{
                    System.out.println("[1]. Input ");
                    System.out.print("Pls Enter Number Of Product : ");
                    n=in.nextInt();
                    for(i=0;i<n;i++){
                        System.out.println("---Product["+(i+1)+"---");
                        pro = new Product();
                        pro.Input();
                        list.put(i, pro);
                    }
                    System.out.println("Input Success.");
                }break;
                case 2:{
                    Header();
                    for(Map.Entry<Integer,Product>obj : list.entrySet()){
                        obj.getValue().Output();
                    }
                }break;
                case 3:{
                    int s_id;
                    boolean b=false;
                    System.out.println("Enter Id For Search : ");
                    s_id=in.nextInt();
                    for(Map.Entry<Integer,Product> obj : list.entrySet()){
                        if(s_id==obj.getValue().code){
                            Header();
                            obj.getValue().Output();
                            b=true;
                            System.out.println("Search Found.");
                        }
                    }
                    if(b==false){
                        System.out.println("Search Not Found.");
                    }
                    
                }break;
                
                case 4:{
                    int s_id;
                    boolean b=false;
                    System.out.println("Enter Id For Search : ");
                    s_id=in.nextInt();
                    for(Map.Entry<Integer,Product> obj : list.entrySet()){
                        if(s_id==obj.getValue().code){
                            System.out.println("---UPDATE DATA----");
                            obj.getValue().Input();
                            b=true;
                            System.out.println("Update Success.");
                        }
                    }
                    if(b==false){
                        System.out.println("Search Not Found.");
                    }
                    
                }break;
                case 5:{
                    list.clear();
                    System.out.println("Clear Success.");
                }break;
            }
            
        }while(option!=0);
       
    }
    
}
