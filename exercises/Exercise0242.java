class Solution {

    public boolean isAnagram(String s, String t) {
        return arePermutations(s,t);    
    }

    public static boolean arePermutations(String n1, String n2)
    {
        for (char c = 97; c <= 122; c++) {
            int count1 = 0, count2 = 0;
            for (char c1 : n1.toCharArray()) {
                if (c1 == c) count1++;
            }
            for (char c2 : n2.toCharArray()) {
                if (c2 == c) count2++;
            }
            
            if (count1 != count2) return false;
        }
        
        return true;
    }
    
}
