class Solution {

    public int countGoodSubstrings(String s) {
        int n = s.length();
        if (n < 3) return 0;

        // n >= 3 here
        int count = 0;
        for (int i = 3; i <= n; i++) {
            String sub = s.substring(i-3, i);
            if (isGood(sub)) count++;
        }
        return count;
    }

    public boolean isGood(String s) {
        int n = s.length();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                char c1 = s.charAt(i);
                char c2 = s.charAt(j);
                if (c1 == c2) return false;
            }
        }
        return true;
    }

}
