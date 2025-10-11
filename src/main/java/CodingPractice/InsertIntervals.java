package CodingPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InsertIntervals {

    public static void main(String[] args) {
        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval = {4,8};
        System.out.println(Arrays.deepToString(insert(intervals, newInterval)));

    }

    public static int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> merged = new ArrayList<>();

        int i=0;
        int length = intervals.length;
        int startNum = newInterval[0];
        int endNum = newInterval[1];

        while(i < length && intervals[i][1]<startNum){
            merged.add(intervals[i]);
            i++;
        }

        while(i < length && endNum >= intervals[i][0]){
            startNum = Math.min(startNum, intervals[i][0]);
            endNum = Math.max(endNum, intervals[i][1]);
            i++;
        }
        int[] intervalToAdd = {startNum, endNum};
        merged.add(intervalToAdd);

        while(i < length){
            merged.add(intervals[i]);
            i++;
        }

        return merged.toArray(new int[merged.size()][]);
    }
}
