
package Array;

public class Test2 {

   
    public static void main(String[] args) {
        String array[] = new String[5];
        array[0]="ETEC";
        array[1]="RUPP";
        array[2]="NPIC";
        array[3]="SETEC";
        array[4]="RULE";
//        for(int i=0;i<array.length;i++){
//            System.out.print(array[i]+" , ");
//        }

          for(String name: array){
              System.out.print(name+" , ");
          }
    }
    
}
