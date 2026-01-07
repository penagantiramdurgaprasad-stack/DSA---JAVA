package dsa.java.slidingWindow.fixed;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class MaxElementsSubArray {
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        List<Integer> maxSub = maxEleSubArrays(arr,k);
        System.out.println(maxSub);
    }

    private static List<Integer> maxEleSubArrays(int[] arr, int k) {
        List<Integer> result = new ArrayList<>();
        Deque<Integer> dq = new LinkedList<>();
        if (arr == null || arr.length == 0 || k <= 0 || k > arr.length) {
            return result;
        }
        for(int i = 0;i< arr.length;i++){
            while(!dq.isEmpty() && arr[dq.peekLast()] <= arr[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
            if(dq.peekFirst() <= i-k){
                dq.pollLast();
            }
            if(i >= k-1){
                result.add(arr[dq.peekFirst()]);
            }
        }

        return result;
    }
}
