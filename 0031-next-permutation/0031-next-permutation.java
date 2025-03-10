

class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int pivot = -1;

       
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        // Step 2: If no pivot found, reverse the array (last permutation case)
        if (pivot == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // Step 3: Find the next greater element in the suffix to swap with nums[pivot]
        for (int j = n - 1; j > pivot; j--) {
            if (nums[j] > nums[pivot]) {
                swap(nums, pivot, j);
                break;
            }
        }

        // Step 4: Reverse the suffix to get the next smallest permutation
        reverse(nums, pivot + 1, n - 1);
    }

    // Swap function
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    // Reverse function
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}