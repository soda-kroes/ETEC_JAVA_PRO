
package Inheritance;

import java.util.Scanner;

class Person{
    Scanner in = new Scanner(System.in);
    private int id;
    private String name,sex,add,dob;
    
    
    public Person(){
        id=0;
        name="null";
        sex="null";
        add="null";
        dob="null";
    }
    

    public Person(int id, String name, String sex, String add, String dob) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.add = add;
        this.dob = dob;
    }

   
   

  
    public void Input(){
        System.out.print("=> Input Id      : ");
        id=in.nextInt();
        System.out.print("=> Input Name    : ");
        name=in.next();
        System.out.print("=> Input Sex     : ");
        sex=in.next();
        System.out.print("=> Input Adresss : ");
        add=in.next();
        System.out.print("=> Input Date    : ");
        dob=in.next();
    }

    public void Output_Person(){
        System.out.println("---------------------------------------------------------------");
        System.out.print(id+"\t "+name+"\t "+sex+"\t "+add+"\t "+dob);
    } 
}
class Employee extends Person{
    private int hour,rate,salary;

    public Employee(){
        super();
        hour=0;
        rate=0;
        salary=0;
    }
    
    

    public Employee(int hour, int rate, int salary, int id, String name, String sex, String add,String dob) {
        super(id, name, sex, add, dob);
        this.hour = hour;
        this.rate = rate;
        this.salary = salary;
    }
    public void Input(){
        super.Input();
        System.out.print("=> Input Hour   : ");
        hour=in.nextInt();
        System.out.print("=> Input Rate   : ");
        rate=in.nextInt();
       
    }
    int salary(){
        return hour*rate;
    }
    void Ouput_Employee(){
        super.Output_Person();
        System.out.print("\t "+rate+"\t "+hour+"\t "+salary()+"$");
    }
    }

public class Example2 {
    public void Header_Person(){
        System.out.print("Id\t Name\t Sex\t Address\t Date");
    
    }
    public void Header_Employee(){
        System.out.println("================ Information Employee ==================");
        System.out.println("Id\t Name\t Sex\t Address\t Date\t Rate\t Hour\t Salary");
    }
    public void Header_Student(){
        System.out.println("\t Java\t C#\t Kotlin\t Switf\t Flutter");
    }
    
    public class Student extends Person{
        private double s1,s2,s3,s4,s5;
        public Student(){
            s1=0;
            s2=0;
            s3=0;
            s4=0;
            s5=0;
        }

        public Student(double s1, double s2, double s3, double s4, double s5) {
            this.s1 = s1;
            this.s2 = s2;
            this.s3 = s3;
            this.s4 = s4;
            this.s5 = s5;
        }
        
        public void Input(){
            super.Input();
            
            System.out.println("====== Start Input Score ======");
            System.out.print("=> Enter Java         : ");
            s1=in.nextDouble();
            System.out.print("=> Enter C#           : ");
            s2=in.nextDouble();
            System.out.print("=> Enter KotLin       : ");
            s3=in.nextDouble();
            System.out.print("=> Enter Swift        : ");
            s4=in.nextDouble();
            System.out.print("=> Enter Flutter      : ");
            s5=in.nextDouble();
  
        }
        
        void Output_Student(){
            super.Output_Person();
            System.out.println("\t "+s1+"\t "+s2+"\t "+s3+"\t "+s4+"\t "+s5);
            
        }
        

     
        
    }
   

    public Example2() {
        Student stu = new Student();
      
        System.out.println("============== Input Information =================");
        stu.Input();
        Header_Person();
        Header_Student();
        
        stu.Output_Student();
        
    }
    

    public static void main(String[] args) {
        new Example2();
       
    }
    
}
