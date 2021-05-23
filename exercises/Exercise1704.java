class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        String s1 = s.substring(0, n/2);
        String s2 = s.substring(n/2, n);
        int count1 = 0, count2 = 0;
        for (int i = 0; i < n / 2; i++) {
            if (isVowel(s1.charAt(i))) count1++;
            if (isVowel(s2.charAt(i))) count2++;
        }
        return count1 == count2;
    }
    
    public boolean isVowel(char c) {
        return "aeiouAEIOU".contains(Character.toString(c));
    }
}