class Solution {
    public int[] sortedSquares(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        int c = nums.length - 1;
        int[] result = new int[nums.length];

        while (l <= r) {
            int l1 = nums[l] * nums[l];
            int r1 = nums[r] * nums[r];
            if (l1 > r1) {
                result[c] = l1;
                l++;
            } else {
                result[c] = r1;
                r--;
            }
            c--;
        }

        return result;
    }
}
