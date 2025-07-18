package Lecture01;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int num = read.nextInt();

        if(num % 2 == 0) {
            System.out.println("Number is even.");
        }else {
            System.out.println("Number is odd.");
        }
    }
}
