
package OOP;

import java.util.Scanner;

public class Student {
    Scanner in = new Scanner(System.in);
    public int id;
    public String name,sex;
    public double score;
    public void Input(){
        System.out.println("========== Input Student ===============");
        System.out.print("=> Input Id   : ");
        id=in.nextInt();
        System.out.print("=> Input Name : ");
        name=in.next();
        System.out.print("=> Input Sex  : ");
        sex=in.next();
        System.out.print("=> Input Score : ");
        score=in.nextDouble();
    }
    public void Output(){
        System.out.println("======== Information Student ===========");
        System.out.println("Id\t Name\t Gender\t Score");
        System.out.println("------------------------------");
        System.out.println(id+"\t "+name+"\t "+sex+"\t "+score);
    }
    
    
}
