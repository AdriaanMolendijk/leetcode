class Solution {

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int distance = 0;
        int n = arr1.length;
        int m = arr2.length;
        for (int i = 0; i < n; i++) {
            boolean valid = true;
            for (int j = 0; j < m; j++) {
                if (distance(arr1[i], arr2[j]) <= d) {
                    valid = false;
                    break;
                }
            }
            if (valid) distance++;
        }
        return distance;
    }

    public int distance(int a, int b) {
        return Math.abs(a - b);
    }

}
