
package Inher;

class Gradfather{//Super Class
    public void Print(){
        System.out.println("I am a gradfather.");
    };
}
class Father extends Gradfather{//Sub class
    public void Print(){
        super.Print();//call function print
        System.out.println("I am a father.");
    }
}
class Son extends Father{
     
     public void Print(){
         super.Print();//call function print
        System.out.println("I am a son.");
    }
}
class Daugth extends Father{
     public void Print(){
        System.out.println("I am a daugth.");
    }
}


public class Hybrid {

    public static void main(String[] args) {
        Son son = new Son();
        son.Print();
        
    }
    
}
