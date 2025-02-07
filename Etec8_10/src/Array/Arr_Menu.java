
package Array;

import java.util.Scanner;

public class Arr_Menu {
    
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[]= new int[50];
        int i,n=0;
        int option;
        do{
            System.out.println("---||| MENU CHOICE |||---");
            System.out.println("[1]. Input");
            System.out.println("[2]. Output");
            System.out.println("[3]. Search");
            System.out.println("[4]. Update");
            System.out.println("[5]. Delete");
            System.out.println("[6]. Insert");
            System.out.println("[7]. Add");
            System.out.println("[8]. Sort");
            System.out.println("[9]. Exit");
            System.out.println("-----------------------");
            System.out.print("Pls Choose One Option[1-9]: ");
            option=in.nextInt();
            switch(option){
                case 1->{
                     System.out.println("[1]. Input");
                     System.out.print("Pls Enter Size Array: ");
                     n=in.nextInt();
                     for(i=0;i<n;i++){
                         System.out.print("Pls Enter Array["+i+"] = ");
                         arr[i]=in.nextInt();
                     }
                     System.out.println("Input Success.");
                    
                }
                case 2-> {
                    System.out.println("[2]. Output");
                    System.out.print("Value Of Array : ");

                     for(i=0;i<n;i++){
                         System.out.print(arr[i]+"  ");
                     }
                     System.out.println("");
                }
                case 3->{
                    System.out.println("[3]. Search");
                    int s_arr;
                    boolean ischeck=false;
                    System.out.print("Pls Enter Number For Search : ");
                    s_arr=in.nextInt();
                    for(i=0;i<n;i++){
                        if(s_arr==arr[i]){
                            System.out.println(s_arr+" is search found.");
                            ischeck=true;
                        }
                        
                    }
                    if(ischeck==false){
                        System.out.println(s_arr+" is search not found.");
                    }
   
                }
                case 4->{
                    System.out.println("[4]. Update"); 
                    int s_arr,b=0;
                    System.out.print("=> Pls Enter Number For Update : ");
                    s_arr=in.nextInt();
                    for(i=0;i<n;i++){
                        if(s_arr==arr[i]){
                            System.err.println("---UPDATE DATA---");
                            System.out.print("=> Input New Array : ");
                            arr[i]=in.nextInt();
                            System.out.println("Update Success.");
                            b=1;
                            
                        }
                    } 
                    if(b==0){
                        System.out.println("Update Not Sucess.");
                    }
 
                }
                case 5->{
                     System.out.println("[5]. Delete");
                     int d_arr,b=0;
                     System.out.print("=> Pls Enter Number For Delete : ");
                     d_arr=in.nextInt();
                     for(i=0;i<n;i++){
                         if(d_arr==arr[i]){
                             for(int j=i;j<n;j++){
                                 arr[j]=arr[j+1];
                             }
                             --n;
                              b=1;
                              System.out.println("Delete Success.");
                             
                         }
                     }
                     if(b==0){
                         System.out.println("Delete Not Success.");
                     }
                    
                }
                case 6->{
                      System.out.println("[6]. Insert");
                      int index;//2
                      System.out.print("Pls Enter Index For Insert : ");
                      index=in.nextInt();//0 1 2 
                      if(index>n){
                          System.out.println("Invalid For Insert.");
                      }
                      else {
                          for(i=n-1;i>=index;i--){
                              arr[i+1] = arr[i];
                          }
                          ++n;
                          System.out.print("Pls Enter New Arrary: ");
                          arr[index]=in.nextInt();
                          System.out.println("Insert Success.");
                         
                      }
                }
                case 7->{
                    System.out.println("[7]. Add");
                    int add;
                    System.out.print("Pls Enter Number For Add: ");
                    add=in.nextInt();
                    for(i=n;i<n+add;i++){
                        System.out.print("Pls Enter Array["+i+"] = ");
                        arr[i]=in.nextInt();
                         
                    }
                    n=n+add;
                    System.out.println("Add Success.");
                    
                }
                case 8->{
                    System.out.println("[8]. Sort");
                    int temp;
                    for(i=0;i<n;i++){
                        for(int j=i+1;j<n;j++){
                            if(arr[i]>arr[j]){
                                temp = arr[i];
                                arr[i] = arr[j];
                                arr[j]=temp;
                            }
                        }
                        
                    }
                    System.out.println("Sort Success.");
                    
                }
                case 9->{
                    System.out.println("Good Bye...........!");
                }
                default->{
                    System.out.println("Your Option Not Found.");
                }
                
               
            }
            
            
        }while(option!=9);
       
    }
    
}
