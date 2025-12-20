package dsa.java.slidingWindow;

public class MaxSubArray {
    public static void main(String[] args) {
        int[] arr = {2,1,5,1,3,2};int k =3;
        System.out.println(maxSubArraySum(arr,k));

    }

    private static int maxSubArraySum(int[] arr,int k) {
        if(arr == null || arr.length < 3){
            throw new IllegalArgumentException("Array is Length is less than 3");
        }
        int max = Integer.MIN_VALUE,sum = 0;
        for(int i = 0;i<arr.length;i++){
                sum += arr[i];
            if(i >= k-1){
                max = Math.max(max,sum);
                sum -= arr[i-k+1];
            }
        }
        return max;
    }
}
/* arr = {2,1,5,1,3,2}, k =3
O/p - 9 (5,1,3) contiguous subArray*/