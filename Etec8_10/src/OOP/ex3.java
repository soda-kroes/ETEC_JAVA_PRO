
package OOP;
class Student{
    private int id;
    public String name;

    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    
}

public class ex3 {

    public static void main(String[] args) {
        Student stu = new Student();
        stu.setId(1001);
        stu.name="Dara";
        
        System.out.println("Id   : "+stu.getId());
        System.out.println("Name : "+stu.name);
                
    }
    
}
