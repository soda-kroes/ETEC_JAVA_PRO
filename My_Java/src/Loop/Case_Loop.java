
package Loop;

import java.util.Scanner;


public class Case_Loop {

  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int op,n;
        String answer;
       do{
           System.out.println("================== Menu Choice ==============");
           System.out.println("[1]. => 2 + 4 + 6 + ....+n");
           System.out.println("[2]. => 2^2 + 4^2 + 6^2 + ....+n");
           System.out.println("[3]. => 1! + 2! + 3! + ....+n");
           System.out.println("[4]. => sqrt(2) + sqrt(4) + sqrt(6) + ....+n");
           System.out.println("[5]. => 2/2 + 4/4 + 6/6 + ....+n");
           System.out.println("[6]. => 9 + 99 + 999 + .....+n");
           System.out.println("==============================================");
           System.out.print("=> Please Choose One Option[1-6] : ");
           op=in.nextInt();
           switch(op){
               case 1:{
                    int sum=0;
                    System.out.println("[1]. => 2 + 4 + 6 + ....+n");
                    System.out.print("=> Input N : ");
                    n=in.nextInt();
                    for(int i=2;i<=n;i+=2){
                        System.out.print(i+" + ");
                        sum=sum+i;
                        
                    }
                    System.out.println("\b\b= "+sum);
                    
               }break;
               case 2:{
                    int sum=0;
                    System.out.println("[2]. => 2^2 + 4^2 + 6^2 + ....+n");
                    System.out.print("=> Input N : ");
                    n=in.nextInt();
                    for(int i=2;i<=n;i+=2){
                        System.out.print(i+" ^2+ ");
                        sum=(int) (sum+Math.pow(i, 2));
                        
                    }
                    System.out.println("\b\b= "+sum);
                    
                   
               }break;
               case 3:{
                   int sum=0;
                   System.out.println("[3]. => 1! + 2! + 3! + ....+n");
                   int fac=1;
                  System.out.print("=> Input N : ");
                    n=in.nextInt();
                    for(int i=1;i<=n;i++){
                        System.out.print(i+"!+ ");
                       fac = fac*i;
                       sum=sum+fac;
                        
                    }
                    System.out.println("\b\b= "+sum);

               }break;
               case 4:{
                   double sum=0.0;
                   System.out.println("[4]. => sqrt(2) + sqrt(4) + sqrt(6) + ....+n");

                  System.out.print("=> Input N : ");
                    n=in.nextInt();
                    for(int i=2;i<=n;i+=2){
                        System.out.print("sqrt("+i+") + ");
                        sum=sum+Math.sqrt(i);
                       
                        
                    }
                    System.out.println("\b\b= "+sum);
                   
               }break;
               case 5:{
                   System.out.println("[5]. => 2/2 + 4/4 + 6/6 + ....+n");
                   double sum=0.0;
                    
                    System.out.print("=> Input N : ");
                    n=in.nextInt();
                    for(int i=2;i<=n;i+=2){
                        System.out.print(i+"/"+i+" + ");
                        sum=sum+(i/i);
                        
                    }
                    System.out.println("\b\b= "+sum);
                   
                   
               }break;
               case 6:{
                   System.out.println("[6]. => 9 + 99 + 999 + .....+n");
                   System.out.print("=> Input N : ");
                   n=in.nextInt();
                   int sum=0,b=9;
                   for(int i=1;i<=n;i++){
                       sum=sum+b;
                       System.out.print(b+" + ");
                       b=b*10+9;
                   }
                   System.out.println("\b\b= "+sum);
                   
               }break;
                   
           }
           System.out.print("Pleaes Enter 'Yes' To Continues : ");
           answer=in.next();
           
       }while(answer.equalsIgnoreCase("yes"));
    }
    
}
