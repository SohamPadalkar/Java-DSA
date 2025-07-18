package Lecture01;

import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int num1 = scan.nextInt();
        System.out.println("\n");

        System.out.print("Enter Second Number: ");
        int num2 = scan.nextInt();
        System.out.println("\n");

        if (num1 > num2) {
            System.out.println(num1 + " is the greater one.");
        } else if (num2 > num1) {
            System.out.println(num2 + " is the greater one.");
        } else {
            System.out.println("Both Numbers are equal.");
        }
    }
}
