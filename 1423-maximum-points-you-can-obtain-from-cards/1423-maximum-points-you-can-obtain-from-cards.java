class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        
        
        int lsum = 0;
        for (int i = 0; i < k; i++) {
            lsum += cardPoints[i];
        }
        
        int max = lsum;
        int rsum = 0;
        int r = n - 1;
        
        // Move cards from left to right one by one
        for (int i = k - 1; i >= 0; i--) {
            lsum -= cardPoints[i]; // remove card from left side
            rsum += cardPoints[r]; // add card from right side
            r--;
            max = Math.max(max, lsum + rsum);
        }
        
        return max;
    }
}
