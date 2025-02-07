
package Condition;

import java.util.Scanner;

public class Check_vowel {

  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch;
        boolean isvowel = false;
        System.out.print("=> Input Character : ");
        ch=in.next().charAt(0);
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            isvowel = true;
             
        }
        if(isvowel==true){
            System.out.println(ch+" is a Vowel.");
        }
        else if((ch>='a' && ch<='z') || (ch>='A' &&  ch<='Z')){
            System.out.println(ch+" is a Consonant.");
        }
        else if((ch>='0') && (ch<='9')){
            System.out.println(ch+" is a Number.");
        }
        else{
            System.out.println(ch+"is a alphabet.");
        }
      
    }
    
}
