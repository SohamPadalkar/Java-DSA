package ArraysandArrayLists;

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] arr = {1,3,4};
        System.out.println(Arrays.toString(getRunningSum(arr)));
    }

    static int[] getRunningSum(int[] nums) {

        int n = nums.length;
        int[] ans =  new int[n];
        ans[0] = nums[0];

        for (int i = 1; i < n; i++) {
            ans[i] = nums[i] + ans[i - 1];
        }
        return ans;
    }
}
