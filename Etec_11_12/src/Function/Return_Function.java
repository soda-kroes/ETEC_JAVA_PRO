
package Function;

public class Return_Function {
    //Return Function Non Parameter
    public static int Sum1(){
        int a=20;
        int b=10;
        return (a+b);
    }
    
     //Return Function Has Parameter
    public static int Sub1(int a,int b){
        return (a-b);
    }
    
    public static int Sum2(int a,int b,int c){
        return (a+b+c);
    }
    
    public static void main(String[] args) {
        System.out.println("A + B = "+Sum1());
        System.out.println("A - B = "+Sub1(30, 10));
        System.out.println("A + B + C = "+Sum2(1, 2, 3));
    }
}
