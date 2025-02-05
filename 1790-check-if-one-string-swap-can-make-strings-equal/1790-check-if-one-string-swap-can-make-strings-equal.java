class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        int n=s1.length();
      int count =0;
       for(int i=0;i<n;i++)
       {
        if(s1.charAt(i)!=s2.charAt(i))
          count++;
       }
       return count==2||count==0?true:false;
        
    }
}