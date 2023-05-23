package oldFiles;

import java.util.Scanner;

public class PBAndJ {

    public static void announceTeaTime(){
        System.out.println("Waiting for tea time...");
        System.out.println("Type a random word to start tea time.");
        Scanner input = new Scanner(System.in);
        input.next();
        System.out.println("it's tea time!");
    }

    public static void main(String[] args) {
        System.out.println("Welcome to your new job");
        announceTeaTime();
        System.out.println("Write code");

    }
}
