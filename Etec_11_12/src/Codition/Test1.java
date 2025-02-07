
package Codition;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00$");
        int code;
        String name;
        int qty;
        float price;
        double total,dis,pay;
        System.out.println("---------|||| Input Product ||||-----------");
        System.out.print("=> Pls Enter Code  : ");
        code=in.nextInt();
        System.out.print("=> Pls Enter Name  : ");
        name=in.next();
        System.out.print("=> Pls Enter Qty   : ");
        qty=in.nextInt();
        System.out.print("=> Pls Enter Price : ");
        price=in.nextFloat();
        total=price*qty;
        if(total>=1 && total<10){
            dis = total*10/100;
            pay = total-dis;
        }
        else if(total>=10 && total<20){
              dis = total*20/100;
              pay = total-dis;
        }
         else if(total>=20 && total<30){
              dis = total*30/100;
              pay = total-dis;
        }
         else if(total>=30 && total<40){
              dis = total*40/100;
              pay = total-dis;
        }
         else if(total>=40 && total<50){
              dis = total*50/100;
              pay = total-dis;
        }
         else{
              dis = total*60/100;
              pay = total-dis;
         }
        System.out.println("-------|||| Recipt ||||---------");
        System.out.println("Code\t Name\t Qty\t Price\t Total\t Discount\t Payment");
        System.out.println(code+"\t "+name+"\t "+qty+"\t "+df.format(price)+"\t "+df.format(total)+"\t "+df.format(dis)+"\t\t "+df.format(pay));
    }
    
}
