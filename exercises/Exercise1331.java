import java.util.*;

class Solution {

    public int[] arrayRankTransform(int[] arr) {

        int n = arr.length;

        // get set
        Set<Integer> numbers = new HashSet<Integer>();
        for (int a : arr) numbers.add(a);

        // get sorted list
        ArrayList<Integer> sorts = new ArrayList<>(numbers);
        Collections.sort(sorts);

        // create map
        Map<Integer, Integer> map = new HashMap<>();
        int rank = 0;
        for (int sort : sorts) {
            rank++;
            map.put(sort, rank);
        }

        int[] out = new int[n];
        for (int i = 0; i < n; i++) {
            out[i] = map.get(arr[i]);
        }
        
        return out;

    }

}
