package ArraysandArrayLists;

import java.util.ArrayList;
import java.util.List;

public class Pangram {
    public static void main(String[] args) {
        String s = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(getPan(s));
    }
    static boolean getPan(String scentence) {
        List<Character> arr = new ArrayList<>();
        for(int i = 0; i < scentence.length(); i++) {
            if(!arr.contains(scentence.charAt(i))) {
                arr.add(scentence.charAt(i));
            }
        }
        return arr.size() == 26;
    }

}

