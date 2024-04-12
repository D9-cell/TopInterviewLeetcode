package BinarySearch;

public class SearchInRotatedSortedArray {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            // Check if the left half is sorted
            if (nums[start] <= nums[mid]) {
                // Check if the target is within the sorted left half
                if (nums[start] <= target && target < nums[mid]) {
                    end = mid - 1; // Search left half
                } else {
                    start = mid + 1; // Search right half
                }
            } else { // Right half is sorted
                // Check if the target is within the sorted right half
                if (nums[mid] < target && target <= nums[end]) {
                    start = mid + 1; // Search right half
                } else {
                    end = mid - 1; // Search left half
                }
            }
        }
        return -1; // Target not found
    }
}
