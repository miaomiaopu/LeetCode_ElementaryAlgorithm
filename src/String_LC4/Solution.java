package String_LC4;

import java.util.Arrays;

public class Solution {
    public boolean isAnagram(String s, String t) {
        char[] charS = s.toCharArray();
        char[] charT = t.toCharArray();
        Arrays.sort(charS);
        Arrays.sort(charT);
        if (Arrays.equals(charS, charT)) {
            return true;
        } else {
            return false;
        }
    }
}
