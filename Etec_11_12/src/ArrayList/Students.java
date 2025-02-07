
package ArrayList;

import java.util.Scanner;


class Students{
    private int id;
    private String name,gender;
    private double score;
    
    //Default Contructor
    public Students() {
        id=0;
        name="null";
        gender="null";
        score=0;
    }
    //Constructor With Parameter
    public Students(int id, String name, String gender, double score) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.score = score;
    }
    //Properties

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public double getScore() {
        return score;
    }
    public void Input(){
        Scanner in = new Scanner(System.in);
        System.out.print("Pls Enter Id     : ");
        id=in.nextInt();
        System.out.print("Pls Enter Name   : ");
        name=in.next();
        System.out.print("Pls Enter Gender : ");
        gender=in.next();
        System.out.print("Pls Enter Score  : ");
        score=in.nextDouble();
        
    }
    public void Output(){
        System.out.println(id+"\t "+name+"\t "+gender+"\t "+score);
    }
    
    
    
    
    
   
}