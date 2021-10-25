package Array_LC10;

import java.util.Arrays;

public class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[] row = new boolean[9];
        boolean[] col = new boolean[9];
        boolean[] space = new boolean[9];
        for (char[] chars : board) {
            Arrays.fill(row, false);
            for (char aChar : chars) {
                if (aChar == '.') continue;
                int index = (aChar - '0') - 1;
                if (row[index]) return false;
                row[index] = true;
            }
        }
        for (int i = 0; i < board[0].length; i++) {
            Arrays.fill(col, false);
            for (char[] chars : board) {
                if (chars[i] == '.') continue;
                int index = (chars[i] - '0') - 1;
                if (col[index]) return false;
                col[index] = true;
            }
        }
        for (int i = 0; i < board.length; i += 3) {
            for (int j = 0; j < board[i].length; j += 3) {
                Arrays.fill(space, false);
                for (int k = 0; k < 3; k++) {
                    for (int l = 0; l < 3; l++) {
                        if (board[i + k][j + l] == '.') continue;
                        int index = (board[i + k][j + l] - '0') - 1;
                        if (space[index]) return false;
                        space[index] = true;
                    }
                }
            }
        }
        return true;
    }
}
