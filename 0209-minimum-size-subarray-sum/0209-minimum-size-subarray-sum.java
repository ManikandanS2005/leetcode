class Solution {
    public int minSubArrayLen(int k, int[] nums) {
        int n = nums.length;
        int l = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        for (int r = 0; r < n; r++) {
            sum += nums[r]; // expand the window

            // shrink the window while the sum is ≥ k
            while (sum >= k) {
                min = Math.min(min, r - l + 1);
                sum -= nums[l];
                l++;
            }
        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }
}
