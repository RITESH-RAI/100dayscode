

class Solution {
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0) {
            return new int[0][];
        }

        // Sort intervals by the starting time
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> ans = new ArrayList<>();
        int[] currentInterval = intervals[0];
        ans.add(currentInterval);

        for (int i = 1; i < intervals.length; i++) {
            int currentEnd = currentInterval[1];
            int nextStart = intervals[i][0];
            int nextEnd = intervals[i][1];

            if (currentEnd >= nextStart) { // Overlapping intervals, merge them
                currentInterval[1] = Math.max(currentEnd, nextEnd);
            } else { // Non-overlapping interval, add to the list
                currentInterval = intervals[i];
                ans.add(currentInterval);
            }
        }

        return ans.toArray(new int[ans.size()][]);
    }
}