package Searching;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1,5,2};
        int target = 0;
        System.out.println(findInMountainArray(target, arr));
    }

    static int findInMountainArray(int target, int[] mountainArr) {
        int start = 0;
        int end = mountainArr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr[mid] > mountainArr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        int peak = end;
        int newStart = 0;
        int newEnd = peak;

        while (newStart <= newEnd) {
            int mid = newStart + (newEnd - newStart) / 2;
            if (mountainArr[mid] > target) {
                newEnd = mid - 1;
            } else if (mountainArr[mid] < target) {
                newStart = mid + 1;
            } else {
                return mid;
            }
        }

        newStart = peak;
        newEnd = mountainArr.length - 1;

        while (newStart <= newEnd) {
            int mid = newStart + (newEnd - newStart) / 2;
            if (mountainArr[mid] > target) {
                newStart = mid + 1;
            } else if (mountainArr[mid] < target) {
                newEnd = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }
}
