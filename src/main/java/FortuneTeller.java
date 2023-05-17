import java.util.Scanner;

public class FortuneTeller {
    public static void main(String[] args) {
        System.out.println("Please select a number between 1 and 10");
        Scanner input = new Scanner(System.in);
        int inputNumber = input.nextInt();
        if(inputNumber < 1 || inputNumber > 10){
            System.out.println("Invalid number entered");
        }
        else if(inputNumber <= 4){
            System.out.println("Enjoy the good luck a friend brings to you!");
        }
        else{
            System.out.println("Your shoe selection will make you happy today.");
        }
    }
}
