import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;

        int num = in.nextInt();

        while (num > 7) {
            int lastDigit = num % 10;
            if (lastDigit == 7) {
                count++;
            }
            num -= lastDigit;
            num = num / 10;
        }
        System.out.println(count);
    }
}