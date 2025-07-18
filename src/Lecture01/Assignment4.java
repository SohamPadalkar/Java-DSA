package Lecture01;

import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int num1 = scan.nextInt();

        System.out.println("Enter the second number: ");
        int num2 = scan.nextInt();

        System.out.println("Enter the operator: ");
        String op = scan.next();

        if(op.equals("+")) {
            System.out.println(num1 + num2);
        } else if (op.equals("-")) {
            System.out.println(num1 - num2);
        } else if (op.equals("x")) {
            System.out.println(num1 * num2);
        } else if (op.equals("/")) {
            System.out.println(num1 / num2);
        } else {
            System.out.println("Invalid Operator.");
        }
    }
}
