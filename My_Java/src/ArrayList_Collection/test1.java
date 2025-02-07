
package ArrayList_Collection;

import java.util.ArrayList;
import java.util.Iterator;


public class test1 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("RUPP");
        list.add("ETEC");
        list.add("NPIC");
        list.add("SETEC");
        
//        Iterator itr = list.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }

//         System.out.println(list);

          for(int i=0;i<list.size();i++){
              System.out.println(list.get(i));
              
          }
        
       
    }
    
}
