
package Array;

import java.util.Scanner;
import javax.swing.JOptionPane;


public class Array_case {
    int array[] = new int[100];
    int i,n,op;
    String ans;
    Scanner in = new Scanner(System.in);

    public Array_case() {
        do{
            System.out.println("=====|||| M E N U ||||=====");
            System.out.println("[1].=> Input ");
            System.out.println("[2].=> Output");
            System.out.println("[3].=> Search ");
            System.out.println("[4].=> Update");
            System.out.println("[5].=> Delete");
            System.out.println("[6].=> Add ");
            System.out.println("[7].=> Sort");
            System.out.println("[8].=> Exit");
            System.out.println("=====================");
            System.out.print("=> Please Choose One Option[1-8]: ");
            op=in.nextInt();
            switch(op){
                case 1:{
                    System.out.println("[1].=> Input ");
                    System.out.print("=> Input Number Of Array : ");
                    n=in.nextInt();
                    for(i=0;i<n;i++){
                        System.out.print("=> Enter Array["+i+"] : ");
                        array[i]=in.nextInt();
                    }
                    System.out.println("Input Success.");
                    
                }break;
                case 2:{
                    System.out.println("[2].=> Output");
                    for(i=0;i<n;i++){
                        System.out.println("Array["+i+"] = "+array[i]);
                    }
                    
                }break;
                
                case 3:{
                    int b=0;
                    System.out.print("=> Input Number For Search : ");
                    int s_value=in.nextInt();
                    for(i=0;i<n;i++){
                        if(s_value==array[i]){
                            b=1;
                            System.out.println(s_value+" is search found.");
                        }
                    }
                    if(b==0){
                        System.out.println(s_value+"is seach not found.");
                    }
                    
                }break;
                
                case 4:{
                    int b=0;
                    System.out.print("=> Input Number For Search : ");
                    int s_value=in.nextInt();
                    for(i=0;i<n;i++){
                        if(s_value==array[i]){
                            b=1;
                            System.out.println("=== Update Data ===");
                            System.out.print("=> Enter Array["+i+"] : ");
                            array[i]=in.nextInt();
                            System.out.println("Update Success.");
                        }
                    }
                    if(b==0){
                        System.out.println(s_value+"is seach not found.");
                    }

                }break;
                case 5:{
                    int b=0;
                    System.out.print("=> Input Number For Search : ");
                    int s_value=in.nextInt();
                    for(i=0;i<n;i++){
                        if(s_value==array[i]){
                            for(int j=i;j<n;j++){
                                array[j] = array[j+1];
                            }
                            --n;
                            b=1;
                            System.out.println(s_value+"Delete Success.");
                        }
                    }
                    if(b==0){
                        System.out.println(s_value+"is seach not found.");
                    }
 
                }break;
                case 6:{
                    int add;
                    System.out.print("=> Input Number For Add : ");
                    add=in.nextInt();
                    for(i=n;i<add+n;i++){
                        
                         System.out.print("=> Enter Array["+i+"] : ");
                         array[i]=in.nextInt();
                         System.out.println("Add Success.");
                        
                    }
                    n=n+add;
                }break;
                case 7:{
                    int temp;
                    for(i=0;i<n;i++){
                        for(int j=i+1;j<n;j++){
                            temp = array[i];
                            array[i] = array[j];
                            array[j] = temp;
                            
                        }
                    }
                    System.out.println("Sort Success.");
                          
                    
                }break;
                case 8:{
                    System.exit(0);
                }break;
                default:{
                    System.out.println("This Option Not Found.");
                }
                case 9:{
                    int index;
                    System.out.print("=> Entet Index For Insert : ");
                    index=in.nextInt();
                    if(index>n){
                        System.out.println("Invalid For Insert.");
                    }
                    else {
                        for(i=n-1;i>=index;i--){
                            array[i+1] = array[i];
                        }
                        ++n;
                        System.out.println("==== Insert Data ======");
                        System.out.print("=> Enter Array : ");
                        array[index]=in.nextInt();
                        System.out.println("Insert Success.");
                    }
                }break;
                
            }
            System.out.print("=> Please Enter 'Yes' To Continues : ");
           ans=in.next();
        }while(ans.equals("yes"));
    }
    

   
    public static void main(String[] args) {
        new Array_case();
       
    }
    
}
