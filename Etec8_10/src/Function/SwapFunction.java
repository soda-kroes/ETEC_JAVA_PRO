
package Function;

import java.util.Scanner;

public class SwapFunction {
    static void ReversString(){
        //Hello
        String original,revers="";
       
        Scanner in = new Scanner(System.in);
        System.out.print("=> Pls Enter String : ");
        original=in.next();
        System.out.println("---|| Befor Revers ||---");
        System.out.println("String : "+original);
        int count = original.length();
        System.out.println("Count : "+count);
        for(int i=count-1;i>=0;i--){
            revers = revers+original.charAt(i);
        }
        System.out.println("---|| After Revers ||----");
        System.out.println("String : "+revers);
    }
 
    
    public static void main(String[] args) {
        ReversString();
      
       
    }
    
}
