import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Solution {

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int minDistance = Integer.MAX_VALUE;
        for (int i = 1; i < n; i++) {
            int distance = arr[i] - arr[i-1];
            minDistance = Math.min(minDistance, distance);
        }

        ArrayList<List<Integer>> output = new ArrayList<List<Integer>>();
        for (int i = 1; i < n; i++) {
            int distance = arr[i] - arr[i-1];
            if (distance == minDistance) {
                ArrayList<Integer> pair = new ArrayList<>();
                pair.add(arr[i-1]);
                pair.add(arr[i]);
                output.add(pair);
            }
        }
        return output;
    }

}
