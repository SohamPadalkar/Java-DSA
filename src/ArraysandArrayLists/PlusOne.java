package ArraysandArrayLists;

public class PlusOne {
    public static void main(String[] args) {

    }

    static int[] getOne(int[] num) {
        for (int i = num.length - 1; i >= 0; i--) {
            // If digit is less than 9, just increment and return
            if (num[i] < 9) {
                num[i]++;
                return num;
            }
            // If digit is 9, set to 0 and carry over
            num[i] = 0;
        }
        // If we finish the loop, all digits were 9 (e.g., 9 or 99 or 999...)
        // Create a new array with size + 1, set the first digit to 1, rest are 0
        int[] result = new int[num.length + 1];
        result[0] = 1;
        return result;
    }
}
