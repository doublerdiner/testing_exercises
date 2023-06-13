import java.util.*;

public class BinaryTest {
    public List<String> calculateHandshake(int number){
        List<String> answer = new LinkedList<>();
        if((number & 1) == 1){
            answer.add("Wink");
        }
        if((number & 2) == 2){
            answer.add("Double Blink");
        }
        if((number & 4) == 4){
            answer.add("Close Eyes");
        }
        if((number & 8) == 8){
            answer.add("Jump");
        }
        if((number & 16) == 16){
            Collections.reverse(answer);
        }
        return answer;
    }

    public static void main(String[] args) {
        BinaryTest test = new BinaryTest();
        System.out.println(test.calculateHandshake(31));
    }
}
