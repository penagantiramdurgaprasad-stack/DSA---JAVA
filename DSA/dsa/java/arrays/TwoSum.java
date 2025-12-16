package dsa.java.arrays;

import java.sql.SQLOutput;
import java.util.*;

/* 1. Two Sum - Leetcode
 Given an array of integers nums and an integer target, return indices of the two
 numbers such that they add up to target.
    Example 1:
    Input: nums = [2,7,11,15], target = 9
    Output: [0,1]
    Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
    Example 2:
    Input: nums = [3,2,4], target = 6
    Output: [1,2]
    Example 3:
    Input: nums = [3,3], target = 6
    Output: [0,1]
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] arrays = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSumPairs(arrays,target))); //If arrays is sorted-Two pointers
        System.out.println(Arrays.toString(twoSumPairsHash(arrays,target))); //If arrays is unsorted-HashMap
    }

    private static int[] twoSumPairsHash(int[] arrays, int target) {
        int i = 0,j = arrays.length-1;
        while(j< arrays.length){
            if(arrays[i] + arrays[j] == target){
                return new int[]{i,j};
            }else if(arrays[i] + arrays[j] < target){
                i++;
            }else{
                j--;
            }
        }
        return new int[]{-1,-1};
    }

    private static int[] twoSumPairs(int[] arrays, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<arrays.length;i++){
            int remain = target - arrays[i];
            if (map.containsKey(remain)) {
                return new int[]{i,map.get(remain)};
            }
            map.put(arrays[i],i);
        }
        return new int[]{-1,-1};
    }

}
