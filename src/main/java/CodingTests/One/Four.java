package CodingTests.One;

public class Four {

    public static void main(String[] args) {
        String testString = "Taco CAT";
        String testString2 = "ooOo    ";
        String testString3 = "Test";
        System.out.println(checkIfStringIsPalindrome(testString));
        System.out.println(checkIfStringIsPalindrome(testString2));
        System.out.println(checkIfStringIsPalindrome(testString3));
    }

    private static boolean checkIfStringIsPalindrome(String inputString) {
        String cleanString = inputString.toLowerCase().strip().replaceAll("\\s", "");
        int lastIndex = cleanString.length()-1;
        for(int i=0, j=lastIndex; i<cleanString.length()/2; i++, j--){
            char firstLetter = cleanString.charAt(i);
            char lastLetter = cleanString.charAt(j);
            if (firstLetter != lastLetter){
                return false;
            }
        }
        return true;
    }
}
