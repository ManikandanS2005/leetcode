class Solution {
    public int findNumbers(int[] nums) {
        int c=0;
        for(int i:nums)
        {
            if(digcount(i))
            {
                c++;
            }
        }
        return c;
    }

    public static boolean digcount(int n)
    {int c=1;
        while(n>9)
        {
            n/=10;
            c++;
        }
        return c%2==0;
    }
}