
package Introduction;

import java.util.Scanner;


public class Demo_Test {
    public static void main(String[] args) {
        Scanner scanf = new Scanner(System.in); 
        
      
        String name,gender;
        double score;
        
        System.out.println("----||| Input Student Information |||-----");
        System.out.print("=> Pls Enter Id     : ");
        int id=scanf.nextInt();
        name=scanf.nextLine();
        System.out.print("=> Pls Enter Name   : ");
        name=scanf.nextLine();
        System.out.print("=> Pls Enter Gender : ");
        gender=scanf.next();
        System.out.print("=> Pls Enter Score  : ");
        score=scanf.nextDouble();
        
        System.out.println("----||| Output Student Information |||-----");
        System.out.println("Id     : "+id);
        System.out.println("Name   : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Score  : "+score);

    }
}
