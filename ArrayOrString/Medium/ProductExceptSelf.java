package ArrayOrString.Medium;

public class ProductExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int left = 1,right = 1;
        for (int i = 0; i < nums.length; i++) {
            result[i] = left;
            left *= nums[i];
        }
        for (int i = nums.length-1; i > -1 ; i--) {
            result[i] *= right;
            right *= nums[i];
        }
        return result;
    }
}
/*
The reason why the first implementation is faster than the second one lies in the loop termination condition
of the second for loop.

In the first implementation:
for (int i = nums.length-1; i > -1; i--)
The loop terminates when 'i' is greater than -1, which is effectively the same as i >= 0.

However, in the second implementation:
for (int i = nums.length-1; i >= 0; i--)
The loop also terminates when 'i' is greater than or equal to 0.
This might seem identical to the first implementation,
but there's a subtle difference: the condition check for i >= 0 is performed
in each iteration of the loop. While the difference may seem minor, it adds up over many iterations.

By eliminating the additional comparison in each iteration, the first implementation reduces the overhead and
thus is slightly faster than the second implementation.
*/
