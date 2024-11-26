package CodingTests.One;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Seven {

    public static void main(String[] args) {
        int[][] testData = generateTestData();
        System.out.println(Arrays.deepToString(testData));
        System.out.println(rotateImage(testData));
        textbookAnswer(testData);
        System.out.println(Arrays.deepToString(testData));


//        Test Data
//        [1, 2, 3, 4, 5]
//        [6, 7, 8, 9, 10]
//        [11, 12, 13, 14, 15]
//        [16, 17, 18, 19, 20]
//        [21, 22, 23, 24, 25]
//
//        Expected Result
//        [21, 16, 11, 6, 1]
//        [22, 17, 12, 7, 2]
//        [23, 18, 13, 8, 3]
//        [24, 19, 14, 9, 4]
//        [25, 20, 15, 10, 5]
    }

    private static List<List<Integer>> rotateImage(int[][] image) {
        List<List<Integer>> response = new ArrayList<>();
        for(int i=0; i<image.length; i++){
            List<Integer> test = new ArrayList<>();
            for(int j=0; j<image.length; j++){
                Integer currentInt = image[j][i];
                test.add(0, currentInt);
            }
            response.add(test);
        }
        return response;
    }

    private static boolean textbookAnswer(int[][] image){
        if(image.length == 0 || image.length != image[0].length) return false;
        int n = image.length;
        for(int row=0; row < n/2; row++){
            int first = row;
            int last = n-1-row;
            for(int i=first; i<last; i++){
                int offset = i - first;
                int top = image[first][i];
                System.out.println("----- START OF LOOP -----");
                System.out.println("first = " + first);
                System.out.println("last = " + last);
                System.out.println("offset = " + offset);
                System.out.println("i = " + i);
                System.out.println("image[first][i] = " + image[first][i]);
                System.out.println("image[last-offset][first] = " + image[last-offset][first]);
                System.out.println("image[last][last-offset] = " + image[last][last-offset]);
                System.out.println("image[i][last] = " + image[i][last]);
                System.out.println("----- END OF LOOP -----");
                image[first][i] = image[last-offset][first];
                image[last-offset][first] = image[last][last-offset];
                image[last][last-offset] = image[i][last];
                image[i][last] = top;
            }
        }
        return true;
    }

    public static int[][] generateTestData(){
        int[] row1 = new int[]{1, 2, 3, 4, 5};
        int[] row2 = new int[]{6, 7, 8, 9, 10};
        int[] row3 = new int[]{11, 12, 13, 14, 15};
        int[] row4 = new int[]{16, 17, 18, 19, 20};
        int[] row5 = new int[]{21, 22, 23, 24, 25};
        return new int[][]{row1, row2, row3, row4, row5};
    }
}
