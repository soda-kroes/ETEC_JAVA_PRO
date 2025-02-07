
package Function;

public class Check_Date {
    public static void main(String[] args) {
        
        DisplayPassword("Etec9");
    }   
    static void DisplayPassword(String password){
        if(password.length()>=5){
            System.out.println("Password: "+password);
        }
        else {
            System.err.println("Password Too Short.....!");
        }
      
        
    }
    
    
}
