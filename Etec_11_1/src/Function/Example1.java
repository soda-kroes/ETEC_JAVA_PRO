
package Function;

public class Example1 {
    //Non_Return Non_Parameter
   void Sum1(){
        int a=30;
        int b=20;
        System.out.println("A + B = "+(a+b));
    }
    //Non_Return Has Parameter
    void Sum2(int x,int y){
        System.out.println("X + Y = "+(x+y));
    }

    public Example1() {
        Sum1();
        Sum2(10, 80);
    }
    public static void main(String[] args) {
        new Example1();
      
    }
    
}
