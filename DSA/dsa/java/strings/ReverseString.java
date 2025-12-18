package dsa.java.strings;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String name = "hellow";
        reverseString(name);
    }

    private static void reverseString(String name) {
        int i = 0,j = name.length()-1;
        char[] names = name.toCharArray();
        while(i<j){
            char c = names[i];
            names[i] = names[j];
            names[j] = c;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(names));
        System.out.println(new String(names));

    }
}
/* Leetcode - 344. Reverse String
    Write a function that reverses a string. The input string is given as an array of characters s.
    You must do this by modifying the input array in-place with O(1) extra memory.
    Example 1:
    Input: s = ["h","e","l","l","o"]
    Output: ["o","l","l","e","h"]
    Example 2:
    Input: s = ["H","a","n","n","a","h"]
    Output: ["h","a","n","n","a","H"]
 */