package dsa.java.strings;

public class PalindromeCheck {
    public static void main(String[] args) {
        String name = "A man, a plan, a canal: Panama";
        System.out.println(palidromecheck(name));

    }

    private static boolean palidromecheck(String name) {
        if(name.isEmpty()){
            return false;
        }
        int left = 0,right = name.length()-1;
        while(left < right){
            if(!Character.isLetterOrDigit(name.charAt(left))){
                left ++;
                continue;
            }else if(!Character.isLetterOrDigit(name.charAt(right))){
                right --;
                continue;
            }else if(Character.toLowerCase(name.charAt(left)) != Character.toLowerCase(name.charAt(right))){
                return false;
            }
                left ++;
                right --;
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
    Explanation: s is an empty string "" after removing non-alphanumeric characters.
    Since an empty string reads the same forward and backward, it is a palindrome.*/