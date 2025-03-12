class Solution {
    public int dominantIndex(int[] nums) {
       int max=-1;
       int max2=-1;
       int maxi=-1;
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]>max)
        {
            max2=max;
            max=nums[i];
            maxi=i;
        }
        else if(nums[i]>max2)
        {
            max2=nums[i];
        }
       }

       if(max>=max2*2)
       {
        return maxi;

       }
       else
       return -1;
}}