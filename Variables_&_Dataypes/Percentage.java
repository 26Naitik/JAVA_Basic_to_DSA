package CompleteJava;

//write a java program to calculate percentage of marks obtained in 5 subject.
import java.util.Scanner;
public class Percentage {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter marks obtained in maths: ");
        int m1=sc.nextInt();

        System.out.println("Enter marks obtained in science: ");
        int m2=sc.nextInt();

        System.out.println("Enter marks obtained in sst: ");
        int m3=sc.nextInt();

        System.out.println("Enter marks obtained in english: ");
        int m4=sc.nextInt();

        System.out.println("Enter marks obtained in hindi: ");
        int  m5=sc.nextInt();

        int total=m1+m2+m3+m4+m5;
        double percentage = (total/500.0)*100;

        System.out.println("percentage scored by you is : "+percentage+ "%");

        sc.close();
    }
}
