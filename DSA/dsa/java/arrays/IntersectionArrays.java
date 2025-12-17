package dsa.java.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionArrays {
    public static void main(String[] args) {
       int[] nums1 = {1,2,2,1}, nums2 = {2,2};
       Set<Integer> set1 = new HashSet<>();
       for(int nm : nums1){
           set1.add(nm);
       }
        Set<Integer> setRe = new HashSet<>();
       for(int num:nums2){
           if(set1.contains(num)){
               setRe.add(num);
           }
       }
       int[] res = new int[setRe.size()];
       int i =0;
       for(int result : setRe){
           res[i++] = result;
       }
       System.out.println(Arrays.toString(res));
    }
    // By using sorting and applying 2 pointers also we can do the same
}
/*Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
Example 1:
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.*/