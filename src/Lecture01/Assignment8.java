package Lecture01;


import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the string to be checked: ");
        String check = scan.nextLine().replaceAll("\\s+", "").toLowerCase();


        StringBuilder reverse = new StringBuilder();

        for (int i = check.length() - 1; i >= 0; i--) {
            reverse.append(check.charAt(i));
        }

        if (check.equals(reverse.toString())) {
            System.out.println("String is a palindrome.");
        } else {
            System.out.println("String is not a palindrome.");
        }
        scan.close();
    }
}
