package dsa.java.arrays;

import java.util.Arrays;

public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(Arrays.toString(removeDuplicate(arr)));
//     Using only 2 pointers because it is sorted and value comparing to the adjacent values,O(n).
    }

    private static int[] removeDuplicate(int[] arr) {
        if(arr.length < 2){
            throw new IllegalArgumentException("array length should be greater than 2");
        }
        int count = 1,j = 1;
        while(j < arr.length){
            if(arr[j] != arr[j-1]){
                arr[count] = arr[j];
                count++;
            }
            j++;
        }
        for(int k = count;k < arr.length;k++){
            arr[k] = 0;
        }
        return arr;
    }
}
/* LeetCode -26
    Given an integer array nums sorted in non-decreasing order, remove the duplicates
    in-place such that each unique element appears only once.
    The relative order of the elements should be kept the same.
    Input: nums = [1,1,2]
    Output: 2, nums = [1,2,_]
    Explanation: Your function should return k = 2, with the first two elements of
    nums being 1 and 2 respectively.
    It does not matter what you leave beyond the returned k (hence they are underscores).*/
