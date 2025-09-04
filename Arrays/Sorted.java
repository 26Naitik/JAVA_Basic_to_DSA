//write a java program to find if the array is sorted or not ?

import java.util.Arrays;

public class Sorted{
    public static void main(String[] args) {
        int arr [] = new int [] {8,0,9,3,4,6};
        int n = arr.length;
        boolean isSorted = true;
        for(int i =0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                isSorted=false;
                break;
            }
        }
        if (isSorted){
            System.out.println("The array is sorted: "+ Arrays.toString(arr));
        }
        else {
            System.out.println("The array is not sorted: "+ Arrays.toString(arr));
        }
    }
}
