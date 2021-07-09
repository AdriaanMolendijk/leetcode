class Solution {

    public int tribonacci(int n) {
        int[] numbers = new int[38];
        numbers[0] = 0;
        numbers[1] = 1;
        numbers[2] = 1;
        if (n < 3) return numbers[n];
        for (int k = 3; k <= n; k++) {
            numbers[k] = numbers[k-1] + numbers[k-2] + numbers[k-3];
        }
        return numbers[n];
    }

}
