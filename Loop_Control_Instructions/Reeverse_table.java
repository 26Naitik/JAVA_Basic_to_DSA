//write a java program to print table of a number in reverse order.
import java.util.Scanner;
public class Reeverse_table {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        for(int i=10;i>=1;i--){
            System.out.printf("%d X %d = %d\n",number,i,number*i);
        }
        sc.close();;
    }
}
