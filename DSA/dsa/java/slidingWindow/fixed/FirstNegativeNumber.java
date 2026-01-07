package dsa.java.slidingWindow.fixed;

import java.util.*;

public class FirstNegativeNumber {
    public static void main(String[] args) {
        int[] arr = {12, -1, -7, 8, -15, 30, 16, 28};
        int k = 3;
        System.out.println( Arrays.toString(firstNegative(arr,k)));

    }

    private static int[] firstNegative(int[] arr, int k) {
        if(arr == null || arr.length < 3){
            return new int[] {0};
        }
        Deque<Integer> dq = new LinkedList<>() ;
        int[] result = new int[arr.length - k +1];int ind = 0;
        for(int i = 0;i<arr.length;i++){
            while(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.pollFirst();
            }
            if(arr[i] < 0){
                dq.offerLast(i);
            }
            if(i >= k-1){
                result[ind++] = dq.isEmpty() ? 0 :arr[dq.peekFirst()];
            }
        }
        return result;
    }
}
/*Given an array arr[] of integers and a positive integer k, find the first negative integer in every contiguous subarray (window) of size k. If a window does not contain a negative integer, return 0 for that window.
*Input: arr = [12, -1, -7, 8, -15, 30, 16, 28], k = 3

Output: [-1, -1, -7, -15, -15, 0]*/