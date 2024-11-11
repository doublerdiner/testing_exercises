package CodingTests.One;

public class Three {

    public static void main(String[] args) {
        String testString = "Mr John Smith    ";
        int testLength = 13;

        System.out.println("Solution 1: " + urlifyString(testString, testLength));
        System.out.println("Solution 2: " + String.valueOf(urlifyStringOtherSolution(testString, testLength)));
    }

    private static char[] urlifyStringOtherSolution(String testString, int testLength) {
        char[] charArray = testString.toCharArray();
        int numberOfSpaces = countSpaces(0, testLength, charArray, ' ');

        int trueLength = testLength + numberOfSpaces * 2;

        if(trueLength < charArray.length) charArray[trueLength] = '\0';

        for (int i=testLength-1; i>=0; i--){
            if(charArray[i] == ' '){
                charArray[trueLength-1] = '0';
                charArray[trueLength-2] = '2';
                charArray[trueLength-3] = '%';
                trueLength-=3;
            }
            else{
                charArray[trueLength-1] = charArray[i];
                trueLength -= 1;
            }
        }

        return charArray;
    }

    private static int countSpaces(int start, int testLength, char[] charArray, char c) {
        int count = 0;
        for(int i=start; i<testLength; i++){
            if (charArray[i] == c){
                count++;
            }
        }
        return count;
    }

    private static String urlifyString(String testString, int testLength) {
        StringBuilder response = new StringBuilder(testLength);
        char[] charArray = testString.toCharArray();
        for(int i=0; i<testLength; i++){
            if ((byte) charArray[i] == 32){
                response.append("%20");
                continue;
            }
            response.append(charArray[i]);
        }

        return response.toString();
    }
}
