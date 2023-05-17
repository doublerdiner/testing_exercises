import java.util.Scanner;

public class MultipleChoice {
    public static void main(String[] args) {
        String question = "What age am I?";
        int answer1 = 30;
        int answer2 = 34;
        int answer3 = 38;
        int correctAnswer = answer2;

        System.out.println(question + " " + answer1 + ", " + answer2 + " or " + answer3);
        Scanner scanner = new Scanner(System.in);
        int userAnswer = scanner.nextInt();

        if(userAnswer == correctAnswer){
            System.out.println("Congratulations");
        }
        else{
            System.out.println(userAnswer + " is incorrect. The answer is " + correctAnswer);
        }
    }
}
