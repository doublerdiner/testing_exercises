
import java.util.ArrayList;
import java.util.List;

public class ListFiltering {
    public List<Object> filterList(List<Object> list){
        List<Object> answer = new ArrayList<>();
        for(Object item : list){
            if(item instanceof Integer ){
                answer.add(item);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        ListFiltering listTest = new ListFiltering();
        System.out.println(listTest.filterList(List.of(1,"hi",3,"no",5,"Last")));
    }
}
