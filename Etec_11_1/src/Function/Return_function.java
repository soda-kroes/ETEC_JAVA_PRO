
package Function;

public class Return_function {
    //Return_Function Non Parameter
    static int Sum(){
       int a=10;
       int b=5;
       return a+b;
    }
    //Return_Function Has Parameter
    static int Sub(int x,int y){
        return x-y;
    }

    public static void main(String[] args) {
        System.out.println("A + B = "+Sum());
        System.out.println("X - Y = "+Sub(30, 20));
    }
    
}
