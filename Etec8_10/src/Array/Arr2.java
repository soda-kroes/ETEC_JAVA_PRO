
package Array;

import java.util.Scanner;

public class Arr2 {
    public static void main(String[] args) {
        String product[][] = new String[3][3];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.out.println("====Product["+(i+1)+"]======");
            for(int j=0;j<3;j++){
                if(j==0){
                    System.out.print("Pls Enter Id   : ");
                }
                else if(j==1){
                    System.out.print("Pls Enter Name : ");
                }
                else if(j==2){
                    System.out.print("Pls Enter Price : ");
                }
                product[i][j]=in.next();
            }
        }

       
    }
    
}
