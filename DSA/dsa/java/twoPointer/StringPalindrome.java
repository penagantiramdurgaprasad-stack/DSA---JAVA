package dsa.java.twoPointer;

public class StringPalindrome {
    public static void main(String[] args) {
        String str= "rammar";
        System.out.println(isPalindrome(str));
    }

    private static boolean isPalindrome(String str) {
        if(str.isEmpty()){
            throw new IllegalArgumentException("str is empty");
        }
        if(str.length() ==1){
            return true;
        }
        int left = 0,right = str.length()-1;
        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
/* Leetcode - 125. Valid Palindrome
   A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
    Given a string s, return true if it is a palindrome, or false otherwise.
    Example 1:
    Input: s = "A man, a plan, a canal: Panama"
    Output: true
    Explanation: "amanaplanacanalpanama" is a palindrome.
    Example 2:
    Input: s = "race a car"
    Output: false
    Explanation: "raceacar" is not a palindrome.
    Example 3:
    Input: s = " "
    Output: true
    Explanation: s is an empty string "" after removing non-alphanumeric characters.*/