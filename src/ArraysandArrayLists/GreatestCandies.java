package ArraysandArrayLists;

import java.util.Arrays;

public class GreatestCandies {
    public static void main(String[] args) {
        int[] arr = {2,3,5,1,3};
        int extra = 3;
        System.out.println(Arrays.toString(maxCandy(arr, extra)));
    }
    static boolean[] maxCandy(int[] candies, int extraCandies) {
        int max = 0;
        int n = candies.length;
        boolean[] ans = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        for (int i = 0; i < n; i++) {
            if (candies[i] + extraCandies >= max) {
                ans[i] = true;
            }else {
                ans[i] = false;
            }
        }
        return ans;
    }
}
