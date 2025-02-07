
package Swing_GUI;

import java.util.ArrayList;

public class studentlist {
   int id;
   String name,gender,date,course,time;
   double price;
   String day,phone,image,room;

    public studentlist(int id, String name, String gender, String date, String course, String time, double price, String day, String phone, String image, String room) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.date = date;
        this.course = course;
        this.time = time;
        this.price = price;
        this.day = day;
        this.phone = phone;
        this.image = image;
        this.room = room;
    }
    static ArrayList<studentlist> list = new ArrayList();
}
