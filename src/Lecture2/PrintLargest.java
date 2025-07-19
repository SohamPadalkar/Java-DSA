package Lecture2;

import java.util.Scanner;

public class PrintLargest {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num;
        int max = Integer.MIN_VALUE;
        System.out.println("Enter the numbers to be compared");

        while (true) {
            num = in.nextInt();
            if (num == 0) {
                break;
            }
            if (num > max) {
                max = num;
            }

        }
        if (max == Integer.MIN_VALUE) {
            System.out.println("No number was entered.");
        } else {
            System.out.println("Largest Number: " + max);
        }
    }
}
