
package Function;


public class function1 {
    
    int Sum1(int a,int b){
        return a+b;
    }
    int Sum2(int a,int b,int c,int d){
        return Sum1(a, b)+Sum1(c, d);
    }
    int Sum3(int a,int b,int c){
        return Sum1(a, b)+c;
    }
    int Sum4(int a,int b,int c,int d,int e){
        return Sum2(a, b, c, d)+e;
    }

    public function1() {
        System.out.println("Function Sum1 = "+Sum1(10, 20));
        System.out.println("Function Sum2 = "+Sum2(1, 2, 3, 4));
        System.out.println("Function Sum3 = "+Sum3(2, 2, 2));
        System.out.println("Function Sum4 = "+Sum4(2, 3, 2, 3, 10));
    }
    
    
    

    public static void main(String[] args) {
       new function1();
    }
    
    
}
