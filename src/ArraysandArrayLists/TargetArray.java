package ArraysandArrayLists;

import java.util.Arrays;

public class TargetArray {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        System.out.println(Arrays.toString(getTarget(nums, index)));
    }

    static int[] getTarget(int[] nums, int[] index) {
        int n = nums.length;
        int[] target = new int[n];

        for (int i = 0; i < n; i++) {
            int pos = index[i];
            // Shift elements from pos to i-1 to the right by one
            for (int j = i; j > pos; j--) {
                target[j] = target[j - 1];
            }
            target[pos] = nums[i];
        }
        return target;
    }
}
