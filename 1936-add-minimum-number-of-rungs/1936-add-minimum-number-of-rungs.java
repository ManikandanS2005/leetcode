class Solution {
    public int addRungs(int[] rungs, int dist) {
        int added = 0;
        for (int i = -1; i < rungs.length - 1; i++) {
            int curr = i == -1 ? 0 : rungs[i];
            int next = rungs[i + 1];
            if (next - curr > dist) {
                added += (next - curr - 1) / dist;
            }
        }
        return added;
    }
}