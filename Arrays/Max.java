//write a java program to find maximum element from the array

public class Max{
    public static void main(String[] args) {
        int [] arr = new int[] {1,3,5,2};
        int n = arr.length;
        int max = arr[0];
        for(int i =0;i<n;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The maximum elemnt of the array is: "+max);
    }
}