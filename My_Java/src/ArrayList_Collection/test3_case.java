
package ArrayList_Collection;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;


public class test3_case {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>(); 
        int op,i,n,array;
        String ans;
        do{
            System.out.println("========= M E N U ==========");
            System.out.println("[1]. => Input ");
            System.out.println("[2]. => Output ");
            System.out.println("[3]. => Search ");
            System.out.println("[4]. => Update ");
            System.out.println("[5]. => Delete ");
            System.out.println("[6]. => Add ");
            System.out.println("[7]. => Sort  ");
            System.out.println("[8]. => Clear ");
            System.out.println("[9]. => Exit ");
            System.out.println("============(^_^)============");
            System.out.print("=> Please Choose One Optionp[1-9] : ");
            op=in.nextInt();
            switch(op){
                case 1:{
                    System.out.println("[1]. => Input ");
                    System.out.print("=> Input Size Of Array : ");
                    n=in.nextInt();
                    for(i=0;i<n;i++){
                        System.out.print("=> Enter Array["+(i+1)+"] : ");
                        array=in.nextInt();
                        list.add(array);

                    }
                    System.out.println("Input Success.");
                    
            }break;
                case 2:{
                     System.out.println("[2]. => Output ");
                     for(i=0;i<list.size();i++){
                         System.out.println("List Of Array["+(i+1)+"] : "+list.get(i));
                     }
                    
                }break;
                
                case 3:{
                    System.out.println("[3]. => Search ");
                    int s_value;
                    System.out.print("=> Input Value For Search : ");
                    s_value=in.nextInt();
                    boolean search = list.contains(s_value);
                    if(search==true){
                        System.out.println(s_value+" is search found.");
                    }
                    else{
                        System.out.println(s_value+" is search not found.");
                    }
                }break;
                
                case 4:{
                    System.out.println("[4]. => Update ");
                    int u_value,b=0;
                    System.out.print("=> Input Value For Update : ");
                    u_value=in.nextInt();
                    for(i=0;i<list.size();i++){
                        if(u_value == list.get(i)){
                            System.out.println("=== Update Value ===");
                            System.out.print("=> Enter New Array : ");
                            int n_value=in.nextInt();
                            list.set(i, n_value);
                            System.out.println("Update Success");
                            b=1;
                        }
                    }
                    if(b==0){
                        System.out.println("Update Not Success.");
                    }
                    
                }break;
                case 5:{
                    System.out.println("[5]. => Delete ");
                    int d_value;
                    boolean b=false;
                    System.out.print("=> Input Value For Delete : ");
                    d_value=in.nextInt();
                    for(i=0;i<list.size();i++){
                        if(d_value==list.get(i)){
                            list.remove(i);
                            System.out.println("Delete Success.");
                            b=true;
                        }
                    }
                    if(b==false){
                        System.out.println("Delete Not Success.");
                    }
                    
                }break;
                case 6:{
                    System.out.println("[1]. => Input ");
                    System.out.print("=> Input Size Of Array to Add : ");
                    n=in.nextInt();
                    for(i=0;i<n;i++){
                        System.out.print("=> Enter Array["+(i+1)+"] : ");
                        array=in.nextInt();
                        list.add(array);

                    }
                    System.out.println("Add Success.");
                    
                }break;
                case 7:{
                    System.out.println("[7]. => Sort  ");
                    Collections.sort(list);
                    System.out.println("Sort Success.");
                    
                }break;
                case 8:{
                   
                    System.out.println("[8]. => Clear ");
                    list.clear();
                    System.out.println("Clear Success.");
                    
                }break;
                case 9:{
                    System.exit(0);
                    
                    
                }break;
                default:{
                    System.out.println("This Option Not Found.");
                    
                }break;
            
            
        }
        System.out.print("Please Enter 'Yes' To Continues: ");
         ans=in.next();
            
    }while(ans.equalsIgnoreCase("yes"));
    }
}
