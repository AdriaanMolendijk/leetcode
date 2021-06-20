import java.util.HashMap;

class Solution {

    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int a : arr) {
            if (map.containsKey(a)) {
                map.put(a, map.get(a) + 1);
            } else {
                map.put(a,1);
            }
        }

        int max = -1;
        for (int key : map.keySet()) {
            if (map.get(key) == key) {
                max = Math.max(max, key);
            }
        }
        return max;
    }

}
