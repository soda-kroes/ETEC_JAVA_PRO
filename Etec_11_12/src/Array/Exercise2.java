
package Array;

import java.util.Random;
import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        double total=0,avg;
        char grade;
        Random rscore = new Random();
        Scanner in = new Scanner(System.in);
        int n,i;
        int arr_score[] = new int[20];
        System.out.print("=> Pls Enter Number Of Score For Random: ");
        n=in.nextInt();
        for(i=0;i<n;i++){
            arr_score[i] = rscore.nextInt(100)+1;
            System.out.println("Score["+(i+1)+"] = "+arr_score[i]);
            total=total+arr_score[i];
        }
        avg=total/n;
        if(avg>=90 && avg<=100){
            grade='A';
        }
        else  if(avg>=80 && avg<90){
            grade='B';
        }
         else  if(avg>=70 && avg<80){
            grade='C';
        }
         else  if(avg>=60 && avg<70){
            grade='D';
        }
         else  if(avg>=50 && avg<60){
            grade='E';
        }
         else {
             grade='F';
         }
        System.out.println("-------||| Display Score |||---------");
        System.out.println("Total   : "+total);
        System.out.println("Average : "+avg);
        System.out.println("Grade   : "+grade);
        
    }
    
}
