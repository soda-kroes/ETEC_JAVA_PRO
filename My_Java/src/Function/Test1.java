
package Function;


public class Test1 {
    int sum1(int x,int y){
        return x+y;
        
    }
    int sum2(int a,int b,int c,int d){
        return  sum1(a, b)+sum1(c, d);
    }
    int sum3(int a,int b,int c){
        return sum1(a, b)+c;
    }

    public Test1() {
        System.out.println("Calling Function Sum1 = "+sum1(20, 10));
        System.out.println("Calling Funciton Sum2 = "+sum2(10, 20 ,30, 40));
        System.out.println("Calling Function Sum3 ="+sum3(20, 10, 20));
    }
    
    
    public static void main(String[] args) {
        new Test1();
     
        
       
       
    }
    
}