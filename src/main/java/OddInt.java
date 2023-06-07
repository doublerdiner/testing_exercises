import java.util.HashMap;
import java.util.List;

public class OddInt {

    public int findIt(int[] a){
        HashMap<Integer, Integer> scores = new HashMap<>();
        for(int i=0; i<a.length; i++){
            int currentNumber = a[i];
            if(scores.containsKey(currentNumber)){
                scores.put(currentNumber, scores.get(currentNumber)+1);
            }
            else{
                scores.put(currentNumber, 1);
            }
        }
        System.out.println(scores);
        for(int key: scores.keySet()){
            if(scores.get(key) % 2 != 0){
                return key;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        OddInt oddint = new OddInt();
        int[] test = new int[]{1,2,3,4,5,6,7,8,9,9,8,7};
        System.out.println(oddint.findIt(test));
    }
}
