
import java.util.Scanner;
import javax.swing.JOptionPane;


public class test3 {

   
    public static void main(String[] args) {
        String gmail,pass,cpass;
        Scanner in = new Scanner(System.in);
        System.out.print("=> Enter Gmail            : ");
        gmail=in.next();
        System.out.print("=> Enter Password         : ");
        pass=in.next();
        System.out.print("=> Enter Comfirm Password : ");
        cpass=in.next();
        if(gmail.equalsIgnoreCase("long")){
            if(pass.equalsIgnoreCase("abc123")){
                if(cpass.equalsIgnoreCase("abc123")){
                    System.out.println("Welcome To Login");
                }
                else{
                    System.out.println("Invalid Comfirm Password.");
                }
            }
            else{
                System.out.println("Invalid Password.");
            }
        }
        else{
            System.out.println("Invalid Gmail.");
        }
    }
    
}
