class Solution {

    public int countCharacters(String[] words, String chars) {
        int total = 0;
        for (String word : words) {
            if (isGood(word, chars)) total += word.length();
        }
        return total;
    }

    public boolean isGood(String word, String chars) {
        for (int i = 97; i < 97 + 26; i++) {
            char c = (char) i;
            int wordCount = charCount(word, c);
            int charCount = charCount(chars, c);
            if (wordCount > charCount) return false;
        }
        return true;
    }

    public int charCount(String word, char c) {
        int count = 0;
        for (char w : word.toCharArray()) {
            if (c == w) count++;
        }
        return count;
    }

}
