
package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class arraylst2 {
    public static void main(String[] args) {
        
         ArrayList<Student> list = new ArrayList<String>(); 
       
        
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

         for(int i=0;i<list.size();i++){
             System.out.println(list.get(i));
         }
        
    }
    
}
