import java.util.HashSet;
import java.util.Set;

class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> numbers1 = new HashSet<Integer>();
        for (int num1 : nums1) numbers1.add(num1);
        Set<Integer> numbers2 = new HashSet<Integer>();
        for (int num2 : nums2) numbers2.add(num2);
        numbers1.retainAll(numbers2);

        int k = 0;
        int[] out = new int[numbers1.size()];
        for (int num1 : numbers1) {
            out[k++] = num1;
        }
        return out;

    }

}
