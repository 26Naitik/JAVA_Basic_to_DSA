//write a java program to find minimum element from the array .

public class Min{
    public static void main(String[] args) {
        int arr [] = new int [] {2,8,9,5};
        int n = arr.length;
        int min= arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("The minimum element from the array is: "+min);
    }
}