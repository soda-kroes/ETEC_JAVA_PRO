
package Array;

import java.util.Scanner;

public class test2 {

    
    public static void main(String[] args) {
        int option;
        Scanner in = new Scanner(System.in);
        int arr[] = new int[20];
        int i,n=0;
        
        do{
            System.out.println("--- Menu Choice ----");
            System.out.println("=> 1. INPUT");
            System.out.println("=> 2. OUTPUT");
            System.out.println("=> 3. SEARCH");
            System.out.println("=> 4. EXIT");
            System.out.println("-----------------------");
            System.out.print("Pls Choose One Option : ");
            option=in.nextInt();
            switch(option){
                case 1:{
                    System.out.println("=> 1. INPUT");
                    System.out.print("Pls Enter Number Of Array: ");
                    n=in.nextInt();
                    for(i=0;i<n;i++){
                        System.out.print("Pls Enter Array["+i+"]= ");
                        arr[i]=in.nextInt();
                    }
                    System.out.println("Input Completed.");
                    
                    
                }break;
                case 2:{
                     System.out.println("=> 2. OUTPUT");
                     for(i=0;i<n;i++){
                         System.out.println("Array["+i+"]= "+arr[i]);
                         
                     }
                    
                }break;
                case 3:{
                    boolean b = false;
                    System.out.println("=> 3. SEARCH");
                    int s_arr;
                    System.out.print("Pls Enter Number For Search : ");
                    s_arr=in.nextInt();
                     for(i=0;i<n;i++){
                         if(s_arr==arr[i]){
                             System.out.println("Array["+i+"]= "+arr[i]);
                             System.out.println("Search Found.");
                             b=true;
                             
                         }
                        
 
                     }
                     if(b==false){
                         System.out.println("Search Not Found.");
                         
                     }
                   
                    
                }break;
                
               
                
            }
            
            
        }while(option!=4);
        
    }
    
}
