class Solution {
    public int[] runningSum(int[] nums) {
        int sum = 0, n = nums.length;
        int[] out = new int[n];
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            out[i] = sum;            
        }
        return out;
    }
}