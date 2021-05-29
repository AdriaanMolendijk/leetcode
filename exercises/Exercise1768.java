class Solution {
    public String mergeAlternately(String word1, String word2) {

        String w1, w2;
        if (word1.length() <= word2.length()) {
            w1 = word1;
            w2 = word2;
        } else {
            w1 = word2;
            w2 = word1;
        }
        
        // w1.length <= w2.length
        int n = w1.length();
        String out = "";
        for (int i = 0; i < n; i++) {
            out += word1.charAt(i);
            out += word2.charAt(i);
        }
        out += w2.substring(n);
        return out;
    }
}
