package String_LC6;

public class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.length() == 0) {
            return 0;
        } else if (s.length() == 1) {
            if (Character.isDigit(s.charAt(0))) {
                return s.charAt(0) - '0';
            } else {
                return 0;
            }
        }
        int res = 0;
        int index = 0;
        int sign = 1;
        if (s.charAt(index) == '-') {
            sign = -1;
            ++index;
        } else if (s.charAt(index) == '+') {
            ++index;
        }
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            int pop = s.charAt(index++) - '0';
            if (res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && pop > Integer.MAX_VALUE % 10)) {
                if (sign == 1) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }
            res = res * 10 + pop;
        }
        return res * sign;
    }
}