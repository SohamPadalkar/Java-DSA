package Lecture2;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        double bill = 0;

        System.out.print("Enter you name: ");
        String name = in.nextLine();

        System.out.print("Enter your ConsumerNumber: ");
        String cNumber = in.nextLine();

        System.out.print("Enter number of Units used: ");
        int numUnits = in.nextInt();

        if (numUnits < 0) {
            System.out.println("Invalid Number Of Units.");
            System.exit(0);
        } else if (numUnits <= 100) {
            bill = numUnits * 1.50;
        } else if (numUnits > 100 && numUnits <= 300){
            int slab2 = numUnits - 100;
            bill = (slab2 * 2.50) + 150;
        } else if (numUnits > 300 && numUnits <= 500) {
            int slab3 = numUnits - 300;
            bill = (slab3 * 4) + 650;
        } else {
            int slab4 = numUnits - 500;
            bill = (slab4 * 6) + 1450;
        }
        System.out.println("\n--- Electricity Bill ---");
        System.out.println("Name: " + name);
        System.out.println("Consumer Number: " + cNumber);
        System.out.println("Units Consumed: " + numUnits);
        System.out.println("Total Bill: ₹" + bill);

    }
    }
