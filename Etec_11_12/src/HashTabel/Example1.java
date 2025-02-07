
package HashTabel;
import java.util.Hashtable;
import java.util.Map;

public class Example1 {
    public static void main(String[] args) {
        Hashtable<Integer,String> list = new Hashtable<>();
        Hashtable<Integer,String> secondlist = new Hashtable<>();
        //Put
        list.put(1, "ETEC");
        list.put(2, "RUPP");
        list.put(3, "NPIC");
        list.put(4, "SETEC");
        
        for(Map.Entry obj : list.entrySet()){
            System.out.println(obj.getKey()+" -> "+obj.getValue());
        }
        //Romove
        list.remove(2);
        System.out.println("----After Remove----");
         for(Map.Entry obj : list.entrySet()){
            System.out.println(obj.getKey()+" -> "+obj.getValue());
        }
        boolean b = list.containsKey(2);
        boolean x = list.containsValue("RUPP");
        
        System.out.println(b);
         System.out.println(x);
        
//        list.clear();
//        System.out.println("----After Clear----");
//         for(Map.Entry obj : list.entrySet()){
//            System.out.println(obj.getKey()+" -> "+obj.getValue());
//        }
        //Clone
        secondlist = (Hashtable<Integer, String>)list.clone();
         System.out.println("----After Clone----");
         for(Map.Entry obj : secondlist.entrySet()){
            System.out.println(obj.getKey()+" -> "+obj.getValue());
        }
        
    }
    
}
