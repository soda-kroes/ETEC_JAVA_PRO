
package Array;

import java.util.Scanner;


public class Array2_ex2 {

  
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int row,col,sum=0;
        int arr[][] = new int[10][10];
        System.out.print("Pls Enter Row    : ");
        row=in.nextInt();
        System.out.print("Pls Enter Column : ");
        col=in.nextInt();
        System.out.println("Pls Enter "+(row*col)+" Value: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("Pls Enter Array["+i+"]["+j+"] = ");
                arr[i][j]=in.nextInt();
                
            }
        }
        System.out.println("----------Output------------");
         for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.println(" Array["+i+"]["+j+"] = "+arr[i][j]);
                sum=sum+arr[i][j];
                if(arr[i][j]%2==0){
                    
                }
                
            }
        }
         System.out.println("Sum Of Array = "+sum);
    }
    
}
