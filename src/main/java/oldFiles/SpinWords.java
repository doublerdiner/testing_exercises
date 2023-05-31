package oldFiles;

public class SpinWords {

    public String spinWords(String sentence){
        String[] words = sentence.split(" ");
        String newSentence = new String();
        for(int i=0; i<words.length; i++){
            String currentWord = words[i];
            if(currentWord.length() > 4){
                StringBuilder reversed = new StringBuilder();
                reversed.append(currentWord);
                reversed.reverse();
                newSentence += reversed.toString() + " ";
                continue;
            }
            newSentence += currentWord + " ";
        }
        return newSentence.trim();
    }

    public static void main(String[] args) {
        SpinWords spin = new SpinWords();
        System.out.println(spin.spinWords("This is a test longer words hererere"));
    }
}
