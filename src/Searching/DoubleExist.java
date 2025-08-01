package Searching;

public class DoubleExist {
    public static void main(String[] args) {
        int[] arr = {3,1,7,11};
        System.out.println(checkIfExist(arr));
    }

    static boolean checkIfExist(int[] nums) {
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            for (int j =0; j < n; j++) {


                if (nums[i] == nums[j] * 2 && i != j) {
                    return true;
                }
            }
        }
        return false;
    }
}
