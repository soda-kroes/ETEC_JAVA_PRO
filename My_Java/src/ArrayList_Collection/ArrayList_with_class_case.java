
package ArrayList_Collection;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayList_with_class_case {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<StudenT> list = new ArrayList<>();
        StudenT stu[] = new StudenT[50];
        int i,n = 0,op;
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
                     System.out.print("=> Input Number Of Student : ");
                     n=in.nextInt();
                     for(i=0;i<n;i++){
                         System.out.println("==== Student["+(i+1)+"] =====");                  
                         stu[i] = new StudenT();
                         stu[i].Input();
                         list.add(stu[i]);
                     }
                     System.out.println("Input Success.");
                }break;
                
                case 2:{
                    System.out.println("[2]. => Output ");
                    System.out.println("======== Student Information ==========");
                    System.out.println("Id\t Name\t Sex\t Score");
                    System.out.println("----------------------------------");
                    for(i=0;i<list.size();i++){
                        list.get(i).Output();
                        
                    }
                }break;
                case 3:{
                    int b=0;
                    System.out.println("[3]. => Search ");
                    String s_name;
                    System.out.print("=> Input Name For Search : ");
                    s_name=in.next();
                    for(i=0;i<list.size();i++){
                        if(s_name.equalsIgnoreCase(list.get(i).getName())){
                            b=1;
                            list.get(i).Output();
                            
                            
                        }
                    }
                    
                }break;
                case 4:{
                    StudenT new_stu = new StudenT();
                     System.out.println("[4]. => Update ");
                     int s_id,b=0;
                     System.out.print("=> Input Id For Update : ");
                     s_id=in.nextInt();
                     for(i=0;i<list.size();i++){
                         if(s_id == list.get(i).getId()){
                             b=1;
                              System.out.println("======== Student Information ==========");
                            System.out.println("Id\t Name\t Sex\t Score");
                            System.out.println("---------------------------");
                            list.get(i).Output();
                            System.out.println("== Input New Data ==");
                            new_stu.Input();
                            list.set(i, new_stu);
                            System.out.println("Update Success.");
                             
                         }
                         
                     }
                     if(b==0){
                         System.out.println("Update Not Success.");
                     }
                    
                }break;
                case 5:{
                    int b=0;
                    System.out.println("[5]. => Delete ");
                    int d_id;
                    System.out.print("=> Input Id For Delete : ");
                    d_id=in.nextInt();
                    for(i=0;i<list.size();i++){
                        if(d_id == list.get(i).getId()){
                            b=1;
                            list.remove(i);
                            System.out.println("Delete Successfully.");
                        }
                    }
                    if(b==0){
                        System.out.println("Delete Not Successfully.");
                    }
                }break;
                case 6:{
                    System.out.println("[6]. => Add ");
                    int add;
                    System.out.print("=> Input Number Of Student For Add : ");
                    add=in.nextInt();
                    for(i=n;i<n+add;i++){
                        System.out.println("==== Student["+(i+1)+"] ====");
                        stu[i] = new StudenT();
                        stu[i].Input();
                        list.add(stu[i]);
                        System.out.println("Add Successfully.");
                        
                    }
                    
                }break;
                case 7:{
                    System.out.println("[7]. => Sort  ");
                    Collections.sort(list, Comparator.comparing(StudenT::getId));
                    System.out.println("Sort Successfully.");
                }break;
                case 8:{
                     System.out.println("[8]. => Clear ");
                     list.clear();
                     System.out.println("Clear Data Successfully.");
                }break;
            }
            System.out.print("Please Enter Yes To Continues: ");
            ans=in.next();
            
            
        }while(ans.equalsIgnoreCase("yes")); 
                
        
    }
    
}
