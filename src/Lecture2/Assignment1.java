package Lecture2;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int product = 1;
        int sum = 0;

        System.out.print("Enter the number to be processed: ");
        int num = in.nextInt();

        while (num > 0) {
            int lastDigit = num % 10;
            product *= lastDigit;
            sum += lastDigit;
            num = (num - lastDigit) / 10;
        }

        int result = product - sum;
        System.out.println("Product - Sum = " + result);
    }
}
