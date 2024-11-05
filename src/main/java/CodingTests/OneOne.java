package CodingTests;

public class OneOne {

    public static void main(String[] args) {
        System.out.println(hasUniqueCharacters("String"));
    }

    private static boolean hasUniqueCharacters(String testString) {
        char[] cleanString = testString.toLowerCase().replaceAll("\\s+", "").strip().toCharArray();
        StringBuilder answer = new StringBuilder();
        for(int i=0; i<cleanString.length; i++){
            char currentChar = cleanString[i];
            if(answer.toString().contains(String.valueOf(currentChar))){
                return false;
            }
            answer.append(currentChar);
        }
        return true;
    }
}
