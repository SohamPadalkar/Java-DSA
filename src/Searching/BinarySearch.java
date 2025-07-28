package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int[] test1 = {1,3,4,7,9,13,20};
        int[] test2 = {99, 67, 34, 5,2};
        System.out.println(sortAgnosticBS(test1, 9));
        System.out.println(sortAgnosticBS(test2, 5));
        System.out.println(sortAgnosticBS(test1, 90));
        System.out.println(sortAgnosticBS(test2, 1));
    }
    static int sortAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int mid;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1;
    }

}
