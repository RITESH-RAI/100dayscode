class Solution {
    public void swap(int[] nums1, int idx1, int[] nums2, int idx2){
        if(nums1[idx1] > nums2[idx2]){
            int temp = nums1[idx1];
            nums1[idx1] = nums2[idx2];
            nums2[idx2] = temp;
        }
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        // Copy nums2 into nums1 from index m onwards
        for (int i = 0; i < n; i++) {
            nums1[m + i] = nums2[i];
        }

        // Total length of the combined array
        int len = m + n;
        // Initialize the gap
        int gap = (len / 2) + (len % 2);
        
        while (gap > 0) {
            int left = 0;
            int right = gap;
            while (right < len) {
                if (left < m && right < m) {
                    // Both elements in nums1
                    swap(nums1, left, nums1, right);
                } else if (left < m && right >= m) {
                    // Left element in nums1 and right element in nums2
                    swap(nums1, left, nums1, right);
                } else {
                    // Both elements in nums2
                    swap(nums1, left, nums1, right);
                }
                left++;
                right++;
            }

            // Reduce the gap
            if (gap == 1)
                break;
            gap = (gap / 2) + (gap % 2);
        }
    }
}

