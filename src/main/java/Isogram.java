import java.util.*;

public class Isogram {

    public boolean isIsogram(String word){
        String lower = word.toLowerCase();
        char[] letters = lower.toCharArray();
        boolean answer = true;
        Set<Character> encounteredLetters = new HashSet<Character>();
        for(int i=0; i<letters.length; i++){
            char currentLetter = letters[i];
            encounteredLetters.add(currentLetter);
        }
        if(encounteredLetters.size() != letters.length){
            answer = false;
        }
        return answer;
    }

    public static void main(String[] args) {
        Isogram isogram = new Isogram();
        System.out.println(isogram.isIsogram("Teesop"));
    }
}
