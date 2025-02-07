
package Array;

import java.util.Scanner;


public class Array_case_function {
    int array[] = new int[100];
    int i,n,op;
    String ans;
    Scanner in = new Scanner(System.in);
    
    void Input(int array[],int n){
        for(i=0;i<n;i++){
            System.out.print("=> Enter Array["+i+"] : ");
            array[i]=in.nextInt();
        }
        System.out.println("Input Success.");
    }
    
    void Output(int array[],int n){
        for(i=0;i<n;i++){
            System.out.println("Arrary["+i+"] = "+array[i]);
        }
    }
    
    int  Search(int array[],int n){
        int index=-1,s_value;
        System.out.print("=> Enter Number For Search : ");
        s_value = in.nextInt();
        for(i=0;i<n;i++){
            if(s_value==array[i]){
                index=i;
                System.out.println(s_value+" search found.");
            }
            
        }
        return index;
        
    }
    
    void Update(int array[],int n){
        int Index = Search(array, n);
        if(Index==-1){
            System.out.println("Update Not Success.");
        }
        else{
            System.out.println("==== Update Data ====");
            System.out.print("=> Input New Number : ");
            int n_value=in.nextInt();
            array[Index]=n_value;
            System.out.println("Update Sucess.");
        }
    
}
    
    void Delete(int array[],int n){
        int delete = Search(array, n);
            if(delete == -1){
                System.out.println("Delete Not Success.");
            }
            else{
                for(i=delete;i<n;i++){
                    array[i] = array[i+1];
                }
                --n;
                System.out.println("Delete Success.");
                Output(array, n);
            }
    }
    
    void Add(int array[],int n,int add){
        for(i=n;i<add+n;i++){
            System.out.print("Enter Array["+i+"] = ");
            array[i]=in.nextInt();
        }
    }

    public Array_case_function() {
        do{
            System.out.println("=====> M E N U <=====");
            System.out.println("[1].=> Input ");
            System.out.println("[2].=> Output");
            System.out.println("[3].=> Search ");
            System.out.println("[4].=> Update");
            System.out.println("[5].=> Delete");
            System.out.println("[6].=> Add ");
            System.out.println("[7].=> Sort");
            System.out.println("[8].=> Exit");
            System.out.println("=====================");
            System.out.print("=> Please Choose One Option[1-8]: ");
            op=in.nextInt();
            switch(op){
                case 1:{
                    System.out.print("=> Enter Number Of Array : ");
                    n=in.nextInt();
                    Input(array, n);
                    
                }break;
                case 2:{
                    Output(array, n);
                    
                }break;
                
                case 3:{
                    int index=Search(array, n);
                    if(index==-1){
                        System.out.println("Search Not Found.");
                    }
                    else {
                        System.out.println("Search Found.");
                    }
                   
                }break;
                case 4:{
                    Update(array, n);
 
                }break;
                case 5:{
                    Delete(array, n);
                    
                }break;
                case 6:{
                    System.out.print("=> Input Number For Add : ");
                    int add=in.nextInt();
                    Add(array, n, add);
                    n=n+add;
                    System.out.println("Add Success.");
                    
                          
                    
                }break;
                case 8:{
                    System.exit(0);
                }break;
                
            }
            System.out.print("=> Please Enter 'Yes' To Continues : ");
           ans=in.next();
        }while(ans.equals("yes"));
    }
    

   
    public static void main(String[] args) {
        new Array_case_function();
       
    }
    
}
