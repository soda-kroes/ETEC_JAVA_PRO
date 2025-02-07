
package Interface;

interface Sport{
    public void SetHomeTeam(String team);
    public void SetStadium(String staduim);
}
interface Football extends Sport{
    public void SetPlay(String name);
    public void SetNumber(int number);
    public void SetGoal(int goal);
}

abstract class DemoSport implements Football{
    public void SetHomeTeam(String team){
        System.out.println("Team : "+team);
    }
    public void SetStadium(String staduim){
        System.out.println("Staduim : "+staduim);
    }
    
class MyTeam extends DemoSport{

    @Override
    public void SetPlay(String name) {
        System.out.println("Player : "+name);
    }

    @Override
    public void SetNumber(int number) {
        System.out.println("Number : "+number);
    }

    @Override
    public void SetGoal(int goal) {
        System.out.println("Total Goal In Club : "+goal);
    }
    
}
public class ex2 {  
    public static void main(String[] args) {
       DemoSport obj = new MyTeam();
       obj.SetHomeTeam("Bacelona");
       obj.SetStadium("Cam Nou");
       obj.SetPlay("Messi");
       obj.SetNumber(10);
       obj.SetGoal(100);
    }
    
}
