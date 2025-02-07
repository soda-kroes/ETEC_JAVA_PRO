
package Array;
public class Test1 {
   
    public static void main(String[] args) {
     //   String names[]={"Dara","Long","Sokha","Vanda"};
     String names[] = new String[4];
     names[0]="Dara";
     names[1]="Long";
     names[2]="Sokha";
     names[3]="Vanda";
     
//       for(String Name:names){
//           System.out.println(Name);
//       }

         for(int i=0;i<names.length;i++){
             System.out.println(names[i]);
         }
    }
    
}
