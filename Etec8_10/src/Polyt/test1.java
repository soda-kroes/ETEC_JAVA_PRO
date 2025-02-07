//constructor overloading
package Polyt;


class Student{
    public int id;
    public String name,sex;
    public double score;
   
    public Student() {
        id=0;
        name="NULL";
        sex="NULL";
        score=0.0;
    }
    
    public Student(int id){
        this.id=id;
        name="NULL";
        sex="NULL";
        score=0.0;
    }
    public Student (String name,String sex){
        id=0;
        this.name=name;
        this.sex=sex;
        score=0.0;
    }
    public Student(int id,String name,double score){
        this.id=id;
        this.name=name;
        sex="NULL";
        this.score=score;
    }

    public Student(int id, String name, String sex, double score) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.score = score;
    }
    public void Display(){
        System.out.println(id+"\t "+name+"\t "+sex+"\t "+score);
    }
    
    
} 


public class test1 { 

   
    public static void main(String[] args) {
      
        System.out.println("-----|||Constructor01|||------");
          Student stu1 = new Student();
          stu1.Display();
          System.out.println("-----|||Constructor02|||------");
          Student stu2 = new Student(1001);
          stu2.Display();
          System.out.println("-----|||Constructor03|||------");
          Student stu3 = new Student("long", "male");
          stu3.Display();
           System.out.println("-----|||Constructor04|||------");
          Student stu4 = new Student(1001, "sokha", 90.5);
          stu4.Display();
          System.out.println("-----|||Constructor05|||------");
          Student stu5 = new Student(1001, "long", "female", 80.5);
          stu5.Display();
        
        
    }
    
}
