package OOP;


import java.util.Scanner;

class Book{
     public int code;
    public String title,subject;
    public double price;
    public Book(){
        code = 0;
        title = "null";
        subject = "null";
        price = 0;
        
    }
    public Book(int Code,String Title,String Subject,double Price){
        code = Code;
        title = Title;
        subject = Subject;
        price = Price;
    }
    public int getCode(){
        return code;
    }
    public void setBook(int Code,String Title,String Subject,double Price){
        code = Code;
        title = Title;
        subject = Subject;
        price = Price;
    }
    public void Input(){
        Scanner in = new Scanner(System.in);
        System.out.print("=> Enter Code    : ");
        code=in.nextInt();
        System.out.print("=> Enter Title   : ");
        title=in.next();
        System.out.print("=> Enter Subject : ");
        subject=in.next();
        System.out.print("=> Enter Price   : ");
        price=in.nextDouble();
    }
    public void Output(){
        System.out.println("---------------------------------------");
        System.out.println(code+"\t "+title+"\t "+subject+"\t\t "+price+"$");
    }
}

public class Object_Array {
    Scanner in = new Scanner(System.in);
    public int Search (Book book[],int n){
        int s_code,search = -1;
        System.out.print("Enter Code For Search : ");
        s_code=in.nextInt();
        for(int i=0;i<n;i++){
            if(s_code == book[i].getCode()){
                search =i;
                 System.out.println("=====================> Book <=======================");
                 System.out.println("Code\t Title\t Subject\t Price");
                 book[i].Output();
            }
        }
        return search;
        
    }
    public int update (Book book[],int n){
        int u_code,update=-1;
        System.out.println("Enter Code For Update : ");
        u_code=in.nextInt();
        for(int i=0;i<n;i++){
            if(u_code == book[i].getCode()){
                update = i;
                System.out.println("=====> Enter New Data <========");
                System.out.print("=> Enter Code    : ");
                int n_code=in.nextInt();
                System.out.print("=> Enter Title   : ");
                String n_title=in.next();
                System.out.print("=> Enter Subject : ");
                String n_subject=in.next();
                System.out.print("=> Enter Price   : ");
                double n_price=in.nextDouble();
                book[i].setBook(n_code, n_title, n_subject, n_price); 
            }
        }
        return update;
    }
    
   public Object_Array(){
    
    int i,n=0,op;
    Book book[] = new Book[50];
    do{
    System.out.println("=========> Menu Choice <==========");
            System.out.println("[1]. ==> Input  Array ");
            System.out.println("[2]. ==> Output Array ");
            System.out.println("[3]. ==> Search Array ");
            System.out.println("[4]. ==> Update Array ");
            System.out.println("[5]. ==> Delete Array ");
            System.out.println("[6]. ==> Add    Array ");
            System.out.println("[7]. ==> Sort   Array ");
            System.out.println("--------------------------------");
            System.out.print("=> Enter Option : ");
            op = in.nextInt();
            switch(op){
                case 1:{
                    System.out.print("Enter Number Of Book : ");
                    n=in.nextInt();
                    for(i=0;i<n;i++){
                        System.out.println("==> Book#"+(i+1) );
                        book[i] = new Book();
                        book[i].Input();
                    }
                    System.out.println("Input Success.");
                }break;
                case 2:{
                    System.out.println("=====================> Book <=======================");
                    System.out.println("Code\t Title\t Subject\t Price");
                    for(i=0;i<n;i++){
                        book[i].Output();
                    }
                }break;
                case 3:{
                    int search = Search(book, n);
                    
                    if(search==-1){
                        System.out.println("Search Not Found.");
                    }
                    
                }break;
                case 4:{
                    int update = update(book, n);
                    if(update==-1){
                        System.out.println("Update Not Success.");
                    }
                            
                }break;
                case 5:{
                    int delete = Search(book, n);
                    if(delete !=-1){
                        for(int j=delete;j<n;j++){
                            book[j] = book[j+1];
                            n=n-1;
                        }
                        System.out.println("Delete Success.");
                    }
                    else {
                        System.out.println("Delete Not Success.");
                    }
                }break;
                case 6:{
                    System.out.print("Enter Number Of Book For Add : ");
                    int m=in.nextInt();
                    for(i=n;i<n+m;i++){
                        System.out.println("\t Book#"+(i+1));
                        book[i] = new Book();
                        book[i].Input();
                    }
                    n=n+m;
                    System.out.println("Add Successfully.");
                    
                }break;
                case 7:{
                    Book temp = new Book();
                    for(i=0;i<n;i++){
                        for(int j=i+1;j<n;j++){
                            if(book[i].getCode() > book[j].getCode()){
                                temp = book[i];
                                book[i] = book[j];
                                book[j] = temp;
                            }
                        }
                    }
                    System.out.println("Sort Success.");
                    
                }break;
            }
    
}while(op!=0);  
}

    public static void main(String[] args) {
     new Object_Array();
}
    
}
