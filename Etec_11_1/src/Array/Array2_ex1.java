
package Array;

import java.util.Scanner;


public class Array2_ex1 {

    public static void main(String[] args) {
        int arr[][]= new int[10][10];
       int row,column;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Row : ");
        row=in.nextInt();
        System.out.print("Enter Column : ");
        column=in.nextInt();
        System.out.println("Pls Eter "+(row*column)+" Value: ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print("Enter Array["+i+"]["+j+"] = ");
                arr[i][j]=in.nextInt();
            }
        }
        System.out.println("-------Show Value Of Array -------");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
               
                if(arr[i][j]%2==0){
                     System.out.println("Array["+i+"]["+j+"] = "+arr[i][j]);
               
                    
                }
            }
        }
       
    }
    
}
