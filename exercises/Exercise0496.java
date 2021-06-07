class Solution {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] out = new int[n];
        for (int i = 0; i < n; i++) {
            int num1 = nums1[i];
            int index = indexOf(nums2, num1);
            boolean found = false;
            for (int j = index + 1; j < m; j++) {
                int num2 = nums2[j];
                if (num2 > num1) {
                    out[i] = num2;
                    found = true;
                    break;
                }
            }
            
            if (!found) {
                out[i] = -1;
            }
        }
        return out;
    }

    public int indexOf(int[] arr, int a) {
        int n = arr.length;
        for (int index = 0; index < n; index++) {
            if (arr[index] == a) return index;
        }
        return -1;
    }

}
