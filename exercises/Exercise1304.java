class Solution {
    public int[] sumZero(int n) {
        int count = 0;
        int[] out = new int[n];
        for (int i = 0; i < n; i++) {
            out[i] = (i+2)/2 * sign(i);
        }
        if (n % 2 == 1) out[n-1] = 0;
        return out;
    }
    
    public int sign(int n) {
        if (n % 2 == 0) return 1;
        return -1;
    }
}