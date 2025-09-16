package CodingPractice;

public class ValidPalindrome {
    public static void main(String[] args) {
        String testString = "0987Kayak kayak7890";
        System.out.println(isPalindrome(testString));
    }

    public static boolean isPalindrome(String s) {
        String stripped = s.toLowerCase().replaceAll("[^a-z0-9]+", "");

        int i=0;
        int j=stripped.length()-1;
        while(i<j){
            if(stripped.charAt(i) != stripped.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
