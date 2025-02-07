
package Interface;

interface Sport{
    public void setHomeTeam();
    public void setStadium();
}

interface Football extends Sport{
    public void setPlayer(String name);
    public void setNumber(int number);
    public void setGoal(int goal);
}

abstract class DemoSport implements Football{
    public void setHomeTeam(){
        System.out.println("Team   : Bacelona");
    }
     public void setStadium(){
         System.out.println("Stadium: CamNou");
     }   
}
class MyTeam extends DemoSport{

    @Override
    public void setPlayer(String name) {
        System.out.println("Name : "+name);
    
    }

    @Override
    public void setNumber(int number) {
        System.out.println("Number: "+number);
        
    }

    @Override
    public void setGoal(int goal) {
        System.out.println("Total Goal In Club: "+goal);
        
    }
    
}
public class Example2 {

   
    public static void main(String[] args) {
        DemoSport obj = new MyTeam();
        obj.setHomeTeam();
        obj.setStadium();
        obj.setPlayer("Messi");
        obj.setNumber(10);
        obj.setGoal(100);
       
    }
    
}
