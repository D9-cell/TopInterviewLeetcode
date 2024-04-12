package TwoPointers;

public class Two_Sum_II {

    public int[] twoSum(int[] numbers, int target) {
        int[] sum = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            int temp = search(numbers,target-numbers[i],i+1, numbers.length);
            if(temp != -1){
                sum[0] = i+1;
                sum[1] = temp;
                break;
            }
        }
        return sum;
    }

    public int search(int[] nums, int target,int left,int right) {
//        int left = 0;
//        int right = nums.length-1;
        while(left<=right){
            int mid = left+((right-left)/2);
            if(nums[mid] == target){
                return mid+1;
            }else if(nums[mid]>target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return -1;
    }
}
