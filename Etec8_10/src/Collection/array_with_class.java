
package Collection;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
    public Integer id;
    public String name,sex;
    public Double score;
    //Default Constructor
    public Student() {
    }
    //Construct With Parameter
    public Student(int id, String name, String sex, double score) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.score = score;
    }
//    public void Output(){
//        System.out.println(id+"\t "+name+"\t "+sex+"\t "+score);
//    }
//    
    
    
    
}

public class array_with_class {
    static void Header(){
        System.out.println("Id\t Name\t Sex\t Score");
        
    }
    
    

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Student stu1 = new Student(1001, "Vanda", "Male", 90.5);
        Student stu2 = new Student(1002, "Long", "Male", 70.5);
        Student stu3 = new Student();
        
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        Iterator itr = list.iterator();
        Header();
        while(itr.hasNext()){
           Student std = (Student) itr.next();
            System.out.println(std.id+"\t "+std.name+"\t "+std.sex+"\t "+std.score);
        
    } 
    }

   
}