package Lecture01;

import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the amount in Rupees: ");
        double rupees = in.nextDouble();

        double USD = rupees * 0.012;

        System.out.println("Amount in USD on 18th July 2025: $" + USD);
    }
}
