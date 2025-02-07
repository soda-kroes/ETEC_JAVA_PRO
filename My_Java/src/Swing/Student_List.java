
package Swing;

import java.util.ArrayList;

public class Student_List {
    private int id;
    private String name,gender,date,course,time,day,phone,image,room;
    private float price;

    public Student_List(int id, String name, String gender, String date, String course, String time, String day, String phone, String image, String room, float price) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.date = date;
        this.course = course;
        this.time = time;
        this.day = day;
        this.phone = phone;
        this.image = image;
        this.room = room;
        this.price = price;
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

    public String getDate() {
        return date;
    }

    public String getCourse() {
        return course;
    }

    public String getTime() {
        return time;
    }

    public String getDay() {
        return day;
    }

    public String getPhone() {
        return phone;
    }

    public String getImage() {
        return image;
    }

    public String getRoom() {
        return room;
    }

    public float getPrice() {
        return price;
    }

    public static ArrayList<Student_List> getList() {
        return list;
    }
    
    

    
    static ArrayList<Student_List> list = new ArrayList();
}
