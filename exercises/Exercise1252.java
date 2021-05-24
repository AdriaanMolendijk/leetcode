class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] matrix = new int[m][n];
        for (int[] index : indices) {
            int r = index[0];
            int c = index[1];
            for (int j = 0; j < n; j++) matrix[r][j]++;
            for (int i = 0; i < m; i++) matrix[i][c]++;
        }
        
        int sum = 0;
        for (int[] row : matrix) {
            for (int val : row)
                if (val % 2 == 1) sum++;
        }
        return sum;
        
    }
    
}
