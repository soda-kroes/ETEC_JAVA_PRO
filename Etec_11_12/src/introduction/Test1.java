
package introduction;
import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int x,y;
        
        System.out.print("=> Enter X : ");
        x=cin.nextInt();
        System.out.print("=> Enter Y : ");
        y=cin.nextInt();
        System.out.println("-------- Operator --------");
        System.out.println(x+" + "+y+" = "+(x+y));
        System.out.println(x+" - "+y+" = "+(x-y));
        System.out.println(x+" x "+y+" = "+(x*y));
        System.out.println(x+" / "+y+" = "+(x/y));
        System.out.println(x+" % "+y+" = "+(x%y));
    } 
}
