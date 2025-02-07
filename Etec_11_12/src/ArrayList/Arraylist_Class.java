
package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist_Class {

   
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        
       Student stu4 = new Student(0, "", "", 0);
        //Student stu2 = new Student(20006, "Long", "Male", 90.6);
        //Student stu3 = new Student(9860, "Sokha", "Female", 80.8);
        //Add List
        //list.add(stu1);
        //list.add(stu2);
        //list.add(stu3);
        Student s1 = null;
        System.out.println("--------------Output Information------------");
        System.out.println("ID\t NAME\t GENDER\t SCORE");
                Iterator obj = list.iterator();

        while(obj.hasNext()){
            Student stu = (Student) obj.next();
            System.out.println(stu.getId());
        }

//          for(int i=0;i<list.size();i++){
//              list.get(i).Display();
//          }
    
    }
    
}
