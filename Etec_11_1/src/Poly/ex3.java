
package Poly;

abstract class Bank{
    abstract int getRate();
}
class ABA extends Bank{

    @Override
    int getRate() {
        return 8;
    }
    
}
class ACLIDA extends Bank{

    @Override
    int getRate() {
        return 9;
    }
    
}
public class ex3 {

    public static void main(String[] args) {
        ABA aba = new ABA();
        System.out.println("Rate Of ABA    : "+aba.getRate());
        ACLIDA ac = new ACLIDA();
        System.out.println("Rate Of Aclida : "+ac.getRate());
    }
    
}
