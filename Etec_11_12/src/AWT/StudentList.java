
package AWT;

import java.util.ArrayList;

public class StudentList {
    private int id;
    private String name,gender,course,time;

    public StudentList(int id, String name, String gender, String course, String time) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.course = course;
        this.time = time;
    }

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
    static ArrayList<StudentList> list = new ArrayList<>();
    
    
    
}
