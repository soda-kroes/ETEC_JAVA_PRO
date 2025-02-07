
package OOP;

import java.util.Scanner;
import java.util.logging.Logger;


public class Book {
    //Datamember 
    private int code;
    private String title;
    private String subject;
    private double price;
    
    //Default Constructor
    public Book(){
        code=0;
        title="null";
        subject="null";
        price=0;
    }
    //Constructor Parameter

    public Book(int code, String title, String subject, double price) {
        this.code = code;
        this.title = title;
        this.subject = subject;
        this.price = price;
    }
    //Property

    public int getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public String getSubject() {
        return subject;
    }

    public double getPrice() {
        return price;
    }
    
    
    
    
    
    
    public void Input(){
        Scanner in = new Scanner(System.in);
        System.out.println("-----||| Input Book |||------");
        System.out.print("=> Pls Enter Code    : ");
        code=in.nextInt();
        System.out.print("=> Pls Enter Title   : ");
        title=in.next();
        System.out.print("=> Pls Enter Subject : ");
        subject=in.next();
        System.out.print("=> Pls Enter Price   : ");
        price=in.nextDouble();
    }
    public void  Output(){
        System.out.println(code+"\t "+title+"\t "+subject+"\t "+price);
    }
    public  void Header(){
        System.out.println("Code\t Title\t Subject\t Price");
    }
    
}
