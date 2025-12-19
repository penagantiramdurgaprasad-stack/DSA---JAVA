package dsa.java.twoPointer;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args) {
        int[] arr = {-4,-1,0,3,10};
        squaresArray(arr);
    }

    private static void squaresArray(int[] arr) {
        if(arr == null || arr.length<2){
            throw new IllegalArgumentException("Array length is small");
        }
        int left = 0,right = arr.length-1;
        int[] res = new int[arr.length];
        int len = res.length-1;
        while(left<=right){
            int lefRes = arr[left]*arr[left];
            int rigthRes =  arr[right]* arr[right];
            if(lefRes>rigthRes){
                res[len--] = lefRes;
                left++;
            }else{
                res[len--] = rigthRes;
                right--;
            }
        }
        System.out.println(Arrays.toString(res));
    }
}
/* Leetcode - 977. Squares of a Sorted Array
    Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
    Example 1:
    Input: nums = [-4,-1,0,3,10]
    Output: [0,1,9,16,100]
    Explanation: After squaring, the array becomes [16,1,0,9,100].
    After sorting, it becomes [0,1,9,16,100].
    Example 2:
    Input: nums = [-7,-3,2,3,11]
    Output: [4,9,9,49,121]*/