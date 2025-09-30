package CodingPractice;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {
    public static void main(String[] args) {
        String full = "abcdefgabcbc";
        String some = "fgaccc";
        String fail = "fgacccc";
        System.out.println(canConstruct(full, some));
        System.out.println(canConstruct(full, fail));
    }

    private static boolean canConstruct(String magazine, String ransomNote) {
        Map<Character, Integer> noteMap = new HashMap<>();
        for(Character letter : ransomNote.toCharArray()){
            noteMap.put(letter, noteMap.getOrDefault(letter, 0)+1);
        }

        for(Character letter : magazine.toCharArray()){
            if(!noteMap.containsKey(letter)){
                continue;
            }
            int remainingChars = noteMap.get(letter)-1;
            if(remainingChars == 0){
                noteMap.remove(letter);
            }
            else{
                noteMap.put(letter, remainingChars);
            }
        }

        return noteMap.isEmpty();
    }
}
