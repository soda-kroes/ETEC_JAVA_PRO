
package OOP;

import java.util.Scanner;
public class Example1 {
    static void Header(){
        
        System.out.println("Id\t Name\t Gender\t Score");
    }
    public static void main(String[] args) {
        Student stu = new Student();
        stu.Input();
        Header();
        stu.Print();      
    }
    
}
