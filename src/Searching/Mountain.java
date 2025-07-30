package Searching;

public class Mountain {
    public static void main(String[] args) {
        int[] arr = {24,69,100,99,79,78,67,36,26,19};
        System.out.println(peakIndex(arr));
    }

    static int peakIndex(int[] arr) {
        int n = arr.length;
        int max = 0;
        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }
        return index;

    }
}
