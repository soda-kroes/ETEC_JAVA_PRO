
package Collection;
import java.util.Scanner;
public class Product {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int code;
        String name;
        int qty;
        double price,total,dis,pay;
        System.out.println("-----||| Add Product |||---------");
        System.out.print("Pls Input Code  : ");
        code=in.nextInt();
        System.out.print("Pls Input Name  : ");
        name=in.next();
        System.out.print("Pls Input Qty   : ");
        qty=in.nextInt();
        System.out.print("Pls Input Price : ");
        price=in.nextDouble();
        total=price*qty;
        System.out.println("Total = "+total+"$");
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
         else{
             dis=total*50/100;
            pay=total-dis;
         }
        
        
        
    }
    
}
