package dsa.java.strings;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "abcbc";
        removeDuplicateChar(str);
    }

    private static void removeDuplicateChar(String str) {
        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< str.length();i++){
            set.add(str.charAt(i));
        }
        for(char c : set){
            sb.append(c);
        }
        System.out.println(sb);
    }
}
/* Leetcode - 316. Remove Duplicate Letters
Given a string s, remove duplicate letters so that every letter appears once and only once. You must make sure your result is the smallest in lexicographical order among all possible results.
* Example 1:
Input: s = "bcabc"
Output: "abc"
Example 2:
Input: s = "cbacdcbc"
Output: "acdb"*/