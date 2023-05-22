import java.util.List;

public class ReverseString {

    public static void main(String[] args) {
        String wordToReverse = "Christopher";
        char[] wordList = wordToReverse.toCharArray();
        String reversed = new String();
        for(char letter : wordList){
            reversed = letter + reversed;
            System.out.println(letter);
        }
        System.out.println(reversed.len);
    }
}
