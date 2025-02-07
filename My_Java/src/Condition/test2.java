
package Condition;

import javax.swing.JOptionPane;


public class test2 {

   
    public static void main(String[] args) {
       String gmail,pass,cpass;
       gmail="long";
       pass = "12345";
       cpass = "12345";
       
      if(gmail.equalsIgnoreCase("Long") && pass.equals("12345") && cpass.equals("12345")){
          JOptionPane.showMessageDialog(null, "Hello");
      }
       
    }
    
}
