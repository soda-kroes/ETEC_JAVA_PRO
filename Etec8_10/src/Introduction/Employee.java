
package Introduction;
import java.util.Scanner;
public class Employee {
  
    public static void main(String[] args) {
        int id;
        String name,sex,add;
        double salary;
        Scanner obj = new Scanner(System.in);
       
        
        System.out.println("----||| Input Employee |||----");
        System.out.print("Pls Input Id     : ");
        id=obj.nextInt();
        System.out.print("Pls Input Name   : ");
        name=obj.next();
        System.out.print("Pls Input Sex    : ");
        sex=obj.next();
        System.out.print("Pls Input Address: ");
        add=obj.next();
        System.out.print("Pls Input Salary : ");
        salary=obj.nextDouble();
        System.out.println("------||| Display Employee |||-----");
        System.out.println("Id     : "+id);
        System.out.println("Name   : "+name);
        System.out.println("Sex    : "+sex);
        System.out.println("Add    : "+add);
        System.out.println("Salary : "+salary+"USD");
           
        
    }
    
}
