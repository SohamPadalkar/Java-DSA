package Lecture2;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the base of the Triangle: ");
        int base = in.nextInt();

        System.out.print("Enter the height of the Triangle: ");
        int height = in.nextInt();

        double area = 0.5 * base * height;

        System.out.println("Area of the Triangle is " + area);
    }
}
