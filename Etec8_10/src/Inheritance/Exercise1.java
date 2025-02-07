
package Inheritance;

public class Exercise1 {
    public  static void Header_Employee(){
        System.out.println("Id\t Name\t Sex\t Address\t Dob\t Hour\t Rate\t Salary");
       
    }

    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println("------||| Input |||------------");
        emp.Input_Employee();
        System.out.println("------||| Output |||------------");
        Header_Employee();
        emp.Output_Employee();
        
    }
    
}
