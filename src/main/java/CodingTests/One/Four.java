package CodingTests.One;

import java.util.Arrays;

public class Four {

    public static void main(String[] args) {
        String testString = "Taco CAT";
        System.out.println(checkIfStringIsPalindrome(testString));
    }

    private static boolean checkIfStringIsPalindrome(String inputString) {
        char[] inputArray = inputString.toLowerCase().strip().replaceAll("\\s", "").toCharArray();
        Arrays.sort(inputArray);
        int oddCharacters = inputArray.length%2;
        boolean foundMiddleCharacter = false;
        for(int i=0; i<inputArray.length-oddCharacters; i++){
            if((i+1 == inputArray.length && foundMiddleCharacter) || (inputArray[i] != inputArray[i+1] && foundMiddleCharacter)){
                return false;
            } else if (inputArray[i] != inputArray[i+1]) {
                foundMiddleCharacter=true;
            }
            else i++;
        }
        return true;
    }
}
