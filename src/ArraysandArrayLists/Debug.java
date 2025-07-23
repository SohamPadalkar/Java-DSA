package ArraysandArrayLists;

import java.util.Arrays;

public class Debug {
    public static void main(String[] args) {
        int[] arr  = {1,2,3};
        int[]  ans = getConcatenation(arr);
        System.out.println(Arrays.toString(ans));
    }

    static int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n * 2];

        for (int i = 0; i < ans.length; i++) {
            if (i < n) {
                ans[i] = nums[i];
            }

            if (i >= n) {
                ans[i] = nums[i - n];
            }
        }

        return ans;
    }
}
