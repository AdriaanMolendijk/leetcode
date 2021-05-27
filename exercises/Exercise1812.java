class Solution {

    public boolean squareIsWhite(String coordinates) {
        char letter = coordinates.charAt(0);
        int num = coordinates.charAt(1) - '0';
        num += letter - 'a';
        if (num % 2 == 0) return true;
        return false;
    }
    
}