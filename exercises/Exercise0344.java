class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        char[] out = new char[n];
        for (int i = 0; i < n; i++) {
            out[i] = s[n-i-1];
        }
        for (int i = 0; i < n; i++) {
            s[i] = out[i];
        }
    }
}
