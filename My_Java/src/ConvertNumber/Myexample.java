
package ConvertNumber;

public class Myexample {

    public static void main(String[] args) {
        //Convert String To Integer
       String a="10";
       String b="20";
       double x = Double.parseDouble(a);
//       int y = Integer.parseInt(b);
        double y = Double.parseDouble(b);
        System.out.println("A + B = "+(x+y));
        System.err.println("***********************");
        //Convert Num To String
        int c = 50;
        int d = 100 ;
        System.out.println(c+d);
        String str1 = Integer.toString(c);
        String str2 = Integer.toString(d);
        System.out.println(str1+str2);
        
        
    }
    
}
