
package HashTabel;
import java.util.Hashtable;
import java.util.Map;

public class Test1 {

 
    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<>();
        Hashtable<Integer,String> hs = new Hashtable<>();
        ht.put(1, "RUPP");
        ht.put(16,"ETEC");
        ht.put(12, "NPIC");
        ht.put(77, "SETEC");
//        System.out.println(ht);
        for(Map.Entry m: ht.entrySet()){
            System.out.println(m.getKey()+"----->"+m.getValue());
            
        }
        
//        ht.remove(16);
//        System.out.println("------- After Remove ----------");
//        for(Map.Entry m: ht.entrySet()){
//            System.out.println(m.getKey()+"----->"+m.getValue());
//            
//        }
//        ht.clear();
//        System.out.println("-------- After Clear ----------");
//        System.out.println(ht);

          System.out.println(" ============= Clone =================");
          hs=(Hashtable<Integer, String>)ht.clone();
          for(Map.Entry m: ht.entrySet()){
            System.out.println(m.getKey()+"----->"+m.getValue());
            
        }
      
        
    }
    
}
