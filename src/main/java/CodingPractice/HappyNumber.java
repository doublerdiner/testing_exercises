package CodingPractice;

import java.util.HashSet;

public class HappyNumber {

    public static void main(String[] args) {
        int testInt = 19;
        System.out.println(isHappy(testInt));
    }

    private static boolean isHappy(int n) {
        HashSet<Integer> numMap = new HashSet<>();
        while(n != 1){
            if(numMap.contains(n)){
                return false;
            }
            numMap.add(n);
            String intString = Integer.toString(n);
            n=0;
            for(int i=0; i<intString.length(); i++) {
                int currentNum = intString.charAt(i) - '0';
                n += currentNum * currentNum;
            }
        }
        return true;
    }
}
