
package ArrayList;

import java.util.ArrayList;


public class Arr_class {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student stu1 = new Student(1001, "Long", "Male", 100);
        Student stu2 = new Student();
        Student stu3 = new Student(2004, "Sokha", "Female", 90.5);
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        System.out.println("------Student Information-------");
        for(int i=0;i<list.size();i++){
           list.get(i).Print();
        }
        
    }
    
}
