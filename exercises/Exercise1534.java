class Solution {
    public int countGoodTriplets(int[] arr, int a, int b, int c) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (!isGood(arr, i, j, a)) continue;
                    if (!isGood(arr, j, k, b)) continue;
                    if (!isGood(arr, i, k, c)) continue;
                    count++;
                }
            }
        }
        return count;
    }
    
    public boolean isGood(int[] arr, int i1, int i2, int bound) {
        return Math.abs(arr[i1] - arr[i2]) <= bound;
    }
}