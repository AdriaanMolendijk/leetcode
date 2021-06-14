import java.util.Arrays;

class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        // iterate cols
        for (int j = 0; j < n; j++) {
            int row = 0;
            int col = j;
            int val = matrix[row][col];
            for (int steps = 1; steps <= m; steps++) {
                row++;
                col++;
                if (!withinBounds(row, col, matrix)) break;
                int entry = matrix[row][col];
                if (entry != val) return false;
            }
        }

        // iterate rows
        for (int i = 0; i < m; i++) {
            int col = 0;
            int row = i;
            int val = matrix[row][col];
            for (int steps = 1; steps <= m; steps++) {
                row++;
                col++;
                if (!withinBounds(row, col, matrix)) break;
                int entry = matrix[row][col];
                if (entry != val) return false;
            }
        }
        return true;
    }

    public boolean withinBounds(int i, int j, int[][] matrix) {
        int m = matrix.length;
        if (i < 0 || i >= m) return false;
        int n = matrix[0].length;
        if (j < 0 || j >= n) return false;
        return true;
    }

}
