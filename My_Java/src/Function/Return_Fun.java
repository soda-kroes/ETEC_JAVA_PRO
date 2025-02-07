
package Function;

public class Return_Fun {

 
    public static void main(String[] args) {
        int a=200;
        int b=100;
        int c=MinFun(a, b);
        System.out.println("Minumum Number is : "+c);
       
    }
    
    public static int MinFun(int a,int b){
        if(a>b){
            return a;
            
        }
        else{
            return b;
        }
    }
    
}
