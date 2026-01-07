package dsa.java.slidingWindow.fixed;

public class AverageSubArray {
    public static void main(String[] args) {
        int[] arr = {1,12,-5};
        int k = 4;
        System.out.println(avgMaxSub(arr,k));
    }

    private static double avgMaxSub(int[] arr, int k) {
        if(arr == null || arr.length < k){
            return 0;
        }
        double max =  Double.MIN_VALUE;
        int sum = 0;
        for(int i = 0;i<k;i++){
            sum += arr[i];
        }
        max = (double)sum/k;
        for(int i = k;i< arr.length;i++){
            sum += arr[i]-arr[i-k];
               double maxValue = (double)sum/k;
               max =  Math.max(max,maxValue);

        }
        return max;
    }
}
/* Leetcode (Problem #643)
    You are given an integer array nums consisting of n elements, and an integer k. Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value.
    Example 1 Input: nums = [1,12,-5,-6,50,3], k = 4 Output: 12.75000 Explanation:
     [12,-5,-6,50] has sum = 51 → average = 12.75 (maximum).
    Example 2 Input: nums = [5], k = 1 Output: 5.00000*/