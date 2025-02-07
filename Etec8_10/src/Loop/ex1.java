
package Loop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        String ans;
        int i,n,option;
        Scanner in = new Scanner(System.in);
       do{
            System.out.println("================ M E N U ===================");
            System.out.println("[1]. => 2 + 4 + 6 + ..... + n");
            System.out.println("[2]. => 2^2 + 4^2 + ..... + n^2");
            System.out.println("[3]. => 1! + 2! + 3!  ..... + n!");
            System.out.println("[4]. => sqrt(2) + sqrt(4) + sqrt(6) + ....+n");
            System.out.println("[5]. => 2/2 + 4/4 + 6/6..... + n");
            System.out.println("[6]. => 9 + 99 + 999 + .... + n");
            System.out.println("===================(^_^)======================");
            System.out.print("Pls Choose One Option[1-6]: ");
            option=in.nextInt();
            switch(option){
                case 1:{
                    int sum=0;
                    System.out.println("[1]. => 2 + 4 + 6 + ..... + n");
                    System.out.print("Pls Enter N : ");
                    n=in.nextInt();
                    for(i=2;i<=n;i=i+2){
                        System.out.print(i+" + ");
                        sum+=i;
                    }
                    System.out.println("\b\b= "+sum);
                    
                }break;
                case 2: {
                    System.out.println("[2]. => 2^2 + 4^2 + ..... + n^2");
                    double sum=0;
                    System.out.print("Pls Enter N : ");
                    n=in.nextInt();
                    i=2;//initiablize
                    do{
                        System.out.print(i+"^2 + ");
                        sum=(sum+Math.pow(i, 2));
                        i+=2;
                        
                    }while(i<=n);
                    System.out.println("\b\b= "+sum);
   
                }break;
                case 3: {
                    int fac=1,sum=0;
                    System.out.println("[3]. => 1! + 2! + 3!  ..... + n!");
                    System.out.print("Pls Enter N : ");
                    n=in.nextInt();
                    for(i=1;i<=n;i++){
                        System.out.print(i+"! + ");
                        fac=fac*i;
                        sum=sum+fac;
                    }
                     System.out.println("\b\b= "+sum);
                    
                }break;
                case 4: {
                     double sum=0;
                     DecimalFormat df = new DecimalFormat("###0.00");
                     System.out.println("[4]. => sqrt(2) + sqrt(4) + sqrt(6) + ....+n");
                     System.out.print("Pls Enter N : ");
                     n=in.nextInt();
                     for(i=2;i<=n;i+=2){
                         System.out.print("sqrt("+i+") + ");
                         sum=sum+Math.sqrt(i);
                     }
                       System.out.println("\b\b= "+df.format(sum));
                    
                }break;
                case 5: {
                      int sum=0;
                       System.out.println("[5]. => 2/2 + 4/4 + 6/6..... + n");
                       System.out.print("Pls Enter N : ");
                       n=in.nextInt();
                       for(i=2;i<=n;i+=2){
                           System.out.print(i+"/"+i+" + ");
                           sum=sum+(i/i);
                           
                       }
                       System.out.println("\b\b= "+sum);
                    
                }break;
                case 6: {
                    int z=9,sum=0;
                    System.out.println("[6]. => 9 + 99 + 999 + .... + n");
                    System.out.print("Pls Enter N : ");
                    n=in.nextInt();
                    for(i=1;i<=n;i++){
                        System.out.print(z+" + ");
                        sum=sum+z;
                        z=z*10+9;
                        
                    }
                     System.out.println("\b\b= "+sum);
                    
                    
                    
                }break;
                default:{
                    System.err.println("This Option Not Found.");
                }break;

            }
           
           
           System.out.print("Pls Enter 'Yes' To Continues Program: ");
           ans=in.next();
           
       }while(ans.equalsIgnoreCase("Yes"));
        
     
      
        
    }
    
}
