
package Array;

import java.util.Random;


public class ran_num {

    
    public static void main(String[] args) {
        Random rnum = new Random();
        int array[] = new int[20];
        for(int i=0;i<5;i++){
            array[i]=rnum.nextInt(10)+1;
            System.out.print(array[i]+" , ");
        }
    }
    
}
