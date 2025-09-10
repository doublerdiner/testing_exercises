package CodingPractice;

public class LengthOfLastWord {
    public static void main(String[] args) {
        String testString = "Fly me to the Moon";
        System.out.println(lengthOfLastWord(testString));
    }

    private static int lengthOfLastWord(String s) {
        String[] stringArray = s.strip().split(" ");
        String finalWord = stringArray[stringArray.length-1];
        return finalWord.length();
    }
}
