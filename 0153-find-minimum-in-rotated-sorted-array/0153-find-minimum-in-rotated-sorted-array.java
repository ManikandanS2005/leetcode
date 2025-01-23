class Solution {
    public int findMin(int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        if(nums[0]>nums[n-1])
        {
          for(int i=n-1;i>=0;i--) 
          {
            min=Math.min(min,nums[i]);
          } 
        }
        for(int j:nums)
        {
            {
            min=Math.min(min,j);
          }
        }
        return min;
    }
}