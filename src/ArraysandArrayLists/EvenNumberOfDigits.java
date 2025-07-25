package ArraysandArrayLists;

public class EvenNumberOfDigits {
    public static void main(String[] args) {
        int[] arr = {12,3,2,4,7898};
        System.out.println(findNumbers(arr));
    }

    static int findNumbers (int[] nums) {
        int n = nums.length;
        int numOfDigits = 0;
        int ans = 0;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            while (nums[i] > 0) {
                temp = nums[i] % 10;
                nums[i] = nums[i] - temp;
                nums[i] = nums[i] / 10;
                numOfDigits++;
            }
            if (numOfDigits % 2 == 0) {
                ans++;
            }
            numOfDigits = 0;
        }
        return ans;
    }

}
