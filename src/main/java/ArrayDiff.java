import java.util.ArrayList;
import java.util.HashMap;

public class ArrayDiff {

    public static int[] arrayDiff(int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList();
        HashMap<Integer, Integer> bNumbers = new HashMap<>();
        for(int i=0; i<b.length; i++){
            bNumbers.put(b[i], 1);
        }
        for(int i=0; i<a.length; i++){
            if(!bNumbers.containsKey(a[i])){
                answer.add(a[i]);
            }
        }
        int[] answerArray = answer.stream().mapToInt(i -> i).toArray();
        return answerArray;
    }

}
