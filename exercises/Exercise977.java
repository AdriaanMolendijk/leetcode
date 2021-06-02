import java.util.Arrays;

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] out = new int[n];
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            out[i] = num * num;
        }
        Arrays.sort(out);
        return out;
    }
}
