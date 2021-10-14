package Array_LC1;

public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0)
            return 0;
        int cnt = 1;
        int now = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != now) {
                now = nums[i];
                nums[cnt++] = now;
            }
        }
        return cnt;
    }
}