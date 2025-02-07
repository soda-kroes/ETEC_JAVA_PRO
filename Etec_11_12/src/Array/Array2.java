
package Array;


public class Array2 { 
    public static void main(String[] args) {
      int arr[][] = new int[3][3];
      int i,j;
      for(i=0;i<arr.length;i++){
          for(j=0;j<arr.length;j++){
              arr[i][j] = i+j;
              
          }
          System.out.println("");
      }
        System.out.println("-----Output------");
        for(int a[]:arr){
            for(int A:a){
                System.out.print(A+" ");
            }
            System.out.println("");
        }
    }
    
}
