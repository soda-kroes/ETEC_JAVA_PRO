
package Array;

import java.util.Scanner;

public class Function_case {
     Scanner in = new Scanner(System.in);
     void Menu(){
            System.out.println("-------||| M E N U |||-------");
            System.out.println("[1].=> Input Array");
            System.out.println("[2].=> Output Array");
            System.out.println("[3].=> Search Array");
            System.out.println("[4].=> Update Array");
            System.out.println("[5].=> Delete Array");
            System.out.println("[6].=> Add Array");
            System.out.println("[7].=> Sort Array");
            System.out.println("[8].=> Insert Array");
            System.out.println("[9].=> Exit Application");
            System.out.println("-------------------------------");
          
    }
    void Input(int array[],int n){
        
        for(int i=0;i<n;i++){
            System.out.print("Enter Array["+i+"] = ");
            array[i]=in.nextInt();
 
        }
        System.out.println("Input Success.");
        
    }
   
    
    void Output(int array[],int n){
        for(int i=0;i<n;i++){
            System.out.println("Array["+i+"] = "+array[i]);
        }
        
    }
    
    int search(int array[],int n){
        int index=-1;
        int s_arr;
        boolean b=false;
        System.out.print("Pls Enter Number Of Array For Search : ");
        s_arr=in.nextInt();
        for(int i=0;i<n;i++){
            if(s_arr==array[i]){
                b=true;
                index=i;
            }
        }
        return index;
    }
    
    void Update(int array[],int n){
        int Index = search(array, n);
        if(Index==-1){
            System.out.println("Search Not Found.");
        }
        else {
            System.out.println("---||| UPDATE ARRAY |||---");
            System.out.print("Enter New Array: ");
            array[Index] = in.nextInt();
            System.out.println("Update Success.");
        }
    }
    
    void Delete(int array[],int n){
        int Index = search(array, n);
        if(Index==-1){
            System.out.println("Search Not Found.");
        }
        else {
            for(int i=Index;i<n;i++){
                array[i]= array[i+1];  
            }
            --n;
            System.out.println("Delete Success.");
        }
    }
     
    
    void Add(int array[],int n,int add){
        System.out.println("[6].=> Add Array");
      
        for(int i=n;i<n+add;i++){
            System.out.print("=> Enter Array["+i+"] = ");
            array[i]=in.nextInt();
        }

        System.out.println("Add Success.");
    }
    
    void Sort(int arr[],int n){
        System.out.println("[7].=> Sort Array");
        int temp;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i] > arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }
        System.out.println("----||| After Sort |||-----");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nSort Suceess.");
        
    }
    
    void Insert(int arr[],int n){
        System.out.println("[9].=> Insert Array");
        int index;
        System.out.print("Pls Enter Index For Insert: ");
        index=in.nextInt();
        if(index>n){
            System.err.println("Invalid For Insert.");
        }
        else{
            for(int i=n-1;i>=index;i--){
                arr[i+1] = arr[i];
            }
            ++n;
            System.out.println("=== Insert Array ====");
            System.out.println("Enter New Array: ");
            arr[index]=in.nextInt();
            System.out.println("Insert Success.");
        
    }
    }
    

    public Function_case() {
        int option,n=0,i;
        int arr[] = new int[50];
       
        do{
            Menu();
            System.out.print("Pls Choose One Option[1-9]: ");
            option=in.nextInt();
            switch(option){
                case 1:{
                    System.out.println("[1].=> Input Array");
                    System.out.print("Pls Enter Number Of Array: ");
                    n=in.nextInt();
                    Input(arr, n);
                    
                    
                }break;
                case 2:{
                     System.out.println("[2].=> Output Array");
                     Output(arr, n);
                    
                }break;
                case 3:{
                   int Index = search(arr, n);
                   if(Index==-1){
                       System.out.println("Search not found.");
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
                    int add;
                    System.out.print("Pls Enter Number For Add More : ");
                    add=in.nextInt();
                    Add(arr, n,add);
                    n=n+add;
                      
                }break;
                case 7:{
                    Sort(arr, n);
                }break;
                case 8:{
                    Insert(arr, n);
                }break;
                case 9:{
                    System.exit(0);
                }break;
                default:{
                    System.out.println("This Option Not Found.");
                }break;
            }
            
        }while(option!=9);
    }
    
    
    
    public static void main(String[] args) {
        new Function_case();      
       
    }
    
}
