package LinkedInCourseTests;

import java.util.Scanner;

public class JavaCourseQuestion {

    public static void main(String[] args) {
        System.out.println("What is my age?");
        System.out.println("A - 30");
        System.out.println("B - 34");
        System.out.println("C - 36");
        System.out.println("D - 40");
        Scanner question = new Scanner(System.in);
        String answer = question.nextLine();
        if(answer.equals("B")){
            System.out.println("Correct!");
        }
        else{
            System.out.println("Sorry, the correct answer was B - 34");
        }
    }
}
