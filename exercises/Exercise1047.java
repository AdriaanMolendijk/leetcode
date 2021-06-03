class Solution {
    
    public String removeDuplicates(String s) {
        for (int i = 0; i < s.length() - 1; i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(i + 1);
            if (c1 == c2) {
                s = s.substring(0, i) + s.substring(i + 2);
                i = Math.max(-1, i - 2);
            }
        }
        return s;
    }
    
}
