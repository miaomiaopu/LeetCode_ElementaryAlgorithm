import Array_LC8.Solution;

public class Main {
    public static void main(String[] args) {
        int[] array_3 = {0, 1, 0, 3, 12};
        Solution plusOne = new Solution();
        plusOne.moveZeroes(array_3);
        for (int num : array_3) {
            System.out.println(num);
        }
    }
}
