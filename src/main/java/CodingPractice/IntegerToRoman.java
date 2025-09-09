package CodingPractice;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {

    public static void main(String[] args) {
        int testNum = 12345;
        String response = intToRoman(testNum);
        System.out.println(response);
    }
    public static String intToRoman(int num) {
        Map<Integer, Character> convertionMap = new HashMap<>();
        convertionMap.put(1, 'I');
        convertionMap.put(5, 'V');
        convertionMap.put(10, 'X');
        convertionMap.put(50, 'L');
        convertionMap.put(100, 'C');
        convertionMap.put(500, 'D');
        convertionMap.put(1000, 'M');

        char[] numsArray = String.valueOf(num).toCharArray();
        StringBuilder response = new StringBuilder();
        int multiplier = 1;

        for(int i=numsArray.length-1; i>=0; i--){
            StringBuilder temp = new StringBuilder();
            int currentInt = Integer.parseInt(String.valueOf(numsArray[i]));
            if(currentInt == 4 || currentInt == 9){
                currentInt *= multiplier;
                temp.append(convertionMap.get(multiplier));
                temp.append(convertionMap.get(currentInt+multiplier));
                currentInt = 0;
            }
            else if(currentInt >= 5){
                temp.append(convertionMap.get(multiplier*5));
                currentInt -= 5;
            }
            for(int j = 0; j<currentInt; j++){
                temp.append(convertionMap.get(multiplier));
            }
            response.insert(0, temp);
            multiplier *= 10;
        }
        return response.toString();
    }

    public static String optimal(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < values.length && num > 0; i++) {
            while (num >= values[i]) {
                num -= values[i];
                sb.append(symbols[i]);
            }
        }

        return sb.toString();
    }
}
