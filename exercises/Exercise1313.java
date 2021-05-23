class Solution {
    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> out = new ArrayList<Integer>();
        int n = nums.length;
        for (int i = 0; i < n; i += 2) {
            int freq = nums[i];
            int val = nums[i+1];
            for (int f = 0; f < freq; f++) {
                out.add(val);
            }
        }
        int l = out.size();
        int[] output = new int[l];
        for (int i = 0; i < l; i++) {
            output[i] = out.get(i);
        }
        return output;
    }
}