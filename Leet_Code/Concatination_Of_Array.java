//leetcode problem 1229 concatination of array 
//use of simple array logic and basic maths.

import java.util.Arrays;

public class Concatination_Of_Array {
    public static void main (String args[]){
        int nums [] = new int [] {1,2,1};
        int n= nums.length;
        int ans[] = new int [2*n];

        for(int i=0;i<n;i++){
            ans[i]=nums[i];
            ans[i+n]=nums[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
