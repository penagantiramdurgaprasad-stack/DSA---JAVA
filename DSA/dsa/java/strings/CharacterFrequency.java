package dsa.java.strings;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static void main(String[] args) {
        String name = "esahgstytdgasgfgfd";
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0; i<name.length();i++){
            map.put(name.charAt(i),map.getOrDefault(name.charAt(i),0)+1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " value " + entry.getValue());
        }
    }
}
/*  Count Character Frequency
*/