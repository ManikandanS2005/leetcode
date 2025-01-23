class Solution {
    public int minimumSum(int[] nums) {
        int n = nums.length;
        int minSum = Integer.MAX_VALUE;

        // Traverse with j as the middle element of the triplet
        for (int j = 1; j < n - 1; j++) {
            int leftMin = Integer.MAX_VALUE;
            int rightMin = Integer.MAX_VALUE;

            // Find the smallest number to the left of j that is less than nums[j]
            for (int i = 0; i < j; i++) {
                if (nums[i] < nums[j]) {
                    leftMin = Math.min(leftMin, nums[i]);
                }
            }

            // Find the smallest number to the right of j that is less than nums[j]
            for (int k = j + 1; k < n; k++) {
                if (nums[k] < nums[j]) {
                    rightMin = Math.min(rightMin, nums[k]);
                }
            }

            // If both left and right elements are found, calculate the triplet sum
            if (leftMin != Integer.MAX_VALUE && rightMin != Integer.MAX_VALUE) {
                int sum = leftMin + nums[j] + rightMin;
                minSum = Math.min(minSum, sum);
            }
        }

        // If no valid mountain triplet is found, return -1
        return minSum == Integer.MAX_VALUE ? -1 : minSum;
    }
}
