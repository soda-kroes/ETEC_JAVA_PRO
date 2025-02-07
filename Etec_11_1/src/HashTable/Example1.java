
package HashTable;

import java.util.Hashtable;
import java.util.Map;


public class Example1 {

    public static void main(String[] args) {
       Hashtable<Integer,String> list = new Hashtable<>();
       Hashtable<Integer,String>second_list = new Hashtable<>();
       list.put(1, "ETEC");
       list.put(2, "RUPP");
       list.put(3, "SETEC");
       list.put(4, "NPIC");
       for(Map.Entry obj : list.entrySet()){
           System.out.println(obj.getKey()+"->"+obj.getValue());  
       }
       //Remove
       list.remove(2);
        System.out.println("-----After Remove-------");
        for(Map.Entry obj : list.entrySet()){
           System.out.println(obj.getKey()+"->"+obj.getValue());  
       }
        //Contain
        boolean b= list.containsKey(2);
        System.out.println(b);
        //Clear
//        list.clear();
//        System.out.println(list);
        System.out.println("********Second List**********");
        System.out.println(second_list);
         second_list = (Hashtable<Integer,String>)list.clone();
          for(Map.Entry obj : second_list.entrySet()){
           System.out.println(obj.getKey()+"->"+obj.getValue());  
       }
        
    }
    
}
