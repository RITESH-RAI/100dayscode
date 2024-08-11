class Solution {
    public boolean check(int[] nums) {
        int n = nums.length;
        int countBreaks = 0;

        // Traverse the array to count breaks in sorted order
        for (int i = 0; i < n; i++) {
            // Compare current element with the next element (circular check)
            if (nums[i] > nums[(i + 1) % n]) {
                countBreaks++;
            }
            
            // If more than one break, return false immediately
            if (countBreaks > 1) {
                return false;
            }
        }
        
        // If we have 0 or 1 break in order, the array is a valid rotated sorted array
        return true;
    }
}