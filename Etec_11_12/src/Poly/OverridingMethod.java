
package Poly;

class Animal{//Super Class
    int Sum(int a,int b){
        return a+b;
    }
    public void Print(){
        System.out.println("Animal can move.");
    }  
}
class Dog extends Animal{
    
    public void Print(){//Method Overiding
        super.Print();
        System.out.println("Dog can walk and run.");
        
    }
}
class Fish extends Animal{
    public void Print(){
        super.Print();
        System.out.println("Fish can travel in water.");
    }
}

public class OverridingMethod {

  
    public static void main(String[] args) {
       Dog obj = new Dog();
       obj.Print();
    }
    
}
