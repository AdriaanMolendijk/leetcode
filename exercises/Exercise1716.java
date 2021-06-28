class Solution {

    public int totalMoney(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int val = i % 7;
            int bonus = i / 7;
            if (val == 0) {
                val = 7;
                bonus--;
            }
            int day = val + bonus;
            sum += day;
        }
        return sum;
    }

}
