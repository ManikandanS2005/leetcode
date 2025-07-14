class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {
        int n=points.length;
        int i=0;
        int s=0;
        while(i<n-1){
             int r=Math.max(Math.abs(points[i][0]-points[i+1][0]),Math.abs(points[i][1]-points[i+1][1]));
             i++;
             s+=r;
             }
             return s;
        
    }
}