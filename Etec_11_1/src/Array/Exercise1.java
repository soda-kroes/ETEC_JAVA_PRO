
package Array;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        String Product[][] = new String[3][3];
        int i,j;
        Scanner in = new Scanner(System.in);
        System.out.println("-----||| Add Product |||-----");
        for( i=0;i<3;i++){
            System.out.println("---Product["+(i)+"]----");
            for( j=0;j<3;j++){
                if(j==0){
                    System.out.print("Pls Enter Code : ");
                }
                if(j==1){
                    System.out.print("Pls Enter Name : ");
                }
                if(j==2){
                    System.out.print("Pls Enter Price : ");
                }
                Product[i][j]=in.next();
            }
           
        }
         System.out.println("-----||| Show Product |||------");
            System.out.println("CODE\t NAME\t PRICE($)");
            for( i=0;i<3;i++){
                for(j=0;j<3;j++){
                    System.out.print(Product[i][j]+"\t ");
                }
                System.out.println("");
                
            }
        
    }
    
}
