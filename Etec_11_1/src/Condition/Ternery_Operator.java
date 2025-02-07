
package Condition;

import java.util.Scanner;

public class Ternery_Operator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int o_use,n_use,total,pay,price;
        System.out.println("-------||| Electric |||---------");
        System.out.print("=> Pls Enter Old_Use[kw] : ");
        o_use=in.nextInt();
        System.out.print("=> Pls Enter New_Use[Kw] : ");
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
        pay=total*price;
        System.out.println("------------||| Recipt |||--------------");
        System.out.println("Old_Month\t New_Month\t Total[Kw]\t Price\t Payment");
        System.out.println(o_use+"\t\t "+n_use+"\t\t "+total+"\t\t "+price+"\t "+pay+"Riel");
       
    }
    
}
