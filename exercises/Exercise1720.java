class Solution {
    public int[] decode(int[] encoded, int first) {
        int n = encoded.length;
        int[] out = new int[n+1];
        out[0] = first;
        for (int i = 0; i < n; i++) {
            out[i+1] = out[i] ^ encoded[i];
        }
        return out;
    }
}