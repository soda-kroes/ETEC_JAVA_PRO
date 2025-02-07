
package Poly;
class Animal{//super class
     public void Move(){
        System.out.println("Animal can move.");
    }
}
class Dog extends Animal{
    //overiding method
  abstract void Move(){
      
  }
        
    
}
class Fish extends Animal{
    public void Move(){
        //overiding method
        super.Move();
        System.out.println("Fish can travel in water.");
    }
}

public class Overiding_Method {
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.Move();
        
    }
    
}
