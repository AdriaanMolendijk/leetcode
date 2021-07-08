class Solution {

    public int[] decrypt(int[] code, int k) {

        int n = code.length;
        int[] decryption = new int[n];
        for (int i = 0; i < n; i++) {

            if (k == 0) decryption[i] = 0;

            int sum = 0;
            int index = i;
            if (k > 0) {
                for (int j = 1; j <= k; j++) {
                    index++;
                    index = getIndex(index, n);
                    sum += code[index];
                }
                decryption[i] = sum;
            } else {
                for (int j = 1; j <= Math.abs(k); j++) {
                    index--;
                    index = getIndex(index, n);
                    sum += code[index];
                }
                decryption[i] = sum;

            }

        }

        return decryption;
    }

    public int getIndex(int index, int n) {
        if (index >= 0 && index < n) return index;
        if (index == -1) return n - 1;
        if (index == n) return 0;
        throw new IllegalArgumentException("Incorrect input");
    }

}
