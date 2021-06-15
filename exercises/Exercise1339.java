import java.util.HashMap;
import java.util.Map;

class Solution {

    public int countLargestGroup(int n) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 1; i <= n; i++) {
            int sum = sumDigits(i);
            if (map.containsKey(sum)) {
                map.put(sum, map.get(sum) + 1);
            } else {
                map.put(sum, 1);
            }
        }
        
        int max = -1;
        for (int key : map.keySet()) {
            max = Math.max(max, map.get(key));
        }
        
        int count = 0;
        for (int key : map.keySet()) {
            if (map.get(key) == max) count++;
        }
        return count;
    }

    public int sumDigits(int n) {
        int sum = 0;
        for (char c : Integer.toString(n).toCharArray()) sum += c - '0';
        return sum;
    }
}
