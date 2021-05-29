class Solution {

    public int countBalls(int lowLimit, int highLimit) {
        int[] boxes = new int[highLimit];
        for (int i = lowLimit; i <= highLimit; i++) {
            boxes[sumDigits(i) - 1]++;
        }
        int maxBalls = 0;
        for (int box : boxes) maxBalls = Math.max(maxBalls, box);
        return maxBalls;
    }

    public int sumDigits(int n) {
        int sum = 0;
        for (char c : Integer.toString(n).toCharArray()) sum += c - '0';
        return sum;
    }

}
