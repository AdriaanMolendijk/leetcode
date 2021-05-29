import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> nums = new ArrayList<Integer>();
        for (int i = left; i <= right; i++) {
            if (isSelfDividing(i)) nums.add(i);
        }
        return nums;
    }

    public boolean isSelfDividing(int n) {
        String num = Integer.toString(n);
        if (num.contains("0")) return false;
        for (char c : num.toCharArray()) {
            int digit = c - '0';
            if (n % digit != 0) return false;
        }
        return true;
    }
}