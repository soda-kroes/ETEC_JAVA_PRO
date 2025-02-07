
package Java_Introduct;

import java.util.Scanner;


public class test3 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int id;
        String name,sex,subject;
        double score;
        System.out.println("========= Input Student  Information =========");
        System.out.print("=> Input ID      : ");
        id=in.nextInt();
        name=in.nextLine();
        System.out.print("=> Input Name    : ");
        name=in.nextLine();
        System.out.print("=> Input Gender  : ");
        sex=in.next();
        System.out.print("=> Input Subject : ");
        subject=in.next();
        System.out.print("=> Input Score   : ");
        score=in.nextDouble();
        System.out.println("========= Show Student  Information =========");
        System.out.println("\t ID\t NAME\t\t GENDER\t SUBJECT\t SCORE");
        System.out.println("\t "+id+"\t "+name+"\t "+sex+"\t "+subject+"\t "+score);
       
        
    }
    
}
