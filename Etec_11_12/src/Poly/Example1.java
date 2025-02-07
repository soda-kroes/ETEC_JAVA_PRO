
package Poly;


class Student{
    int id;
    String name,sex;
    double score;
    
    public Student(){
        id=0;
        name="null";
        sex="null";
        score=0;
    }
    public Student(int id){
        this.id=id;
        name="null";
        sex="null";
        score=0.0;
        
    }
    public Student(String name,String sex,double score){
         id=0;
         this.name=name;
         this.sex=sex;
         this.score=score;
    }
    public Student(int id,String name,String sex,double score){
        this.id=id;
         this.name=name;
         this.sex=sex;
         this.score=score;
    }
    public void Display(){
        System.out.println("Id     : "+id);
        System.out.println("Name   : "+name);
        System.out.println("Gender : "+sex);
        System.out.println("Score  : "+score);
    }
}

public class Example1 {

    public static void main(String[] args) {
        System.out.println("=> Constructor#1: ");
        Student stu1 = new Student();
        stu1.Display();
        System.out.println("=> Constructor#2: ");
        Student stu2 = new Student(1001);
        stu2.Display();
         System.out.println("=> Constructor#3: ");
        Student stu3 = new Student("Long", "Male", 90.5);
        stu3.Display();
         System.out.println("=> Constructor#4: ");
         Student stu4 = new Student(1003, "long", "male", 100);
         stu4.Display();
    }
    
}
