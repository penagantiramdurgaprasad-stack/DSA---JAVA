package dsa.java.twoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumDifferencePair {
    public static void main(String[] args) {
        int[] arr = {3,8,-10,23,19,-4,-14,27};
        minDiffernecPair(arr);
    }

    private static void minDiffernecPair(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> list = new ArrayList<>();
        int minDif = Integer.MAX_VALUE;
        for(int i = 1; i < arr.length;i++){
            minDif = Math.min(minDif,arr[i]-arr[i-1]);
        }
        System.out.println(minDif);
        for(int i = 1; i < arr.length;i++){
            if(arr[i]-arr[i-1] == minDif){
                list.add(List.of(arr[i-1],arr[i]));
            }

        }
        System.out.println(list);
    }
}
/* 1200. Minimum Absolute Difference
* Example 1:

Input: arr = [4,2,1,3]
Output: [[1,2],[2,3],[3,4]]
Explanation: The minimum absolute difference is 1. List all pairs with difference equal to 1 in ascending order.
Example 2:

Input: arr = [1,3,6,10,15]
Output: [[1,3]]
Example 3:

Input: arr = [3,8,-10,23,19,-4,-14,27]
Output: [[-14,-10],[19,23],[23,27]]*/