package CodingPractice;

import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        String testString = "{[()]}";
        System.out.println(isValid(testString));
    }

    public static boolean isValid(String s) {
        Stack<Character> openBrackets = new Stack<>();

        for(Character letter : s.toCharArray()){
            if(letter == '(' || letter == '{' || letter == '['){
                openBrackets.push(letter);
            }
            else{
                if(openBrackets.isEmpty()){
                    return false;
                }

                Character current = openBrackets.pop();
                if((current == '(' && letter != ')') ||
                        (current == '{' && letter != '}') ||
                        (current == '[' && letter != ']')){
                    return false;
                }
            }
        }
        return openBrackets.isEmpty();
    }
}
