class Solution {

    public int numSpecial(int[][] mat) {

        int m = mat.length;
        int n = mat[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (isSpecial(mat, i, j)) count++;
            }
        }
        return count;
    }

    public boolean isSpecial(int[][] matrix, int row, int col) {
        if (matrix[row][col] == 0) return false;
        
        // matrix[row][col] == 1 here
        if (rowSum(matrix, row) > 1) return false;
        if (colSum(matrix, col) > 1) return false;
        return true;
    }

    public int rowSum(int[][] matrix, int row) {
        int n = matrix[0].length;
        int sum = 0;
        for (int j = 0; j < n; j++) {
            sum += matrix[row][j];
        }
        return sum;
    }

    public int colSum(int[][] matrix, int col) {
        int m = matrix.length;
        int sum = 0;
        for (int i = 0; i < m; i++) {
            sum += matrix[i][col];
        }
        return sum;
    }

}
