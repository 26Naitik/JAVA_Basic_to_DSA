//write a java program to find weather a student is pass or fail if he requires total 40 % and inimum 33% to pass 
import java.util.Scanner;
public class PassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the marks of sub 1: ");
        float m1=sc.nextFloat();
        System.out.println("Enter the marks of sub 2: ");
        float m2=sc.nextFloat();
        System.out.println("Enter the marks of sub 3: ");
        float m3=sc.nextFloat();

        float total = m1+m2+m3;
        float percentage = (total/300)*100;

        if (m1>=33 && m2>=33 && m3>=33 && percentage >=40){
            System.out.println("Congrats you are pass!");
            System.out.println("Your percentage is: " + percentage);

        }
        else {
            System.out.println("you are fail");
            System.out.println("Your percentage is: " + percentage);


        sc.close();
    }
}
}
