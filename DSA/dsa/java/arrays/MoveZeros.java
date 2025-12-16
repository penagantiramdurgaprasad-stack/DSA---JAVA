package dsa.java.arrays;

import java.util.Arrays;

public class MoveZeros {
    public static void main(String[] args) {
        // Same like removeDuplicates moveZeros uses same technique so two pointers are used.
        int[] arr = {0,1,0,3,12};
        int count = 0;
        for(int i = 0;i < arr.length;i++){
            if(arr[i] != 0){
                arr[count] = arr[i];
                count++;
            }
        }
        for(int j = count;j < arr.length;j++){
            arr[j] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
/*Leetcode- 283. Move Zeroes
    Given an integer array nums, move all 0's to the
    end of it while maintaining the relative order of the non-zero elements.
    Example 1:
    Input: nums = [0,1,0,3,12]
    Output: [1,3,12,0,0]
    Example 2:
    Input: nums = [0]
    Output: [0]
    */