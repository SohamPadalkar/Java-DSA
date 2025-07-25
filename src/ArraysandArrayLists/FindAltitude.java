package ArraysandArrayLists;

import java.util.Arrays;

public class FindAltitude {
    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(getHighest(gain));
    }

    static int getHighest(int[] gain) {
        int n = gain.length;
        int[] alt = new int[n + 1];
        int maxAlt = 0;

        alt[0] = 0;
        for (int i = 0; i < n; i++) {
            alt[i + 1] = alt[i] + gain[i];
        }
        for (int i = 0; i <= n; i++) {
            if (alt[i] > maxAlt) {
                maxAlt = alt[i];
            }
        }
        return maxAlt;
    }
}
