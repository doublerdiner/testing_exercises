package CodingPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinArrowsToBurst {
    public static void main(String[] args) {
        int[][] points = {{10,16},{2,8},{1,6},{7,12}};
        int[][] points2 = {{-2147483646,-2147483645},{2147483646,2147483647}};
        System.out.println(findMinArrowShots(points));
        System.out.println(findMinArrowShots(points2));
    }

    public static int findMinArrowShots(int[][] points) {
        if(points.length < 2){
            return points.length;
        }

        Arrays.sort(points, Comparator.comparingInt(a -> a[0]));

        List<int[]> shots = new ArrayList<>();

        int[] current = points[0];
        shots.add(current);

        for(int[] point : points){
            int currentStart = current[0];
            int currentEnd = current[1];
            int nextStart = point[0];
            int nextEnd = point[1];

            if(currentEnd >= nextStart){
                currentStart = Math.max(currentStart, nextStart);
                currentEnd = Math.min(currentEnd, nextEnd);
                current[0] = currentStart;
                current[1] = currentEnd;

            }
            else{
                current = point;
                shots.add(point);
            }
        }
        return shots.size();
    }
}
