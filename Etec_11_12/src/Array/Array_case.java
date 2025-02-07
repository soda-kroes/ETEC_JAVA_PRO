
package Array;

import java.util.Scanner;


public class Array_case {

    public static void main(String[] args) {
        int option;
        String ans;
        Scanner in = new Scanner(System.in);
        int arr[] = new int[50];
        int i,n=0;
        do{
            System.err.println("-------||| M E N U |||-------");
            System.out.println("[1].=> Input Array");
            System.out.println("[2].=> Output Array");
            System.out.println("[3].=> Search Array");
            System.out.println("[4].=> Update Array");
            System.out.println("[5].=> Delete Array");
            System.out.println("[6].=> Add Array");
            System.out.println("[7].=> Sort Array");
            System.out.println("[8].=> Exit Application");
            System.out.println("[9].=> Insert Array");
            System.out.println("-----------(^_^)-------------");
            System.out.print("=> Pls Choose One Option[1-8]: ");
            option=in.nextInt();
            switch(option){
                case 1:{
                    System.out.println("[1].=> Input Array");
                    System.out.print("=> Pls Enter Number Of Array: ");
                    n=in.nextInt();
                    for(i=0;i<n;i++){
                        System.out.print("=> Enter Array["+(i)+"] = ");
                        arr[i]=in.nextInt();
                    }
                    System.out.println("Input Successfully.");
                    
                }break;
                case 2:{
                    System.out.println("[2].=> Output Array");
                    System.out.print("Value Of Array: ");
                    for(i=0;i<n;i++){
                        System.out.print(arr[i]+" ");
                    }
                    System.out.println("");
                    
                }break;
                case 3:{
                    boolean check = false;
                    System.out.println("[3].=> Search Array");
                    int s_arr;
                    System.out.print("=> Pls Enter  Number For Search: ");
                    s_arr=in.nextInt();
                    for(i=0;i<n;i++){
                        if(s_arr==arr[i]){
                            check=true;
                            System.out.println(s_arr+" is search found.");
                        }
                    }
                    if(check==false){
                        System.out.println(s_arr+" is search not found.");
                    }
                    
                }break;
                case 4:{
                    int b=0;
                     System.out.println("[4].=> Update Array");
                    System.out.print("=> Pls Enter Number For Update: ");
                    int u_arr=in.nextInt();
                    for(i=0;i<n;i++){
                        if(u_arr==arr[i]){
                            System.out.println("--- Update Data ---");
                            System.out.print("Enter New Array["+i+"] = ");
                            arr[i]=in.nextInt();
                            b=1;
                            System.out.println("Update Success.");
                            
                        }
                    }
                    if(b==0){
                        System.err.println("Update Not Success.");
                    }
                }break;
                case 5:{
                    boolean b=false;
                    System.out.println("[5].=> Delete Array");
                    System.out.print("=> Pls Enter Number For Delete : ");
                    int d_arr=in.nextInt();
                    for(i=0;i<n;i++){
                        if(d_arr==arr[i]){
                            for(int j=i;j<n;j++){
                                arr[j] = arr[j+1];
                            }
                            --n;//remove n
                            System.out.println("Delete Success.");
                            b=true;
                        }
                    }
                    if(b==false){
                        System.err.println("Delete Not Success.");
                    }
                }break;
                case 6:{
                    System.out.println("[6].=> Add Array");
                    System.out.print("=> Pls Enter Number For Add More: ");
                    int add=in.nextInt();
                    for(i=n;i<n+add;i++){
                        System.out.print("=> Enter Array["+i+"] = ");
                        arr[i]=in.nextInt();
                    }
                    n=n+add;
                    System.out.println("Add Success.");
                    
                }break;
                case 7:{
                    System.out.println("[7].=> Sort Array");
                    int temp;
                    for(i=0;i<n;i++){
                        for(int j=i+1;j<n;j++){
                            if(arr[i] > arr[j]){
                                temp=arr[i];
                                arr[i]=arr[j];
                                arr[j]=temp;
                                
                            }
                        }
                    }
                    System.out.println("----||| After Sort |||-----");
                    for(i=0;i<n;i++){
                        System.out.print(arr[i]+" ");
                    }
                    System.out.println("\nSort Suceess.");
                    
                   
                }break;
                case 8:{
                    System.err.println("Good Bye............!");
                    System.exit(0);
                }break;
                case 9:{
                    System.out.println("[9].=> Insert Array");
                    int index;
                    System.out.print("Pls Enter Index For Insert: ");
                    index=in.nextInt();
                    if(index>n){
                        System.err.println("Invalid For Insert.");
                    }
                    else{
                        for(i=n-1;i>=index;i--){
                            arr[i+1] = arr[i];
                        }
                        ++n;
                        System.out.println("=== Insert Array ====");
                        System.out.println("Enter New Array: ");
                        arr[index]=in.nextInt();
                        System.out.println("Insert Success.");
                    }
                }break;
                default:{
                    System.err.println("This Option Not Found.");
                }break;
            }
            System.out.print("=> Pls Etner 'Yes' To Continues Program: ");
            ans=in.next();
            
            
        }while(ans.equalsIgnoreCase("yes"));
    }
    
}
