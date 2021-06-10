import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

class Solution {

    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> occurs = new HashMap<Integer,Integer>();
        for (int num : arr) {
            if (occurs.containsKey(num)) {
                occurs.put(num, occurs.get(num) + 1);
            } else {
                occurs.put(num,1);
            }
        }

        Set<Integer> occurrences = new TreeSet<Integer>();
        for (int key : occurs.keySet()) {
            occurrences.add(occurs.get(key));
        }
        if (occurrences.size() == occurs.keySet().size()) return true;
        return false;
    }

}
