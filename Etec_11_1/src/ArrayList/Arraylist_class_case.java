
package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Arraylist_class_case {
    static void Header(){
        System.out.println("Id\t Name\t Gender\t Score");
    }

    public static void main(String[] args) {
        int i,n,option;
        Scanner in = new Scanner(System.in);
        Student stu[] = new Student[50];
        ArrayList<Student> list = new ArrayList<>();
        do{
            System.out.println("-----||| M E N U |||----");
            System.out.println("[1]. => Input");
            System.out.println("[2]. => View");
            System.out.println("[3]. => Search");
            System.out.println("[4]. => Update");
            System.out.println("[5]. => Remove");
            System.out.println("[6]. => Add More");
            System.out.println("[7]. => Sort");
            System.out.println("[8]. => Clear");
            System.out.println("[9]. => Exit");
            System.out.println("--------------------");
            System.out.print("Choose One Option : ");
            option=in.nextInt();
            switch(option){
                case 1:{
                     System.out.println("[1]. => Input");
                     System.out.print("Pls Input Number Of Student : ");
                     n=in.nextInt();
                     for(i=0;i<n;i++){
                         System.out.println("----[Student"+(i+1)+"]-----");
                         stu[i] = new Student();
                         stu[i].Input();
                         list.add(stu[i]); 
                     }
                     System.out.println("Input Success.");
                    
                }break;
                case 2:{
                    System.out.println("[2]. => View");
                    Header();
                    for(i=0;i<list.size();i++){
                        stu[i].Print();
                    }
                    
                }break;
                case 3:{
                    boolean b=false;
                    System.out.print("Pls Enter Id For Search : ");
                    int s_id = in.nextInt();
                    for(i=0;i<list.size();i++){
                        if(s_id==list.get(i).getId()){
                            Header();
                            stu[i].Print();
                            b=true;
                            System.out.println("search found.");
                        }
                    }
                    if(b==false){
                        System.out.println(" search not found.");
                    }
                }break;
                case 7:{
                    Collections.sort(list,Comparator.comparing(Student::getId));
                    System.out.println("Sort Success");
                }break;
            }
            
        }while(option!=9);
    }
    
}
