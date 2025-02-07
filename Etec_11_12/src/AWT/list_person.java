
package AWT;

import java.util.ArrayList;

  public class list_person{
        public String id,name,gender,add;

        public list_person(String id, String name, String gender, String add) {
            this.id = id;
            this.name = name;
            this.gender = gender;
            this.add = add;
        }
        static ArrayList<list_person> list = new ArrayList<>();
        
    }