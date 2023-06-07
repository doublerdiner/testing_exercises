package LinkedInCourseTests;

public class StringTests {

    public boolean stringPalindromeTest(String first, String second){
        String firstString = first.toLowerCase();
        String secondString = second.toLowerCase();
        if(firstString.length() != secondString.length()){
            return false;
        }
        for(int i=0; i<firstString.length(); i++){
            char firstStringLetter = firstString.charAt(i);
            char secondStringLetter = secondString.charAt(secondString.length()-1-i);
            if(firstStringLetter != secondStringLetter){
                return false;
            }
        }
        return true;
    }

    public boolean firstNumberIsSmaller(String first, String second) {
        if(first.length() > second.length()){
            return true;
        }
        else if(first.length() == second.length()){
            for(int i=0; i<first.length(); i++){
                char firstNumber = first.charAt(i);
                char secondNumber = second.charAt(i);
                if(Character.compare(firstNumber, secondNumber) > 0){
                    return true;
                }
                else if(Character.compare(secondNumber, firstNumber) > 0){
                    return false;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {

        System.out.println("Question 1: ");
        String a_string = "ABC";
        System.out.println("a_string is: " + a_string + "\n");

        System.out.println("Question 2: ");
        String bString = "DEF";
        System.out.println("bString's second character is: " + bString.charAt(1) + "\n");

        System.out.println("Question 3: ");
        String cString = "GHI";
        for(char character : cString.toCharArray()){
            System.out.println(character);
        }

        System.out.println("\nQuestion 4: ");
        String dString = "PQR";
        for(int i=0; i<dString.length(); i++){
            System.out.println(dString.charAt(i));
        }

        System.out.println("\nQuestion 5: ");
        StringTests stringTests = new StringTests();
        String string1 = "Kayak";
        String string2 = "Kayak";
        String string3 = "Nope";
        System.out.println(stringTests.stringPalindromeTest(string1, string2));
        System.out.println(stringTests.stringPalindromeTest(string1, string3));

        System.out.println("\nQuestion 6: ");
        System.out.println(stringTests.firstNumberIsSmaller("1232", "201"));
        System.out.println(stringTests.firstNumberIsSmaller("22", "22"));
        System.out.println(stringTests.firstNumberIsSmaller("1234557", "1234556"));
        System.out.println(stringTests.firstNumberIsSmaller("1234557", "1234558"));

    }


}
