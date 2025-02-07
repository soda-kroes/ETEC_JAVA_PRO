
package Swing;

import java.util.ArrayList;


public class Person_List {
    private int id;
    private String name,sex,address;

    public Person_List(int id, String name, String sex, String address) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getAddress() {
        return address;
    }
    static ArrayList<Person_List> list = new ArrayList<>();
    
    
}
