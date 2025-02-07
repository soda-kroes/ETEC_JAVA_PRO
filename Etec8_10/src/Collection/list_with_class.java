
package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class list_with_class {
    
    static void Header(){
        System.out.println("Id\t Name\t Gender\t Salary\t Address");
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<>();
        Employee emp[] = new Employee[50];
        
        int option,i,n=0;
        do{
            System.out.println("-------||| M E N U |||-------");
            System.out.println("[1].=> Input ");
            System.out.println("[2].=> Output ");
            System.out.println("[3].=> Search ");
            System.out.println("[4].=> Update ");
            System.out.println("[5].=> Delete ");
            System.out.println("[6].=> Add ");
            System.out.println("[7].=> Sort ");
            System.out.println("[8].=> Insert");
            System.out.println("[9].=> Exit ");
            System.out.println("-----------(^_^)-------------");
            System.out.print("Pls Choose One Option[1-9]: ");
            option=in.nextInt();
            switch(option){
                case 1:{
                    System.out.print("Pls Enter Number Of Employee: ");
                    n=in.nextInt();
                    for(i=0;i<n;i++){
                        System.out.println("====[Employee#"+(i+1)+"]======");
                        emp[i] = new Employee();
                        emp[i].Input();
                        list.add(emp[i]);
                        
                    }
                    System.out.println("Input Completed.");
                    
                    
                }break;
                case 2:{
                    Header();
                    for(i=0;i<list.size();i++){
                        list.get(i).Output();
                    }
                }break;
                case 3:{
                    String sname;
                    boolean b=false;
                    System.out.print("Pls Enter Id For Search Employee: ");
                    sname=in.next();
                    for(i=0;i<list.size();i++){
                      if(sname.equals(list.get(i).name)){ 
                          Header();
                          list.get(i).Output();
                          System.out.println("Search Found.");
                          b=true;
                      } 
                    }
                    if(b==false){
                        System.out.println("Search Not Found.");
                    }
                    
                }break;
                case 7:{
                    
                    Collections.sort(list,Comparator.comparing(Employee::getId));
                    System.out.println("Sort Success.");
                    
                }break;
                case 8:{
                    int index;
                    System.out.println("Pls Enter Index For Insert: ");
                    index=in.nextInt();
                    if(index>n){
                        System.out.println("Invalid For Insert.");
                    }
                    else {
                        for(i=0;i>=index;i--){
                            emp[i+1] = emp[i];
                        }
                       
                        
                    }
                }break;
            }
            
            
        }while(option!=9);
        
    }
    
}
