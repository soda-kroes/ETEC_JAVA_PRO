
package Condition;

import java.util.Scanner;


public class Electric {

   
    public static void main(String[] args) {
       int old_use,new_use,total;
       double price,pay;
        Scanner in = new Scanner(System.in);
        System.out.println("=========> Enter Electricity <=========");
        System.out.print("=> Input Old Month : ");
        old_use=in.nextInt();
        System.out.print("=> Input New Month : ");
        new_use=in.nextInt();
        total = old_use-new_use;
        if(total>=1 && total<=10){
            price=500;
        }
        else if(total>=10 && total<=20){
            price=550;
        }
        else if(total>=20 && total<=30){
            price=600;
        }
         else if(total>=30 && total<=40){
            price=650;
        }
         else if(total>=40 && total<=50){
            price=700;
        }
         else if(total>=50 && total<=60){
            price=750;
        }
         else{
             price=800;
         }
        pay = price*total;
        
        System.out.println("================> Payment <==================");
        System.out.println("\t Old_Month\t New_Month\t Total[KW]\t Price\t Payment");
        System.out.println("\t "+old_use+"\t\t "+new_use+"\t\t "+total+"\t\t "+price+"\t "+pay);
    }
    
}
