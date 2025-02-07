
package Function;

import java.util.Scanner;
public class Test5 {
    public int Sum1(int a,int b){
        return a+b;
    }
    
    public int Sum2(int a,int b,int c,int d){
        return Sum1(a, b)+Sum1(c, d);
    }
    
    public void Sum3(int a,int b,int c){
        System.out.println("Function Sum3 = "+(Sum1(a, b)+c));
     
    }

    public Test5() {
        System.out.println("Function Sum1 = "+Sum1(2, 3));
        System.out.println("Function Sum2 = "+Sum2(1, 1, 1, 1));
        Sum3(10, 10, 10);
    }
    
    public static void main(String[] args) {
      new Test5();
    }
}
