
package Awt;

import java.net.IDN;
import java.util.ArrayList;

public class StudentList {
  private int id;
   private String name,sex,course,time;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getCourse() {
        return course;
    }

    public String getTime() {
        return time;
    }
  

    public StudentList(int id, String name, String sex, String course, String time) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.course = course;
        this.time = time;
       
    }
    
    static ArrayList<StudentList> list = new ArrayList<>();
 
}
