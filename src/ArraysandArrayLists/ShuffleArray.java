package ArraysandArrayLists;

import java.util.Arrays;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] test = {7,5,2,1};
        System.out.println(Arrays.toString(shuffleArr(test, 2)));

    }

    static int[] shuffleArr(int[] arr,int n) {
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        int[] finalArray = new int[n * 2];

        for (int i = 0; i < n; i++) {
            arr1[i] = arr[i];
            arr2[i] = arr[n + i];
        }

        for (int i = 0; i < n; i++) {
            finalArray[i * 2] = arr1[i];
            finalArray[(i * 2) + 1] = arr2[i];
        }
        return finalArray;
    }
}
