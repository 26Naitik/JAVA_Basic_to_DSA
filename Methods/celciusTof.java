//write a java program to convert celcius into farhenhite using methods in java
import java.util.Scanner;

public class celciusTof {

    static double toFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double c = sc.nextDouble();

        double f = toFahrenheit(c); 
        System.out.println("Temperature in Fahrenheit = " + f);
        sc.close();
    }
}
