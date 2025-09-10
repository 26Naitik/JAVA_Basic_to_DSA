import java.util.HashSet;

public class Contains_Duplicate {
    public static void main(String[] args) {
        int arr[] = new int[] {1, 2, 3, 1};

        boolean result = containsDuplicate(arr);

        System.out.println("Contains Duplicate? " + result);
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> intSet = new HashSet<>();

        for (int num : nums) {
            if (intSet.contains(num)) {
                return true; 
            }
            intSet.add(num);
        }
        return false; 
    }
}
