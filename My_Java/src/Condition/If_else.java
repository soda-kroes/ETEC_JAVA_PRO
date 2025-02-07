
package Condition;

import java.text.DecimalFormat;
import java.util.Scanner;


public class If_else {

 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00$");
       
        int code;
        String name;
        int qty;
        float price;
        double total,dis,pay;
        
        System.out.println("======== Input Product =========");
        System.out.print("=> Input Code  : ");
        code=in.nextInt();
        System.out.print("=> Input Name  : ");
        name=in.next();
        System.out.print("=> Input Qty   : ");
        qty=in.nextInt();
        System.out.print("=> Input Price : ");
        price=in.nextFloat();
        total = price*qty;
        if(total>=1 && total<10){
            dis=total*10/100;
            pay=total-dis;
            
        }
        else if(total>=10 && total<20){
            dis=total*20/100;
            pay=total-dis;
        }
         else if(total>=20 && total<30){
            dis=total*30/100;
            pay=total-dis;
        }
         else if(total>=30 && total<40){
            dis=total*40/100;
            pay=total-dis;
        }
         else if(total>=40 && total<50){
            dis=total*50/100;
            pay=total-dis;
        }
         else if(total>=50 && total<60){
            dis=total*60/100;
            pay=total-dis;
        }
         else{
             dis=total*70/100;
            pay=total-dis;
         }
         System.out.println("Total    = "+df.format(total));
         System.out.println("Discount = "+df.format(dis));
         System.out.println("Payment  = "+df.format(pay));
               
              
    }
    
}
