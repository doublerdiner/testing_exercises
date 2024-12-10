package CodingTests.Two;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class One {
    public static void main(String[] args) {
        LinkedList<Integer> testList = testLinkedList();

        removeDuplicates(testList);

        System.out.println(testList);
    }

    private static void removeDuplicates(LinkedList<Integer> list) {
        HashSet<Integer> set = new HashSet<>();
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            Integer current = iterator.next();
            if(set.contains(current)){
                iterator.remove();
            }
            else set.add(current);
        }
    }

    private static LinkedList<Integer> testLinkedList() {
        LinkedList<Integer> response = new LinkedList<>();
        response.add(1);
        response.add(5);
        response.add(5);
        response.add(3);
        response.add(1);
        response.add(3);
        response.add(2);
        return response;
    }
}
