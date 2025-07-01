class Solution {
    public int possibleStringCount(String word) {

           int count = 1;  // At least one possibility: no removal

        int i = 0;
        int n = word.length();

        while (i < n) {
            int j = i;

            // Move j to the end of current group of same letters
            while (j < n && word.charAt(j) == word.charAt(i)) {
                j++;
            }

            int groupLength = j - i;

            if (groupLength > 1) {
                // We can reduce duplicates in this group
                count += (groupLength - 1);
            }

            i = j;  // Move to next group
        }

        return count;
    }
}