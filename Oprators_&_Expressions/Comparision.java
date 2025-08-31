import java.util.Scanner;
public class Comparision {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        int num=27;
        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        if (number>27){
            System.out.println("The number you enterd is " +number +" which is grater than given number "+num);
        }
        else {
            System.out.println("The enterd number is "+number+" which is not grater thena given number "+num);
        }
        sc.close();
    }
}
