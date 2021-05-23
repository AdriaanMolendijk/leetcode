class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int n = points.length;
        int total = 0;
        for (int i = 0; i < n - 1; i++) {
            int[] a = points[i];
            int[] b = points[i+1];
            total += dist(a,b);
        }
        return total;
    }
    
    public int dist(int[] a, int[] b) {
        int distX = Math.abs(a[0] - b[0]);
        int distY = Math.abs(a[1] - b[1]);
        return Math.max(distX, distY);
    }
}