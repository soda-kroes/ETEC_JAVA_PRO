
package Swing;

import java.util.ArrayList;


public class Employee_listt {
    int id;
    String name,sex,address,position,phone;
    double salary;

    public Employee_listt(int id, String name, String sex, String address, String position, String phone, double salary) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.address = address;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
    }

    
    static ArrayList<Employee_listt> list = new ArrayList<>();
}
