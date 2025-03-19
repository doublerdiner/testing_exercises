package CodingTests.Three;

public class Four {

    public static void main(String[] args) {
        MyQueue<Integer> testQueue = genereateTestMyQueue();

        System.out.println(testQueue.peek());
        testQueue.remove();
        System.out.println(testQueue.peek());
        testQueue.add(50);
        System.out.println("size " + testQueue.size());
        System.out.println(testQueue.peek());
        testQueue.remove();
        System.out.println(testQueue.peek());
        testQueue.remove();

    }

    private static MyQueue<Integer> genereateTestMyQueue() {
        MyQueue<Integer> myQueue = new MyQueue<Integer>();
        myQueue.add(1);
        myQueue.add(2);
        return myQueue;
    }

    private static class MyQueue<T>{
        Stack<T> newStack;
        Stack<T> oldStack;

        public MyQueue() {
            this.newStack = new Stack<>();
            this.oldStack = new Stack<>();
        }

        public int size(){
            return this.newStack.size() + this.oldStack.size();
        }

        public void add(T item){
            this.newStack.push(item);
        }

        public void switchStacks(){
            if(this.oldStack.isEmpty()){
                while(!this.newStack.isEmpty()){
                    this.oldStack.push(this.newStack.pop());
                }
            }
        }

        public T remove(){
            switchStacks();
            return this.oldStack.pop();
        }

        public T peek(){
            switchStacks();
            return this.oldStack.peek();
        }
    }
}
