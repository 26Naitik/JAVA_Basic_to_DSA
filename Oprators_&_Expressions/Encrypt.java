//write a java proram to encrypt the code by adding 8 to it and decrypt it to show the correct grade
import java.util.Scanner;
public class Encrypt {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter your grade(A,B,C,...): ");
        char grade = sc.next().charAt(0);

        char encrypted_code = (char)(grade+8);
        System.out.println("Encrypted code is : "+encrypted_code);

        char decrypted_code=(char)(encrypted_code-8);
        System.out.println("Decyrpted code is: "+decrypted_code);

        sc.close();
    }


}
