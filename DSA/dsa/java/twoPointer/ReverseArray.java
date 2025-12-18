package dsa.java.twoPointer;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,6,7,8};
        reverseArray(arr);
    }

    private static void reverseArray(int[] arr) {
        if(arr.length < 1){
            throw new RuntimeException("Array is lessthan 2");
        }
        if(arr.length == 1){
            System.out.println(Arrays.toString(arr));
        }
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
