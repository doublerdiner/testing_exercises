package oldFiles;

import java.util.ArrayList;

public class ExercismTests {

    public static int message(String logLine){
        int answer = logLine.indexOf(":");
        return answer;
    }

    public static int index(String logLine, String symbol){
        int answer = logLine.indexOf(symbol);
        return answer;
    }

    public static void main(String[] args) {
        String test = "[ERROR]:    Operation Unsuccessful    ";
//        int answer = message(test) +1;
//        System.out.println(answer);
//        System.out.println(test.substring(answer));
//        String finalAnswer = test.substring(answer).strip();
//        System.out.println(finalAnswer);

        int indexOne = index(test, "[") + 1;
        int indexTwo = index(test, "]");

        System.out.println(indexOne);
        System.out.println(indexTwo);
        System.out.println(test.substring(indexOne, indexTwo).toLowerCase());

    }

}
