import java.util.Arrays;

class Solution {

    public int heightChecker(int[] heights) {

        int[] h = heights.clone();
        Arrays.sort(h);
        int n = h.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (heights[i] != h[i]) count++;
        }
        return count;

    }

}
