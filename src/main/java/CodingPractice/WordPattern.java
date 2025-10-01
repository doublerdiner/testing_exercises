package CodingPractice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "abba";
        String words = "dog cat cat dog";
        System.out.println(wordPattern(pattern, words));
    }

    private static boolean wordPattern(String pattern, String s) {
        char[] patternArray = pattern.toCharArray();
        List<String> stringArray = Arrays.asList(s.split(" "));

        if(patternArray.length != stringArray.size()){
            return false;
        }
        Map<Character, String> patternKeys = new HashMap<>();
        Map<String, Character> stringKeys = new HashMap<>();

        for(int i=0; i<patternArray.length; i++){
            Character patternChar = patternArray[i];
            String word = stringArray.get(i);

            if(patternKeys.containsKey(patternChar)){
                if(!patternKeys.get(patternChar).equals(word)){
                    return false;
                }
            }
            else{
                patternKeys.put(patternChar, word);
            }

            if(stringKeys.containsKey(word)){
                if(stringKeys.get(word) != patternChar){
                    return false;
                }
            }
            else{
                stringKeys.put(word, patternChar);
            }

        }
        return true;
    }
}
