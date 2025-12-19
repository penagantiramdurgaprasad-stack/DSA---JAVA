package dsa.java.twoPointer;

import java.util.Arrays;

public class DutchNationalFlag {
    public static void main(String[] args) {
        int[] arr = {2,0,2,1,1,0};
        sortColour(arr);
    }

    private static void sortColour(int[] arr) {
        if(arr == null || arr.length < 3){
            return;
        }
        int left = 0,mid = 0,right = arr.length-1;
        while(mid<=right){
            if(arr[mid] == 0){
                int temp = arr[left];
                arr[left] = arr[mid];
                arr[mid] = temp;
                left++;
                mid++;
            }else if(arr[mid] == 1){
                mid++;
            }else{
                int temp = arr[mid];
                arr[mid] = arr[right];
                arr[right] = temp;
                right --;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
/* Leetcode - Dutch National Flag
*Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue. will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
You must solve this problem without using the library's sort function.
Example 1:
Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
Example 2:
Input: nums = [2,0,1]
Output: [0,1,2]*/