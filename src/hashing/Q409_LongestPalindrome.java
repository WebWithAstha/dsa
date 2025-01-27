package hashing;

import java.util.HashMap;

public class Q409_LongestPalindrome {

    public static int longestPalindrome(String s) {


        HashMap<Character, Integer> map = new HashMap<>();
        // counting all character in string
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int longPal = 0;
        boolean isOld = false;

        for (char ch : map.keySet()) {
            if (map.get(ch) % 2 == 0) longPal += map.get(ch);
            else {
                isOld = true;
                longPal += map.get(ch) - 1;
            }
        }

        if(isOld) longPal+=1;
        return longPal;
    }


    public static void main(String[] args) {
        String s = "abccccdd";
        System.out.println(longestPalindrome(s));
    }
}
