class Solution {
    public int characterReplacement(String s, int k) {
        int l=0;
        int r=0;
        int maxlen=0;
        int maxf=0;
        int[] ar=new int[26];
        while(r<s.length())
        {
            ar[s.charAt(r)-'A']++;
            maxf=Math.max(maxf,ar[s.charAt(r)-'A']);
            if((r-l+1)-maxf>k)
            {
                ar[s.charAt(l)-'A']--;
                
                l++;

            }
            if((r-l+1)-maxf<=k)
            {
               maxlen=Math.max(maxlen,r-l+1);
               r++;
            }

        }
        return maxlen;
    }
}