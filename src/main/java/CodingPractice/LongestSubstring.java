package CodingPractice;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring{
    public static void main(String[] args) {
        String testString = "abcbccabbc";
        System.out.println(lengthOfLongestSubstring(testString));
    }
    public static int lengthOfLongestSubstring(String s) {
        char[] charArray = s.toCharArray();
        int substringLength = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        int left = 0;

        for(int right=0; right<charArray.length; right++){
            if(charMap.containsKey(charArray[right])){
                int indexToRemove = charMap.get(charArray[right]);
                substringLength = Math.max(substringLength, charMap.size());
                while(left <= indexToRemove){
                    charMap.remove(charArray[left]);
                    left++;
                }
            }
            charMap.put(charArray[right], right);
        }
        return Math.max(substringLength, charMap.size());
    }
}
