class Solution {

    public boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length;
        if (n <= 2) return false;
        for (int i = 0; i < n-2; i++) {
            int val1 = arr[i];
            int val2 = arr[i+1];
            int val3 = arr[i+2];
            if (isOdd(val1) && isOdd(val2) && isOdd(val3)) return true;
        }
        return false;
    }

    public boolean isOdd(int n) {
        return n % 2 != 0;
    }
}
