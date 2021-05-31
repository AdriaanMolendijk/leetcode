class Solution {
    public int[] countBits(int n) {
        int[] out = new int[n+1];
        for (int i = 0; i < n + 1; i++) {
            String binary = Integer.toBinaryString(i);
            out[i] = sumDigits(binary);
        }
        return out;
    }
    
    public int sumDigits(String binary) {
        int sum = 0;
        for (char c : binary.toCharArray()) sum += c - '0';
        return  sum;
    }
}
