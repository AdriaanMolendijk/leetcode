import java.util.Arrays;

class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;

        // n >= 2
        int diff = arr[1] - arr[0];
        for (int i = 0; i < n - 1; i++) {
            int a = arr[i];
            int b = arr[i+1];
            if (b - a != diff) return false;
        }
        return true;
    }
}
