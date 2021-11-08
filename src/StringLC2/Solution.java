package StringLC2;

public class Solution {
    int calculate(int x) {
        long ans = 0;
        while (x != 0) {
            ans *= 10;
            ans += (x % 10);
            x /= 10;
        }
        if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
            return 0;
        }
        return (int) ans;
    }

    public int reverse(int x) {
        long ans = 0;
        if (x == 0) {
            return x;
        } else if (x < 0) {
            return -1 * calculate(-1 * x);
        } else {
            return calculate(x);
        }
    }
}
