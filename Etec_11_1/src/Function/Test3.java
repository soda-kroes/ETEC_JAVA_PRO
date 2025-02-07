
package Function;

import java.util.Scanner;


public class Test3 {
    static void ReverString(){
        String original,revers="";
        Scanner scanf = new Scanner(System.in);
        System.out.print("Pls Enter The String : ");
        original=scanf.next();
        int size=original.length();
        System.out.println("length : "+size);
        for(int i=size-1;i>=0;i--){
            revers = revers+original.charAt(i);
            
        }
        System.out.println("After Revers String : "+revers);
    }
    public static void main(String[] args) {
        ReverString();
        
    }
    
}
