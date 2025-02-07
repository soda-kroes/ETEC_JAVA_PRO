
package ArrayList;

import java.util.Scanner;

class Student{
    private int id;
    public String name,gender;
    public double score;
    //Default Constructor
    public Student(){
        id=0;
        name="null";
        gender="null";
        score=0;
    }
    //Constructor With Parameter
    public Student(int id, String name, String gender, double  score) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.score = score;
    }
    public void Input(){
        Scanner in = new Scanner(System.in);
        System.out.print("Pls Input Id    : ");
        id=in.nextInt();
         System.out.print("Pls Input Name : ");
        name=in.next();
         System.out.print("Pls Input Sex  : ");
        gender=in.next();
        System.out.print("Pls Input Score : ");
        score=in.nextDouble();
    }
    //Create Properies
    int getId(){
        return id;
    }
    
    
    public void Print(){
        System.out.println(id+"\t "+name+"\t "+gender+"\t "+score);
    }
    
    
}