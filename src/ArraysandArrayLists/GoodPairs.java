package ArraysandArrayLists;

public class GoodPairs {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,1,3};
        System.out.println(getGood(arr));
    }

    static int getGood(int[] nums) {

        int n = nums.length;
        int good = 0;

        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]){
                    good++;
                }
            }
        }

        return good;
    }
}
