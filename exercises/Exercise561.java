import java.util.Arrays;

class Solution {

    public int arrayPairSum(int[] nums) {

        Arrays.sort(nums);
        int n = nums.length / 2;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int a = nums[2*i];
            int b = nums[2*i+1];
            sum += Math.min(a,b);
        }
        return sum;

    }

}
