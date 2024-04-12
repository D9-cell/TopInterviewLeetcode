package BitManipulation.Medium;
/*
Given two integers left and right that represent the range [left, right],
return the bitwise AND of all numbers in this range, inclusive.

Example 1:                      Example 2:                      Example 3:
Input: left = 5, right = 7      Input: left = 0, right = 0      Input: left = 1, right = 2147483647
Output: 4                       Output: 0                       Output: 0

Constraints: 0 <= left <= right <= 2^31 - 1
 */

public class BitwiseAndOfNumbersRange {

    public int rangeBitwiseAnd(int left, int right) {
        int count = 0;
        while(left != right){
            left = left >> 1;
            right = right >> 1;
            count++;
        }
        return left<<count;
    }

}
