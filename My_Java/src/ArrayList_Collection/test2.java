
package ArrayList_Collection;

import java.util.ArrayList;
import java.util.Comparator;

public class test2 {
 
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        //Method add
        list.add("Soda");
        list.add("Sopheak");
        list.add("Seyha");
        list.add("Deth");
//        System.out.println(list);


//        Method get
//        String name = list.get(2);
//        System.out.println(name);
        
//        set Method
        list.set(3, "Vanda");
        System.out.println(list);
        
//        System.out.println("After Remove : ");
//        list.remove(3);
//        System.out.println(list);
        
        System.out.println(list.size());
        
        Comparator<String> compare = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
               
            }
            
            
        };
        list.sort(compare);
        System.out.println("======= After Sort ===========");
        System.out.println(list);
        
        
        boolean obj = list.contains("Sada");
        System.out.println(obj);
        
        System.out.println(list.indexOf("Vanda"));
        
        
      
       
    }
    
}
