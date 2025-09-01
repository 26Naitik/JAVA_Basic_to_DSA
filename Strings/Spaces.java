//write a java program to detect double an triple spaces in a string 

import java.util.Scanner;

public class Spaces {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a string with spaces : ");

        String str = sc.nextLine();

        int doublespaceIndex=str.indexOf("  ");
        int triplespaceIndex=str.indexOf("   ");

        System.out.println("the double space is fount at indes : "+doublespaceIndex);
        System.out.println("the triple space is found at index : "+triplespaceIndex);

        sc.close();
    }
}