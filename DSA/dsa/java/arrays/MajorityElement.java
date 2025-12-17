package dsa.java.arrays;

public class MajorityElement {
    //Boyer-Moore Voting Algorithm
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        int cand = 0,count = 0;
        for(int i = 0; i< nums.length; i++){
            if(count == 0){
                cand = nums[i];
            }
            count += (cand == nums[i]) ? 1:-1;
        }
        System.out.println(cand);
    }
}
/*Leetcode - 169. Majority Element
    Given an array nums of size n, return the majority element.
    The majority element is the element that appears more than ⌊n / 2⌋ times.
    You may assume that the majority element always exists in the array.
    Example 1:
    Input: nums = [3,2,3]
    Output: 3
    Example 2:
    Input: nums = [2,2,1,1,1,2,2]
    Output: 2 */