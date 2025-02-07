
package Loop;

import java.util.Random;

public class For_Each {

    public static void main(String[] args) {
        Random obj = new Random();
        System.out.println("Random Number : ");
        System.out.println("**********************");
        for(int i=0;i<=5;i++){
            System.out.println(obj.nextInt(100));
        }
    }
    
}
