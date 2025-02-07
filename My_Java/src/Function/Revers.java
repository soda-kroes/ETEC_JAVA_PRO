
package Function;

import java.util.Scanner;

public class Revers {
    void ReverString(){
        String original,revers="";
        Scanner in = new Scanner(System.in);
        System.out.print("=> Enter String To Revers: ");
        original=in.next();
        int sum = original.length();
        for(int i=sum-1;i>=0;i--){
            revers=revers+original.charAt(i);  
            
        }
        System.out.println("=== After Revers ===");
            System.out.println("The String Is : "+revers);
    }

    public Revers() {
        ReverString();
    }

    public static void main(String[] args) {
        new Revers();
       
    }
    
}