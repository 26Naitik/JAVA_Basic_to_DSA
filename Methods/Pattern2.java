//write a java program to print pattern two using methods
public class Pattern2 {
    static void Pattern3(int n) {
         for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    public static void main(String[] args) {
        Pattern3(5);
    }
}
