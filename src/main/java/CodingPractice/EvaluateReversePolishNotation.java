package CodingPractice;

import java.util.Stack;

public class EvaluateReversePolishNotation {

    public static void main(String[] args) {
        String[] testArray = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        System.out.println(evalRPN(testArray));
    }

    public static int evalRPN(String[] tokens) {
        Integer result = 0;
        Stack<String> tokenStack = new Stack<>();
        for(String item : tokens){
            if(item.equals("+") || item.equals("-") || item.equals("*") || item.equals("/")){
                Integer second = Integer.parseInt(tokenStack.pop());
                Integer first = Integer.parseInt(tokenStack.pop());

                switch (item) {
                    case "+" -> result = first + second;
                    case "-" -> result = first - second;
                    case "*" -> result = first * second;
                    case "/" -> result = first / second;
                }
                tokenStack.push(result.toString());

            }
            else{
                tokenStack.push(item);
            }
        }
        return Integer.parseInt(tokenStack.pop());
    }
}
