package CodingPractice;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {

    public static void main(String[] args) {
        String testString1 = "abcdef";
        String testString2 = "cfbaed";

        System.out.println(isAnagram(testString1, testString2));
    }
    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> sMap = new HashMap<>();

        for(Character letter : s.toCharArray()){
            sMap.put(letter, sMap.getOrDefault(letter, 0)+1);
        }

        for(Character letter : t.toCharArray()){
            if(!sMap.containsKey(letter) || sMap.get(letter) < 1){
                return false;
            }
            else {
                sMap.put(letter, sMap.get(letter)-1);
            }
        }
        return true;
    }
}
