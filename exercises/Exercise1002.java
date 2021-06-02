import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> commonChars(String[] words) {

        List<String> output = new ArrayList<>();
        for (int i = 97; i < 97 + 26; i++) {

            // character c
            char c = (char) i;
            int minHits = Integer.MAX_VALUE;
            for (String word : words) {
                int hits = countHits(word, c);
                minHits = Math.min(minHits, hits);
            }

            for (int j = 1; j <= minHits; j++) {
                output.add(Character.toString(c));
            }
        }
        return output;
    }

    public int countHits(String word, char c) {
        int count = 0;
        for (char w : word.toCharArray()) {
            if (w == c) count++;
        }
        return count;
    }

}
