package CodingTests;

public class OneOne {

    public static void main(String[] args) {

        System.out.println(hasUniqueCharacters("Testthis"));

        System.out.println(anotherSolution("Test"));
    }

    private static boolean anotherSolution(String testString) {
        String stringToTest = testString.toLowerCase().replaceAll("//s", "").strip();
        boolean[] boolArray = new boolean[128];
        char[] charArray = stringToTest.toCharArray();
        for(char character : charArray){
            if(boolArray[character]){
                return false;
            }
            boolArray[character] = true;
        }
        return true;
    }

    private static boolean hasUniqueCharacters(String testString) {
        char[] cleanString = testString.toLowerCase().replaceAll("\\s+", "").strip().toCharArray();
        StringBuilder answer = new StringBuilder();
        for(char character : cleanString){
            if(answer.toString().contains(String.valueOf(character))){
                return false;
            }
            answer.append(character);
        }
        return true;
    }


}
