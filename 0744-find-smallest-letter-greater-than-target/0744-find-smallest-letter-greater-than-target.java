class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int index = -1;
        int left = 0;
        int right = letters.length-1;
        while(left<=right)
        {
            int mid = (left+right)/2;
            if(letters[mid]>target)
            {
                index = mid;
                right = mid-1;
            }
            else
            {
                left = mid+1;
            }
        }
        if(index==-1)
        {
            return letters[0];
        }
        else
        {
            return letters[index];
        }
        
    }
}