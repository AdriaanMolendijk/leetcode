class Solution {
    public int arraySign(int[] nums) {
        int prod = 1;
        for (int num : nums) prod *= signFunc(num);
        return prod;
    }
    
    public int signFunc(int x) {
        if (x == 0) return 0;
        if (x > 0) return 1;
        return -1;
    }
}