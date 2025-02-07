
package Function;

public class Swaping {
    
    void Swap(int a,int b){

        int temp;
        temp = a;
        a = b;
        b= temp;
       
    }
    
    Swaping(){
        int a=20,b=10;
        System.out.println("Befor Swapping:");
        System.out.println("A = "+a);
        System.out.println("B = "+b);

        Swap(a, b);
         
        System.out.println("After Swapping:");
        System.out.println("A = "+a);
        System.out.println("B = "+b);

    }

   
    public static void main(String[] args) {
       new Swaping();
    }
    
}
