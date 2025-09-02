//write a java program to check from the url what type of ebssite the user is visiting.
import java.util.Scanner;
public class Url {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter the url: ");
        String url= sc.nextLine();

        if (url.endsWith(".com")){
            System.out.println("This is an commercial website");
        }
        else if (url.endsWith(".org")){
            System.out.println("This is an organizational website");
        }
        else if (url.endsWith(".in")){
            System.out.println("This is an indian website");
        }
        else {
            System.out.println("This is an unknown website");
        }
        sc.close();
    }
}
