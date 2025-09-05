//write a java program to print a multiplication table using methods in java
public class Method {
    static void multiplication (int n){
    for(int i=1;i<=10;i++){
        System.out.format("%d x %d = %d\n",n,i,n*i);
    }
}
    public static void main(String[] args) {
        multiplication(7);
    }
}
