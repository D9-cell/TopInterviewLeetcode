package BitManipulation.Easy;

/*
    Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
    You must implement a solution with a linear runtime complexity and use only constant extra space.

    Example 1:                         Example 2:                           Example 3:
    Input: nums = [2,2,1]              Input: nums = [4,1,2,1,2]            Input: nums = [1]
    Output: 1                          Output: 4                            Output: 1

    Constraints:
    1 <= nums.length <= 3 * 10^4 || -3 * 10^4 <= nums[i] <= 3 * 10^4
    Each element in the array appears twice except for one element which appears only once.
 */

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public int singleNumber(int[] nums) {
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            result = result ^ nums[i];
        }
        return result;
    }

}
