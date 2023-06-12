import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DescendingOrder {

    public int sortDesc(int num){
        String number = Integer.toString(num);
        char[] array = number.toCharArray();
        List<Integer> numberList = new ArrayList<>();
        for(char thisNumber : array){
            Integer digit = Integer.parseInt(String.valueOf(thisNumber));
            numberList.add(digit);
        }
        Collections.sort(numberList, Collections.reverseOrder());
        StringBuilder builder = new StringBuilder();
        for(int i=0; i<numberList.size(); i++){
            builder.append(numberList.get(i));
        }
        return Integer.parseInt(builder.toString());
    }

    public static void main(String[] args) {
        DescendingOrder descending = new DescendingOrder();
        System.out.println(descending.sortDesc(12345));


    }
}
