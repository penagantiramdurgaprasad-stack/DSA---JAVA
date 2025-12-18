package dsa.java.strings;

import java.util.Arrays;

public class ReverseEachWord {
    public static void main(String[] args) {
        String sen = "Just testing the code";
        char[] word = sen.toCharArray();
        int start = 0;
        for(int i =0;i<= word.length;i++){
            if( i == word.length || word[i] == ' ' ){
                reverseWord(word,start,i-1);
                start = i+1;
            }
        }
        System.out.println(Arrays.toString(word));
        System.out.println(new String(word));
    }

    private static void reverseWord(char[] word, int start, int k) {
        while(start<k){
            char c = word[start];
            word[start] = word[k];
            word[k] = c;
            start ++;
            k--;
        }
    }

}
