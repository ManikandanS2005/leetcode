class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0; // To count flowers we can place
        int len = flowerbed.length;

        for (int i = 0; i < len; i++) {
            if (flowerbed[i] == 0) { 
                // Check adjacent plots
                boolean leftEmpty = (i == 0) || (flowerbed[i - 1] == 0);
                boolean rightEmpty = (i == len - 1) || (flowerbed[i + 1] == 0);

                if (leftEmpty && rightEmpty) {
                    // Place a flower here
                    flowerbed[i] = 1;
                    count++;
                    
                    if (count >= n) {
                        return true; // Successfully placed all flowers
                    }
                }
            }
        }

        return count >= n; // Check if we could place all required flowers
    }
}
