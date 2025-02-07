
package Array;

import java.util.Scanner;


public class Function_With_Array {
    Scanner in = new Scanner(System.in);
    
    void Menu(){
            System.out.println("---||| MENU CHOICE |||---");
            System.out.println("[1]. Input");
            System.out.println("[2]. Output");
            System.out.println("[3]. Search");
            System.out.println("[4]. Update");
            System.out.println("[5]. Delete");
            System.out.println("[6]. Insert");
            System.out.println("[7]. Add");
            System.out.println("[8]. Sort");
            System.out.println("[9]. Exit");
            System.out.println("-----------------------");
    }
    void Input(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.print("Pls Enter Array["+i+"]= ");
            arr[i]=in.nextInt();
        }
        System.out.println("Input Success.");
        
    }
    void Output(int arr[],int n){
        for(int i=0;i<n;i++){
            System.out.println("Array["+i+"]= "+arr[i]);
        }
    }
    
    int Search(int arr[],int n){
        int s_arr,index=-1;
        System.out.print("Pls Enter Value For Search : ");
        s_arr=in.nextInt();
        for(int i=0;i<n;i++){
            if(s_arr==arr[i]){
                index=i;
            }
        }
        return index;
        
        
    }
    
    void Update(int arr[],int n){
        int Index = Search(arr, n);
        if(Index==-1){
            System.out.println("Update Not Success.");
        }
        else{
            System.out.println("------UPDATE-------");
            System.out.print("Pls Enter New Array: ");
            arr[Index]=in.nextInt();
            System.out.println("Update Success.");
            
            
        }
    }
    void Delete(int arr[],int n){
        int Index = Search(arr, n);
        if(Index==-1){
            System.out.println("Delete Not Success.");
        }
        else{
            for(int j=Index;j<n;j++){
                arr[j]=arr[j+1];
            }
            --n;
            System.out.println("Delete Success.");
        }
    }

    public Function_With_Array() {
        int option,n=0;
        int array[]=new int[50];
        
        do{
            Menu();
            System.out.print("Pls Choose One Option[1-9] : ");
            option=in.nextInt();
            switch(option){
                case 1:{
                    System.out.print("Pls Enter Size of Array: ");
                    n=in.nextInt();
                    Input(array, n);
                    
                }break;
                case 2:{
                    Output(array, n);
                }break;
                case 3:{
                    
                    int Index = Search(array, n);
                    if(Index==-1){
                        System.out.println("Search Not Found.");
                    }
                    else{
                        System.out.println("Search Found.");
                    }
                    
                    
                }break;
                case 4:{
                    Update(array, n);
                }break;
                case 5:{
                    Delete(array, n);
                }break;
            }
            
        }while(option!=0);
        
        
    }
    
    

    public static void main(String[] args) {
        new Function_With_Array();
        
    }
    
}
