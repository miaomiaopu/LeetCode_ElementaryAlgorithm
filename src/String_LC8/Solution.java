package String_LC8;

public class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String s = countAndSay(n - 1);
        StringBuffer result = new StringBuffer();
        char local = s.charAt(0);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == local) {
                count++;
            } else {
                result.append(count);
                result.append(local);
                count = 1;
                local = s.charAt(i);
            }
        }
        result.append(count);
        result.append(local);
        return result.toString();
    }
}
