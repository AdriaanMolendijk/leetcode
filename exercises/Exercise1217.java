class Solution {
    public int minCostToMoveChips(int[] position) {
        int sum = 0;
        int n = position.length;
        int minSum = n;
        
        for (int i = 0; i < n; i++) {
            sum = 0;
            for (int j = 0; j < n; j++) {
                if (Math.abs(position[i] - position[j]) % 2 == 1) sum++;
            }
            minSum = Math.min(minSum, sum);
        }
        return minSum;
    }
}
