class Solution {
    public int numberOfSteps(int num) {
        if (num == 0) return 0;
        // num >= 1 here
        if (num % 2 == 0) return 1 + numberOfSteps(num/2);
        return 1 + numberOfSteps(num - 1);
    }
}