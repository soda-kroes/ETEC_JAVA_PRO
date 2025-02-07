
package OOP;

import java.util.Scanner;


class Book{
    //data member
    private int code;
    private String title,subject;
    private float price;
    //default contructor
     public Book() {
    }
    
    //constructor with parameter
    public Book(int code, String title, String subject, float price) {
        this.code = code;
        this.title = title;
        this.subject = subject;
        this.price = price;
    }
     
    //Method member
    public void Input(){
        Scanner in = new Scanner(System.in);
        System.out.print("Pls Enter Code    : ");
        code=in.nextInt();
        System.out.print("Pls Enter Title   : ");
        title=in.next();
        System.out.print("Pls Enter Subject : ");
        subject=in.next();
        System.out.print("Pls Enter Price   : ");
        price=in.nextFloat(); 
    }
    public void Output(){
        System.out.println(code+"\t "+title+"\t "+"\t "+subject+"\t\t "+price+"$");
    }
    String getTitle(){
        return title;
    }
    int getCode(){
        return code;
    }
    
}

public class ObjectArray {
    static void Header(){
        System.out.println("Code\t Title\t\t Subject\t Price");
    }

   
    public static void main(String[] args) {
        Book book[] = new Book[50];
        int option,i,n=0;
        Scanner in = new Scanner(System.in);
        do{
            System.out.println("---||| MENU CHOICE |||---");
            System.out.println("[1]. Input");
            System.out.println("[2]. Output");
            System.out.println("[3]. Search");
            System.out.println("[4]. Update");
            System.out.println("[5]. Delete");
            System.out.println("[6]. Insert");
            System.out.println("[7]. Add");
            System.out.println("[8]. Sort");
            System.out.println("[9]. Clear");
            System.out.println("-----------------------");
            System.out.print("Pls Choose One Option[1-9]: ");
            option=in.nextInt();
            switch(option){
                case 1:{
                     System.out.println("[1]. Input");
                     System.out.print("Pls Enter Number Of Book : ");
                     n=in.nextInt();
                     for(i=0;i<n;i++){
                         book[i]=new Book();
                         book[i].Input();
                        
                     }
                     System.out.println("Input Completed.");

                }break;
                case 2:{
                     System.out.println("[2]. Output");
                     if(n==0){
                         System.out.println("Error.....! No Data.......!");
                     }
                     else {
                         Header();
                         for(i=0;i<n;i++){
                             book[i].Output();
                         }
                     }
                }break;
                case 3:{
                    boolean ischeck=false;
                    System.out.println("[3]. Search");
                    String sname;
                    System.out.print("Pls Enter Name For Search : ");
                    sname=in.next();
                    for(i=0;i<n;i++){
                        if(sname.equalsIgnoreCase(book[i].getTitle())){
                            Header();
                            book[i].Output();
                            ischeck=true;
                            System.out.println("Search Found.");
                            
                        }
                    }
                    if(ischeck==false){
                        System.out.println("Search Not Found.");
                    }
                    
                }break;
                case 4:{
                    int b=0;
                     System.out.println("[4]. Update");
                     int scode;
                     System.out.print("Pls Enter Code For Update : ");
                     scode=in.nextInt();
                     for(i=0;i<n;i++){
                         if(scode==book[i].getCode()){
                             System.out.println("---Update----");
                             book[i].Input();
                             System.out.println("Update Completed.");
                             b=1;
                         }
                     }
                     if(b==0){
                         System.out.println("Update Not Success.");
                     }
                }break;
                case 5:{
                    int b=0;
                    System.out.println("[5]. Delete");
                    int dcode;
                    System.out.print("Pls Enter Code For Delete : ");
                    dcode=in.nextInt();
                    for(i=0;i<n;i++){
                        if(dcode==book[i].getCode()){
                            for(int j=i;j<n;j++){
                                book[j]=book[j+1];
                            }
                            --n;
                            b=1;
                            System.out.println("Delete Completed.");
                            
                        }
                    }
                    if(b==0){
                        System.out.println("Delete Not Success.");
                    }
                    
                }break;
                case 6:{
                    System.out.println("[6]. Insert");
                    int index;
                    System.out.println("Pls Enter Index For Insert : ");
                    index=in.nextInt();
                    if(index>n){
                        System.out.println("Invalid For Insert.");
                    }
                    else{
                        for(i=n;i>=index;i--){
                            book[i+1]=book[i];
                        }
                        ++n;
                        System.out.println("---Insert---");
                        book[index].Input();
                        System.out.println("Insert Completed.");
                    }
                }break;
                case 7:{
                     System.out.println("[7]. Add");
                     int add;
                     System.out.print("Pls Enter Number For Add : ");
                     add=in.nextInt();
                    
                     for(i=n;i<n+add;i++){
                         book[i]=new Book();
                         book[i].Input();
                     }
                     n=n+add;
                     System.out.println("Add Success.");
                    
                    
                }break;
                case 8:{
                      System.out.println("[8]. Sort");
                      Book temp;
                      for(i=0;i<n;i++){
                          for(int j=i+1;j<n;j++){
                              if(book[i].getCode()>book[j].getCode()){
                                  temp=book[i];
                                  book[i]=book[j];
                                  book[j]=temp;
                              }
                          }
                      }
                      System.out.println("Sort Success.");
                }break;
                case 9:{
                    n=0;
                    System.out.println("Clear All Data Success.");
                }break;
                
            }
            
        }while(option!=10);
        
        
    }
    
}
