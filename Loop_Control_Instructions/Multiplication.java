//write a java program to print the multiplication table of n
import java.util.Scanner;
public class Multiplication{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        int n=10;
        for(int i=1;i<=n;i++){
            System.out.printf("%d X %d = %d\n",number,i,number*i);
        }
        sc.close();
    }
}