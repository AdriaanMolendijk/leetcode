class Solution {
    public String restoreString(String s, int[] indices) {
        int n = indices.length;
        String out = "";
        for (int i = 0; i < n; i++) out += "_";
        for (int i = 0; i < n; i++) {
            int index = indices[i];
            out = out.substring(0, index) + s.charAt(i) + out.substring(index + 1, n);
        }
        return out;        
    }
}