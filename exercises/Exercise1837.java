class Solution {
    public int sumBase(int n, int k) {
        String num = Integer.toString(n, k);
        int sum = 0;
        for (char c : num.toCharArray()) sum += c - '0';
        return sum;
    }
}