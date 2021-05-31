class Solution {

    public String reverseWords(String s) {
        String[] words = s.split(" ");
        String out = "";
        for (String word : words) out += reverse(word) + " ";
        return out.substring(0, out.length() - 1);
    }

    public String reverse(String word) {
        return new StringBuilder(word).reverse().toString();
    }

}
