class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        Stack<Integer> stack = new Stack<>();

        // Initialize result with -1
        Arrays.fill(result, -1);

        // Traverse the array twice to simulate circular behavior
        for (int i = 0; i < 2 * n; i++) {
            int num = nums[i % n];

            // Process elements in the stack
            while (!stack.isEmpty() && nums[stack.peek()] < num) {
                result[stack.pop()] = num;
            }

            // Only push index during the first pass
            if (i < n) {
                stack.push(i);
            }
        }

        return result;
    }
}

