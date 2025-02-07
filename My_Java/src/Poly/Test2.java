
package Poly;
class Employee{
    public String name,sex,address;
    public Employee(){
        name="null";
        sex="null";
        address="null";
    }

    public Employee(String name, String sex, String address) {
        this.name = name;
        this.sex = sex;
        this.address = address;
    }
    public void Print(){
        System.out.println(name+"\t "+sex+"\t "+address);
    }
    public void Print(String phone){
         System.out.println(name+"\t "+sex+"\t "+address+"\t "+phone);
    }
    public void print(int value1,int value2){
        System.out.println("Value1 + Value2 = "+(value1+value2));
    }
    
}

public class Test2 {

   
    public static void main(String[] args) {
        Employee obj = new Employee("Dara", "Male", "Takeo");
        obj.Print();
        obj.Print("0107898678");
        obj.print(10, 20);
       
    }
    
}
