package dsa.java.strings;

import java.util.HashMap;
import java.util.Map;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "anagram", t = "nagaram";
        // Can be solved using sorting and compare method
        // Can be solved using map
        Map<Character,Integer> map = new HashMap<>();
        if(str1.length() != t.length()){
            throw new IllegalArgumentException("Not anagrams");
        }
        for(int i = 0;i< str1.length();i++){
            map.put(str1.charAt(i),1);
        }
        for(int i = 0;i< str1.length();i++){
            if(!map.containsKey(t.charAt(i))){
                throw new IllegalArgumentException("Strings are not anagrams");
            }
        }
        System.out.println("both are anagarams");
    }
}
/* Leetcode - 242. Valid Anagram

Given two strings s and t, return true if t is an anagram of s, and false otherwise.
Example 1:
Input: s = "anagram", t = "nagaram"
Output: true
Example 2:
Input: s = "rat", t = "car"
Output: false*/