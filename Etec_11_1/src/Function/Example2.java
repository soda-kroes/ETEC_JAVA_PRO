
package Function;


public class Example2 {
    static void GetGrade(double score){
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
    public static void main(String[] args) {
        GetGrade(40);
        
    }

}
