class Solution {
    public int dominantIndex(int[] nums) {
        if (nums.length == 1) return 0; // If only one element, it's always dominant.

        int maxIndex = 0;  // Index of the largest number
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        // Find the largest and second-largest numbers
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                secondMax = max; // Update second largest
                max = nums[i];   // Update largest
                maxIndex = i;    // Store index of largest
            } else if (nums[i] > secondMax) {
                secondMax = nums[i]; // Update second largest if needed
            }
        }

        // Check if the largest number is at least twice the second largest
        if (max >= secondMax * 2) {
            return maxIndex;
        } else {
            return -1;
        }
    }
}
