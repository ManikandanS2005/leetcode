import java.util.*;

class Solution {
    public int minElement(int[] nums) {
        int minSum = Integer.MAX_VALUE; // To store the minimum digit sum
        
        for (int num : nums) {
            int sum = 0;
            // Calculate the sum of digits of the current number
            while (num > 0) {
                sum += num % 10;  // Add the last digit
                num /= 10;         // Remove the last digit
            }
            // Update the minimum digit sum
            minSum = Math.min(minSum, sum);
        }

        return minSum;  // Return the minimum sum of digits
    }
}
