package Searching;

public class Sqrt {
    public static void main(String[] args) {
        int n = 8;
        System.out.println(getRoot(n));
    }

    static int getRoot(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }

        if (num < 0) {
            return -1;
        }

        int guess = num / 2;
        while((guess * guess > num)) {
            guess = (guess + num/guess) / 2;
        }
        return guess;
    }
}
