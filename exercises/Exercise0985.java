class Solution {

    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {

        int m = queries.length;
        int[] out = new int[m];
        int sum = 0;
        for (int num : nums) {
            if (num % 2 == 0) sum += num;
        }

        for (int i = 0; i < m; i++) {
            int val = queries[i][0];
            int index = queries[i][1];

            int number = nums[index];
            if (number % 2 == 0) {
                if (val % 2 == 0) {
                    sum += val;
                } else {
                    sum -= number;
                }
            } else {
                if (val % 2 == 0) {
                    // do nothing
                } else {
                    sum += number + val;
                }
            }

            nums[index] += val;
            out[i] = sum;
        }

        return out;

    }

}
