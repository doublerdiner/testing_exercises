package LinkedInCourseTests;

import java.util.Arrays;

public class ArrayTests {

    public int returnSecondLargestNum(int[] numberArray){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        if(numberArray.length <= 1){
            return 0;
        }
        for (int num : numberArray) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            }
            else if(num > secondLargest){
                secondLargest = num;
            }
        }
        return secondLargest;
    }

    public static void main(String[] args) {
        System.out.println("Question 1: ");
        String[] a_list = new String[]{"item1", "item2", "item3"};
        System.out.println("a_list is: " + Arrays.toString(a_list)+"\n");

        System.out.println("Question 2: ");
        int[] b_list = new int[]{0,0,0};
        b_list[1] = 1;
        System.out.println("b_list is: " + Arrays.toString(b_list)+"\n");

        System.out.println("Question 3: ");
        for(String item : a_list){
            System.out.println(item);
        }

        System.out.println("\nQuestion 4: ");
        for(int i=0; i<a_list.length; i++){
            System.out.println(a_list[i]);
        }

        System.out.println("\nQuestion 5: ");
        int[] e_list = new int[]{32, 55, 710, 1};
        System.out.println("The sum of e_list is (should be 798): ");
        int e_listAnswer = Arrays.stream(e_list).sum();
        System.out.println(e_listAnswer + "\n");

        System.out.println("Question 6: ");
        int[] numbers = new int[]{1, 3, 4, 5, 0, 2};
        int[] zero = new int[]{};
        int[] three = new int[]{2, 2, 1};
        ArrayTests arrayTest = new ArrayTests();
        System.out.println(arrayTest.returnSecondLargestNum(numbers));
        System.out.println(arrayTest.returnSecondLargestNum(zero));
        System.out.println(arrayTest.returnSecondLargestNum(three));


    }
}
