
package AWT;

import java.util.ArrayList;

public class Studentlist {
    private int id;
    private String name,gender,course,time;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getCourse() {
        return course;
    }

    public String getTime() {
        return time;
    }
    

    public Studentlist(int id, String name, String gender, String course, String time) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.course = course;
        this.time = time;
    }
    static ArrayList<Studentlist> list = new ArrayList<>();
     
}
