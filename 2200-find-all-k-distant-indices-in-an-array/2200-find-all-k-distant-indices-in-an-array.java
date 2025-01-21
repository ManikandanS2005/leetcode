import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;

class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> list = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();  // To store unique indices

        // Find all occurrences of `key`
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == key) {
                // For each occurrence of `key`, add all indices within k distance
                for (int i = Math.max(0, j - k); i <= Math.min(nums.length - 1, j + k); i++) {
                    set.add(i);  // Add index to set to avoid duplicates
                }
            }
        }

        // Convert set to list and sort it
        list.addAll(set);
        Collections.sort(list);

        return list;
    }
}
