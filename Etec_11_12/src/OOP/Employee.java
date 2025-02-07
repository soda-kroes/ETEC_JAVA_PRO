
package OOP;

import java.util.Scanner;

class Employee{
    public int id;
    public String name,gender;
    public double salary;
    
    //Default constructor
    public Employee(){
        id=0;
        name="null";
        gender="null";
        salary=0;
    }
    //Construct with Parameter
    public Employee(int id, String name, String gender, double salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }
    public void Input(){
        Scanner in = new Scanner(System.in);
        System.out.print("=> Pls Enter Id     : ");
        id=in.nextInt();
        System.out.print("=> Pls Enter Name   : ");
        name=in.next();
        System.out.print("=> Pls Enter Gender : ");
        gender=in.next();
        System.out.print("=> Pls Enter Salary : ");
        salary=in.nextDouble();
    }
    String getName(){
        return name;
    }
    public void Output(){
        System.out.println(id+"\t "+name+"\t "+gender+"\t "+salary+"USD");
    }
  
}