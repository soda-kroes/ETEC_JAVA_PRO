
package Poly;
//Constructor overloading


public class overloading_ex1 {
    static void Header(){
        System.out.println("Id\t Name\t Gender\t Salary");
    }
    
    public static void main(String[] args) {
        System.out.println("Constructor#1: ");
        Employee obj1 = new Employee();
        Header();
        obj1.Output();
        System.out.println("Constructor#2: ");
        Employee obj2 = new Employee(1001);
        Header();
        obj2.Output();
        System.out.println("Constructor#3: ");
        Employee obj3 = new Employee("long", 500);
        Header();
        obj3.Output();
        System.out.println("Constructor#4: "); 
        Employee obj4 = new Employee(1001, "long", "male");
        Header();
        obj4.Output();
        System.out.println("Constructor#5: ");
        Employee obj5 = new Employee(1001, "long", "male", 500);
        Header();
        obj5.Output();
        
        
    }
    
}
