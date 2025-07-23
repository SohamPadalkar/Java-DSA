package ArraysandArrayLists;

public class RichestCustomer {
    public static void main(String[] args) {
        int[][] arr= {{1,2},{2,3}};

        System.out.println(getRichest(arr));
    }
    static int getRichest(int[][] nums) {
        int max = 0;
        int rows = nums.length;
        int ans = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < nums[i].length; j++){
                ans = ans + nums[i][j];

            }
            if (ans >  max) {
                max = ans;
            }
            ans = 0;
        }
        return max;
    }
}


