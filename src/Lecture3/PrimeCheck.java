package Lecture3;

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number to be checked:");
        int num = in.nextInt();

        if (isPrime(num)) {
            System.out.println("The number is Prime.");
        } else {
            System.out.println("The number is not Prime.");
        }

        in.close();
    }

    static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) return false;
        }

        return true;
    }
}
