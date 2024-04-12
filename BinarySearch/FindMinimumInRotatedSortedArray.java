package BinarySearch;


/**
Suppose an array of length n sorted in ascending order is rotated between 1 and n times.
For example, the array nums = [0,1,2,4,5,6,7] might become:

[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums of unique elements, return the minimum element of this array.
You must write an algorithm that runs in O(log n) time.

Example 1:                                   |  Example 2:
Input: nums = [3,4,5,1,2]                    |  Input: nums = [4,5,6,7,0,1,2]
Output: 1                                    |  Output: 0
Explanation: The original array was          |  Explanation: The original array was
[1,2,3,4,5] rotated 3 times.                 |  [0,1,2,4,5,6,7] and it was rotated 4 times.
_____________________________________________|________________________________________________________
Example 3:                                   |  Example 4:                  |    Example 5:
Input: nums = [11,13,15,17]                  |  Input: nums = [5,1,2,3,4]   |   Input: nums = [3,1,2]
Output: 11                                   |  Output: 1                   |   Output: 1
Explanation: The original array was          |
[11,13,15,17] and it was rotated 4 times.    |

 Constraints:
 n == nums.length || 1 <= n <= 5000 || -5000 <= nums[i] <= 5000 || All the integers of nums are unique.
 nums is sorted and rotated between 1 and n times.
*/

public class FindMinimumInRotatedSortedArray {

    public int findMin(int[] nums) {
        int low = 0;
        int high = nums.length-1;
        while(low < high){
            int mid = low + (high-low)/2;
            if(nums[mid] > nums[mid+1]){
                return nums[mid+1];
            }else if(nums[low] > nums[mid]){
                high = mid;
            }else if(nums[mid] < nums[mid+1]){
                if(nums[low] < nums[high]){
                    high = mid-1;
                }else{
                    low = mid;
                }
            }
        }
        return nums[low];
    }

    // index --> 0 1 2 3 4 5 6
    //          [4,5,6,7,0,1,2]

    // index --> 0 1 2 3 4 5
    //          [5,6,1,2,3,4]

    // index --> 0 1 2 3 4 5 6
    //          [5,6,7,0,1,2,4]


    //index --> 0 1 2 3 4
    //         [2,3,4,5,1]



}
