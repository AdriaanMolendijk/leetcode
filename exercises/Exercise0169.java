import java.util.HashMap;
import java.util.Map;

class Solution {

    public int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        for (int key : map.keySet()) {
            if (map.get(key) >= Math.ceil(n * 1.0 / 2)) return key;
        }

        return -1;
    }

}
