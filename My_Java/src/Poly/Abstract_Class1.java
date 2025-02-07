
package Poly;
abstract class Bike{

    public Bike() {
        System.out.println("Bike is created.");
    }
    abstract void run();
    void changGear(){
        System.out.println("gear change");
    }
}

class Honda extends Bike{

    @Override
    void run() {
        System.out.println("Runing Safely....");
    }
    
}

public class Abstract_Class1 {

    public static void main(String[] args) {
        Bike obj = new Honda();
        obj.run();
        obj.changGear();
        
    }
    
}
