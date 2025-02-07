
package Interface;

public class Convert {

    
    public static void main(String[] args) {
       //convert string to integer
       String num1="10";
       String num2="20";
       System.out.println(num1+num2);
//       int a = Integer.parseInt(num1);//a=10
//       int b = Integer.parseInt(num2);//b=20
         double a = Double.valueOf(num1);
         double b = Double.parseDouble(num2);
        System.out.println(a+b); 
        
        //convert number to string
        int value1=10;
        int value2=20;
        System.out.println(value1+value2);
        String str1 = Integer.toString(value1);
        String str2 = Integer.toString(value2);
        System.out.println(str1+str2);
        
    }
    
}
