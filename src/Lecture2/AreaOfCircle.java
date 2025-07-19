package Lecture2;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        double r = in.nextDouble();

        double area = 3.14 * r * r;

        System.out.println("Area of the circle is: " + area);

    }
}
