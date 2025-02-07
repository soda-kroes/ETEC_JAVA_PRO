
package Swing;

import java.util.ArrayList;

public class EmployeeList {
    public int Id;
    public String name,gender,address,position,phone;
    public double salary;

    public EmployeeList(int Id, String name, String gender, String address, String position, String phone, double salary) {
        this.Id = Id;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.position = position;
        this.phone = phone;
        this.salary = salary;
    }
    static ArrayList<EmployeeList> list = new ArrayList<>();
    
}
