
package Condition;


import javax.swing.JOptionPane;
import javax.swing.JOptionPane;

public class Ex1 {

    public static void main(String[] args) {
      String username,pass,cpass;
      username="Dara";
      pass="12345";
      cpass="12345";
      if(username.equals("Dara")){
          if(pass.equals("12345")){
              if(cpass.equals("12345")){
                  JOptionPane.showMessageDialog(null, "Login Success.");
              }
              
             else{
                 JOptionPane.showMessageDialog(null, "Invalid ComfirmPassword.");
          }
              
          }
           else{
          JOptionPane.showMessageDialog(null, "Invalid Password.");
      }
          
      }
      else{
          JOptionPane.showMessageDialog(null, "Invalid Username.");
      }
 
      
      
    }
    
}
