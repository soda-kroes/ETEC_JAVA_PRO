
package Poly;

abstract class Bank{
    abstract int getRate();
    abstract int Sum(int a,int b);
}
class ABA extends Bank{

    @Override
    int getRate() {
        return 9;
        
    }

    @Override
    int Sum(int a, int b) {
        return a+b;
        
    }   
}
class Aclida extends Bank{

    @Override
    int getRate() {
        return 8;
    }

    @Override
    int Sum(int a, int b) {
        return a+b;
        
    }
    
}

public class Abstract_Class {
    public static void main(String[] args) {
        ABA aba = new ABA();
        Aclida aci = new Aclida();
        System.out.println("ABA Rate = "+aba.getRate());
        System.out.println("ACLIDA = "+aci.getRate());
        System.out.println("Sum = "+aba.Sum(10,40));
        
    }
    
}
