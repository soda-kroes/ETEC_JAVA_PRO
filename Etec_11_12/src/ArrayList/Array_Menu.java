
package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array_Menu {

    public static void main(String[] args) {
        Student stu[] = new Student[50];
        Scanner in = new Scanner(System.in);
         int option,i,n=0,arr;
         ArrayList<Student> list = new ArrayList<>();
        do{
            System.out.println("----||| M E N U |||---");
            System.out.println("[1]. Input");
            System.out.println("[2]. Show");
            System.out.println("[3]. Search");
            System.out.println("[4]. Update");
            System.out.println("[5]. Delete");
            System.out.println("[6]. Add More");
            System.out.println("[7]. Sort");
            System.out.println("[8]. Clear");
            System.out.println("[9]. Exit");
            System.out.println("--------------------");
            System.out.print("=> Pls Choose Option[1-8]: ");
            option=in.nextInt();
            switch(option){
                case 1:{
                     System.out.println("[1]. Input");
                     System.out.print("=> Pls Enter Size Of Array : ");
                     n=in.nextInt();
                     for(i=0;i<n;i++){
                         stu.INput();
                         list.add(stu);
                         
                         System.out.print("=> Enter Array["+i+"] = ");
                         arr=in.nextInt();
                         list.add(arr);    
                     }
                     System.out.println("Input Successfully.");
                }break;
                case 2:{
                     System.out.println("[2]. Show");
                     for(i=0;i<list.size();i++){
                         System.out.println("ArrayList["+i+"] = "+list.get(i));
                         
                     }
                    
                }break;
                case 3:{
                    System.out.println("[3]. Search");
                    int s_value;
                    System.out.print("=> Pls Enter Number For Search : ");
                    s_value=in.nextInt();
                    boolean search = list.contains(s_value);
                    if(search==true){
                        System.out.println(s_value+" is search found.");
                    }
                    else {
                        System.out.println(s_value+" is search not found.");
                    }
                }break;
                case 4:{
                     int b=0;
                     System.out.println("[4]. Update");
                     int u_value;
                     System.out.print("Pls Enter Number For Update : ");
                     u_value=in.nextInt();
                     for(i=0;i<list.size();i++){
                         if(u_value==list.get(i)){
                             System.out.println("---UPDATE----");
                             System.out.print("Enter New Array["+i+"] = ");
                             int n_value=in.nextInt();
                             list.set(i, n_value);
                             System.out.println("UPdate Successfully.");
                             b=1;
                         }
                     }
                     if(b==0){
                         System.out.println("Update Not Success.");
                         
                     }
                    
                }break;
                case 5:{
                    boolean b=false;
                      System.out.println("[5]. Delete");
                      int d_value;
                      System.out.print("Pls Enter Value For Delete : ");
                      d_value=in.nextInt();
                      for(i=0;i<list.size();i++){
                          if(d_value==list.get(i)){
                              list.remove(i);
                              System.out.println("Delete Success");
                              b=true;
                          }
                      }
                      if(b==false){
                          System.out.println("Delete Not Success.");
                      }
                    
                }break;
                case 6: {
                     System.out.println("[6]. Add More");
                     System.out.print("=> Pls Enter Size Of Array : ");
                     int add=in.nextInt();
                     for(i=n;i<n+add;i++){
                         System.out.print("=> Enter Array["+i+"] = ");
                         arr=in.nextInt();
                         list.add(arr);    
                     }
                     System.out.println("Input Successfully.");
                }break;
                case 7:{
                    //Collections.sort(list);
                    Collections.reverse(list);
                    System.out.println("Sort Success.");
                }break;
                case 8:{
                     System.out.println("[8]. Clear");
                     list.clear();
                     System.out.println("Clear Success.");
                    
                }break;
                case 9:{
                    
                }break;
                default:{
                    System.err.println("This Option Not Found.");
                }break;
                
            }
            
        }while(option!=9);
       
    }
    
}
