package Lecture3;

import java.util.Scanner;

public class EligibleOrNot {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        System.out.println("Enter Your Age:");
        int age = in.nextInt();

        if (eligibility(age)) {
            System.out.println("You are eligible for voting.");
        }else {
            System.out.println("You are underage for voting.");
        }
        in.close();
    }

    static boolean eligibility(int age) {
        return age >= 18;
    }
}
