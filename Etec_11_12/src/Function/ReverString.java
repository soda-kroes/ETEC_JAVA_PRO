
package Function;

import java.util.Scanner;



public class ReverString {
    public static void Revers(){
        String original,revers="";
       
        Scanner cin = new Scanner(System.in);
        System.out.print("Pls Enter The String : ");
        original=cin.next();
        System.out.println(">>> Befor Revers  : "+original);
        int size=original.length();
        System.out.println("Length Of String  : "+size);
        for(int i=size-1;i>=0;i--){
            revers=revers+original.charAt(i);
            
        }
        System.out.println(">>> After Revers  : "+revers);
        
    }

   
    public static void main(String[] args) {
       Revers();
    }
    
}
