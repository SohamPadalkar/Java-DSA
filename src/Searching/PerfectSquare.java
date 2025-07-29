package Searching;

public class PerfectSquare {
    public static void main(String[] args) {

    }

    static boolean isPerfect(int n) {
        int start = 1;
        int end = n;
        if (n == 0 || n == 1) {
            return true;
        }

        if (n > 1) {
            end = n / 2;
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            long square = (long) mid * mid;
            if (square == n) {
                return true;
            } else if (square < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }
}
