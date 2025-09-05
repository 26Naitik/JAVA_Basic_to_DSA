//write a java progra to print sum of n number using methods
public class Rec {
    static int sumRec(int n){
        if(n==1){
            return 1;
        }
        return n + sumRec(n-1);
    }
    public static void main(String[] args) {
        int c = sumRec(10);
        System.out.println(c);
    }
}
