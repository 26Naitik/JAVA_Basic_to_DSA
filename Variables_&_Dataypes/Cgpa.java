package CompleteJava;

// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Scanner;

public class Cgpa {
   public Cgpa() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter the marks of subject 1: ");
      int var2 = var1.nextInt();
      System.out.println("Enter marks of subject2: ");
      int var3 = var1.nextInt();
      System.out.println("Enter marks of subject3: ");
      int var4 = var1.nextInt();
      float var5 = (float)(var2 + var3 + var4);
      double var6 = (double)var5 / 300.0 * 100.0;
      double var8 = var6 / 9.5;
      System.out.println("The Cgpa secures is: " + var8);
      var1.close();
   }
}

