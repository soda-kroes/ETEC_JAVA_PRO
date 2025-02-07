
package Poly;

class Employee{
    //datamember
    int id;
    String name,gender;
    double salary;

    public Employee() {
        id=0;
        name="null";
        gender="null";
        salary=0.0;  
    }
    
    public Employee(int id,String name,String gender){
        this.id=id;
        this.name=name;
        this.gender=gender;
        salary=0.0;
    }
    public Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }
    public Employee(int id){
        this.id=id;
        name="null";
        gender="null";
        salary=0.0;  
        
    }

    public Employee(int id, String name, String gender, double salary) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.salary = salary;
    }
    public void Output(){
        System.out.println(id+"\t "+name+"\t "+gender+"\t "+salary+"$");
    }
    
}
class Student extends Employee{
    
}