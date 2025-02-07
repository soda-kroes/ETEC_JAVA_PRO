
package OOP;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

import java.util.Scanner;

class Employee{
    Scanner in = new Scanner(System.in);
    private int id;
    private String name,sex;
    private double salary;
   
    
    public Employee(){
        id=0;
        name="null";
        sex="null";
        salary=0.0;
    }
    public Employee(int id, String name, String sex, double salary) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public double getSalary() {
        return salary;
    }
    public void Input(){
        System.out.print("=> Input Id     : ");
        id=in.nextInt();
        System.out.print("=> Input Name   : ");
        name=in.next();
        System.out.print("=> Input Sex    : ");
        sex=in.next();
        System.out.print("=> Input Salary : ");
        salary=in.nextDouble();
        
    }
    public void Output(){
        System.out.println("------------------------------------");
        System.out.println(id+"\t "+name+"\t "+sex+"\t "+salary);
    }

   
 

   
    
}


public class Employee_Opp {

   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Employee> list = new ArrayList<>();
        Employee emp1[] = new Employee[40];
        int op,i,n=0;
        String ans;
        do{
            System.out.println("====== M E N U =====");
            System.out.println("[1]. => Input ");
            System.out.println("[2]. => Output ");
            System.out.println("[3]. => Search ");
            System.out.println("[4]. => Update ");
            System.out.println("[5]. => Delete ");
            System.out.println("[6]. => Add ");
            System.out.println("[7]. => Sort ");
            System.out.println("[8]. => Clear ");
            System.out.println("[9]. => Exit ");
            System.out.println("=====================");
            System.out.print("=> Please Enter Option : ");
            op=in.nextInt();
            switch(op){
                case 1:{
                    System.out.println("[1]. => Input ");
                    System.out.print("=> Input Number Of Employee : ");
                    n=in.nextInt();
                    for(i=0;i<n;i++){
                        System.out.println("===== Employee["+(i+1)+"] =====");
                        Employee emp = new Employee();
                        emp.Input();
                        list.add(emp);
                    }
                    System.out.println("Input Successfully.");
                }break;
                case 2:{
                    System.out.println("[2]. => Output ");
                    System.out.println("Id\t Name\t Gender\t Salary");
                    for(i=0;i<list.size();i++){
                        list.get(i).Output();
                    }
                    
                }break;
                case 3:{
                     System.out.println("[3]. => Search ");
                     int s_id;
                     boolean b=false;
                     System.out.print("=> Input Id For Search : ");
                     s_id=in.nextInt();
                     for(i=0;i<list.size();i++){
                         if(s_id == list.get(i).getId()){
                             b=true;
                             System.out.println("Id\t Name\t Gender\t Salary");
                             list.get(i).Output();
                             System.out.println("Search Found.");
                             
                         }
                     }
                     if(b==false){
                         System.out.println("Search Not Found.");
                     }
                    
                }break;
                case 4:{
                    boolean b=false;
                    Employee emp2 = new Employee();
                    System.out.println("[4]. => Update ");
                    String u_name;
                    System.out.print("=> Input Id For Update : ");
                    u_name=in.next();
                    for(i=0;i<list.size();i++){
                        if(u_name.equals(list.get(i).getName())){
                            b=true;
                            System.out.println("==== Update Data =====");
                            emp2.Input();
                            list.set(i, emp2);
                            System.out.println("Update Successfully.");
                        }
                    }
                    if(b==false){
                        System.out.println("Update Not Successfully.");
                    }
                    
                }break;
                case 5:{
                    boolean b=false;
                    System.out.println("[5]. => Delete ");
                    int d_id;
                    System.out.print("=> Input Id For Delete : ");
                    d_id=in.nextInt();
                    for(i=0;i<list.size();i++){
                        if(d_id == list.get(i).getId()){
                            b=true;
                            list.remove(i);
                            System.out.println("Delete Successfully.");
                        }
                    }
                    if(b==false){
                        System.out.println("Delete Not Successfully.");
                    }
                    
                }break;
                case 6:{
                    System.out.println("[6]. => Add ");
                    int add;
                    System.out.print("=> Input Number For Add Employee: ");
                    add=in.nextInt();
                    for(i=0;i<n+add;i++){
                       System.out.println("===== Employee["+(i+1)+"] =====");
                       emp1[i]=new Employee();
                       emp1[i].Input();
                       list.add(emp1[i]);
   
                    }
                    System.out.println("Add Successfully.");
                }break;
                case 7:{
                    System.out.println("[7]. => Sort ");
                    Collections.sort(list, Comparator.comparing(Employee::getId));
                    System.out.println("========= After Sort ===========");
                    System.out.println("Id\t Name\t Gender\t Salary");
                    for(i=0;i<list.size();i++){
                        list.get(i).Output();
                    }
                    
                            
                }break;
                case 8:{
                    System.out.println("[8]. => Clear ");
                    list.clear();
                    System.out.println("Clear Success.");
                    
                }break;
                case 9:{
                    System.exit(0);
                    
                }break;
            }
            System.out.print("Please Enter 'Yes' To Continues: ");
            ans=in.next();
            
            
        }while(ans.equalsIgnoreCase("yes"));
        
    }
    
}
