
package ArrayList_Collection;

import java.util.Scanner;

class StudenT{
     
        private int id;
        private String name,sex;
        private double score;
        
        public StudenT(){
            id=0;
            name="null";
            sex="null";
            score=0.0;
        }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public double getScore() {
        return score;
    }
        public StudenT(int id,String name,String sex,double score){
            this.id=id;
            this.name=name;
            this.sex=sex;
            this.score=score;
        }
        public void Input(){
            Scanner in = new Scanner(System.in);
            System.out.print("=> Input Id    : ");
            id=in.nextInt();
            System.out.print("=> Input Name  : ");
            name=in.next();
            System.out.print("=> Input Sex   : ");
            sex=in.next();
            System.out.print("=> Input Score : ");
            score=in.nextDouble();
            
        }
        public void Output(){
            
            System.out.println(id+"\t "+name+"\t "+sex+"\t "+score);
        }
    }

