
package Inheritance;

import java.util.Scanner;

public class Person {//Base Class
    public int id;
    public String name,sex,add,dob;
    //default constructor
    public Person(){
        
    }
    //construct with parameter
    public Person(int id, String name, String sex, String add, String dob) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.add = add;
        this.dob = dob;
    } 
    public void Input_Person(){
        
        Scanner in = new Scanner(System.in);
        System.out.print("Pls Enter Id      : ");
        id=in.nextInt();
        System.out.print("Pls Enter Name    : ");
        name=in.next();
        System.out.print("Pls Enter Sex     : ");
        sex=in.next();
        System.out.print("Pls Enter Address : ");
        add=in.next();
        System.out.print("Pls Enter Date    : ");
        dob=in.next();
    }
    public void Output_Person(){
        System.out.print(id+"\t "+name+"\t "+sex+"\t "+add+"\t "+dob+"\t ");
    }
}




class Employee extends Person{//Sub Class
    private int hour,rate;
    private double salary;
    
    //Default Constructor 
    
    public Employee(){
    }
    

    //Construct With Parameter
    
   
    public Employee(int hour, int rate, double salary, int id, String name, String sex, String add, String dob) {
        super(id, name, sex, add, dob);
        this.hour = hour;
        this.rate=rate;
        this.salary = salary;
    }

    public void Input_Employee() {
        Scanner in = new Scanner(System.in);
        super.Input_Person();
        System.out.print("Pls Enter Hour: ");
        hour=in.nextInt();
        System.out.print("Pls Enter Rate : ");
        rate=in.nextInt();
    }
    public double Salary(){
        return hour*rate;
    }
    public void Output_Employee(){
        super.Output_Person();
        System.out.println(hour+"\t "+rate+"\t "+Salary());
    }
    
}