package ArraysandArrayLists;

import java.util.Arrays;

public class SmallNumbers {
    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};

        System.out.println(Arrays.toString(getSmall(arr)));

    }

    static int[] getSmall(int[] nums) {
        int n = nums.length;
        int smallCount = 0;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (nums[j] < nums[i]) {
                    smallCount++;
                }
            }
            ans[i] = smallCount;
            smallCount = 0;
        }
        return ans;
    }
}
