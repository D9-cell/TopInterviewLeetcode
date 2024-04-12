package Math;
/*
Given an integer n, return the number of trailing zeroes in n!.
Note that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1.
Example 1:                                  Example 2:                      Example 3:
Input: n = 3                                Input: n = 5                    Input: n = 0
Output: 0                                   Output: 1                       Output: 0
Explanation: 3! = 6, no trailing zero.      Explanation: 5! = 120, one trailing zero.
Constraints:0 <= n <= 10^4
Follow up: Could you write a solution that works in logarithmic time complexity?
 */
public class FactTrailingZero {
    public int trailingZeroes(int n) {
        int ans = 0;
        while(n>0){
            n = n/5;
            ans += n;
        }
        return ans;
    }
}
