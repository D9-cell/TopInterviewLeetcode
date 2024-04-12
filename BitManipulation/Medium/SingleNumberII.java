package BitManipulation.Medium;

/*
    Given an integer array nums where every element appears three times except for one, which appears exactly once.
    Find the single element and return it.
    You must implement a solution with a linear runtime complexity and use only constant extra space.

    Example 1:                      Example 2:
    Input: nums = [2,2,3,2]         Input: nums = [0,1,0,1,0,1,99]
    Output: 3                       Output: 99

    Constraints:
    1 <= nums.length <= 3 * 10^4
    -2^31 <= nums[i] <= 2^31 - 1
    Each element in nums appears exactly three times except for one element which appears once.
 */

public class SingleNumberII {

    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;
        for (int num : nums) {
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }
        return ones;
    }

    /*
    1.`ones` represents the bits that have appeared exactly once so far.

    2.`twos` represents the bits that have appeared exactly twice so far.

    3.When a number appears for the first time, it will be XORed with `ones`, and `twos` will remain unchanged.

    4.When a number appears for the second time, it will be XORed with `ones`,
      and the result will be XORed with `twos` to effectively remove it from `ones`.

    5.When a number appears for the third time, it will reset both `ones` and `twos` because
      XORing it with `ones` and `twos` will cancel each other out.

    6.At the end of the loop, ones will hold the single number that appeared only once.
    This solution has linear runtime complexity O(n) and uses only constant extra space.
     */
}
