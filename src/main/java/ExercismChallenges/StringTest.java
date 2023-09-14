package ExercismChallenges;

public class StringTest {
    public static void main(String[] args) {
        String test = "[ERROR]: Invalid operation";
        int colonIndex = test.indexOf(":")+1;
        String message = test.substring(colonIndex);
        System.out.println(message.trim());

        int startIndex = test.indexOf("[")+1;
        int endIndex = test.indexOf("]");
        String answer = test.substring(startIndex, endIndex);
        System.out.println(answer.toLowerCase());
    }

}
