package ArrayOrString.Medium;

public class RemoveDuplicatesFromSortedArrayII {

    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) // If the array length is less than or equal to 2, no need to process, return the length
            return nums.length;

        int count = 1; // Initialize the count of the current element to 1
        int index = 1; // Start index to store the result after removing duplicates

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) { // If the current element is equal to the previous one
                count++; // Increment count
            } else {
                count = 1; // Reset count for a new element
            }

            if (count <= 2) { // If count is less than or equal to 2, include the element
                nums[index++] = nums[i]; // Move the element to its correct position in the result
            }
        }

        return index; // Return the length of the result array
    }


}
