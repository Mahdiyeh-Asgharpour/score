package grade;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double sum=0;
        int totalunit=0;
        Scanner z=new Scanner(System.in);
        Scanner q=new Scanner(System.in);
        System.out.println("write ur name:");
        String name=q.next();
        System.out.println("write ur total unit:");
        int total=z.nextInt();
        while (true){
            Scanner p=new Scanner(System.in);
            System.out.println("ur score:");
            double score=p.nextDouble();
            System.out.println("this unit:");
            int unit =z.nextInt();
            double lesson=score*unit;
            sum=sum+lesson;
            double average=sum/total;
            totalunit=totalunit+unit;
            System.out.println(name+"'s average:"+average);



            if (totalunit==total) break;

        }

	// write your code here
    }
}
