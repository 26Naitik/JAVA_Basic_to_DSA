import java.util.Scanner;
public class Income {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the income: ");
        int income = sc.nextInt();
        double tax = 0;

        if (income <= 250000) {
            tax = 0;
        } 
        else if (income > 250000 && income <= 500000) {
            tax = (income - 250000) * 0.05;  
        } 
        else if (income > 500000 && income <= 1000000) {
            tax = (250000 * 0.05) + (income - 500000) * 0.2;  
        } 
        else {
            tax = (250000 * 0.05) + (500000 * 0.2) + (income - 1000000) * 0.3; 
        }

        System.out.println("Income Tax : " + tax);
        sc.close();
    }
}
