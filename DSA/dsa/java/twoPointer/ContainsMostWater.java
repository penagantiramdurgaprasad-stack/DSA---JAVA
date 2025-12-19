package dsa.java.twoPointer;

public class ContainsMostWater {
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,1};
        mostWater(arr);
    }

    private static void mostWater(int[] arr) {
        if(arr == null || arr.length<2){
            System.out.println("null");
            return;
        }
        int max = 0;
        int left = 0,right = arr.length-1;
        while(left<right){
            if(arr[left]<arr[right]){
                int sum = arr[left]*(right-left);
                max = Math.max(max,sum);
                left++;
            }else{
                int sum = arr[right]*(right-left);
                max = Math.max(max,sum);
                right--;
            }
        }
        System.out.println(max);
    }
}
/* Leetcode - 11. Container With Most Water
You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
Find two lines that together with the x-axis form a container, such that the container contains the most water.
Return the maximum amount of water a container can store.
Notice that you may not slant the container.
Example 1
Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:
Input: height = [1,1]
Output: 1*/