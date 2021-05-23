class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String total1 = "";
        String total2 = "";
        for (String w1 : word1) total1 += w1;
        for (String w2 : word2) total2 += w2;
        return total1.equals(total2);
    }
}