import java.util.Arrays;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        int l = 0; // left pointer
        int r = 0; // right pointer
        int[] ar = new int[256]; // stores last index of each character
        Arrays.fill(ar, -1); // initialize with -1 (meaning "not seen yet")

        while (r < s.length()) {
            // If current character is already seen and is inside the current window
            if (ar[s.charAt(r)] != -1 && ar[s.charAt(r)] >= l) {
                l = ar[s.charAt(r)] + 1; // move left pointer after the last occurrence
            }

            ar[s.charAt(r)] = r; // update last seen position for this character
            max = Math.max(max, r - l + 1); // update max length
            r++; // move right pointer
        }

        return max;
    }
}
