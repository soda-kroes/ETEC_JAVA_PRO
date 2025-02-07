
package Loop;
import java.util.*;
public class For_Each {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Pls Enter Charactor : ");
        char ch=in.next().charAt(0);
        in.close();
        boolean b=false;
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
        else if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
            System.out.println(ch+" is a consonant.");
        }
        else if(ch>='0' && ch<='9'){
            System.out.println(ch+" is a number.");
        }
        else{
            System.out.println(ch+" is not alphabet.");
        }
       
    }
    
}
