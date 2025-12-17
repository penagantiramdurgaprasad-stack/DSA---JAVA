package dsa.java.arrays;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        maxSubArray(nums);
    }

    private static void maxSubArray(int[] nums) {
        // Kadane algorithm is used
        if(nums.length < 2){
            throw new IllegalArgumentException("length should be greater than 2");
        }
        int currentSum = nums[0];
        int max = nums[0];
        for(int i =1; i<nums.length;i++){
            currentSum = Math.max(nums[i],currentSum + nums[i]);
            max = Math.max(max,currentSum );
        }
        System.out.println(max);
    }

}
/*Given an integer array nums, find the subarray with the largest sum, and return its sum.
    Example 1:
    Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    Output: 6
    Explanation: The subarray [4,-1,2,1] has the largest sum 6.
    Example 2:
    Input: nums = [1]
    Output: 1
    Explanation: The subarray [1] has the largest sum 1.
    Example 3:
    Input: nums = [5,4,-1,7,8]
    Output: 23
    Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.*/