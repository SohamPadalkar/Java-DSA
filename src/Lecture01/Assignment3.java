package Lecture01;

import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Enter the principal amount: ");
        double p = read.nextDouble();

        System.out.println("Enter time period(in yrs): ");
        double t = read.nextDouble();

        System.out.println("Enter the rate of intrest(per annum):");
        double r = read.nextDouble();

        double simpleIntrest = (p * t * r) / 100;

        System.out.println("The Simple Intrest is: Rs." + simpleIntrest);
    }
}
