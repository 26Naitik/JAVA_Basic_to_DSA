//write a java program to replace spaces with underscore

import java.util.Scanner;

public class Replace{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a name with spaces: ");
        String name = sc.nextLine();

        String newName=name.replace(" ", "_");
        System.out.println("The name without spaces is : "+newName);
        sc.close();
    }
}