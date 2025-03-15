package CodingTests.Three;

public class Two extends Stack<Integer> {

    public static void main(String[] args) {
        Two testTwoStack = getTestTwoStack();

        System.out.println("Min: " + testTwoStack.min());

        System.out.println("Peek: " + testTwoStack.peek());
        testTwoStack.pop();
        System.out.println("Peek: " + testTwoStack.peek());
        testTwoStack.pop();
        System.out.println("Peek: " + testTwoStack.peek());
        testTwoStack.pop();
        System.out.println("Peek: " + testTwoStack.peek());

        System.out.println("Min: " + testTwoStack.min());
    }

    private static Two getTestTwoStack() {
        Two testStack = new Two();
        testStack.push(3);
        testStack.push(2);
        testStack.push(4);
        testStack.push(5);
        testStack.push(2);
        testStack.push(1);
        testStack.push(7);
        testStack.push(2);
        return testStack;
    }

    Stack<Integer> s2;
    public Two(){
        super();
        this.s2 = new Stack<>();
    }

    public void push(Integer num){
        super.push(num);
        if(num <= min()){
            this.s2.push(num);
        }
    }

    public Integer pop(){
        int value = super.pop();
        if(value == min()){
            this.s2.pop();
        }
        return value;
    }

    public Integer min(){
        if(this.s2.isEmpty()){
            return Integer.MAX_VALUE;
        }
        else {
            return this.s2.peek();
        }
    }

}
