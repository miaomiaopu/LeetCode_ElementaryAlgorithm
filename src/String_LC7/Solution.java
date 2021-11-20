package String_LC7;

public class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        if (haystack.length() == 0) {
            return -1;
        }
        int index_h = 0;
        for (; index_h < haystack.length() - needle.length() + 1; index_h++) {
            if (haystack.charAt(index_h) == needle.charAt(0)) {
                boolean flag = true;
                for (int i = 0; i < needle.length(); i++) {
                    if (haystack.charAt(index_h + i) != needle.charAt(i)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    return index_h;
                }
            }
        }
        return -1;
    }
}
