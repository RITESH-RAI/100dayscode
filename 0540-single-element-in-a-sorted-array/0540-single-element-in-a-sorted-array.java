class Solution {
    public int singleNonDuplicate(int[] arr) {
     int n = arr.length;

        // If there's only one element, return it
        if (n == 1) return arr[0];

        // Check if the first element is the single element
        if (arr[0] != arr[1]) return arr[0];

        // Check if the last element is the single element
        if (arr[n - 1] != arr[n - 2]) return arr[n - 1];

        // Binary search between the second and the second last element
        int start = 1;
        int end = n - 2;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if mid is the single element
            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                return arr[mid];
            }

            // Check if the left half can be eliminated
            if ((mid % 2 == 1 && arr[mid] == arr[mid - 1]) || (mid % 2 == 0 && arr[mid] == arr[mid + 1])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1; // Return -1 if no single element is found (should not happen given valid input)
    }
}