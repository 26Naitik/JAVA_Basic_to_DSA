package CompleteJava;

// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class Int {
   public Int() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter a number: ");
      if (var1.hasNextInt()) {
         int var2 = var1.nextInt();
         System.out.println("the number " + var2 + " is integer");
      } else {
         System.out.println("The number is not an integers");
      }

      var1.close();
   }
}

