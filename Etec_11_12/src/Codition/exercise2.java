
package Codition;

import java.util.Scanner;

public class exercise2 {

 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int o_use,n_use,total,payment,price;
        System.out.println("-------|||| Electric City ||||---------");
        System.out.print("=> Pls Enter Old Month[kw] : ");
        o_use=in.nextInt();
        System.out.print("=> Pls Enter New Month[kw] : ");
        n_use=in.nextInt();
        total=n_use-o_use;
        if(total>=1 && total<10){
            price=500;
        }
        else if(total>=10 && total<20){
            price=550;
        }
        else if(total>=20 && total<30){
            price=600;
        }
        else if(total>=30 && total<40){
            price=650;
        }
        else if(total>=40 && total<50){
            price=700;
        }
        else if(total>=50 && total<60){
            price=750;
        }
        else{
            price=800;
        }
        payment=total*price;
        System.out.println("--------|||| Recipt ||||----------");
        System.out.println("Total   : "+total+"kw");
        System.out.println("Price   : "+price+"Riel");
        System.out.println("Payment : "+payment+"Riel");
    }
    
}
