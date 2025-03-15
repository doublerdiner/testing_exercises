package CodingTests.Three;

import java.util.ArrayList;
import java.util.List;

public class Three {

    public static void main(String[] args) {
        SetOfStacks setOfStacks = getTestSetOfStacks();
        for(Stack stack: setOfStacks.stacksList){
            System.out.println(stack.peek());
        }
    }

    private static SetOfStacks getTestSetOfStacks() {
        SetOfStacks stacks = new SetOfStacks(3);
        stacks.push(1);
        stacks.push(2);
        stacks.push(3);
        stacks.push(4);
        stacks.push(5);
        stacks.pop();
        stacks.push(6);
        stacks.pop();
        stacks.push(7);
        stacks.push(8);
        stacks.push(9);
        stacks.pop();
        stacks.pop();
        stacks.pop();
        return stacks;
    }

    public static class SetOfStacks extends Stack<Integer> {
        private int maxSize;

        private List<Stack> stacksList = new ArrayList<>();

        public SetOfStacks(int maxSize) {
            this.maxSize = maxSize;
            this.stacksList.add(new Stack());
        }

        @Override
        public Integer pop(){
            Stack stackToUse = stacksList.get(stacksList.size()-1);
            Integer value = (Integer) stackToUse.pop();

            if(stackToUse.isEmpty()){
                stacksList.remove(stackToUse);
            }
            return value;
        }

        @Override
        public void push(Integer item){
            Stack stackToUse = stacksList.get(stacksList.size()-1);
            if(stackToUse.size() == this.maxSize){
                stackToUse = new Stack();
                stacksList.add(stackToUse);
            }
            stackToUse.push(item);
        }
    }
}
