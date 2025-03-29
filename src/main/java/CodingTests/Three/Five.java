package CodingTests.Three;

public class Five {

    public static void main(String[] args) {
        Stack<Integer> testStack = createNewStack();

        sortStack(testStack);

        while(!testStack.isEmpty()){
            System.out.println(testStack.peek());
            testStack.pop();
        }
    }

    private static void sortStack(Stack<Integer> testStack) {
        Stack<Integer> tempStack = new Stack<>();

        while(!testStack.isEmpty()){
            Integer currentNum = testStack.pop();
            while(!tempStack.isEmpty() && tempStack.peek()>currentNum){
                testStack.push(tempStack.pop());
            }
            tempStack.push(currentNum);
        }

        while(!tempStack.isEmpty()){
            testStack.push(tempStack.pop());
        }
    }

    private static Stack<Integer> createNewStack() {
        Stack<Integer> response = new Stack<>();
        response.push(3);
        response.push(1);
        response.push(5);
        response.push(4);
        response.push(2);
        return response;
    }
}
