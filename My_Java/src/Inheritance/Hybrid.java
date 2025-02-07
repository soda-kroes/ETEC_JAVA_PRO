
package Inheritance;
class GradFather{
   public void Show(){
       System.out.println("I am a grandfather.");
   }
}
class Father extends GradFather{
    public void Show(){
        System.out.println("I am a Father.");
    }
}
class Son extends  Father{
    public void Show(){
        System.out.println("I am a Son.");
    }
}

class Daugther extends Father {
    
    public void Show(){
        System.out.println("I am a Daughter.");
    }
}
    


public class Hybrid {

    public static void main(String[] args) {
        Daugther obj = new Daugther();
        obj.Show();
        
    }
    
}
