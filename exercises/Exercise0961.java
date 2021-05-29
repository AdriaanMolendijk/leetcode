import java.util.HashSet;
import java.util.Set;

class Solution {
    public int repeatedNTimes(int[] nums) {

        // get all numbers in array
        Set<Integer> numbers = new HashSet<>();
        for (int num : nums) numbers.add(num);

        int n = nums.length;
        for (int number : numbers) {
            int count = 0;
            for (int num : nums) {
                if (num == number) {
                    count++;
                }
            }
            if (count == n / 2) return number;
        }
        
        throw new IllegalStateException("Incorrect input");
    }
}
