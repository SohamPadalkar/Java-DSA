package Lecture2;

import java.util.Scanner;

public class FactorsOfNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = in.nextInt();

        System.out.println("Factors of the number " + num + " are:");
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(" " + i);
            }
        }


    }
}
