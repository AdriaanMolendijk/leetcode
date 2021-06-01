import java.util.ArrayList;

class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        // nums.length = 2 * n
        int n = nums.length / 2;
        ArrayList<Integer> evens = new ArrayList<Integer>();
        ArrayList<Integer> odds = new ArrayList<Integer>();
        for (int num : nums) {
            if (num % 2 == 0) {
                evens.add(num); continue;
            }
            odds.add(num);
        }

        for (int i = 0; i < n; i++) {
            nums[2 * i] = evens.get(i);
            nums[2 * i + 1] = odds.get(i);
        }

        return nums;
    }
}
