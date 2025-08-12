package Searching;

public class RotatedSorted {
    public static void main(String[] args) {
        int[] nums = {7,9,13,29,1,5};
        System.out.println(search(nums, 0));
    }

    static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            // Calculate the middle index to avoid potential integer overflow
            int mid = left + (right - left) / 2;

            // Case 1: Found the target
            if (nums[mid] == target) {
                return mid;
            }

            // Case 2: The left half of the array is sorted
            // Example: [4, 5, 6, 7, 0, 1, 2], mid is 7. Left half [4,5,6,7] is sorted.
            if (nums[left] <= nums[mid]) {
                // Check if the target is within the bounds of the sorted left half
                if (target >= nums[left] && target < nums[mid]) {
                    // Search on the left side
                    right = mid - 1;
                } else {
                    // Search on the right side
                    left = mid + 1;
                }
            }

            // Case 3: The right half of the array is sorted
            // Example: [6, 7, 0, 1, 2, 4, 5], mid is 1. Right half [1,2,4,5] is sorted.
            else {
                // Check if the target is within the bounds of the sorted right half
                if (target > nums[mid] && target <= nums[right]) {
                    // Search on the right side
                    left = mid + 1;
                } else {
                    // Search on the left side
                    right = mid - 1;
                }
            }
        }

        // Target was not found in the array
        return -1;
    }
}

