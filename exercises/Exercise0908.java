class Solution {

    public int smallestRangeI(int[] nums, int k) {
        int max = -1, min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        int dist = max - min;
        if (dist < 2 * k) return 0;
        return dist - 2 * k;
    }

}
