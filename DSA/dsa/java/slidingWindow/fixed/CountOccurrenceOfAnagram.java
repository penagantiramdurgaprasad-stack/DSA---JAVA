package dsa.java.slidingWindow.fixed;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrenceOfAnagram {
    public static void main(String[] args) {
        String str = "forxxorfxdofr";
        String pat = "for";
        System.out.println(countOccurrence(str,pat));

    }

    private static int countOccurrence(String str, String pat) {
        Map<Character,Integer> map = new HashMap<>();
        int k = pat.length();
        for(int i = 0;i<k;i++){
            map.put(pat.charAt(i),map.getOrDefault(pat.charAt(i),0)+1);
        }
        Map<Character,Integer> mapCount = new HashMap<>();
        int matches = 0,count = 0;
        for(int i = 0;i<str.length();i++){
            char c = str.charAt(i);
            mapCount.put(c,mapCount.getOrDefault(c,0)+1);
            if(map.containsKey(c) && map.get(c).equals(mapCount.get(c))){
                matches ++;
            }
            if(i >= k){
                char cOut  = str.charAt(i-k);
                if(map.containsKey(cOut) && map.get(cOut).equals(mapCount.get(cOut))){
                    matches--;
                }
                mapCount.put(cOut,mapCount.get(cOut)-1);
                if(mapCount.get(cOut) == 0){
                    mapCount.remove(cOut);
                }
            }
            if(matches == map.size()){
                count ++;
            }
        }
        return count;
    }
}
/*An anagram of a string is another string that contains the same characters, only the order can be different.
    Input: txt = "forxxorfxdofr", pat = "for"
    Output: 3
    Explanation:
    Substrings of length 3: "for", "orx", "rxx", "xxo", "xor", "orf", "rfx", "fxd", "xdo", "dof", "ofr"
    Anagrams of "for" are "for", "orf", "ofr" → total = 3.*/