package CodingPractice;

import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args) {
        String testString = "/home/user/Documents/../Pictures";
        System.out.println(simplifyPath(testString));
    }

    public static String simplifyPath(String path){
        String[] splitString = path.split("/");

        Stack<String> stringStack = new Stack<>();

        for(String word : splitString){
            if(word.equals("..")){
                stringStack.pop();
            }
            else if(!word.isEmpty() && !word.equals(".")){
                stringStack.push(word);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(String word : stringStack){
            sb.append("/");
            sb.append(word);
        }
        return sb.toString();
    }
}
