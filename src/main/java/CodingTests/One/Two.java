package CodingTests.One;

import java.util.*;

public class Two {

    public static void main(String[] args) {
        String test1 = "spin";
        String test2 = "nips";

        System.out.println(doStringsContainTheSameCharacters(test1, test2));
    }

    public static boolean doStringsContainTheSameCharacters(final String firstString, final String secondString){
        String cleanString1 = firstString.toLowerCase().replaceAll("//s", "").strip();
        String cleanString2 = secondString.toLowerCase().replaceAll("//s", "").strip();
        if(cleanString1.length() != cleanString2.length()){
            return false;
        }
        return Objects.equals(sortString(cleanString1), sortString(cleanString2));
    }

    private static Object sortString(String cleanString) {
        char[] stringCharArray = cleanString.toCharArray();
        Arrays.sort(stringCharArray);
        return String.valueOf(stringCharArray);
    }
}
