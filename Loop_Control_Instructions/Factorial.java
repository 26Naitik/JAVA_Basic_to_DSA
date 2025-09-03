//write a java program to print the factorial of a given number using loops
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.println("factorial of enterd number: "+fact);
        sc.close();
    }
}
