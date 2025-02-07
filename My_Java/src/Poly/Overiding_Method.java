
package Poly;
class Animal{
    public  void Move(){
        System.out.println("Animal Can Move.");
    }
}
class Dog extends Animal{
    public void Move(){
        super.Move();
        System.out.println("Dog Can Move And Run.");
        
    }
}

class Fish extends Animal{
    public void Move(){
        super.Move();
        System.out.println("Fish Can Travel In Wather.");
    }
}

public class Overiding_Method {
    public static void main(String[] args) {
        
        Animal animal = new Animal();
        Dog dog = new Dog();
        Fish fish = new Fish();
        System.out.println("=== Class Animal ====");
        animal.Move();
        System.out.println("=== Class Dog ====");
        dog.Move();
        System.out.println("=== Class Fish ====");
        fish.Move();
       
    }
    
}
