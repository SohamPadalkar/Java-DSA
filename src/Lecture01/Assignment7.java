package Lecture01;

import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = scan.nextInt();

        int t1 = 0;
        int t2 = 1;

        if (n >= 1) System.out.print(t1);
        if (n >= 2) System.out.print(", " + t2);

        for (int i = 3; i <= n; i++) {
            int tn = t1 + t2;
            System.out.print(", " + tn);
            t1 = t2;
            t2 = tn;
        }
    }
}
