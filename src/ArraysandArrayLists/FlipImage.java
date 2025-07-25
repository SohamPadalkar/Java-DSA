package ArraysandArrayLists;

import java.util.Arrays;

public class FlipImage {
    public static void main(String[] args) {
        int[][] sample = {{1,1,0},{1,0,1},{0,0,0}};
        System.out.println(Arrays.toString(flipAndInvertImage(sample)));
    }
    static int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        // First invert
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < image[i].length; j++) {
                image[i][j] = image[i][j] ^ 1; // Inverts 0 to 1 and 1 to 0
            }
        }
        // Then flip (reverse each row)
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = image[i].length - 1;
            while (left < right) {
                int temp = image[i][left];
                image[i][left] = image[i][right];
                image[i][right] = temp;
                left++;
                right--;
            }
        }
        return image;
    }

}
