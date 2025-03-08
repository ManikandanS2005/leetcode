class Solution {
    public int majorityElement(int[] nums) {
        int ans = nums[0];
        int c = 0;
        
        for (int i : nums) {
            if (c == 0) {
                ans = i;
            }
            if (i == ans) {
                c++;
            } else {
                c--;
            }
        }
        
        return ans;
    }
}
