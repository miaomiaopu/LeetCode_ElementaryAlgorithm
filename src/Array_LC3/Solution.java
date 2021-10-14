package Array_LC3;

public class Solution {
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] tmp = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            tmp[(i + k) % nums.length] = nums[i];
        }
        System.arraycopy(tmp, 0, nums, 0, nums.length);
    }
}
