
package Array;

import java.util.Scanner;

public class exer1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String Array[][] = new String[3][3];
        for(int i=0;i<Array.length;i++){
            System.out.println("======== Product["+(i+1)+"] =========");
            for(int j=0;j<Array.length;j++){
                if(j==0){
                    System.out.print("=> Enter Code    : ");   
                }
                else if(j==1){
                    System.out.print("=> Enter Name    : ");
                    
                }
                
                else{
                    System.out.print("=> Enter Price   : ");
                }
                Array[i][j] = in.next();

        }
            
    }
        
        System.out.println("=============== Ricipt ================");
                System.out.println("ID\t NAME\t PRICE");
                for(String product[] : Array){
                    for(String Product: product){
                        System.out.print(Product+"\t ");
                    }
                    System.out.println("");
                    
                }
                
    
    }
}
