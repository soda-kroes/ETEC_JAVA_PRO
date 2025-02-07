
package HashTabel;

import java.util.Hashtable;
import java.util.Map;

public class Test2 {
 

    public static void main(String[] args) {
        
        
        Hashtable<Integer,String> hash_table = new Hashtable<>();
        Hashtable<Integer,String> hash = new Hashtable<>();
        
        hash_table.put(1005, "RUPP");
        hash_table.put(1004, "ETEC");
        hash_table.put(1003, "NPIC");
        hash_table.put(1002, "ITC");
        hash_table.put(1001, "NORTON");
        System.out.println("======== Object[1] ==========");
        for(Map.Entry all:hash_table.entrySet()){
            System.out.println(all.getKey()+":"+all.getValue());
            
        }
//        hash_table.remove(1005);
//        System.out.println("===== After Remove =====");
//         for(Map.Entry all:hash_table.entrySet()){
//            System.out.println(all.getKey()+":"+all.getValue());
//            
//        }
         
         //Clon
         System.out.println("======== Object[2] ==========");
         hash = (Hashtable<Integer, String>)hash_table.clone();
        for(Map.Entry all:hash_table.entrySet()){
            System.out.println(all.getKey()+":"+all.getValue());
            
        }
        
        System.out.println(hash_table.containsKey(1007));
        
        hash_table.clear();
        System.out.println("===== After Clear =========");
         System.out.println("clear os hz bro");
        for(Map.Entry all:hash_table.entrySet()){
            System.out.println(all.getKey()+":"+all.getValue());
           
            
        }
        
       
        
       
    }
    
}
