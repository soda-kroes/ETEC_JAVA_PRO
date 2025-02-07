
package Array;


import java.util.Hashtable;
import java.util.Map;

public class Test3 {
    public static void main(String[] args) {
        Hashtable<Integer,String> list = new Hashtable<>();
        
        list.put(1, "Dara");
        list.put(2, "Darith");
        list.put(3, "Vathana");
        list.put(4, "Daro");
        
       
        //list.clear();
        //list.remove(4);
        
         System.out.println(list.contains("Darak"));
         System.out.println(list);
         
         for(Map.Entry obj: list.entrySet() ){
             System.out.println(obj.getKey()+"=> "+obj.getValue());
  
         } 
    }
    
}
