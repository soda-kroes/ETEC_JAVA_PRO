
package Interface;
//create interface

abstract class Demo implements Test{
    public void a(){
        System.out.println("Hello Interface.");
    }
}
class Test1 extends Demo{

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
public class ex1 {

    public static void main(String[] args) {
        Test obj = new Test1();
        obj.a();
        obj.b();
        obj.c();
        obj.d();
    }
    
}
