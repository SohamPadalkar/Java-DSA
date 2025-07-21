package Lecture3;

import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter Three Numbers to be compared:");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        System.out.println("Maximum: " + max(num1, num2, num3));
        System.out.println("Minimum: " + min(num1, num2, num3));
    }

    static int max(int a, int b, int c) {
        int maxNum = a;
        if (b > maxNum) maxNum = b;
        if (c > maxNum) maxNum = c;
        return maxNum;
    }

    static int min(int a, int b, int c) {
        int minNum = a;
        if (b < minNum) minNum = b;
        if (c < minNum) minNum = c;
        return minNum;
    }
}
