package dsa.java.twoPointer;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,9} ;int target = 7;

        System.out.println(Arrays.toString(twoSum(arr,target)));
    }

    private static int[] twoSum(int[] arr, int target) {
        int left = 0,right = arr.length-1;
        while(left<right){
            if(arr[left] + arr[right] == target){
                return new int[]{left,right};
            }
            else if(arr[left] + arr[right] < target){
                left++;
            }
            else{
                right--;
            }
        }
        return new int[]{-1,-1};
    }
}
