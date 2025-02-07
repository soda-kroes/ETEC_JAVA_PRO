
package Function;

public class Test1 {
    public void GetGrade(){
        int score=50;
        if(score>=100.0){
            System.out.println("Grade A.");
        }
        else if(score>=50){
            System.out.println("Grade B.");
        
        }
        else{
            System.out.println("Grade F.");
        } 
    }

    public Test1() {
        GetGrade();
    }
    public static void main(String[] args) {
       new Test1();
       
    }
    
}
