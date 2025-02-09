class Solution {
    public long countBadPairs(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(nums[i] - i != nums[j] - j)
                {
                    sum++;
                }
            }
        }
        return sum;
    }
}