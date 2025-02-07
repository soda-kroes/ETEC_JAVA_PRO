
package Codition;

import java.awt.SystemColor;
import java.util.Scanner;

public class Nested_loop {

   
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch;
        boolean b=false;
        System.out.print("=> Please Enter Character : ");
        ch=in.next().charAt(0);
        switch(ch){
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'i':
            case 'I':
            case 'o':
            case 'O':
            case 'u':
            case 'U':
                b=true;
        } 
        
        if(b==true){
            System.out.println(ch+" is a vowel.");
        }
        else if((ch>='A'&&ch<='Z') || (ch>='a' && ch<='z')){
            System.out.println(ch+" is a consonant.");
        }
        else if(ch>='0' && ch<='9'){
            System.out.println(ch+" is a number.");
        }
        else{
            System.err.println(ch+" is not alphabet.");
        }
        
        
    }
    
}
