
package Condition;

import javax.swing.JOptionPane;


public class Example1 {

    public static void main(String[] args) {
        String uname,pass,cpass;
        uname="long";
        pass="123";
        cpass="123";
        if(uname.equals("long")){
            if(pass.equals("123")){
                if(pass.equals("123")){
                    System.out.println("***************");
                    System.out.println("Login Success.");
                    System.out.println("***************");
                }
                else{
                    System.err.println("Invalid Comfirm Password.");
                }
            }
            else{
                System.err.println("Invalid Password.");
            }
        }
        else{
            System.err.println("Invalid User Name.");
        }
        
        
    }
    
}
