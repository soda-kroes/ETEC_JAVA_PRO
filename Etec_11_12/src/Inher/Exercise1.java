
package Inher;

import java.util.Scanner;

class Person{
    protected String id,name,gender,address,dob;
    //Default Constructor
    public Person() {
        id="null";
        name="null";
        gender="null";
        address="null";
        dob="null";
    }
    //Construct with Parameter
    public Person(String id, String name, String gender, String address, String dob) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.dob = dob;
    }
    
    
    
    public void Input(){
        Scanner in = new Scanner(System.in);
        System.out.print("Pls Enter Id      : ");
        id=in.next();
        System.out.print("Pls Enter Name    : ");
        name=in.next();
         System.out.print("Pls Enter Sex    : ");
        gender=in.next();
        System.out.print("Pls Enter Address : ");
        address=in.next();
        System.out.print("Pls Enter Date    : ");
        dob=in.next();
        
    }
    public void Output(){
        System.out.print(id+"\t "+name+"\t "+gender+"\t "+address+"\t "+dob+"\t ");
    }
    
}
class Employee extends Person{
    protected int hour,rate;
    //Dafalut Constructor
    public Employee() {
        super();//call default constructor from class person
        hour=0;
        rate=0;
     
    }
    //Constructor With Parameter

    public Employee(int hour, int rate, String id, String name, String gender, String address, String dob) {
        super(id, name, gender, address, dob);
        this.hour = hour;
        this.rate = rate;
    }
    

    

    
    
    
    
    
    public void Input(){
        
         Scanner in = new Scanner(System.in);
         super.Input();
         System.out.print("Pls Enter Hour   : ");
         hour=in.nextInt();
         System.out.print("Pls Enter Rate : ");
         rate=in.nextInt();
    }
    int Salary(){
        return hour*rate;
    }
    public void Output(){
        super.Output();
        System.out.println(hour+"\t "+rate+"\t "+Salary());
    }
    
}
public class Exercise1 {
    static void Header_Person(){
        System.out.println("Id\t Name\t Gender\t Address\t Date");
    }
    static void Header_Employee(){
         System.out.println("Id\t Name\t Gender\t Address\t Date\t Hour\t Rate\t Salary");
    }
    public static void main(String[] args) {
//        Person per = new Person();
//        System.out.println("---------Input Person---------\n");
//        per.Input();
//        Header_Person();
//        per.Output();
//        System.out.println("\n---------Input Employee---------\n");
//        Employee emp = new Employee();
//        System.out.println("");
//        emp.Input();
//        Header_Employee();
//        emp.Output();

          System.out.println("-----Default Constructor Clas Person---------");
          Person per = new Person();
          Header_Person();
          per.Output();
          System.out.println("\n-----Constructor With Parameter Class Person---------");
          Person Per = new Person("1001", "Dara", "Male", "Takeo", "2001");
          Header_Person();
          Per.Output();
          System.out.println("\n-----Default Constructor Class Employee---------");
          Employee emp = new Employee();
          Header_Employee();
          emp.Output();
          System.out.println("\n-----Constructor With Parameter Class Employee---------");
          Employee emp1 = new Employee(30, 5, "1002", "Long", "Male", "Takeo", "1979");
          Header_Employee();
          emp1.Output();
    }
    
}
