package dsa.java.arrays;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] nums1 ={1,2,3,0,0,0};
        int[] nums2 ={2,5,6};
        mergeSortedArrays(nums1,nums2);
    }

    private static void mergeSortedArrays(int[] nums1,int[] nums2) {
        int n1 = 3 -1; // m
        int n2 = 3 -1 ; // n = 3 provided in problem
        int k = nums1.length-1; // or m+n-1
        while(n1 >=0 && n2 >=0){
            if(nums1[n1] > nums2[n2]){
                nums1[k] = nums1[n1];
                n1 --;
            }else{
                nums1[k] = nums2[n2];
                n2 --;
            }
            k--;
        }

        while(n2 >=0){
            nums1[k] = nums2[n2];
            n2--;
            k--;
        }
        System.out.println(Arrays.toString(nums1));
    }
}
/*You are given two integer arrays nums1 and nums2,
sorted in non-decreasing order, and two integers m and n,
representing the number of elements in nums1 and nums2 respectively.
    Example 1:
    Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
    Output: [1,2,2,3,5,6]
    Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
    The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.
    Example 2:
    Input: nums1 = [1], m = 1, nums2 = [], n = 0
    Output: [1]
    Explanation: The arrays we are merging are [1] and [].
    The result of the merge is [1].*/