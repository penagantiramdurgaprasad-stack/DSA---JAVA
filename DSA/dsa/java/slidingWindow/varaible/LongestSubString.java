package dsa.java.slidingWindow.varaible;

import java.util.HashSet;
import java.util.Set;

public class LongestSubString {
    public static void main(String[] args) {
        String str = "abcabcbb";
        System.out.println(longestSubString(str));
    }

    private static int longestSubString(String str) {
        int left = 0,maxLength = 0;
        Set<Character> set = new HashSet<>();
        for(int right = 0;right < str.length();right++){
            char c = str.charAt(right);
            while (set.contains(c)){
                set.remove(str.charAt(left));
                left++;
            };
            set.add(c);
            maxLength = Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
}
/* Leetcode - 3. Longest Substring Without Repeating Characters
Given a string s, find the length of the longest substring without duplicate characters.
Example 1:
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3. Note that "bca" and "cab" are also correct answers.
Example 2:
Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:
Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring*/