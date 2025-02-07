
package OOP;

import java.util.Scanner;

class Student{
    public int id;
    public String name,sex;
    public double score;
    
    public void Input(){
        Scanner in = new Scanner(System.in);
        System.out.println("------||| Input Student |||-------");
        System.out.print("=> Pls Enter Id    : ");
        id=in.nextInt();
        System.out.print("=> Pls Enter Name  : ");
        name=in.next();
        System.out.print("=> Pls Enter Sex   : ");
        sex=in.next();
        System.out.print("=> Pls Enter Score : ");
        score=in.nextDouble();
    }
    public void Print(){
        System.out.println(id+"\t "+name+"\t "+sex+"\t "+score);
    }
}
