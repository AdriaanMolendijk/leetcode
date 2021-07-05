class Solution {

    public int getMinDistance(int[] nums, int target, int start) {

        int minDist = Integer.MAX_VALUE;
        int index = -1;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                int dist = Math.abs(i - start);
                if (dist < minDist) {
                    minDist = dist;
                    index = i;
                }
            }
        }
        return minDist;

    }

}
