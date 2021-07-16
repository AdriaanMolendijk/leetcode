class Solution {

    public void moveZeroes(int[] nums) {
        int n = nums.length;

        for (int repeat = 1; repeat <= n; repeat++) {
            for (int i = 0; i < n - 1; i++) {
                int num = nums[i];
                if (num == 0) {
                    int num2 = nums[i+1];
                    nums[i] = num2;
                    nums[i+1] = 0;
                }
            }
        }

    }

}
