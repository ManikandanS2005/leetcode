import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); // Sort the array
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n - 2; i++) {
            // Skip duplicate elements to avoid duplicate triplets
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            int l = i + 1, r = n - 1;

            while (l < r) {
                int sum = nums[i] + nums[l] + nums[r];

                if (sum == 0) {
                    res.add(Arrays.asList(nums[i], nums[l], nums[r]));

                    
                    while (l < r && nums[l] == nums[l + 1]) l++;
                    while (l < r && nums[r] == nums[r - 1]) r--;

                    l++;
                    r--;
                } 
                else if (sum < 0) {
                    l++; // Increase left pointer to increase sum
                } 
                else {
                    r--; // Decrease right pointer to decrease sum
                }
            }
        }
        return res;
    }
}
