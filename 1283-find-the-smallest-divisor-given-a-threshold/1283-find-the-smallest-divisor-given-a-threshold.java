class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int l = 1;
        int r = getMax(nums);  // Max value in the array

        while (l <= r) {
            int m = l + (r - l) / 2;
            if (isValid(nums, threshold, m)) {
                r = m - 1;
            } else {
                l = m + 1;
            }
        }

        return l;
    }

    // Helper to find max in array
    private int getMax(int[] nums) {
        int max = nums[0];
        for (int i : nums) {
            max = Math.max(max, i);
        }
        return max;
    }

    // Check if using divisor 'd' keeps sum within threshold
    private boolean isValid(int[] nums, int threshold, int d) {
        int sum = 0;
        for (int num : nums) {
            sum += (num + d - 1) / d;  // Equivalent to ceil(num / d)
        }
        return sum <= threshold;
    }
}
