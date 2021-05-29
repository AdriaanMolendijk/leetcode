class Solution {

    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {

            // i == n - 1
            if (i == n - 1) arr[i] = -1;

            // i < n - 1
            arr[i] = -1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) arr[i] = arr[j];
            }
        }
        return arr;
    }

}