
package Collection;

import java.util.ArrayList;
import java.util.Collections;


public class Arraylist1 {

   
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        //Code Name Qty Price Amount
        
        //Add  
        list.add("Long");
        list.add("Dara");
        list.add("Vanda");
        list.add("Devith");
        list.add("Sokha");
        list.add(2, "Daro");
        System.out.println(list);
 //       System.out.println(list);
//        System.out.println(list.get(2));
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }
//Method Set
//        list.set(4, "Seyha");
//        System.out.println(list);
        
        System.out.println(list);
        //Method Remove
        list.remove(4);
         System.out.println(list);
         
         //Method contains
         boolean isCheck = list.contains("Vandy");
         System.out.println(isCheck);
         
         //Method Clear
//         list.clear();
//         System.out.println(list);
          System.out.println(list.size());
          
          //Method Sort
          Collections.sort(list);
        
          System.out.println(list);
          
          Collections.reverse(list);
          System.out.println(list);
          
         
    }
    
}
