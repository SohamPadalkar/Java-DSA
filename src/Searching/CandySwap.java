package Searching;

public class CandySwap {
    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        System.out.println(searchRange(nums, 8));
    }

    static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0;
        int sumB = 0;
        int n = aliceSizes.length;

        for (int i = 0; i < n; i++) {
            sumA = sumA + aliceSizes[i];
            sumB = sumB + bobSizes[i];
        }

        int delta = (sumB - sumA) / 2;

        for (int a : aliceSizes) {
            for (int b : bobSizes) {
                if (b == a + delta) {
                    return new int[]{a, b};
                }
            }
        }
        return new int[0]; // Guaranteed to have a solution
    }


    static int[] searchRange(int[] nums, int target) {
        int index1 = -1;
        int index2  = -1;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                count++;
                if (count == 1) {
                    index1 = i;
                }


                if (count == 2){
                    index2 = i;
                    return new int[] {index1, index2};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
