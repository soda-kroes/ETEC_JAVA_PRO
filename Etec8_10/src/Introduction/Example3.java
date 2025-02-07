
package Introduction;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int id;
        String name,sex,address;
        double score;
        System.out.println("--------|| Input Student ||----------");
        System.out.print("=> Pls Enter Id        : ");
        id=obj.nextInt();
        name=obj.nextLine();
        System.out.print("=> Pls Enter Name      : ");
        name=obj.nextLine();
        System.out.print("=> Pls Enter Sex       : ");
        sex=obj.next();
        System.out.print("=> Pls Etner Address   : ");
        address=obj.next();
        System.out.print("=> Pls Enter Score     : ");
        score=obj.nextDouble();
        System.out.println("-------|| Output Student ||--------");
        System.out.println("ID\t NAME\t GENDER\t ADDRESS\t SCORE");
        System.out.println("---------------------------------------");
        System.out.println(id+"\t "+name+"\t "+sex+"\t "+address+"\t "+score);
    }
    
}
