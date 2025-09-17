package CodingPractice;

public class IsSubsequence {

    public static void main(String[] args) {
        String testS = "abc";
        String testT = "caccabbac";
        System.out.println(isSubsequence(testS, testT));

        String testS2 = "fail";
        String testT2 = "caccabbac";
        System.out.println(isSubsequence(testS2, testT2));
    }

    public static boolean isSubsequence(String s, String t) {
        if(s.length() == 0){
            return true;
        }
        int sIndex = 0;
        for(int i=0; i<t.length(); i++){
            if(s.charAt(sIndex) == t.charAt(i)){
                sIndex++;
            }
            if(sIndex == s.length()){
                return true;
            }
        }
        return false;
    }
}
