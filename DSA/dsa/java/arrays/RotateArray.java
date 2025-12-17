package dsa.java.arrays;

import java.util.Arrays;

public class RotateArray {
        public static void main(String[] args) {
            int[] arr = {1,2,3,4,5,6,7};
            int k = 13;
                k = k % arr.length;
            rotateArray(arr,0,arr.length-1);
            rotateArray(arr,0,k-1);
            rotateArray(arr,k,arr.length-1);
            System.out.println(Arrays.toString(arr));
        }

        private static void rotateArray(int[] arr, int start, int end) {
            // Two pointers as start and end points will move in opposite direction to replace the elements
            if(arr.length<2){
                throw new IllegalArgumentException("Array is not allowed");
            }
           for(int i = start;i < end ; i++){
                    int swap = arr[i];
                    arr[i] = arr[end ];
                    arr[end] = swap;
                    end--;
            }
        }
}
/* Leetcode - 189. Rotate Array
* Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
    Example 1:
    Input: nums = [1,2,3,4,5,6,7], k = 3
    Output: [5,6,7,1,2,3,4]
    Explanation:
    rotate 1 steps to the right: [7,1,2,3,4,5,6]
    rotate 2 steps to the right: [6,7,1,2,3,4,5]
    rotate 3 steps to the right: [5,6,7,1,2,3,4]
    Example 2:
    Input: nums = [-1,-100,3,99], k = 2
    Output: [3,99,-1,-100]
    Explanation:
    rotate 1 steps to the right: [99,-1,-100,3]
    rotate 2 steps to the right: [3,99,-1,-100]
* */