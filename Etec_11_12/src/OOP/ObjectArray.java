
package OOP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class ObjectArray {
     Scanner in = new Scanner(System.in);
    void Header(){
        System.out.println("Code\t Title\t Subject\t Price");
    }
    
    int Search(Book books[],int n){
        int s_code,index=-1;
        System.out.print("Pls Enter Code For Search : ");
        s_code=in.nextInt();
        for(int i=0;i<n;i++){
            if(s_code==books[i].getCode()){
                index=i;
                Header();
                books[i].Output();
            }
        }
        return index;
    }
    
    void Update(Book books[],int n){
        int Index = Search(books, n);
        if(Index==-1){
            System.out.println("Update Not Success.");
        }
        else{
            System.out.println("-----UPDATE------");
            books[Index].Input();
            System.out.println("Update Sucess.");
        }
    }
    
    //Constructor
    public ObjectArray() {
        int option,i,n=0;
       
        Book book[] = new Book[50];
        
       
        
        do{
            System.out.println("-------||| M E N U |||-------");
            System.out.println("[1].=> Input ");
            System.out.println("[2].=> Output ");
            System.out.println("[3].=> Search ");
            System.out.println("[4].=> Update ");
            System.out.println("[5].=> Delete ");
            System.out.println("[6].=> Add ");
            System.out.println("[7].=> Sort ");
            System.out.println("[8].=> Exit Application");
            System.out.println("-----------(^_^)-------------");
            System.out.print("=> Pls Choose One Option[1-8]: ");
            option=in.nextInt();
            switch(option){
                case 1:{
                     System.out.println("[1].=> Input ");
                     System.out.print("Pls Enter Number Of Book: ");
                     n=in.nextInt();
                     for(i=0;i<n;i++){
                         System.out.println("----BOOK["+(i+1)+"]----");
                         book[i]=new Book();
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
                    int Index = Search(book, n);
                    if(Index==-1){
                        System.out.println("Search Not Found.");
                    }
                    else{
                        System.out.println("Search Found.");
                    }
                    
                    
                }break;
                case 4:{
                    Update(book, n);
                }break;
                case 5:{
                    int Index = Search(book, n);
                    if(Index==-1){
                        System.out.println("Delete Not Success.");
                    }
                    else{
                        for(int j=0;j<Index;j++){
                           // arr[j]=arr[j+1];
                           book[j] = book[j+1];
                        }
                        --n;
                        System.out.println("Delete Success.");
                    }
                    
                }break;
                case 6:{
                    System.out.println("[6].=> Add ");
                    System.out.print("Pls Enter Number Of Book For Add More: ");
                    int add=in.nextInt();
                    for(i=n;i<n+add;i++){
                         System.out.println("----BOOK["+(i+1)+"]----");
                         book[i]=new Book();
                         book[i].Input();
                    }
                    n=n+add;
                    System.out.println("Add Success.");
                }break;
                case 7:{
                     Book temp;
                     for(i=0;i<n;i++){
                         for(int j=i+1;j<n;j++){
                            if(book[i].getPrice() > book[j].getPrice()){
                                temp = book[i];
                                book[i]=book[j];
                                book[j]=temp;
                            }
                            
                         }
                     }
                     System.out.println("Sort Success.");
                }break;
            }
            
        }while(option!=8);
    }
    
    public static void main(String[] args) {
        new ObjectArray();
    }
    
}
 