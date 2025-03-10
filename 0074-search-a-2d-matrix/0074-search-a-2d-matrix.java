class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       int n=matrix.length;
       int m=matrix[0].length; 
       int l=0,h=n*m-1;

       while(l<=h)
       {
        int mid=(l+h)/2;
        int r=mid/m,c=mid%m;
        if(matrix[r][c]==target)
        {
            return true;
        }
        else if(matrix[r][c]<target)
        {
           l=mid+1; 
        }
         else{
            h=mid-1;
         }
       }
       return false;
    }
}