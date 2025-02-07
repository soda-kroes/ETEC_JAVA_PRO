
package OOP;

import java.util.Scanner;

class Student{
    //data member
    Integer id;
    String name;
    String gender;
    Double score;
    //constructor?
    //default constructor
    public Student() {
    }
    
    //construct with parameter

    public Student(int id, String name, String gender, double score) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.score = score;
    }

    public void Output(){
        System.out.println(id+"\t "+name+"\t "+gender+"\t "+score);
    
    }
    
   
}

public class ex1 {

    public static void main(String[] args) {
        System.out.println("----||| Use Default Constructor|||-------");
        Student stu = new Student();
        stu.Output();
        System.out.println("----|||Constructor With Parameter|||-------");
        Student std = new Student(2002, "Sokha", "Female", 100);
        std.Output();
       
    }
    
}
