
package Array;

import java.util.Scanner;

public class case_menu {
     Scanner in = new Scanner(System.in);
    void Menu(){
        System.out.println("-----||| M E N U |||----");
        System.out.println("[1]. => Input");
        System.out.println("[2]. => Output");
        System.out.println("[3]. => Search");
        System.out.println("[4]. => Update");
        System.out.println("[5]. => Delete");
        System.out.println("[6]. => Insert");
        System.out.println("[7]. => Add");
        System.out.println("[8]. => Exit");
        System.out.println("----------(^_^---------)");
       
    }
    
    void Input(int array[],int n){
        for(int i=0;i<n;i++){
            System.out.print("=> Enter Array["+i+"] = ");
            array[i]=in.nextInt();
        }
        System.out.println("Input Success.");
        
    }
    
    void Output(int array[],int n){
        for(int i=0;i<n;i++){
            System.out.println("Array["+i+"] = "+array[i]);
        }
    }
    
    int Search(int array[],int n){
        int s_value;
        int index=-1;
        System.out.print("=> Pls Enter Number For Search: ");
        s_value=in.nextInt();
        for(int i=0;i<n;i++){
            if(s_value==array[i]){
                index=i;
            }  
        }
        return index;
    }
    
    void Update(int array[],int n){
        int update = Search(array, n);
        if(update==-1){
            System.out.println("Update Not Success.");
        }
        else{
            System.out.print("---|| Update ||---");
            System.out.println("Enter New Array = ");
            array[update]=in.nextInt();
            System.out.println("Update Success.");
        }
    }
    
    void Delete(int array[],int n){
        int Index = Search(array, n);
        if(Index==-1){
            System.out.println("Delete Not Success.");
        }
        else{
            for(int i=Index;i<n;i++){
                array[i] = array[i+1];
            }
            --n;
            System.out.println("Delete Success.");
        }
    }
    void Insert(int array[],int n){
        int index;
        System.out.print("Pls Enter Index For Insert: ");
        index=in.nextInt();
        if(index>n){
            System.out.println("Invalid For Insert.");
        }
        else{
            for(int i=n-1;i>=index;i--){
                array[i+1] = array[i];
            }
            ++n;
            System.out.println("---|| INSERT ||---");
            System.out.print("Enter New Array: ");
            array[index]=in.nextInt();
            System.out.println("Insert Success.");
        }
    }
    
    void Add(int array[],int n,int add){
        
      
        for(int i=n;i<n+add;i++){
            System.out.print("Enter Array["+i+"] = ");
            array[i]=in.nextInt();
        }
        
        System.out.println("Add Success.");
        
        
    }
  
    
    //Constructor
    public case_menu() {
        
        int option;
       
        int i,n=0;
        int arr[] = new int[100];
        do{
             Menu();
             System.out.print("=> Pls Choose One Option[1-8]: ");
             option=in.nextInt();
             switch(option){
                 case 1:{
                     System.out.println("[1]. => Input");
                     System.out.print("Pls Enter Number Of Array : ");
                     n=in.nextInt();
                     Input(arr, n);
                     
                 }break;
                 case  2:{
                      System.out.println("[2]. => Output");
                      Output(arr, n);
                      
                 }break;
                 case 3:{
                      System.out.println("[3]. => Search");
                      int Index = Search(arr, n);
                      if(Index==-1){
                          System.out.println("Search Not Found.");
                          
                      }
                      else{
                          System.out.println("Search Found.");
                      }
                     
                 }break;
                 case 4:{
                     Update(arr, n);
                 }break;
                 case 5:{
                     Delete(arr, n);
                 }break;
                 case 6:{
                     Insert(arr, n);
                 }break;
                 case 7:{
                     int add;
                     System.out.print("Enter Number For Add More: ");
                     add=in.nextInt();
                     Add(arr, n, add);
                     n=n+add;
                     
                 }break;
             }
            
            
        }while(option!=8);
   
    }
    
    public static void main(String[] args) { 
        new case_menu();
      
   }     
      
    
    
}
