package dsa.java.twoPointer;

import java.util.Arrays;

public class RemoveDuplicatesArr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4,5,5,6,7,8,8};
        removeDuplicates(arr);
    }

    private static void removeDuplicates(int[] arr) {
        if(arr == null || arr.length < 2){
            throw new IllegalArgumentException("Arrays is smaller to process");
        }
        int left = 1,right = arr.length,count = 1;
        while(left<right){
            if(arr[left] != arr[left-1]){
                arr[count ++] = arr[left];
            }
            left++;
        }
        while(count<right){
            arr[count ++] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }
}
