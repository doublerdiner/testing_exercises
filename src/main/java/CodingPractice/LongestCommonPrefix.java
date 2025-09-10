package CodingPractice;

public class LongestCommonPrefix {

    public static void main(String[] args) {
        String[] testArray = {"flower", "flow", "flight"};
        System.out.println(longestCommonPrefix(testArray));
    }

    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int firstWordLength = strs[0].length();

        for(int i=0; i<firstWordLength; i++){
            char currentChar = strs[0].charAt(i);
            for(int j=0; j<strs.length; j++){
                if(strs[j].length() <= i || currentChar != strs[j].charAt(i)){
                    return sb.toString();
                }
            }
            sb.append(currentChar);
        }
        return sb.toString();
    }
}
