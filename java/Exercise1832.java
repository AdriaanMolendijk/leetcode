class Solution {
    public boolean checkIfPangram(String sentence) {
        String alphabet = "abcdefghijklmnopqwrstuvwxyz";
        for (char x : alphabet.toCharArray()) {
            if (!containsChar(sentence, x)) return false;
        }
        return true;
    }
    
    public boolean containsChar(String word, char c) {
        for (char w : word.toCharArray()) {
            if (c == w) return true;
        }
        return false;
    }
}