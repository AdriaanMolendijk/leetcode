import java.util.HashMap;
import java.util.Map;

class Solution {
    public int sumOfUnique(int[] nums) {

        Map<Integer, Integer> count = new HashMap<>();

        // put numbers in map with their count
        for (int num : nums) {
            if (count.containsKey(num)) {
                count.put(num, count.get(num) + 1);
            } else {
                count.put(num, 1);
            }
        }
        
        int sum = 0;
        for (int key : count.keySet()) {
            if (count.get(key) == 1) sum += key;
        }
        return sum;
    }
}