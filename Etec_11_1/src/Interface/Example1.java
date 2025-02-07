
package Interface;

abstract class Test2 implements Test{
    public void a(){
        System.out.println("Hello A.");
    }
}
class Test3 extends Test2{

    @Override
    public void b() {
       System.out.println("Hello B.");
    }

    @Override
    public void c() {
       System.out.println("Hello C.");
    }

    @Override
    public void d() {
       System.out.println("Hello D.");
    }
    
}

public class Example1 {

    
    public static void main(String[] args) {
        Test2 obj = new Test3();
        obj.a();
        obj.b();
        obj.c();
        obj.d();
            
        
       
    } 
}
