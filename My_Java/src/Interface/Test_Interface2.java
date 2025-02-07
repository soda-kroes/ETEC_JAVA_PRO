
package Interface;
interface Sport{
    public void setHomeTeam();
    public void setStadium();
}
interface Football extends Sport{
    public void setPlayer(String player);
    public void setNumber(int num);
    public void setGoal(int goal);
} 

abstract class Demo implements Football{
    public void setHomeTeam(){
        System.out.println("Team : Bacelona");
    }
    public void setStadium(){
        System.out.println("Stadium : Cam Nou");
    }
}

class My_Sport extends Demo{

    @Override
    public void setPlayer(String player) {
        System.out.println("Player Name : "+player);
    }

    @Override
    public void setNumber(int num) {
        System.out.println("Player Number : "+num);
        
    }

    @Override
    public void setGoal(int goal) {
        System.out.println("Total goal in club : "+goal);
      
    }

}

public class Test_Interface2 {

    public static void main(String[] args) {
        
       Demo soccer = new My_Sport();
       soccer.setHomeTeam();
       soccer.setStadium();
       soccer.setPlayer("Messi");
       soccer.setNumber(10);
       soccer.setGoal(109);
    }
    
    
}
