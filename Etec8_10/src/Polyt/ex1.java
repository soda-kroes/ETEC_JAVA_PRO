
package Polyt;
//Method Overloaing

public class ex1 {
    public void Myfun(int x){
        System.out.println("X = "+x);
      
    }
    public void Myfun(float y){
        System.out.println("Y = "+y);
        
    }
    public void Myfun(int x,int y){
         System.out.println("X = "+x);
         System.out.println("Y = "+y);
         System.out.println("X + Y = "+(x+y));
    }
    public void Myfun(int x,int y,int z){
        System.out.println("X = "+x);
        System.out.println("Y = "+y);
        System.out.println("Z = "+z);
    }
    public void Myfun(double x,float y){
        System.out.println("X = "+x);
        System.out.println("Y = "+y);
        
    }

    public ex1() {
        System.out.println("---Function1-----");
        Myfun(10);
        System.out.println("---Function2-----");
        Myfun(10.5f);
        System.out.println("---Function3-----");
        Myfun(20.4, 10.2f);
        System.out.println("---Function4-----");
        Myfun(10, 10, 10); 
        System.out.println("---Function5-----");
        Myfun(1, 2);
    }
    
    

    public static void main(String[] args) {
        new ex1();
    }
    
}
