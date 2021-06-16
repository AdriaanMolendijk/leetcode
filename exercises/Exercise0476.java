class Solution {
    public int findComplement(int num) {
        int numBits = (int)(Math.floor(Math.log(num) / Math.log(2))) + 1;
        return ((1 << numBits) - 1) ^ num;
    }
}
