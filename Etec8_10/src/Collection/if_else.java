
package Collection;

import java.util.Scanner;
public class if_else {
    public static void main(String[] args) {
        String username,pass,cpass;
        Scanner in = new Scanner(System.in);
        System.out.print("Pls Enter UserName        : ");
        username=in.next();
        System.out.print("Pls Enter Password        : ");
        pass=in.next();
        System.out.print("Pls Enter Comfirm Password: ");
        cpass=in.next();
        
        if(username.equalsIgnoreCase("dara")){
            if(pass.equals("123")){
                if(cpass.equals("123")){
                    System.out.println("Login Success.");
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
            System.out.println("Invalid UserName.");
        }
        
    }
    
}
