
package Condition;


public class Login {

   
    public static void main(String[] args) {
       String name="soda";
       String pass="111";
       String cpass="111";
       
       if(name.equalsIgnoreCase("soda") && pass.equals("1111") && cpass.equals("1111")){
           System.out.println("Wellcome To Login.");
       }
       else if(!name.equalsIgnoreCase("soda") ){
           System.out.println("Invalid Name.");
       }
       else if(!pass.equals("1111")){
           System.out.println("Invalid Password.");
       }
       else if(!name.equalsIgnoreCase("soda") && pass.equals("1111") && !cpass.equals("1111")){
           System.out.println("Invalid Password.");
       }
       else{
           System.out.println("Invalid Name Or Password or Comfirmpass.");
       }
    }
    
}
