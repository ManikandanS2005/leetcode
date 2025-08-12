class Solution {
    public int numberOfSubstrings(String s) {
        int[] ls={-1,-1,-1};
        int c=0;
        for(int i=0;i<s.length();i++){
            ls[s.charAt(i)-'a']=i;
             int min=Math.min(ls[0],Math.min(ls[1],ls[2]));
             if (min != -1) { // means all three have been seen
            c += min + 1;
        }
        }
        return c;
    }
}