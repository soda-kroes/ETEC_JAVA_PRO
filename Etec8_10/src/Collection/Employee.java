
package Collection;

import java.util.Scanner;

class Employee{
    private int id;
    String name;
    String gender;
    Double salary;
    String add;
    //Default-constructor
    public Employee() {
       
    }
    //contructor-with-parameter
    

    public Employee(int id, String name, String gender, Double salary, String add) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
        this.add = add;
    } 
    
    public void Input(){
        Scanner in = new Scanner(System.in);
        System.out.print("Pls Enter Id     :  ");
        id=in.nextInt();
        System.out.print("Pls Enter Name   :  ");
        name=in.next();
        System.out.print("Pls Enter Gender :  ");
        gender=in.next();
        System.out.print("Pls Enter Salary :  ");
        salary=in.nextDouble();
        System.out.print("Pls Enter Address:  ");
        add=in.next();
        
    }
    public void Output(){
        System.out.println(id+"\t "+name+"\t "+gender+"\t "+salary+"$"+"\t "+add);
    }
    //properties
    public int getId(){
        return id;
    }
    
}