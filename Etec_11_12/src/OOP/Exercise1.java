
package OOP;

import java.util.Scanner;


public class Exercise1 {
    static void Header(){
        System.out.println("Id\t Name\t Gender\t Salary");
    }
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        System.out.println("-------Default Constructor-------");
        Header();
        emp1.Output();
        
        System.out.println("-------Constructor With Parameter-------");
        Employee emp2 = new Employee(1001, "Long", "Male", 90.5);
        Header();
        emp2.Output();
        System.out.println("-----------Input Employee--------------");
        emp1.Input();
        Header();
        emp1.Output();    
    }
    
}
