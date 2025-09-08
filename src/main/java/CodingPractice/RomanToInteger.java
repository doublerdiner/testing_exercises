package CodingPractice;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

    public static void main(String[] args) {
        String testString = "IX";
        System.out.println(romanToInt(testString));
        testString = "MCMXCIV";
        System.out.println(romanToInt(testString));
    }

    private static int romanToInt(String testString) {
        Map<Character, Integer> valueHashMap = new HashMap<>();
        valueHashMap.put('I', 1);
        valueHashMap.put('V', 5);
        valueHashMap.put('X', 10);
        valueHashMap.put('L', 50);
        valueHashMap.put('C', 100);
        valueHashMap.put('D', 500);
        valueHashMap.put('M', 1000);
        int total = 0;
        for(int i=0 ; i<testString.length(); i++){
            int value = valueHashMap.get(testString.charAt(i));
            if(i+1 < testString.length() && value < valueHashMap.get(testString.charAt(i+1))){
                total -= value;
            }
            else{
                total += value;
            }
        }
        return total;
    }
}
