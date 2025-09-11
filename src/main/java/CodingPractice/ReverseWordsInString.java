package CodingPractice;

public class ReverseWordsInString {

    public static void main(String[] args) {
        String testString = "a good   example";
        System.out.println(reverseWords(testString));
    }
    public static String reverseWords(String s) {
        String[] wordArray = s.strip().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=wordArray.length-1; i>=0; i--){
            sb.append(wordArray[i]);
            if(i != 0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
