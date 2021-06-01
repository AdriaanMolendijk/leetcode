import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<String> buildArray(int[] target, int n) {
        int l = target.length;
        int end = target[l-1];
        ArrayList<String> output = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i > end) break;
            output.add("Push");
            if (Arrays.binarySearch(target, i) < 0) output.add("Pop");
        }
        return output;
    }
}
