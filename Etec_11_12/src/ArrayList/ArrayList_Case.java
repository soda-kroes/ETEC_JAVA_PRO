
package ArrayList;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;


public class ArrayList_Case {
   

 
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        ArrayList<Students> list = new ArrayList<>();
        int option,i,n=0;
        Students stu[] = new Students[50];
        
        do{
            System.out.println("-----||| M E N U |||----");
            System.out.println("[1].=> Input");
            System.out.println("[2].=> Output");
            System.out.println("[3].=> Search");
            System.out.println("[4].=> Update");
            System.out.println("[5].=> Delete");
            System.out.println("[6].=> Add More");
            System.out.println("[7].=> Sort");
            System.out.println("[8].=> Clear");
            System.out.println("[9].=> Exit ");
            System.out.println("---------(^_^)-------");
            System.out.print("Pls Choose One Option[1-9]: ");
            option=in.nextInt();
            switch(option){
                case 1:{
                    System.out.println("[1].=> Input");
                    System.out.print("Pls Enter Number Of Student : ");
                    n=in.nextInt();
                    for(i=0;i<n;i++){
                        System.out.println("---Student[#"+(i+1)+"]---");
                       stu[i] = new Students();
                       stu[i].Input();
                       list.add(stu[i]);
                    }
                    System.out.println("Input Success.");
                }break;
                case 2:{
                   System.out.println("ID\t NAME\t GENDER\t SCORE");
                    for(i=0;i<list.size();i++){
                        list.get(i).Output();
                    }
                }break;
                case 3:{
                    int s_id,b=0;
                    System.out.print("Pls Enter Id For Search : ");
                    s_id=in.nextInt();
                    for( i=0;i<list.size();i++){
                        if(s_id==list.get(i).getId()){
                            System.out.println("ID\t NAME\t GENDER\t SCORE");
                            list.get(i).Output();
                            System.out.println("Search Found.");
                            b=1;
                        }
                    }
                    if(b==0){
                        System.err.println("Search Not Found.");
                    }   
                }break;
                case 4:{
                    Students n_stu = new Students();
                    String u_name;
                    boolean b=false;
                    System.out.print("Pls Enter Name For Update : ");
                    u_name=in.next();
                    for(i=0;i<n;i++){
                        if(u_name.equalsIgnoreCase(list.get(i).getName())){
                            System.out.println("---UPDATE----");
                            System.out.print("Enter New Student: \n");
                            n_stu = new Students();
                            n_stu.Input();
                            list.set(i, n_stu);
                            System.out.println("Update Success.");
                            b=true;
                        }
                    }
                    if(b==false){
                        System.out.println("Update Not Success.");
                    }
                }break;
                case 5:{
                    int d_id;
                    boolean b=false;
                    System.out.print("Pls Enter Id For Delete : ");
                    d_id=in.nextInt();
                    for(i=0;i<list.size();i++){
                        if(d_id==list.get(i).getId()){
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
                    int add;
                    System.out.print("Pls Enter Number Of Student : ");
                    add=in.nextInt();
                    for(i=n;i<n+add;i++){
                        System.out.println("---Student[#"+(i+1)+"]---");
                       stu[i] = new Students();
                       stu[i].Input();
                       list.add(stu[i]);
                    }
                    System.out.println("Add Success.");
                    
                }break;
                case 7:{
                    Collections.sort(list,Comparator.comparing(Students::getId));
                    System.out.println("Sort Success.");
                }break;
                case 8:{
                    list.clear();
                    System.out.println("Clear Success.");
                }break;
                case 9:{
                    
                }break;
                default:{
                    System.err.println("Error This Option Not Found.");
                }break;
            }
            
        }while(option!=9);
        
    }
    
}
