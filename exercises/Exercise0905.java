import java.util.ArrayList;

class Solution {
    public int[] sortArrayByParity(int[] nums) {

        ArrayList<Integer> odds = new ArrayList<>();
        ArrayList<Integer> evens = new ArrayList<>();
        int[] output = new int[nums.length];

        for (int num : nums) {
            if (num % 2 == 0) {
                evens.add(num);
                continue;
            }
            odds.add(num);
        }

        int index = 0;
        for (int even : evens) {
            output[index] = even;
            index++;
        }
        for (int odd : odds) {
            output[index] = odd;
            index++;
        }
        return output;
    }
}
