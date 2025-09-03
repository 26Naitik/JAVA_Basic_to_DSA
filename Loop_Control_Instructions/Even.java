//write a java program to print sum of even numbers using while loop
import java.util.Scanner;
public class Even {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();
        int sum=0;
        int i=2;
        while(i<=num){
            sum = sum+i;
            i+=2;
        }
        System.out.println(sum);
        sc.close();
    }
}
