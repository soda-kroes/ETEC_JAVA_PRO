
package Array;

import java.util.Scanner;

public class Array2_three {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0;
        int array[][] = new int[20][20];
        System.out.print("=> Enter Row    : ");
        int row=in.nextInt();
        System.out.print("=> Enter Column : ");
        int column=in.nextInt();
        System.out.println("Enter "+(row*column)+" Value : ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print("=> Enter Array["+i+"]["+j+"] : ");
                array[i][j]=in.nextInt();
                sum=sum+array[i][j];
                
            }
            
        }
        System.out.println("================== Show Value =====================");
        System.out.print("Value Of Array : ");
        for(int i=0;i<row;i++){
            
            for(int j=0;j<column;j++){
                System.out.print(array[i][j]+"  ");
            }
        }
        System.out.println("Sum Of Array = "+sum);
    }
    
}
