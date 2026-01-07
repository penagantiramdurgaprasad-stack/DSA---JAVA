package dsa.java.slidingWindow.fixed;

import java.util.Deque;
import java.util.LinkedList;

public class SumOfMinMax {
    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        minMaxSum(arr,k);
    }

    private static void minMaxSum(int[] arr, int k) {
        Deque<Integer> mindq = new LinkedList<>();
        Deque<Integer> maxdq = new LinkedList<>();
        int sum = 0;
        for (int i = 0;i< arr.length;i++){
            while(!mindq.isEmpty() && arr[mindq.peekLast()] >= arr[i]){
                mindq.pollLast();
            }
            mindq.offerLast(i);
            while(!maxdq.isEmpty() && arr[maxdq.peekLast()] <= arr[i]){
                maxdq.pollLast();
            }
            maxdq.offerLast(i);
            while(i >=k && maxdq.peekFirst() <= i-k){
                maxdq.pollFirst();
            }
            while(i >=k && mindq.peekFirst() <= i-k ){
                mindq.pollFirst();
            }
            if(i >= k-1 ){
                sum += arr[mindq.peekFirst()] + arr[maxdq.peekFirst()];
            }

        }
        System.out.println(sum);
    }
}
