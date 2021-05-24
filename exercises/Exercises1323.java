class Solution {
    public int maximum69Number (int num) {
        String number = Integer.toString(num);
        int n = number.length();
        for (int i = 0; i < n; i++) {
            if (number.charAt(i) == '6') {
                number = number.substring(0,i) + "9" + number.substring(i+1);
                break;
            }
        }
        return Integer.parseInt(number);
    }
}