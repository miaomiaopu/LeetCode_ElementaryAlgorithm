package StringLC5;

import static java.lang.Character.isLetterOrDigit;

public class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }
        s = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            while (i < j && !isLetterOrDigit(s.charAt(i))) {
                ++i;
            }
            while (i < j && !isLetterOrDigit(s.charAt(j))) {
                --j;
            }
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            ++i;
            --j;
        }
        return true;
    }
}
