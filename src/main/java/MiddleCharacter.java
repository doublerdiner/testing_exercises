public class MiddleCharacter {
    public String getMiddle(String word){
        if(word.length() % 2 == 0){
            StringBuilder answer = new StringBuilder();
            int letterLocation = word.length()/2;
            char letter1 = word.charAt(letterLocation-1);
            char letter2 = word.charAt(letterLocation);
            answer.append(letter1);
            answer.append(letter2);
            return answer.toString();
        }
        char letter = word.charAt(word.length()/2);
        return String.valueOf(letter);
    }

    public static void main(String[] args) {
        MiddleCharacter middle = new MiddleCharacter();
        System.out.println(middle.getMiddle("Test"));
    }
}
