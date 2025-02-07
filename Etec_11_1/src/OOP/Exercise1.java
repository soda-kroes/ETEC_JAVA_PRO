
package OOP;

import java.util.Scanner;

class Employee{
    public String id,name,gender;
    public double salary;

    public Employee() {
    
    }

    public Employee(String id, String name, String gender, double salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }
    
    public void Input(){
        Scanner in = new Scanner(System.in);
        System.out.print("Pls Enter Id      : ");
        id=in.next();
        System.out.print("Pls Enter Name    : ");
        name=in.next();
        System.out.print("Pls Enter Gender  :  ");
        gender=in.next();
        System.out.println("Pls Enter Salary : ");
        salary=in.nextDouble();
        
    }
    public void Output(){
        System.out.println(id+"\t "+name+"\t "+gender+"\t "+salary);
    }
    
}
public class Exercise1 {
    static void Header(){
        System.out.println("Id\t Name\t Gender\t Score");
    }
   
    public static void main(String[] args) {
        Header();
       Employee emp = new Employee("A001", "Long", "Male", 500.00);
       emp.Output();
    }
    
}
