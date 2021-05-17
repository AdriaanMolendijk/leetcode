class Solution {
    public int subtractProductAndSum(int n) {
        int prod = 1, sum = 0;
        for (char c : Integer.toString(n).toCharArray()) {
            int digit = c - '0';
            prod *= digit;
            sum += digit;
        }
        return prod - sum;
    }
}