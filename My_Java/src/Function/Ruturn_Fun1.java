
package Function;


public class Ruturn_Fun1 {
    static int cube(int value){
        return (int) Math.pow(value, 3);
    }
    static int getVolume(int size){
        return cube(size);
    }

 
    public static void main(String[] args) {
        int valume;
        valume = getVolume(2);
        System.out.println(valume);
    }
    
}
