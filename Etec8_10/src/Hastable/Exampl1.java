
package Hastable;


import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
public class Exampl1 {
    
    public static void main(String[] args) {
        int option;
        Product pro = new Product();
        Hashtable<Integer,Product> list = new Hashtable<>();
        int n;
        
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("---||| Menu Choice |||---");
            System.out.println("[1].Input");
            System.out.println("[2].Output");
            System.out.println("[3].Search");
            System.out.println("[4].Update");
            System.out.println("[5].Clear");
            System.out.println("[6].Exit");
            System.out.println("**************************");
            System.out.print("Pls Choose One Option[1-6]: ");
            option=in.nextInt();
            switch(option){
                case 1:{
                    System.out.println("[1].Input");
                    System.out.print("Pls Enter Number Of Product : ");
                    n=in.nextInt();
                    for(int i=0;i<n;i++){
                        System.out.println("---Product[#"+(i+1)+"]------");
                        pro = new Product();
                        pro.Input();
                        list.put(i, pro);
                    }
                    System.out.println("Input Completed."); 
                }break;
                case 2:{
                    System.out.println("[2].Output");
                    pro.Header();
                    for(Map.Entry<Integer,Product> obj: list.entrySet()){
                        obj.getValue().Output();
                    } 
                }break;
                case 3:{
                     boolean ischeck=false;
                     System.out.println("[3].Search");
                     int s_code;
                     System.out.print("Pls Enter Code For Search Product: ");
                     s_code=in.nextInt();
                     for(Map.Entry<Integer,Product> obj: list.entrySet()){
                        if(s_code==obj.getValue().code){
                            obj.getValue().Output();
                            ischeck=true;
                            System.out.println("Search Found.");
                        }
                    } 
                     if(ischeck==false){
                         System.out.println("Search Not Found.");
                     }
                     
                    
                    
                }break;
                case 4:{
                    boolean ischeck=false;
                     System.out.println("[3].Search");
                     int s_code;
                     System.out.print("Pls Enter Code For Update Product: ");
                     s_code=in.nextInt();
                     for(Map.Entry<Integer,Product> obj: list.entrySet()){
                        if(s_code==obj.getValue().code){
                            System.out.println("---UPDATE----");
                            obj.getValue().Input();
                            ischeck=true;
                            System.out.println("Update Completed.");
                        }
                    } 
                     if(ischeck==false){
                         System.out.println("Search Not Found.");
                     }
                     
                    
                    
                }break;
                case 5:{
                    list.clear();
                    System.out.println("Clear Success.");
                    
                }break;
                case 6:{
                    System.exit(0);
                    
                }break;
                default:{
                    System.out.println("Sorry This Option Not Found.Pls Try Again........!");
                }
                
            }
            
            
        }while(option!=6);
        
    }
    
}

//product code name qty price
//input output search update clear