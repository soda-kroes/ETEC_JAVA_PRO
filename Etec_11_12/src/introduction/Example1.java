
package introduction;
import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {
        
        Scanner scanf = new Scanner(System.in);
        
        int id;
        String name,gender;
        double score;
        System.err.println("------- Input Information --------");
        
        System.out.print("=> Pls Enter Id     : ");
        id=scanf.nextInt();
        name=scanf.nextLine();
        System.out.print("=> Pls Enter Name   : ");
        name=scanf.nextLine();
        System.out.print("=> Pls Enter Gender : "); 
        gender=scanf.next();
        System.out.print("=> Pls Enter Score  : ");
        score=scanf.nextDouble();
        System.out.println("-------- Output Information --------");
        System.out.println("Id     : "+id);
        System.out.println("Name   : "+name);
        System.out.println("Gender : "+gender);
        System.out.println("Score  : "+score);
    }
    
}
