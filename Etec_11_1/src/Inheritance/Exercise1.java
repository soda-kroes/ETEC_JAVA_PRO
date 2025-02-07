
package Inheritance;

import java.util.Scanner;

class Person{//super class
    protected int id;
    protected String name,gender,add,dob;
    //Default Constructor
    public Person() {
        id=0;
        name="null";
        gender="null";
        add="null";
        dob="null";
    }
    //Constructor With Parameter
    public Person(int id, String name, String gender, String add, String dob) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.add = add;
        this.dob = dob;
    }
    
    
    public void Input_person(){
        
        Scanner in = new Scanner(System.in);
        System.out.println("---|| Input ||---");
        System.out.print("Pls Input Id      : ");
        id=in.nextInt();
        System.out.print("Pls Input Name    : ");
        name=in.next();
        System.out.print("Pls Input Gender  : ");
        gender=in.next();
        System.out.print("Pls Input Address : ");
        add=in.next();
        System.out.print("Pls Input Date    : ");
        dob=in.next(); 
    }
    public void Output_person(){
        System.out.print(id+"\t "+name+"\t "+gender+"\t "+add+"\t "+dob);
    }
}

class Employee extends Person{//sub class
    int rate,hour;
     //Default Constructro

    public Employee() {
        super();//cals constructor from person
        rate=0;
        hour =0;
    }
 //Construct with paramter
   public Employee(int id ,String name,String gender,String add,String dob,int rate,int hour){
       super(id, name, gender, add, dob);
       this.hour=hour;
       this.rate=rate;
       
       
   }
    
    
    
    public void Input_employee(){
        Scanner in = new Scanner(System.in);
        super.Input_person();
        System.out.print("Pls Input Rate : ");
        rate=in.nextInt();
        System.out.print("Pls Input Hour : ");
        hour=in.nextInt();
        
    }
    double Salary(){
        return hour*rate;
    }
    public void Output_employee(){
        super.Output_person();
        System.out.println("\t "+rate+"\t "+hour+"\t "+Salary()+"$");
    }
}

public class Exercise1 {
    static void header_employee(){
        System.out.println("Id\t Name\t Gender\t Addrss\t Date\t Rate\t Hour\t Salary");
    }

    public static void main(String[] args) {
//        Employee emp = new Employee();
//        emp.Input_employee();
//        header_employee();
//        emp.Output_employee();

         Employee emp1 = new Employee(10001, "Daro", "Male", "Takeo", "2001", 10, 50);
         header_employee();
         emp1.Output_employee();
    }
    
}
