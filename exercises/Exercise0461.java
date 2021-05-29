class Solution {

    public int hammingDistance(int x, int y) {

        String num1 = Integer.toBinaryString(x);
        String num2 = Integer.toBinaryString(y);

        if (num1.length() <= num2.length()) {
             // do nothing
        } else {
            // swap
            String temp = num1;
            num1 = num2;
            num2 = temp;
        }

        // num1.length() <= num2.length(), e.g. num1 = 101, num2 = 10000
        int length = num2.length() - num1.length();
        for (int i = 0; i < length; i++) {
            num1 = "0" + num1;
        }

        int count = 0;
        int n = num1.length();
        for (int i = 0; i < n; i++) {
            if (num1.charAt(i) != num2.charAt(i)) count++;
        }
        return count;

    }
    
}
