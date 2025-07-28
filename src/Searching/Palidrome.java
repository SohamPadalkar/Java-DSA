package Searching;


public class Palidrome {
    public static void main(String[] args) {
        int n = 121;
        System.out.println(isPalindrome(121));
    }

    static boolean isPalindrome(int num) {
        int temp = num;
        int reverse = 0;

        while (temp > 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }
        return num == reverse;
    }
}
