package Lecture2;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;

        System.out.println("Enter the number from which you want to count:");
        int num = in.nextInt();

        System.out.println("Enter the number whose appearence you want to count:");
        int n = in.nextInt();

        while (num > n) {
            int lastDigit = num % 10;
            if (lastDigit == n) {
                count++;
            }
            num -= lastDigit;
            num = num / 10;
        }
        System.out.println(count);
    }
}
