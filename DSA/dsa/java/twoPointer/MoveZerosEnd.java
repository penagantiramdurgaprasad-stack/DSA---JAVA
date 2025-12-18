package dsa.java.twoPointer;

import java.util.Arrays;

public class MoveZerosEnd {
    public static void main(String[] args) {
        int[] arr = {1,2,0,3,0,4,0,0,0,5,0,6,0,6,0};
        System.out.println(Arrays.toString(moveZerosEnd(arr)));

    }

    private static int[] moveZerosEnd(int[] arr) {
        int left = 0,right = arr.length-1,count =0;
        if(arr == null){
            throw new IllegalArgumentException("Array is null");
        }
        if(arr.length == 1){
            return arr;
        }
        while(left<right){
            if(arr[left] != 0){
                arr[count++] = arr[left];
            }
            left++;
        }
        while(count<right){
                arr[count++] = 0;
        }
        return arr;
    }
}
/* Leetcode - 283. Move Zeroes
Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
Note that you must do this in-place without making a copy of the array.
Example 1:
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:
Input: nums = [0]
Output: [0] */