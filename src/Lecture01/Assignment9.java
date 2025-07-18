package Lecture01;

import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the lower bound: ");
        int low = scan.nextInt();

        System.out.print("Enter the upper bound: ");
        int high = scan.nextInt();

        System.out.println("Armstrong numbers between " + low + " and " + high + " are:");

        for (int num = low; num <= high; num++) {
            int original = num;
            int sum = 0;

            int digits = String.valueOf(num).length();

            int temp = num;

            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }

            if (sum == original) {
                System.out.println(original);
            }
        }

        scan.close();
    }
}
