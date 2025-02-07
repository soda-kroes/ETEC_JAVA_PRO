
package OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Arrlist_oop {
    
    public static void main(String[] args) {
        String ans;
        int option,n=0,i,j;
        Employee emp1[] = new Employee[50];//Object Array
        ArrayList<Employee> list = new ArrayList<Employee>();
        Scanner in = new Scanner(System.in);
       do{
            System.out.println("-------||| M E N U |||-------");
            System.out.println("[1].=> Input ");
            System.out.println("[2].=> Output ");
            System.out.println("[3].=> Search ");
            System.out.println("[4].=> Update ");
            System.out.println("[5].=> Delete ");
            System.out.println("[6].=> Add ");
            System.out.println("[7].=> Sort ");
            System.out.println("[8].=> Clear ");
            System.out.println("[9].=> Exit Application");
            System.out.println("-----------(^_^)-------------");
            System.out.print("=> Pls Choose One Option[1-8]: ");
            option=in.nextInt();
            switch(option){
                case 1:{
                      System.out.println("[1].=> Input ");
                      System.out.print("Pls Enter Number Of Employee: ");
                      n=in.nextInt();
                      for(i=0;i<n;i++){
                          System.out.println("---[Employee"+(i+1)+"]---");
                          emp1[i] = new Employee();
                          emp1[i].Input();
                          list.add(emp1[i]);
                      }
                      System.out.println("Input Success.");
                    
                }break;
                case 2:{
                    System.out.println("Id\t Name\t Gender\t Score");
                    for(i=0;i<list.size();i++){
                        list.get(i).Output();
                    }
                }break;
                case 3:{
                    boolean b=false;
                    System.out.print("Pls Enter Id For Search : ");
                    int s_id = in.nextInt();
                    for(i=0;i<list.size();i++){
                        if(s_id == list.get(i).id){
                            System.out.println("Id\t Name\t Gender\t Score");
                            list.get(i).Output();
                            System.out.println("Search Found.");
                            b=true;
                        }
                    }
                    if(b==false){
                        System.out.println("Search Not Found.");
                    }
                }break;
                case 4:{
                    Employee emp2 = new Employee();
                    boolean b=false;
                    System.out.print("Pls Enter Id For Update : ");
                    int u_id=in.nextInt();
                    for(i=0;i<list.size();i++){
                        if(u_id==list.get(i).id){
                            System.out.println("---UPDATE DATA---");
                            emp2=new Employee();
                            emp2.Input();
                            list.set(i, emp2);
                            System.out.println("Update Success.");
                            b=true;
                        }
                    }
                    if(b==false){
                        System.out.println("Update Not Success.");
                    }
                }break;
                case 5:{
                    boolean b=false;
                    System.out.print("Pls Enter Id For Delete: ");
                    int d_id=in.nextInt();
                    for(i=0;i<list.size();i++){
                        if(d_id==list.get(i).id){
                            list.remove(i);
                            System.out.println("Delete Success.");
                             b =true;
                        }
                    }
                    if(b==false){
                        System.out.println("Delete Not Success.");
                    }
                }break;
                case 6:{
                    System.out.print("Pls Enter Number Of Employee: ");
                      int add=in.nextInt();
                      for(i=n;i<n+add;i++){
                          System.out.println("---[Employee"+(i+1)+"]---");
                          emp1[i] = new Employee();
                          emp1[i].Input();
                          list.add(emp1[i]);
                      }
                      System.out.println("Add Success.");
                    
                }break;
                case 7:{
                    Collections.sort(list,Comparator.comparing(Employee::getName));
                    System.out.println("Sort Success.");
                }break;
                case 8:{
                    list.clear();
                    System.out.println("Clear Success.");
                }break;
                case 9:{
                    System.exit(0);
                }break;
                default: {
                    System.out.println("This Option Not Found.");
                }break;
            }
           
           System.out.print("Pls Enter 'Yes' To Continues Program: ");
           ans=in.next();
       }while(ans.equalsIgnoreCase("Yes"));
    }
    
}
