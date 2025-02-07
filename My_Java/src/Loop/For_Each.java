
package Loop;


public class For_Each {

   
    public static void main(String[] args) {
        int numbers[] = {10,20,30,40};
//        for(int i=0;i<numbers.length;i++){
//            System.out.print(numbers[i]+" ");
//        }
          for(int x: numbers){
              System.out.print(x +" ");
          }
          System.out.println("\n****************************");
          String names[] = {"dara","sokha","long","seyha"};
          for(String Name: names){
              System.out.print(Name+",");
          }

    }
    
}
