
package Loop;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int op,n,i;
        String ans;
       do{
           System.out.println("-----------------|||| M E N U ||||-----------------");
           System.out.println("[1].=> 2 + 4 + 6 + .... +n");
           System.out.println("[2].=> 2/2 + 4/2 + .... + n/2");
           System.out.println("[3].=> sqrt(2) + sqrt(4) + sqrt(6) +....+sqrt(n)");
           System.out.println("[4].=> 2/2 + 4/4 + 6/6 + .... +n/n");
           System.out.println("[5].=> 1! + 2! + 3! +....+n!");
           System.out.println("[6].=> 9 + 99 + 999 + ....+n");
           System.out.println("[7].=> Exit Application");
           System.out.println("====================================================");
           System.out.print("=> Pls Choose One Option[1-7]:  ");
           op=in.nextInt();
           switch(op){
               case 1:{
                   int sum=0;
                    System.out.println("[1].=> 2 + 4 + 6 + .... +n");
                    System.out.print("=> Pls Enter N : ");
                    n=in.nextInt();
                    i=2;
                    while(i<=n){
                        System.out.print(i+" + ");
                        sum=sum+i;
                        i+=2;
                    }
                    System.out.println("\b\b = "+sum);
                   
               }break;
               case 2:{
                   int sum=0;
                   System.out.println("[2].=> 2/2 + 4/2 + .... + n/2");
                   System.out.print("=> Pls Enter N : ");
                   n=in.nextInt();
                   for(i=2;i<=n;i+=2){
                       System.out.print(i+"/2 + ");
                       sum=sum+(i/2);
                   }
                   System.out.println("\b\b = "+sum);
                   
               }break;
               case 3:{
                   DecimalFormat df = new DecimalFormat("#.##");
                   double result=0;
                    System.out.println("[3].=> sqrt(2) + sqrt(4) + sqrt(6) +....+sqrt(n)");
                    System.out.print("=> Pls Enter N : ");
                    n=in.nextInt();
                    for(i=2;i<=n;i+=2){
                        System.out.print("sqrt("+i+") + ");
                        result=result+Math.sqrt(i)  ;
                    }
                    System.out.println("\b\b = "+df.format(result));
               }break;
               case 4:{
                   int sum=0;
                   System.out.println("[4].=> 2/2 + 4/4 + 6/6 + .... +n/n");
                    System.out.print("=> Pls Enter N : ");
                    n=in.nextInt();
                    i=2;
                    while(i<=n){
                        System.out.print(i+"/"+i+" + ");
                        sum=sum+(i/i);
                        
                       i=i+2; 
                    }
                    System.out.println("\b\b= "+sum);
                   
                   
               }break;
               case 5:{
                    int sum=0,fac=1;
                    System.out.println("[5].=> 1! + 2! + 3! +....+n!");
                    System.out.print("=> Pls Enter N : ");
                    n=in.nextInt();
                    for(i=1;i<=n;i++){
                        System.out.print(i+"! + ");
                        fac=fac*i;
                        sum=sum+fac;
                    }
                    System.out.println("\b\b= "+sum);
               }break;
               case 6:{
                      int sum=0,b=9;
                       System.out.print("=> Pls Enter N : ");
                       n=in.nextInt();
                      System.out.println("[6].=> 9 + 99 + 999 + ....+n");
                      for(i=1;i<=n;i++){
                          System.out.print(b+" + ");
                          sum=sum+b;
                          b=b*10+9;
                      }
                      System.out.println("\b\b= "+sum);
                   
               }break;
               
           }
           System.out.print("=> Pls Enter 'Yes' To Continues Program : ");
           ans=in.next();
           
       }while(ans.equalsIgnoreCase("yes"));
    }
    
}
