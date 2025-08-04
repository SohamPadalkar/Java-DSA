package Searching;

public class InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        System.out.println(findTarget(arr, 10));
    }

    static int findTarget(int[] nums, int target) {
        int start = 0;
        int end = 1;

        while (!(target > nums[start] && target <= nums[end])) {
            start = end;
            end = end * 2;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
