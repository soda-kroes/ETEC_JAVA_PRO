
package OOP;

import java.util.Scanner;

class Book{
    private int code;
    private String title,subject;
    private double price;

    public Book() {
    }

    public Book(int code, String title, String subject, double price) {
        this.code = code;
        this.title = title;
        this.subject = subject;
        this.price = price;
    }
    
    void Input(){
        Scanner in = new Scanner(System.in);
        System.out.print("Pls Enter Code    : ");
        code=in.nextInt();
        System.out.print("Pls Enter Title   : ");
        title=in.next();
        System.out.print("Pls Enter Subject : ");
        subject=in.next();
        System.out.print("Pls Enter Price   : ");
        price=in.nextDouble();
        
    }
    void Output(){
        System.out.println(code+"\t "+title+"\t "+subject+"\t "+price+"$");
    }
    //Property
    public int getCode() {
        return code;
    }


    
}


public class Object_Array_Case {

    static void Header(){
        System.out.println("Code\t Title\t Subject\t\t Price");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Book obj = new Book();//normal object
        Book book[]  = new Book[50];//object array
        int i,n=0;
        int option;
        do{
            System.out.println("-----||| M E N U |||----");
            System.out.println("[1]. => Input");
            System.out.println("[2]. => Output");
            System.out.println("[3]. => Search");
            System.out.println("[4]. => Update");
            System.out.println("[5]. => Delete");
            System.out.println("[6]. => Add");
            System.out.println("[7]. => Exit");
            System.out.println("----------(^_^---------)");
            System.out.print("Pls Chhose One Option[1-7]: ");
            option=in.nextInt();
            switch(option){
                case 1:{
                   System.out.println("[1]. => Input");  
                    System.out.print("Pls Enter Number Of Book : ");
                    n=in.nextInt();
                    for(i=0;i<n;i++){
                        System.out.println("----[BOOK#"+(i+1)+"]-----");
                        book[i] = new Book();
                        book[i].Input();
                    }
                    System.out.println("Input Success.");
                }break;
                case 2:{
                    Header();
                    for(i=0;i<n;i++){
                        book[i].Output();
                    }
                }break;
                case 3:{
                    boolean b=false;
                    System.out.print("Pls Enter Code For Search : ");
                    int s_code=in.nextInt();
                    for(i=0;i<n;i++){
                        if(s_code==book[i].getCode()){
                            Header();
                            book[i].Output();
                            
                            b=true;
                            System.out.println("Search Found.");
                        }
                    }
                    if(b==false){
                        System.out.println("Search Not Found.");
                    }
                }break;
                
                 case 4:{
                    boolean b=false;
                    System.out.print("Pls Enter Code For Update : ");
                    int s_code=in.nextInt();
                    for(i=0;i<n;i++){
                        if(s_code==book[i].getCode()){
                            System.out.println("---UPDATE DATA---");
                            book[i].Input();
                            
                            b=true;
                            System.out.println("Update Success.");
                        }
                    }
                    if(b==false){
                        System.out.println("Search Not Found.");
                    }
                }break;
                 case 5:{
                     int d_code;
                     boolean b=false;
                     System.out.print("Pls Enter Code For Delete : ");
                     d_code=in.nextInt();
                     for(i=0;i<n;i++){
                         if(d_code==book[i].getCode()){
                             for(int j=i;j<n;j++){
                                 //array[j] = array[j+1];
                                 book[j]=book[j+1];
                             }
                             --n;
                             b=true;
                             System.out.println("Delete Success.");
                         }
                     }
                     if(b==false){
                          System.out.println("Delete Not Success.");
                         
                     }
                 }break;
                 case 6:{
                     System.out.print("Pls Enter Number Of Book For Add More : ");
                     int add=in.nextInt();
                    for(i=n;i<n+add;i++){
                        System.out.println("----[BOOK#"+(i+1)+"]-----");
                        book[i] = new Book();
                        book[i].Input();
                    }
                    n=n+add;
                    System.out.println("Add Success.");
                 }break;
            }
            
            
        }while(option!=7);
       
    }
    
}
