class Solution {
    public int dominantIndex(int[] nums) {
        int max_value = Integer.MIN_VALUE;
        int maxIndex = -1;

        for(int i=0;i<nums.length;i++) {
            if(nums[i] > max_value) {
                max_value = nums[i];
                maxIndex = i;
            }
        }

        for(int i=0;i<nums.length;i++) {
            if (i != maxIndex && max_value < 2 * nums[i]) {
                return -1;
            }
        }

        return maxIndex;
    }
}