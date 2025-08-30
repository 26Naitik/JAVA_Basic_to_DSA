package CompleteJava;

//write a java program to print hello <name> have a good day take name as input from the user.
import java.util.Scanner;
public class Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter your name: ");
        String name =sc.nextLine();

        System.out.println("Hello " + name + " have a good day!");
        sc.close();
    }
}

