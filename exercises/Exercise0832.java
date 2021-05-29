class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int m = image.length;
        int n = image[0].length;
        int[][] out = new int[m][n];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                out[i][j] = 1 - image[i][n-j-1];
            }
        }
        return out;
    }
}