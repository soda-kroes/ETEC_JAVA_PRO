
package Array;

import java.util.*;
public class arr_random {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int id[] = new int[20];
        String name[] = new String[20];
        String sex[] = new String[20];
        double score[] = new double[20];
        System.out.println("--------||| Input Information |||---------");
        System.out.print("=> Pls Enter Number Of Student : ");
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            System.out.println("----Student["+(i+1)+"]-----");
            System.out.print("=> Pls Enter Id    : ");
            id[i]=in.nextInt();
            System.out.print("=> Pls Enter Name  : ");
            name[i]=in.next();
            System.out.print("=> Pls Enter Sex   : ");
            sex[i]=in.next();
            System.out.print("=> Pls Enter Score : ");
            score[i]=in.nextDouble();
        }
        System.out.println("-----||| Display Information |||-------");
        System.out.println("ID\t NAME\t GENDER\t SCORE");
        System.err.println("--------------------------------");
        for(int i=0;i<n;i++){
            System.out.println(id[i]+"\t "+name[i]+"\t "+sex[i]+"\t "+score[i]);
        }
       
    }
    
}
