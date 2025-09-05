//write a java program to print nth number from febonacci series using recursio
public class fib {
    static int fib1(int n){
        if(n==1){
            return 0;
        }
        else if (n==2){
            return 1;
        }
        else{
            return (fib1(n-1) + fib1(n-2));
        }
    }

    public static void main(String[] args) {
        int result = fib1(5);
        System.out.println(result);
    }
}
