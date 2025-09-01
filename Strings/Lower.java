//write a java program to concert a string to lower case.
import java.util.Scanner;

public class Lower{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a string: ");

        String name = sc.nextLine();

        String lowercase=name.toLowerCase();
        System.out.println("The string in lower case is as : "+lowercase);
        sc.close();
    }
}