
package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Example1 {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        //Use Method Add
        list.add("Dara");
        list.add("Sokha");
        list.add("Vanda");
        list.add("Seyha");
        list.add("Long");
//        Iterator obj = list.iterator();
//        while(obj.hasNext()){
//            System.out.println(obj.next());
//        }
//        System.out.println(list);
          for(int i=0;i<list.size();i++){
              System.out.println(list.get(i));
          }
        
        
    }
    
}
