package CodingPractice;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {

    public static void main(String[] args) {
        String testString1 = "badc";
        String testString2 = "baba";
        System.out.println(isIsomorphic(testString1, testString2));
    }

    private static boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }

        Map<Character, Character> charMapS = new HashMap<>();
        Map<Character, Character> charMapT = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            Character sChar = s.charAt(i);
            Character tChar = t.charAt(i);
            if(charMapS.containsKey(sChar)){
                if(charMapS.get(sChar) != tChar){
                    return false;
                }
            }
            else{
                charMapS.put(s.charAt(i), t.charAt(i));
            }
            if(charMapT.containsKey(tChar)){
                if(charMapT.get(tChar) != sChar){
                    return false;
                }
            }
            else{
                charMapT.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }
}
