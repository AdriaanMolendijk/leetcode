import java.util.ArrayList;
import java.util.List;

class Solution {

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        List<List<Integer>> matrix = new ArrayList<List<Integer>>();
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            matrix.add(new ArrayList<Integer>());
            for (int j = 0; j < n; j++) {
                matrix.get(i).add(grid[i][j]);
            }
        }

        for (int i = 1; i <= k; i++) {
            matrix = shift(matrix);
        }
        return matrix;

    }

    public List<List<Integer>> shift(List<List<Integer>> matrix) {
        List<List<Integer>> output = new ArrayList<List<Integer>>();
        int m = matrix.size();
        int n = matrix.get(0).size();
        for (int i = 0; i < m; i++) {
            output.add(new ArrayList<Integer>());
            for (int j = 0; j < n; j++) {
                output.get(i).add(0);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    output.get(i).set(j, matrix.get(m-1).get(n-1));
                    continue;
                }
                if (j == 0) {
                    output.get(i).set(j, matrix.get(i-1).get(n-1));
                    continue;
                }
                output.get(i).set(j, matrix.get(i).get(j-1));
            }
        }
        return output;
    }

}
