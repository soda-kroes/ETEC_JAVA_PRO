
package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Test1 { 
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        int i,n=0,option,arr;
        do{
            System.out.println("-----||| M E N U |||----");
            System.out.println("[1]. => Input");
            System.out.println("[2]. => View");
            System.out.println("[3]. => Search");
            System.out.println("[4]. => Update");
            System.out.println("[5]. => Remove");
            System.out.println("[6]. => Add More");
            System.out.println("[7]. => Sort");
            System.out.println("[8]. => Clear");
            System.out.println("[9]. => Exit");
            System.out.println("----------(^_^---------)");
            
            System.out.print("Pls Choose One Option: ");
            option=in.nextInt();
            switch(option){
                case 1:{
                    System.out.println("[1]. => Input");
                    System.out.print("Pls Enter Number Of Array: ");
                    n=in.nextInt();
                    for(i=0;i<n;i++){
                        System.out.print("Enter Array: ");
                        arr=in.nextInt();
                        list.add(arr);
                        
                    }
                    System.out.println("Input Success.");

                }break;
                case 2:{
                     System.out.println("[2]. => View");
                     System.out.print("Value Of Array: ");
                     for(i=0;i<list.size();i++){
                         System.out.print(list.get(i)+" ");
                     }
                     System.out.println("");
                    
                }break;
                case 3:{
                    System.out.println("[3]. => Search");
                    int s_value;
                    System.out.print("Pls Enter Number For Search : ");
                    s_value=in.nextInt();
                    boolean search = list.contains(s_value);
                    if(search==true){
                        System.out.println(s_value+" is Search Found.");
                    }
                    else{
                        System.out.println(s_value+" is search not found.");
                    }
                    
                }break;
                case 4:{
                    int u_value;
                    System.out.print("Pls Enter Value For Update : ");
                    u_value=in.nextInt();
                    boolean update = list.contains(u_value);
                    if(update==true){
                        System.out.println("---UPDATE----");
                        System.out.print("Pls Enter New Array: ");
                        int n_arr=in.nextInt();
                        list.add(n_arr);
                        System.out.println("Update Success.");
                    }
                    else{
                        System.out.println("Update Not Success.");
                    }
                }break;
                case 5:{
                    int d_arr;
                    System.out.println("Pls Enter Value For Delete : ");
                    d_arr=in.nextInt();
                    boolean delete = list.contains(d_arr);
                    if(delete==true){
                        list.remove(d_arr);
                        System.out.println("Delete Success.");
                    }
                    else{
                        System.out.println("Delete Not Success.");
                    }
                }break;
                case 6:{
                    int add;
                     System.out.println("[6]. => Add More");
                     System.out.print("Pls Enter Number Of Array: ");
                    add=in.nextInt();
                    for(i=n;i<n+add;i++){
                        System.out.print("Enter Array: ");
                        arr=in.nextInt();
                        list.add(arr);
                        
                    }
                    n=n+add;
                    System.out.println("Add  Success.");
                    
                }break;
                case 7:{
                    System.out.println("[7]. => Sort");
                    Collections.sort(list);//sort small to big
                    Collections.reverse(list);//sort big to small
                    System.out.println("Sort Success.");
                    
                }break;
                case 8:{
                    list.clear();
                    System.out.println("Clear Success.");
                }break;
                case 9:{
                    System.err.println("Goodbye.......!");
                    System.exit(0);
                }break;
                default:{
                    System.err.println("This Option Not Found.");
                }break;
                
            }
            
        }while(option!=9);
        
        
        
    }
}
