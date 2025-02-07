
package Loop;

import java.util.Random;


public class Random_Number {

    
    public static void main(String[] args) {
        Random rnum = new Random();
        int i;
        System.out.println("Random Numbers");
        System.out.println("******************");
        for(i=0;i<=10;i++){
            System.out.println(rnum.nextInt(10)+1);
        }
    }
    
}
