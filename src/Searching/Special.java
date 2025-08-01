package Searching;

public class Special {
    public static void main(String[] args) {
        int[] arr = {100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100,100};
        System.out.println(specialArray(arr));
    }

    static int specialArray(int[] arr) {
        int numOfGreater = 0;

        int n = arr.length;

        int max = 0;
        for (int k = 0; k < n; k ++) {
            if (arr[k] > max) {
                max =  arr[k];
            }
        }

        for (int i = 1; i < max; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[j] >= i) {
                    numOfGreater++;
                }
            }
            if (numOfGreater == i) {
                return i;
            }
            numOfGreater = 0;
        }
        return -1;
    }
}
