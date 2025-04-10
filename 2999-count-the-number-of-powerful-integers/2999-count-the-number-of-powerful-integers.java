class Solution {
    public long numberOfPowerfulInt(long start, long finish, int limit, String s) {
        int c=0;
        String s3=String.valueOf(limit);
        for(long i=start;i<=finish;i++)
        {
            String s1=String.valueOf(i);
            if(s1.endsWith(s)&&(!s1.startsWith(s3)))
            {
                c++;
            }
        }
        return c;
        
    }
}