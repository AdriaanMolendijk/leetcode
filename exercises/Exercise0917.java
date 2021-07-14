class Solution {

    public String reverseOnlyLetters(String s) {
        String chars = s.replaceAll("-", "");
        chars = s.replaceAll("!", "");
        chars = new StringBuilder(chars).reverse().toString();

        String out = "";
        int n = s.length();
        int charCount = -1;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '-' || s.charAt(i) == '!') {
                out += s.charAt(i);
            } else {
                charCount++;
                out += chars.charAt(charCount);
            }
        }

        return out;
    }

}
