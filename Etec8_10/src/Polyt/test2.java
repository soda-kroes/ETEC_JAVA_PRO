
package Polyt;
//method overiding

class Animal{
    
    public  void  Move(){//super class
        System.out.println("Animal can Move.");
    }
}

class Dog extends Animal{
    public void Move(){
        super.Move();
        System.out.println("Dog can walk.");
    }
}

class Fish extends Animal{
    public void Move(){
        super.Move();
        System.out.println("Fish can travel in water.");
    }
}
public class test2 {

   
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.Move();
        
        Animal obj1 = new Fish();
        obj1.Move();
    }
    
}
