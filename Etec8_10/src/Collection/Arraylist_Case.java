
package Collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Arraylist_Case {

    public static void main(String[] args) {
        int op;
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        do{
            System.err.println("-------||| M E N U |||-------");
            System.out.println("[1].=> Input ");
            System.out.println("[2].=> Output ");
            System.out.println("[3].=> Search ");
            System.out.println("[4].=> Update ");
            System.out.println("[5].=> Delete ");
            System.out.println("[6].=> Add ");
            System.out.println("[7].=> Sort ");
            System.out.println("[8].=> Insert");
            System.out.println("[9].=> Exit ");
            System.out.println("-----------(^_^)-------------");
            
            System.out.println("Pls Choose One Option[1-9]: ");
            op=in.nextInt();
            switch(op){
                case 1:{
                    System.out.println("[1].=> Input ");
                }break;
            }
            
        }while(op!=9);
    }
    
}
