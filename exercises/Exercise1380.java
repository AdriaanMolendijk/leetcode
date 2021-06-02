import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        ArrayList<Integer> output = new ArrayList<>();
        int m = matrix.length;
        int n = matrix[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (minRowEl(matrix, i, j) && maxColEl(matrix, i, j)) output.add(matrix[i][j]);
            }
        }
        return output;
    }

    public boolean minRowEl(int[][] matrix, int i, int j) {
        int num = matrix[i][j];
        for (int k = 0; k < matrix[0].length; k++) {
            if (matrix[i][k] < num) return false;
        }
        return true;
    }

    public boolean maxColEl(int[][] matrix, int i, int j) {
        int num = matrix[i][j];
        for (int k = 0; k < matrix.length; k++) {
            if (matrix[k][j] > num) return false;
        }
        return true;
    }
}
