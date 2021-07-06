class Solution {

    public int findSpecialInteger(int[] arr) {
        int n = arr.length;
        int count = 0;
        double frac = 0.0;

        for (int i = 0; i < n; i++) {

            int val = arr[i];
            count = 1;
            for (int j = 1; j < n; j++) {
                int index = i + j;
                if (index < n) {
                    if (arr[index] == arr[i]) {
                        count++;
                    } else {
                        break;
                    }
                }
            }

            frac = 1.0 * count / n;
            if (frac > 0.25) return val;

        }
        
        return -1;

    }

}
