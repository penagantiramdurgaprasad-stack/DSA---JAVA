package dsa.java.twoPointer;

public class TrappingRainwater {
    public static void main(String[] args) {
        int[] rain = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(rainTrap(rain));

    }

    private static int rainTrap(int[] rain) {
        if(rain == null || rain.length <3){
            return  0;
        }
        int left = 0,right = rain.length-1,leftMax = 0,rightMax = 0,unit = 0;
        while(left<right){
            if(rain[left] < rain[right]){
                if (rain[left] >= leftMax) {
                   leftMax = rain[left];
                }else{
                    unit +=  leftMax - rain[left] ;
                }
                left ++;
            }else{
                if(rain[right] >= rightMax){
                    rightMax = rain[right];
                }else{
                    unit +=  rightMax - rain[right] ;
                }
                right--;
            }
        }
        return unit;
    }
}
/* Leetcode - 42. Trapping Rain Water
Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining.
Exmaple -1:
 Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
Output: 6
Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
Example 2:
Input: height = [4,2,0,3,2,5]
Output: 9*/