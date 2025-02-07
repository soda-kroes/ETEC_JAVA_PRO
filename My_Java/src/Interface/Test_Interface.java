
package Interface;
interface Test{
    public void a();
    public void b();
    public void c();
    public void d();
    
} 
abstract class Test1 implements Test{
   public void a(){
       System.out.println("Hello Interface.");
   }
  
}
class Test2 implements Test{

    @Override
    public void a() {
        System.out.println("Hello A.");
    }

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
public class Test_Interface {

    public static void main(String[] args) {
        Test obj = new Test2();
        obj.a();
        obj.b();
    }
    
}
