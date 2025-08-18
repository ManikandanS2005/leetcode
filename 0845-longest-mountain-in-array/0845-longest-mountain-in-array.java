class Solution {
    public int longestMountain(int[] arr) {
        int n = arr.length;
        int i = 1;
        int maxlen = 0;

        while (i < n - 1) {
            // Check if current is a peak
            if (arr[i - 1] < arr[i] && arr[i] > arr[i + 1]) {
                int l = i - 1;
                int r = i + 1;

                // Expand to the left - strictly increasing
                while (l > 0 && arr[l - 1] < arr[l]) {
                    l--;
                }

                // Expand to the right - strictly decreasing
                while (r < n - 1 && arr[r] > arr[r + 1]) {
                    r++;
                }

                maxlen = Math.max(maxlen, r - l + 1);

                i = r; // Skip to end of current mountain
            } else {
                i++;
            }
        }

        return maxlen;
    }
}
