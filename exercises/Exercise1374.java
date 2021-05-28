class Solution {
    public String generateTheString(int n) {
        if (n == 1) return "a";
        if (n == 2) return "ab";
        
        // n >= 2 here
        if (n % 2 == 0) return "bb" + generateTheString(n-2);
        return "d" + generateTheString(n-1);
    }
}