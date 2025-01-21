class Solution {
    public int dominantIndex(int[] nums) {
        int n = nums.length;

        // Edge case: If there's only one element, return its index (0)
        if (n == 1) {
            return 0;
        }

        int maxIndex = 0; // Track the index of the maximum number

        // Find the maximum element and its index
        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }

        // Check if the maximum is at least twice as large as all other elements
        for (int i = 0; i < n; i++) {
            if (i != maxIndex && nums[maxIndex] < 2 * nums[i]) {
                return -1; // Condition not satisfied
            }
        }

        return maxIndex; // Return the index of the dominant element
    }
}
