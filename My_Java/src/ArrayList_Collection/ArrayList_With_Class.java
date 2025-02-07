
package ArrayList_Collection;

import java.util.ArrayList;
import java.util.Iterator;


class Student{
    int id;
    String name,sex;
    float score;
    public Student(){
        id=0;
        name="null";
        sex="null";
        score=0;
    }
    public Student(int id,String name,String sex,float score){
        this.id=id;
        this.name=name;
        this.sex=sex;
        this.score=score;
    }
    
    public void Output(){
        System.out.println(id+"\t "+name+"\t "+sex+"\t Score");
    }
}

public class ArrayList_With_Class {

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Student stu1 = new Student(1001, "Dara", "Male", 90);
        Student stu2 = new Student(1002, "Long", "Male", 60);
        Student stu3 = new Student(1003, "Daro", "Male", 80);
        
        list.add(stu1);
        list.add(stu2);
        list.add(stu3);
        
        System.out.println("=========== Information Student ============");
        System.out.println("ID\t NAME\t SEX\t SCORE");
//        Iterator itr = list.iterator();
//        while(itr.hasNext()){
//            Student stu = (Student) itr.next();
//            System.out.println("------------------------------------");
//            System.out.println(stu.id+"\t "+stu.name+"\t "+stu.sex+"\t "+stu.score);
//        }

          for(int i=0;i<=list.size();i++){
              list.get(i).Output();
              
          }
        
        
        
    }
    
}
