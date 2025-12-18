package dsa.java.strings;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingChar {
    public static void main(String[] args) {
        //this can be solved using map and int frequency
        String str = "swiss";
        firstChar(str);
        firstChar1(str);
    }

    private static void firstChar1(String str) {
        Map<Character,Integer> map = new HashMap<>();
        for(char c : str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(entry.getKey());
                break;
            }
        }
    }

    private static void firstChar(String str) {
        int[] arr = new int[256];
        for(char c : str.toCharArray()){
            arr[c] ++;
        }
        for(char c : str.toCharArray()){
            if(arr[c] == 1){
                System.out.println(c);
                break;
            }
        }

    }
}
