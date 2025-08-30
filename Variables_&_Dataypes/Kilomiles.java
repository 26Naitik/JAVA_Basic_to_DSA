package CompleteJava;

//Write a java  program to convert km to miles.
import java.util.Scanner;
public class Kilomiles {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter the kilometers you traveled: ");
        double kilometers = sc.nextDouble();

        double miles = kilometers*0.621371;

        System.out.println("Kilomerter in miles is : "+miles);
        sc.close();
    }
}

