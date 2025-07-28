package Searching;

import java.util.Arrays;

public class TwoSum2 {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(getAns(arr, target)));
    }

    static int[] getAns(int[] nums, int target) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;

        for (int i = 0; i < n; i++) {
            start = i + 1;
            end = n - 1;
            while(start <= end) {
                int mid = start + (end - start) / 2;
                if (nums[i] + nums[mid] > target) {
                    end = mid - 1;
                } else if (nums[i] + nums[mid] < target) {
                    start = mid + 1;
                } else {
                    return new int[] {i + 1,mid + 1};
                }
            }
        }
        return new int[] {-1,-1};
    }
}
