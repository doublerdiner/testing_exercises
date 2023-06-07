package LinkedInCourseTests;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Hashmaps {

    private String findNameThatAppearsTwice(String[] names) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<names.length; i++){
            if(map.containsKey(names[i])){
                 return names[i];
            }
            else{
                map.put(names[i], 1);
            }
        }
        return "No Duplicate Found";
    }

    private String findNumbersThatAddUpToTen(int[] numberArray) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<numberArray.length; i++){
            int currentNumber = numberArray[i];
            if(map.containsKey(10-currentNumber)){
                int[] answer = new int[]{10-currentNumber, currentNumber};
                return Arrays.toString(answer);
            }
            else{
                map.put(currentNumber, currentNumber);
            }
        }
        return "No numbers add up to 10";
    }

    public static void main(String[] args) {
        System.out.println("Question 1: ");
        HashMap<String, Integer> aDict = new HashMap<>(){{
            put("Amy",28);
        }};
        System.out.println("aDict is: " + aDict);

        System.out.println("\nQuestion 2: ");
        HashMap<String, Object> bDict = new HashMap<>(){{
            put("Amy", 30);
            put("Tom", "Age Unknown");
        }};
        System.out.println("Tom's age is: " + bDict.get("Tom"));

        System.out.println("\nQuestion 3: ");
        HashMap<String, Object> cDict = new HashMap<>(){{
            put("Amy", 30);
            put("Tom", "Age Unknown");
        }};
        cDict.put("George", 44);
        System.out.println("George's age is: " + cDict.get("George"));

        System.out.println("\nQuestion 4: ");
        String[] names = new String[]{"George", "Tom", "Emily", "Jenny", "Tom"};
        Hashmaps hashmaps = new Hashmaps();
        System.out.println(hashmaps.findNameThatAppearsTwice(names));

        System.out.println("\nQuestion 5: ");
        int[] numberArray = new int[]{3, 4, 1, 2, 9};
        System.out.println(hashmaps.findNumbersThatAddUpToTen(numberArray));
    }




}
