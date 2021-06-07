import java.util.HashSet;
import java.util.Set;

class Solution {

    public int singleNumber(int[] nums) {
        Set<Integer> numbers = new HashSet<>();
        int n = nums.length;
        for (int num : nums) numbers.add(num);

        int count = 0;
        for (int number : numbers) {
            count = 0;
            for (int i = 0; i < n; i++) {
                if (number == nums[i]) count++;
                if (count == 2) break;
            }
            if (count == 1) return number;
        }
        
        throw new IllegalStateException("Incorrect input");
    }

}
