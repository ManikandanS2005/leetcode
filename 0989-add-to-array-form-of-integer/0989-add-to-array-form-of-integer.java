import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> result = new ArrayList<>();
        int n = num.length;
        int carry = k; // Start by considering k as the carry
        
        // Start from the last digit of num and work backwards
        for (int i = n - 1; i >= 0; i--) {
            int sum = num[i] + (carry % 10); // Add the current digit and the last digit of carry
            carry = carry / 10 + sum / 10; // Calculate the new carry
            result.add(0, sum % 10); // Add the result digit to the front of the list
        }
        
        // If carry still exists, add the remaining carry to the front
        while (carry > 0) {
            result.add(0, carry % 10);
            carry /= 10;
        }
        
        return result;
    }
}
