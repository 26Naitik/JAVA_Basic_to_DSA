//write a java progra to reverse an array.
import java.util.Arrays;
public class Reverse{
    public static void main(String[] args) {
        int [] arr = new int[] {1,2,3,4};
        int n= arr.length;
        for(int i=0;i<n/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1]=temp;
        }
        System.out.println("The reverse array is as: "+ Arrays.toString(arr));
    }
}