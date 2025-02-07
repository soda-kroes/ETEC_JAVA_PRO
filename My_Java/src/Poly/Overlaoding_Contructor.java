
package Poly;

class Employee{
    public String name,sex,address;
    public int id;
    public Employee(){
        id=0;
        name="null";
        sex="null";
        address="null";
    }

        public Employee(String name, String sex, String address) {
        this.id=0;
        this.name = name;
        this.sex = sex;
        this.address = address;
        
    }
        public Employee(int id){
            this.id=id;
            name="null";
            sex="null";
            address="null";
        }
        
        public Employee(int id,String name,String sex,String address){
            this.id=id;
            this.name=name;
            this.sex=sex;
            this.address=address;
        }
        public void Display(){
            System.out.println(id+"\t "+name+"\t "+sex+"\t "+address);
        }
    
    
}


public class Overlaoding_Contructor {   
    public static void main(String[] args) {
        Employee obj = new Employee();
        System.out.println("====== Constructor#1 ========");
        obj=new Employee();
        obj.Display();
        
        System.out.println("====== Constructor#2 ========");
        obj=new Employee("Dara", "Male", "Takeo");
        obj.Display();
        
        System.out.println("====== Constructor#3 ========");
        obj=new Employee(1001);
        obj.Display();
        
        System.out.println("====== Constructor#4 ========");
        obj=new Employee(1001, "Dara", "Male", "Takeo");
        obj.Display();
        
        
        
    }
    
}
