import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Solution {

    public int[] frequencySort(int[] nums) {

        HashMap<Integer, Integer> freqs = new HashMap<>();
        for (int num : nums) {
            if (freqs.containsKey(num)) {
                freqs.put(num, freqs.get(num) + 1);
            } else {
                freqs.put(num, 1);
            }
        }

        ArrayList<Pair> pairs = new ArrayList<>();
        for (int key : freqs.keySet()) {
            Pair pair = new Pair(key, freqs.get(key));
            pairs.add(pair);
        }
        Collections.sort(pairs);
        int n = pairs.size();

        ArrayList<Integer> convert = new ArrayList<>();
        for (Pair pair : pairs) {
            int freq = pair.freq;
            for (int f = 1; f <= freq; f++) {
                convert.add(pair.val);
            }
        }

        int[] out = new int[convert.size()];
        for (int i = 0; i < convert.size(); i++) out[i] = convert.get(i);
        return out;

    }

    class Pair implements Comparable<Pair> {
        int val;
        int freq;

        public Pair(int val, int freq) {
            this.val = val;
            this.freq = freq;
        }

        @Override
        public int compareTo(Pair o) {
            if (freq == o.freq)
                return Integer.compare(-val, -o.val);
            return Integer.compare(freq, o.freq);
        }
    }
}
