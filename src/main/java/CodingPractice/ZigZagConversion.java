package CodingPractice;

import java.util.ArrayList;
import java.util.List;

public class ZigZagConversion {
    public static void main(String[] args) {
        String testString = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(convert(testString, 4));
        String testString2 = "AB";
        System.out.println(convert(testString2, 1));
    }

    public static String convert(String s, int numRows) {
        if(numRows == 1){
         return s;
        }
        List<StringBuilder> sbArray = new ArrayList<>();
        for(int i=0; i<numRows; i++){
            sbArray.add(new StringBuilder());
        }
        boolean downwardDirection = false;
        int row = 0;
        for(int i=0; i<s.length(); i++){
            char currentChar = s.charAt(i);
            if(row==0 || row==numRows-1){
                downwardDirection = !downwardDirection;
            }
            sbArray.get(row).append(currentChar);
            row = downwardDirection? row+1: row-1;
        }
        StringBuilder sb = new StringBuilder();
        for(StringBuilder arrayBuilder : sbArray){
            sb.append(arrayBuilder);
        }
        return sb.toString();
    }
}
