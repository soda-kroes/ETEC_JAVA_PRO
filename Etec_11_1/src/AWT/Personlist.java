
package AWT;

import java.util.ArrayList;

public class Personlist {
    public String id,name,gender,add;
    public Personlist(String id, String name, String gender, String add) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.add = add;
       
    }
     static ArrayList<Personlist> list = new ArrayList();
    
    
}
