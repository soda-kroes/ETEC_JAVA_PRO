

package Inheritance;

import java.util.Scanner;

 class test1{
        protected int a;
        protected int b;
        protected int c;
    }
    class test2 extends test1{
        private int d;

        public test2(int a,int b,int c,int d){
            this.a=a;
            this.b=b;
            this.c=c;
            this.d=d;
        }
        public void Input(){
            Scanner in = new Scanner(System.in);
            System.out.println("=> Input A : ");
            a=in.nextInt();
            System.out.println("=> Input B : ");
            b=in.nextInt();
            System.out.println("=> Input C : ");
            c=in.nextInt();
            System.out.println("=> Input D : ");
            d=in.nextInt();
            
        }
        public void Output(){
            System.out.println("A = "+a);
            System.out.println("B = "+b);
            System.out.println("C = "+c);
            System.out.println("D = "+d);
        }

    }

public class Example1 {
   
    public static void main(String[] args) {
        test2 obj = new test2(10, 30, 40, 80);
        obj.Output();
        
    }
    
}
