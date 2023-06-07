package LinkedInCourseTests;

public class VowelConsonant {
    public String vowelConsonantCounter(String phrase){
        String normalise = phrase.toLowerCase().strip();
        char[] charArray = normalise.toCharArray();
        int vowels = 0;
        int consonants = 0;
        for(int i=0; i< charArray.length; i++){
            char currentLetter = charArray[i];
            if(currentLetter == ' '){
                continue;
            }
            switch(currentLetter) {
                case 'a', 'e', 'i', 'o', 'u' -> vowels++;
                default -> consonants++;
            }
        }
        return String.format("There are %s vowels and %s consonants.", vowels, consonants);
    }

    public static void main(String[] args) {
        VowelConsonant vowelConsonant = new VowelConsonant();
        String test1 = "Hello";
        String test2 = "Hello lets try a LONGER string now    ";
        String test3 = "Hello";
        System.out.println(vowelConsonant.vowelConsonantCounter(test1));
        System.out.println(vowelConsonant.vowelConsonantCounter(test2));
    }
}
