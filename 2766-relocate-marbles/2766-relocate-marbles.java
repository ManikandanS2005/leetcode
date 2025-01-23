import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

class Solution {
    public List<Integer> relocateMarbles(int[] nums, int[] moveFrom, int[] moveTo) {
        // Use a TreeSet to maintain the marbles in sorted order
        TreeSet<Integer> marbleSet = new TreeSet<>();
        for (int num : nums) {
            marbleSet.add(num);
        }

        int n = moveFrom.length;

        // Process the moves
        for (int j = 0; j < n; j++) {
            // Remove the marble at moveFrom[j]
            marbleSet.remove(moveFrom[j]);
            // Add the marble at moveTo[j]
            marbleSet.add(moveTo[j]);
        }

        // Convert the sorted set to a list
        return new ArrayList<>(marbleSet);
    }
}
