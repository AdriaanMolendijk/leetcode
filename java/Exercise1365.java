class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] out = new int[n];
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = 0; j < n; j++) {
                if (nums[j] < nums[i]) {
                    sum++;
                }
            }
            out[i] = sum;
        }
        return out;
    }
}