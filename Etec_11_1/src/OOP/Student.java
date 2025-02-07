//folder
package OOP;

import java.util.Scanner;

class Student{
    //Data Member
    public int id;
    public String name,gender;
    public double score;

    
    
    
    //Method Member
    void Input(){
        Scanner in = new Scanner(System.in);
        System.out.print("=> Pls Enter Id     : ");
        id=in.nextInt();
        System.out.print("=> Pls Enter Name   : ");
        name=in.next();
        System.out.print("=> Pls Enter Gender : ");
        gender=in.next();
        System.out.print("=> Pls Enter Score   : ");
        score=in.nextDouble();
    }
    void Output(){
        System.out.println(id+"\t "+name+"\t "+gender+"\t "+score);
    } 
    
}