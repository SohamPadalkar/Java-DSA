package Lecture2;

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int factorial = 1;

        System.out.println("Enter the number whose factorial you want to find: ");
        int num = in.nextInt();

        if (num == 0) {
            System.out.println(factorial);
        }

        for (int i = num; i > 0; i--) {
            factorial *= i;
        }

        System.out.println("Factorial of the number " + num + " is: " + factorial);
    }

}
